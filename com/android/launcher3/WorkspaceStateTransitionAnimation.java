package com.android.launcher3;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class WorkspaceStateTransitionAnimation {
    final int mAllAppsTransitionTime;
    final Launcher mLauncher;
    float[] mNewAlphas;
    float[] mNewBackgroundAlphas;
    float mNewScale;
    float[] mOldAlphas;
    float[] mOldBackgroundAlphas;
    final int mOverlayTransitionTime;
    final float mOverviewModeShrinkFactor;
    final int mOverviewTransitionTime;
    final float mSpringLoadedShrinkFactor;
    AnimatorSet mStateAnimator;
    final Workspace mWorkspace;
    final boolean mWorkspaceFadeInAdjacentScreens;
    final float mWorkspaceScrimAlpha;
    final ZoomInInterpolator mZoomInInterpolator = new ZoomInInterpolator();

    public WorkspaceStateTransitionAnimation(Launcher launcher, Workspace workspace) {
        this.mLauncher = launcher;
        this.mWorkspace = workspace;
        DeviceProfile deviceProfile = launcher.mDeviceProfile;
        Resources resources = launcher.getResources();
        this.mAllAppsTransitionTime = resources.getInteger(R.integer.config_allAppsTransitionTime);
        this.mOverviewTransitionTime = resources.getInteger(R.integer.config_overviewTransitionTime);
        this.mOverlayTransitionTime = resources.getInteger(R.integer.config_overlayTransitionTime);
        this.mSpringLoadedShrinkFactor = ((float) resources.getInteger(R.integer.config_workspaceSpringLoadShrinkPercentage)) / 100.0f;
        this.mOverviewModeShrinkFactor = ((float) resources.getInteger(R.integer.config_workspaceOverviewShrinkPercentage)) / 100.0f;
        this.mWorkspaceScrimAlpha = ((float) resources.getInteger(R.integer.config_workspaceScrimAlpha)) / 100.0f;
        this.mWorkspaceFadeInAdjacentScreens = deviceProfile.shouldFadeAdjacentWorkspaceScreens();
    }
}
