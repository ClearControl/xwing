package clearcontrol.microscope.lightsheet.imaging;

import clearcontrol.microscope.lightsheet.LightSheetMicroscope;

/**
 * Author: Robert Haase (http://haesleinhuepf.net) at MPI CBG (http://mpi-cbg.de)
 * March 2018
 */
public interface DirectImageInterface
{
  void setExposureTimeInSeconds(double pExposureTimeInSeconds);

  LightSheetMicroscope getLightSheetMicroscope();

  void setImageWidth(int pImageWidth);
  void setImageHeight(int pImageHeight);
}