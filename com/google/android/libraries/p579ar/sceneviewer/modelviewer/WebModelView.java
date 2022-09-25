package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.sceneviewer.concurrent.CompletableFuture;
import com.google.android.libraries.p579ar.sceneviewer.immersiveedge.sidechannelevent.SideChannelEventManager;
import com.google.android.libraries.p579ar.sceneviewer.infocard.BottomViewGroup;
import com.google.android.libraries.p579ar.sceneviewer.infocard.CardWebView;
import com.google.android.libraries.p579ar.sceneviewer.modelviewer.ModelViewer;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.NodeTransformationIndicator;
import com.google.android.libraries.p579ar.sceneviewer.utilities.LoadHelper;
import com.google.android.libraries.p579ar.sceneviewer.utilities.ThreadPools;
import com.google.common.p4525e.C58967o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.p3723ar.imp.p3726a.C47970b;
import com.google.p3723ar.p3724a.p3725a.C47890a;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p3186j$.nio.charset.StandardCharsets;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.WebModelView */
/* compiled from: PG */
public final class WebModelView extends FrameLayout implements ModelViewer {
    private static final long ANIMATION_REVEAL_DURATION_MILLISECONDS = 300;
    private static final String BACKGROUND_COLOR_STRING = "#F8F9FA";
    private static final String JAVASCRIPT_INTERFACE_NAME = "webModelView";
    /* access modifiers changed from: private */
    public static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.modelviewer.WebModelView");
    private final Map baseFormatMap = new HashMap();
    /* access modifiers changed from: private */
    public View coverView;
    /* access modifiers changed from: private */
    public ModelViewer.Host host;
    /* access modifiers changed from: private */
    public boolean isLoadComplete = false;
    /* access modifiers changed from: private */
    public boolean isLoading = false;
    private final C10736c javascriptCallbacks = new C10736c(this);
    private CompletableFuture templateHtmlFuture;
    /* access modifiers changed from: private */
    public ViewPropertyAnimator viewPropertyAnimator = null;
    private WebView webView;

    public WebModelView(Context context) {
        super(context);
    }

