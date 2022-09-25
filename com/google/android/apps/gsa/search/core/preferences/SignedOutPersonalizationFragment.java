package com.google.android.apps.gsa.search.core.preferences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewFragment;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.p6818b.C86295a;
import com.google.android.apps.gsa.search.core.preferences.p6818b.C86296b;
import com.google.android.apps.gsa.search.core.preferences.p6818b.C86298c;
import com.google.android.apps.gsa.search.core.preferences.p6818b.C86299d;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@ProguardMustNotDelete
/* compiled from: PG */
public class SignedOutPersonalizationFragment extends WebViewFragment {

    /* renamed from: a */
    public static final C59071e f233314a = C59071e.m91332i("com.google.android.apps.gsa.search.core.preferences.SignedOutPersonalizationFragment");

    /* renamed from: b */
    public C86124t f233315b;

    /* renamed from: c */
    public C68214a f233316c;

    /* renamed from: d */
    public C22871g f233317d;

    /* renamed from: e */
    public C86296b f233318e;

    /* renamed from: f */
    public C86299d f233319f;

    /* renamed from: g */
    public C84474e f233320g;

    /* renamed from: h */
    public Set f233321h = new HashSet();

    /* renamed from: i */
    private WebView f233322i;

    /* renamed from: com.google.android.apps.gsa.search.core.preferences.SignedOutPersonalizationFragment$a */
    /* compiled from: PG */
    public interface C86281a {
        /* renamed from: qj */
        void mo79993qj(SignedOutPersonalizationFragment signedOutPersonalizationFragment);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f233315b == null) {
            ((C86281a) C47266f.m84076a(getActivity(), C86281a.class)).mo79993qj(this);
        }
        HashSet hashSet = new HashSet();
        this.f233321h = hashSet;
        hashSet.addAll(Arrays.asList(new String[]{"history.google.com", "history.sandbox.google.com", "myactivity.google.com"}));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WebView webView = (WebView) super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f233322i = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f233322i.addJavascriptInterface(this, "interface");
        this.f233322i.setWebViewClient(new C86290af(this));
        this.f233322i.loadUrl("https://history.google.com/history/optout?agsa=1&nogb=1");
        return this.f233322i;
    }

    @JavascriptInterface
    public void setSignedOutSearchCustomizationEnabled(boolean z) {
        if (z != ((SharedPreferences) this.f233316c.mo27525b()).getBoolean("signed_out_search", true)) {
            C86296b bVar = this.f233318e;
            new C90873ag(C60922j.m93044g(C60838bs.m92859i(bVar.f233336b.mo79697b()), new C86295a(bVar), C60826bg.f164896a), this.f233317d, "record signed-out customization setting", new C86285aa(z)).mo85223a(C86286ab.f233325a);
            if (this.f233320g.mo78131t()) {
                C86299d dVar = this.f233319f;
                C90873ag agVar = new C90873ag(C60922j.m93045h(C60838bs.m92859i(dVar.f233340b.mo79697b()), new C86298c(dVar, z), C60826bg.f164896a), this.f233317d, "Set TNG signed-out customization data store", C86287ac.f233326a);
                agVar.mo85224b(Exception.class, C86288ad.f233327a);
                agVar.mo85223a(C86289ae.f233328a);
            }
            ((SharedPreferences) this.f233316c.mo27525b()).edit().putBoolean("signed_out_search", z).apply();
        }
    }
}
