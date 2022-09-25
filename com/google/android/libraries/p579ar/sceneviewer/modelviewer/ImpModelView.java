package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import android.content.Context;
import android.net.Uri;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.libraries.p579ar.sceneviewer.common.function.HexaConsumer;
import com.google.android.libraries.p579ar.sceneviewer.common.function.TetraConsumer;
import com.google.android.libraries.p579ar.sceneviewer.common.function.TriConsumer;
import com.google.android.libraries.p579ar.sceneviewer.immersiveedge.sidechannelevent.SideChannelEventManager;
import com.google.android.libraries.p579ar.sceneviewer.infocard.BottomViewGroup;
import com.google.android.libraries.p579ar.sceneviewer.infocard.CardWebView;
import com.google.android.libraries.p579ar.sceneviewer.modelviewer.ModelViewer;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.NodeTransformationIndicator;
import com.google.android.libraries.p579ar.sceneviewer.permissions.PermissionUtilities;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.p3723ar.imp.p3726a.C47970b;
import com.google.p3723ar.imp.view.C47982ab;
import com.google.p3723ar.imp.view.C47984ad;
import com.google.p3723ar.imp.view.C47985ae;
import com.google.p3723ar.imp.view.C47993i;
import com.google.p3723ar.imp.view.C48000j;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p3723ar.imp.view.C48006p;
import com.google.p3723ar.imp.view.C48007q;
import com.google.p3723ar.p3724a.p3725a.C47890a;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView */
/* compiled from: PG */
public final class ImpModelView extends FrameLayout implements ModelViewer {
    private static final String DEFAULT_NATIVE_LIBRARY_NAME = "agsa_renderer_jni";
    private static final int VIBRATION_DURATION = 20;
    private static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.modelviewer.ImpModelView");
    private Runnable debugFrameCallback = null;
    private final Object debugFrameCallbackLock = new Object();
    private final ImpApiHandler impApiHandler = new ImpApiHandler();
    private final C48007q impView;
    final CardWebView.PageLoadListener loadScriptAPICallback = new ImpModelView$$ExternalSyntheticLambda20(this);
    private ModelViewer.Host modelViewerHost = null;
    private NodeTransformationIndicator nodeTransformationIndicator;
    private CardWebView webView = null;

    public ImpModelView(Context context) {
        super(context);
        this.impView = new C48007q(context);
    }

    public static boolean isSupported() {
        return true;
    }

    /* access modifiers changed from: private */
    public static native int nArAvailabilityErrorAction(long j);

    /* access modifiers changed from: private */
    public static native boolean nAreOcclusionsActive(long j);

    /* access modifiers changed from: private */
    public static native boolean nAreOcclusionsAvailable(long j);

    /* access modifiers changed from: private */
    public static native boolean nAreOcclusionsRendered(long j);

    /* access modifiers changed from: private */
    public static native void nEnableDebugging(long j, boolean z);

    /* access modifiers changed from: private */
    public static native void nFlushRendering(long j);

    /* access modifiers changed from: private */
    public static native int nGetMode(long j);

    /* access modifiers changed from: private */
    public static native void nInitialize(long j, Object obj, byte[] bArr);

    private static native boolean nIsCaptureAvailable(long j);

    /* access modifiers changed from: private */
    public static native boolean nIsModelLoaded(long j);

    /* access modifiers changed from: private */
    public static native boolean nIsModelLoading(long j);

    /* access modifiers changed from: private */
    public static native boolean nIsModelShown(long j);

    /* access modifiers changed from: private */
    public static native boolean nIsTransforming(long j);

    /* access modifiers changed from: private */
    public static native void nLoadGltf(long j, String str, String str2, String str3);

    /* access modifiers changed from: private */
    public static native void nLoadScriptingAPI(long j);

    /* access modifiers changed from: private */
    public static native void nLoadUri(long j, String str);

    /* access modifiers changed from: private */
    public static native void nOnBottomViewGroupStateChange(long j, Types.Visibility visibility);

