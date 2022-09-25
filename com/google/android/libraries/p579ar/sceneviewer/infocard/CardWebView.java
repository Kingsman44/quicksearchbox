package com.google.android.libraries.p579ar.sceneviewer.infocard;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.google.android.libraries.p11026am.C147759b;
import com.google.android.libraries.p579ar.sceneviewer.utilities.AppUtilities;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.ar.sceneviewer.infocard.CardWebView */
/* compiled from: PG */
public final class CardWebView extends WebView {
    private static final int FADE_IN_DURATION_MILLIS = 300;
    private static final String GSA_VERSION_HEADER = "GSA";
    private static final String INFO_CARD_PATH = "searchar/infocard";
    private static final String JAVASCRIPT_INTERFACE_NAME = "Viewer";
    private static final C58485gu URL_ALLOWLIST = C58485gu.m89851s("https://ar-streaming-infocard-staging.appspot.com/*", "https://ar-streaming-infocard.appspot.com/*", "https://svp-staging.appspot.com/*", "https://arvr.google.com/*", "https://www.gstatic.com/ar/core/viewer/*", "https://arvr-searchar*.sandbox.google.com/*");
    private static final C58485gu URL_OVERRIDE_LIST = C58485gu.m89845m();
    /* access modifiers changed from: private */
    public static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.infocard.CardWebView");
    /* access modifiers changed from: private */
    public final AtomicBoolean modelEventTriggered = new AtomicBoolean(false);
    private final List pageLoadListeners = new ArrayList();
    private final AtomicBoolean pageLoaded = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public boolean transparentModeEnabled = false;

    /* renamed from: com.google.android.libraries.ar.sceneviewer.infocard.CardWebView$PageLoadListener */
    /* compiled from: PG */
    public interface PageLoadListener {
        void onPageLoaded(String str, int i);
    }

    public CardWebView(Context context) {
        super(context);
        initialize();
    }

    private void initialize() {
        getSettings().setJavaScriptEnabled(true);
        setScrollBarStyle(0);
        setVisibility(4);
        if (AppUtilities.isDarkMode(getContext())) {
            getSettings().setForceDark(2);
        } else {
            getSettings().setForceDark(0);
        }
        setBackgroundColor(0);
        C10719g gVar = new C10719g(this, new C147759b((List) URL_OVERRIDE_LIST), new C147759b((List) URL_ALLOWLIST));
        gVar.f398703c = true;
        setWebViewClient(gVar);
    }

    /* access modifiers changed from: private */
    public void onReadyToRender(String str, int i) {
        setAlpha(0.0f);
        setVisibility(0);
        animate().cancel();
        animate().setDuration(300).alpha(1.0f).withEndAction(new CardWebView$$ExternalSyntheticLambda0(this, str, i));
    }

    public void addPageLoadListener(PageLoadListener pageLoadListener) {
        this.pageLoadListeners.add(pageLoadListener);
    }

    public void enableTransparentMode(boolean z) {
        if (z) {
            setLayerType(1, (Paint) null);
        }
        this.transparentModeEnabled = z;
    }

    public boolean isPageLoaded() {
        return this.pageLoaded.get();
    }

    /* renamed from: lambda$onReadyToRender$0$com-google-android-libraries-ar-sceneviewer-infocard-CardWebView */
    public /* synthetic */ void mo18900x4434392b(String str, int i) {
        this.pageLoaded.set(true);
        for (PageLoadListener onPageLoaded : this.pageLoadListeners) {
            onPageLoaded.onPageLoaded(str, i);
        }
    }

    public void removePageLoadListener(PageLoadListener pageLoadListener) {
        this.pageLoadListeners.remove(pageLoadListener);
    }

    public void setGsaVersionName(String str) {
        String str2 = getSettings().getUserAgentString() + " GSA/" + str;
        ((C59052c) ((C59052c) logger.mo56224b()).mo56372aa(42343)).mo56389s("User Agent for CardWebView is %s", str2);
        getSettings().setUserAgentString(str2);
    }

    public CardWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize();
    }

    public CardWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize();
    }
}
