public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }

        int maxArea = 0;
        int low = 0;
        int high = height.length - 1;

        while (low < high) {
            int thisArea;

            if (height[low] <= height[high]) {
                thisArea = (high - low) * height[low];
                low++;
            } else {
                thisArea = (high - low) * height[high];
                high--;
            }

            if (maxArea < thisArea) {
                maxArea = thisArea;
            }
        }

        return maxArea;
    }

}