    /* access modifiers changed from: private */
    public static native void nOnButtonPressed(long j, int i);

    /* access modifiers changed from: private */
    public static native void nPause(long j);

    /* access modifiers changed from: private */
    public static native void nResume(long j);

    /* access modifiers changed from: private */
    public static native void nSendCaptureImageRequest(long j);

    /* access modifiers changed from: private */
    public static native void nSetBottomViewGroup(long j, BottomViewGroup bottomViewGroup);

    /* access modifiers changed from: private */
    public static native void nSetDarkMode(long j, boolean z);

    /* access modifiers changed from: private */
    public static native void nSetEnableEasyPlacement(long j, boolean z);

    /* access modifiers changed from: private */
    public static native void nSetEnableVerticalPlacement(long j, boolean z);

    /* access modifiers changed from: private */
    public static native void nSetEnableVerticalPlacementSnapBehaviour(long j, boolean z);

    /* access modifiers changed from: private */
    public static native boolean nSetMode(long j, int i);

    /* access modifiers changed from: private */
    public static native void nSetOcclusionsActive(long j, boolean z);

    /* access modifiers changed from: private */
    public static native void nSetScale(long j, float f, int i);

    /* access modifiers changed from: private */
    public static native void nSetSideChannelEventHandler(long j, SideChannelEventManager sideChannelEventManager);

    /* access modifiers changed from: private */
    public static native void nSetWebView(long j, WebView webView2);

    /* access modifiers changed from: private */
    public static native void nStartMirroringToNativeWindow(long j, Surface surface, int i, int i2, int i3, int i4);

    /* access modifiers changed from: private */
    public static native void nStopMirroringToNativeWindow(long j, Surface surface);

    /* access modifiers changed from: private */
    public static native boolean nSupportsArMode(long j);

    /* access modifiers changed from: private */
    public static native void nUnloadModel(long j);

    public boolean areOcclusionsActive() {
        Optional call = this.impApiHandler.call((Function) ImpModelView$$ExternalSyntheticLambda21.INSTANCE);
        if (!call.isPresent()) {
            return false;
        }
        return ((Boolean) call.get()).booleanValue();
    }

    public boolean areOcclusionsAvailable() {
        Optional call = this.impApiHandler.call((Function) ImpModelView$$ExternalSyntheticLambda15.INSTANCE);
        if (!call.isPresent()) {
            return false;
        }
        return ((Boolean) call.get()).booleanValue();
    }

    public boolean areOcclusionsRendered() {
        Optional call = this.impApiHandler.call((Function) ImpModelView$$ExternalSyntheticLambda14.INSTANCE);
        if (!call.isPresent()) {
            return false;
        }
        return ((Boolean) call.get()).booleanValue();
    }

    public void captureDebugLightingValues() {
    }

    public void destroy() {
        this.impApiHandler.releaseResources();
        CardWebView cardWebView = this.webView;
        if (cardWebView != null) {
            cardWebView.removePageLoadListener(this.loadScriptAPICallback);
        }
    }

    public void enableDebugging(boolean z) {
        this.impApiHandler.call((BiConsumer) ImpModelView$$ExternalSyntheticLambda12.INSTANCE, (Object) Boolean.valueOf(z));
    }

    public void flushRendering() {
        this.impApiHandler.call((Consumer) ImpModelView$$ExternalSyntheticLambda19.INSTANCE);
    }

    public ArViewerLogEnumOuterClass.ArViewerLogEnum.Action getArAvailabilityErrorAction() {
        Optional call = this.impApiHandler.call((Function) ImpModelView$$ExternalSyntheticLambda22.INSTANCE);
        if (!call.isPresent()) {
            return ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.ACTION_UNKNOWN;
        }
        return ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.forNumber(((Integer) call.get()).intValue());
    }

    public SurfaceView getCaptureView() {
        return this.impView;
    }

    public ImpApiHandler getImpApiHandler() {
        return this.impApiHandler;
    }