    static /* synthetic */ String lambda$initialize$0(Context context, ModelViewer.Host host2) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream) LoadHelper.fromUri(context, Uri.parse(host2.getViewerConfig().f124005f)).call(), StandardCharsets.UTF_8));
            StringWriter stringWriter = new StringWriter();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return stringWriter.toString();
                }
                stringWriter.write(readLine);
            }
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) logger.mo56225c()).mo56382g(e)).mo56372aa(42386)).mo56386p("Failed to read templated html.");
            return BuildConfig.FLAVOR;
        }
    }

    public boolean areOcclusionsActive() {
        return false;
    }

    public boolean areOcclusionsAvailable() {
        return false;
    }

    public boolean areOcclusionsRendered() {
        return false;
    }

    public void captureDebugLightingValues() {
    }

    public void destroy() {
        this.webView.destroy();
    }

    public void enableDebugging(boolean z) {
    }

    public void flushRendering() {
    }

    public ArViewerLogEnumOuterClass.ArViewerLogEnum.Action getArAvailabilityErrorAction() {
        return ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.ACTION_UNKNOWN;
    }

    public SurfaceView getCaptureView() {
        return null;
    }

    public ImpApiHandler getImpApiHandler() {
        return null;
    }

    public Types.ViewerMode getMode() {
        return Types.ViewerMode.THREE_D;
    }

    public View getRootView() {
        return this;
    }

    public View getSceneView() {
        return this.webView;
    }

    public ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerClientVersion getViewerClientVersion() {
        return ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerClientVersion.WEB_MODEL_VIEW;
    }

    public void initialize(C47890a aVar, ModelViewer.Host host2, Types.InitialSettings initialSettings) {
        this.host = host2;
        HashSet hashSet = new HashSet();
        String str = host2.getViewerConfig().f124004e;
        hashSet.add(str);
        this.baseFormatMap.put("{{background_color}}", BACKGROUND_COLOR_STRING);
        this.baseFormatMap.put("{{javascript_interface_name}}", JAVASCRIPT_INTERFACE_NAME);
        this.baseFormatMap.put("{{model_viewer_js_uri}}", str);
        int parseColor = Color.parseColor(BACKGROUND_COLOR_STRING);
        setBackgroundColor(parseColor);
        WebView webView2 = new WebView(getContext());
        this.webView = webView2;
        webView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.webView.addJavascriptInterface(this.javascriptCallbacks, JAVASCRIPT_INTERFACE_NAME);
        this.webView.setBackgroundColor(parseColor);
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        addView(this.webView);
        View view = new View(getContext());
        this.coverView = view;
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.coverView.setBackgroundColor(parseColor);
        addView(this.coverView);
        this.templateHtmlFuture = CompletableFuture.supplyAsync(new WebModelView$$ExternalSyntheticLambda0(getContext().getApplicationContext(), host2), ThreadPools.getThreadPoolExecutor());
        this.webView.setWebViewClient(new C10734a(hashSet));
        this.webView.getSettings().setJavaScriptEnabled(true);
    }

    public boolean isModelLoaded() {
        return this.isLoadComplete;
    }

    public boolean isModelLoading() {
        return this.isLoading;
    }

    public boolean isModelShown() {
        return this.isLoadComplete;
    }

    public boolean isTransforming() {
        return false;
    }

    /* renamed from: lambda$loadGltf$1$com-google-android-libraries-ar-sceneviewer-modelviewer-WebModelView */
    public /* synthetic */ void mo19122xaa8ec55a(Map map, String str, String str2) {
        String str3 = str2;
        for (Map.Entry entry : map.entrySet()) {
            str3 = str3.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
        }
        this.webView.loadDataWithBaseURL(str, str3, (String) null, (String) null, (String) null);
    }

    public void loadGltf(String str, String str2, String str3) {
        this.isLoadComplete = false;
        this.isLoading = true;
        HashMap hashMap = new HashMap(this.baseFormatMap);
        hashMap.put("{{model_uri}}", C58967o.f156821b.mo56216a(str));
        if (str2 != null) {
            hashMap.put("{{sound_uri}}", C58967o.f156821b.mo56216a(str2));
        }
        this.templateHtmlFuture.thenAcceptAsync(new WebModelView$$ExternalSyntheticLambda1(this, hashMap, str), ThreadPools.getMainExecutor());
    }

    public void loadUri(Uri uri) {
    }

    public void onBottomViewGroupStateChange(Types.Visibility visibility) {
    }

    public void onButtonPressed(int i) {
    }

    public void onFrameRendered() {
    }

    public void onSnap() {
    }

    public void pause() {
        this.webView.onPause();
    }

    public void resume() {
        this.webView.onResume();
    }

    public void sendCaptureImageRequest() {
    }

    public void setBottomViewGroup(BottomViewGroup bottomViewGroup) {
    }

    public void setCarPaintColor(C47970b bVar) {
    }

    public void setDarkMode(boolean z) {
    }

    public void setDebugFrameCallback(Runnable runnable) {
    }

    public void setEnableEasyPlacement(boolean z) {
    }

    public void setEnableVerticalPlacement(boolean z) {
    }

    public void setEnableVerticalPlacementSnapBehaviour(boolean z) {
    }

    public boolean setMode(Types.ViewerMode viewerMode) {
        return viewerMode == Types.ViewerMode.THREE_D;
    }

    public void setNodeTransformationIndicator(NodeTransformationIndicator nodeTransformationIndicator) {
    }

    public void setOcclusionRanges(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
    }

    public void setOcclusionsActive(boolean z) {
    }

    public void setScale(float f, Duration duration) {
    }

    public void setUserActionManager(SideChannelEventManager sideChannelEventManager) {
    }

    public void setWebView(CardWebView cardWebView) {
    }

    public void startMirroringToSurface(Surface surface, int i, int i2, int i3, int i4) {
    }

    public void stopMirroringToSurface(Surface surface) {
    }

    public boolean supportsArMode() {
        return false;
    }

    public boolean supportsDracoCompression() {
        return false;
    }

    public void unloadModel() {
    }

    public void updateTransformUI(float f, float f2, float f3) {
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ModelViewer.Host host2 = this.host;
        host2.getClass();
        return host2.onInterceptModelViewerTouchEvent(motionEvent);
    }

    public WebModelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
