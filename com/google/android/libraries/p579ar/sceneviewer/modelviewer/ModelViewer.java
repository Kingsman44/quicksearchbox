package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import com.google.android.libraries.p579ar.sceneviewer.immersiveedge.sidechannelevent.SideChannelEventManager;
import com.google.android.libraries.p579ar.sceneviewer.infocard.BottomViewGroup;
import com.google.android.libraries.p579ar.sceneviewer.infocard.CardWebView;
import com.google.android.libraries.p579ar.sceneviewer.media.capture.SurfaceMirrorer;
import com.google.android.libraries.p579ar.sceneviewer.occlusions.OcclusionsHost;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.NodeTransformationIndicator;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.p3723ar.imp.p3726a.C47970b;
import com.google.p3723ar.p3724a.p3725a.C47890a;
import com.google.p3723ar.p3724a.p3725a.C47892c;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ModelViewer */
/* compiled from: PG */
public interface ModelViewer extends OcclusionsHost, SurfaceMirrorer {

    /* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ModelViewer$Host */
    /* compiled from: PG */
    public interface Host {
        void emitLogProto(byte[] bArr);

        boolean ensureArPermissions();

        boolean getOnboardingGuidanceShown();

        C47892c getViewerConfig();

        void hideChipNotification();

        void hideSnackbar();

        void notifyActualScale(boolean z);

        void onArScaleUiSnap();

        void onGetRenderedImage(byte[] bArr, int i, int i2);

        void onHideLoadingIndicator();

        boolean onInterceptModelViewerTouchEvent(MotionEvent motionEvent);

        void onLoadProgress(double d);

        void onModelLoadFailed(String str);

        void onModelVisibilityChanged();

        void onRenderReadinessChanged(boolean z);

        boolean onSessionError(Types.SessionError sessionError);

        void onSnapBehavior();

        void reloadWithStreamingDisabled();

        void setOnboardingGuidanceShown(boolean z);

        void showChipNotification(Types.ChipNotificationContent chipNotificationContent);

        void showLoadObjectErrorDialog();

        void showNotification(Types.Notification notification);

        void showSnackbar(Types.SnackbarMessage snackbarMessage);

        void updateArScaleUI(float f, float f2, float f3);

        void updateOcclusionsUi();
    }

    boolean areOcclusionsActive();

    boolean areOcclusionsAvailable();

    boolean areOcclusionsRendered();

    void captureDebugLightingValues();

    void destroy();

    void enableDebugging(boolean z);

    void flushRendering();

    ArViewerLogEnumOuterClass.ArViewerLogEnum.Action getArAvailabilityErrorAction();

    SurfaceView getCaptureView();

    ImpApiHandler getImpApiHandler();

    Types.ViewerMode getMode();

    View getRootView();

    View getSceneView();

    ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerClientVersion getViewerClientVersion();

    void initialize(C47890a aVar, Host host, Types.InitialSettings initialSettings);

    boolean isModelLoaded();

    boolean isModelLoading();

    boolean isModelShown();

    boolean isTransforming();

    void loadGltf(String str, String str2, String str3);

    void loadUri(Uri uri);

    void onBottomViewGroupStateChange(Types.Visibility visibility);

    void onButtonPressed(int i);

    void onFrameRendered();

    void onSnap();

    void pause();

    void resume();

    void sendCaptureImageRequest();

    void setBottomViewGroup(BottomViewGroup bottomViewGroup);

    void setCarPaintColor(C47970b bVar);

    void setDarkMode(boolean z);

    void setDebugFrameCallback(Runnable runnable);

    void setEnableEasyPlacement(boolean z);

    void setEnableVerticalPlacement(boolean z);

    void setEnableVerticalPlacementSnapBehaviour(boolean z);

    boolean setMode(Types.ViewerMode viewerMode);

    void setNodeTransformationIndicator(NodeTransformationIndicator nodeTransformationIndicator);

    void setOcclusionRanges(float f, float f2, float f3, float f4, float f5, float f6, boolean z);

    void setOcclusionsActive(boolean z);

    void setScale(float f, Duration duration);

    void setUserActionManager(SideChannelEventManager sideChannelEventManager);

    void setWebView(CardWebView cardWebView);

    boolean supportsArMode();

    boolean supportsDracoCompression();

    void unloadModel();

    void updateTransformUI(float f, float f2, float f3);
}