    public Types.ViewerMode getMode() {
        Optional call = this.impApiHandler.call((Function) ImpModelView$$ExternalSyntheticLambda18.INSTANCE);
        if (!call.isPresent()) {
            return Types.ViewerMode.THREE_D;
        }
        int intValue = ((Integer) call.get()).intValue();
        if (intValue < 0 || intValue >= Types.ViewerMode.values().length) {
            return Types.ViewerMode.THREE_D;
        }
        return Types.ViewerMode.values()[intValue];
    }

    public View getRootView() {
        return this;
    }

    public View getSceneView() {
        return this.impView;
    }

    public ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerClientVersion getViewerClientVersion() {
        return ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerClientVersion.IMP_MODEL_VIEW;
    }

    public void initialize(C47890a aVar, ModelViewer.Host host, Types.InitialSettings initialSettings) {
        this.modelViewerHost = host;
        this.impApiHandler.call((TriConsumer) ImpModelView$$ExternalSyntheticLambda29.INSTANCE, (Object) host, (Object) initialSettings.toByteArray());
    }

    public boolean isModelLoaded() {
        Optional call = this.impApiHandler.call((Function) ImpModelView$$ExternalSyntheticLambda8.INSTANCE);
        if (!call.isPresent()) {
            return false;
        }
        return ((Boolean) call.get()).booleanValue();
    }

    public boolean isModelLoading() {
        Optional call = this.impApiHandler.call((Function) ImpModelView$$ExternalSyntheticLambda2.INSTANCE);
        if (!call.isPresent()) {
            return false;
        }
        return ((Boolean) call.get()).booleanValue();
    }

    public boolean isModelShown() {
        Optional call = this.impApiHandler.call((Function) ImpModelView$$ExternalSyntheticLambda17.INSTANCE);
        if (!call.isPresent()) {
            return false;
        }
        return ((Boolean) call.get()).booleanValue();
    }

    public boolean isSuccessfullyInitialized() {
        return this.impApiHandler.isReady();
    }

    public boolean isTransforming() {
        Optional call = this.impApiHandler.call((Function) ImpModelView$$ExternalSyntheticLambda34.INSTANCE);
        if (!call.isPresent()) {
            return false;
        }
        return ((Boolean) call.get()).booleanValue();
    }

    /* renamed from: lambda$new$0$com-google-android-libraries-ar-sceneviewer-modelviewer-ImpModelView */
    public /* synthetic */ void mo19065x9ddac43a(String str, int i) {
        if (i == 0) {
            this.impApiHandler.call((Consumer) ImpModelView$$ExternalSyntheticLambda23.INSTANCE);
        }
    }

    /* renamed from: lambda$setupAsync$1$com-google-android-libraries-ar-sceneviewer-modelviewer-ImpModelView */
    public /* synthetic */ C60870cx mo19066xc1703f00(C48004n nVar) {
        this.impApiHandler.setImpApi(nVar);
        return C60856cj.m92900i(nVar);
    }

    public void loadGltf(String str, String str2, String str3) {
        this.impApiHandler.call((TetraConsumer) ImpModelView$$ExternalSyntheticLambda16.INSTANCE, (Object) str, (Object) C58837ba.m90858g(str2), (Object) C58837ba.m90858g(str3));
    }

    public void loadUri(Uri uri) {
        this.impApiHandler.call((BiConsumer) ImpModelView$$ExternalSyntheticLambda7.INSTANCE, (Object) uri.toString());
    }

    public void onBottomViewGroupStateChange(Types.Visibility visibility) {
        this.impApiHandler.call((BiConsumer) ImpModelView$$ExternalSyntheticLambda0.INSTANCE, (Object) visibility);
    }

    public void onButtonPressed(int i) {
        this.impApiHandler.call((BiConsumer) ImpModelView$$ExternalSyntheticLambda5.INSTANCE, (Object) Integer.valueOf(i));
    }

    public void onFrameRendered() {
        synchronized (this.debugFrameCallbackLock) {
            Runnable runnable = this.debugFrameCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void onSnap() {
        if (getContext() != null && PermissionUtilities.checkPermission(getContext(), "android.permission.VIBRATE")) {
            try {
                ((Vibrator) getContext().getSystemService("vibrator")).vibrate(VibrationEffect.createOneShot(20, -1));
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) logger.mo56225c()).mo56382g(e)).mo56372aa(42384)).mo56386p("Unexpected failure during VibrationEffect");
            }
        }
    }

    public void pause() {
        this.impApiHandler.call((Consumer) ImpModelView$$ExternalSyntheticLambda4.INSTANCE);
        this.impApiHandler.stopFrameLoop();
    }

    public void resume() {
        this.impApiHandler.startFrameLoop();
        this.impApiHandler.call((Consumer) ImpModelView$$ExternalSyntheticLambda33.INSTANCE);
    }

    public void sendCaptureImageRequest() {
        this.impApiHandler.call((Consumer) ImpModelView$$ExternalSyntheticLambda35.INSTANCE);
    }

    public void setBottomViewGroup(BottomViewGroup bottomViewGroup) {
        this.impApiHandler.call((BiConsumer) ImpModelView$$ExternalSyntheticLambda32.INSTANCE, (Object) bottomViewGroup);
    }

    public void setCarPaintColor(C47970b bVar) {
    }

    public void setDarkMode(boolean z) {
        this.impApiHandler.call((BiConsumer) ImpModelView$$ExternalSyntheticLambda10.INSTANCE, (Object) Boolean.valueOf(z));
    }

    public void setDebugFrameCallback(Runnable runnable) {
        synchronized (this.debugFrameCallbackLock) {
            this.debugFrameCallback = runnable;
        }
    }

    public void setEnableEasyPlacement(boolean z) {
        this.impApiHandler.call((BiConsumer) ImpModelView$$ExternalSyntheticLambda26.INSTANCE, (Object) Boolean.valueOf(z));
    }

    public void setEnableVerticalPlacement(boolean z) {
        this.impApiHandler.call((BiConsumer) ImpModelView$$ExternalSyntheticLambda13.INSTANCE, (Object) Boolean.valueOf(z));
    }

    public void setEnableVerticalPlacementSnapBehaviour(boolean z) {
        this.impApiHandler.call((BiConsumer) ImpModelView$$ExternalSyntheticLambda27.INSTANCE, (Object) Boolean.valueOf(z));
    }

    public boolean setMode(Types.ViewerMode viewerMode) {
        Optional call = this.impApiHandler.call((BiFunction) ImpModelView$$ExternalSyntheticLambda11.INSTANCE, (Object) Integer.valueOf(viewerMode != null ? viewerMode.getNumber() : -1));
        if (!call.isPresent()) {
            return false;
        }
        return ((Boolean) call.get()).booleanValue();
    }

    public void setNodeTransformationIndicator(NodeTransformationIndicator nodeTransformationIndicator2) {
        this.nodeTransformationIndicator = nodeTransformationIndicator2;
    }

    public void setOcclusionRanges(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
    }

    public void setOcclusionsActive(boolean z) {
        this.impApiHandler.call((BiConsumer) ImpModelView$$ExternalSyntheticLambda25.INSTANCE, (Object) Boolean.valueOf(z));
    }

    public void setScale(float f, Duration duration) {
        this.impApiHandler.call((TriConsumer) ImpModelView$$ExternalSyntheticLambda30.INSTANCE, (Object) Float.valueOf(f), (Object) Integer.valueOf((int) duration.toMillis()));
    }

    public void setUserActionManager(SideChannelEventManager sideChannelEventManager) {
        this.impApiHandler.call((BiConsumer) ImpModelView$$ExternalSyntheticLambda9.INSTANCE, (Object) sideChannelEventManager);
    }

    public void setWebView(CardWebView cardWebView) {
        cardWebView.addPageLoadListener(this.loadScriptAPICallback);
        this.impApiHandler.call((BiConsumer) ImpModelView$$ExternalSyntheticLambda31.INSTANCE, (Object) cardWebView);
        this.webView = cardWebView;
    }

    public void setup() {
        this.impView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.impView);
        C48007q qVar = this.impView;
        C47982ab abVar = (C47982ab) C47985ae.f124188h.createBuilder();
        abVar.copyOnWrite();
        C47985ae aeVar = (C47985ae) abVar.instance;
        aeVar.f124190a |= 8;
        aeVar.f124194e = "scene_viewer";
        abVar.copyOnWrite();
        C47985ae aeVar2 = (C47985ae) abVar.instance;
        aeVar2.f124190a |= 1;
        aeVar2.f124191b = DEFAULT_NATIVE_LIBRARY_NAME;
        qVar.f124242b = C48004n.m85167e((C47985ae) abVar.build(), qVar.f124241a, qVar);
        this.impApiHandler.setImpApi(qVar.f124242b);
    }

    public C60870cx setupAsync(Executor executor, Executor executor2) {
        this.impView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.impView);
        C48007q qVar = this.impView;
        C47982ab abVar = (C47982ab) C47985ae.f124188h.createBuilder();
        abVar.copyOnWrite();
        C47985ae aeVar = (C47985ae) abVar.instance;
        aeVar.f124190a |= 8;
        aeVar.f124194e = "scene_viewer";
        abVar.copyOnWrite();
        C47985ae aeVar2 = (C47985ae) abVar.instance;
        int i = 1;
        aeVar2.f124190a |= 1;
        aeVar2.f124191b = DEFAULT_NATIVE_LIBRARY_NAME;
        C47985ae aeVar3 = (C47985ae) abVar.build();
        C60870cx f = C48004n.m85168f(aeVar3, qVar.f124241a, executor2);
        int a = C47984ad.m85154a(aeVar3.f124196g);
        if (a != 0) {
            i = a;
        }
        C47993i iVar = new C47993i(i);
        return C60922j.m93045h(C60922j.m93044g(C60922j.m93044g(f, new C48000j(aeVar3, iVar, qVar), iVar.mo53095a()), new C48006p(qVar), executor), C47810es.m84966f(new ImpModelView$$ExternalSyntheticLambda3(this)), executor);
    }

    public void startMirroringToSurface(Surface surface, int i, int i2, int i3, int i4) {
        this.impApiHandler.call((HexaConsumer) ImpModelView$$ExternalSyntheticLambda1.INSTANCE, (Object) surface, (Object) Integer.valueOf(i), (Object) Integer.valueOf(i2), (Object) Integer.valueOf(i3), (Object) Integer.valueOf(i4));
    }

    public void stopMirroringToSurface(Surface surface) {
        this.impApiHandler.call((BiConsumer) ImpModelView$$ExternalSyntheticLambda24.INSTANCE, (Object) surface);
    }

    public boolean supportsArMode() {
        Optional call = this.impApiHandler.call((Function) ImpModelView$$ExternalSyntheticLambda6.INSTANCE);
        if (!call.isPresent()) {
            return false;
        }
        return ((Boolean) call.get()).booleanValue();
    }

    public boolean supportsDracoCompression() {
        return true;
    }

    public void unloadModel() {
        this.impApiHandler.call((Consumer) ImpModelView$$ExternalSyntheticLambda28.INSTANCE);
    }

    public void updateTransformUI(float f, float f2, float f3) {
        NodeTransformationIndicator nodeTransformationIndicator2 = this.nodeTransformationIndicator;
        if (nodeTransformationIndicator2 != null) {
            nodeTransformationIndicator2.update(f, f2, f3, C59203do.f157270a);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ModelViewer.Host host = this.modelViewerHost;
        host.getClass();
        return host.onInterceptModelViewerTouchEvent(motionEvent);
    }

    public ImpModelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.impView = new C48007q(context);
    }
}
