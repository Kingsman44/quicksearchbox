package com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.shared;

import android.content.Context;
import android.net.Uri;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84020o;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109772d;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109780l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.ui.shared.ConsentHeaderLayout */
/* compiled from: PG */
public class ConsentHeaderLayout extends FrameLayout {

    /* renamed from: a */
    private boolean f306102a;

    public ConsentHeaderLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public final void mo98208b(int i) {
        int i2;
        int i3;
        if (!this.f306102a) {
            if (i - 1 != 0) {
                this.f306102a = true;
                i2 = 46421;
                i3 = R.id.opa_consent_value_prop_fallback;
            } else {
                i2 = 46420;
                i3 = R.id.opa_consent_value_prop_content_root;
            }
            C28295m.m52919e(this, new C28292j(i2));
            findViewById(i3).setVisibility(0);
        }
    }

    public ConsentHeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo98207a(C109772d dVar) {
        C109780l lVar;
        int i = dVar.f305861a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            if (i == 1) {
                lVar = (C109780l) dVar.f305862b;
            } else {
                lVar = C109780l.f305895d;
            }
            LayoutInflater.from(getContext()).inflate(R.layout.value_prop, this, true);
            if ((lVar.f305897a & 1) != 0) {
                try {
                    boolean z = !lVar.f305899c.isEmpty();
                    WebView webView = (WebView) findViewById(R.id.opa_consent_value_prop_webview);
                    webView.setWebViewClient(new C84020o(new C109857a(this)));
                    webView.getSettings().setJavaScriptEnabled(true);
                    String str = lVar.f305898b;
                    if (z) {
                        str = Uri.parse(str).buildUpon().appendQueryParameter("hideHeader", "true").build().toString();
                    }
                    webView.loadUrl(str);
                    webView.setBackgroundColor(0);
                    if (z) {
                        HeaderLayout headerLayout = (HeaderLayout) findViewById(R.id.opa_header);
                        C84018m.m133908c(headerLayout.f228718a, lVar.f305899c, TextView.BufferType.NORMAL, headerLayout);
                        headerLayout.setVisibility(0);
                    }
                } catch (Exception unused) {
                    mo98208b(2);
                }
            } else {
                mo98208b(2);
            }
        } else if (i3 == 1) {
            Context context = getContext();
            String str2 = dVar.f305861a == 2 ? (String) dVar.f305862b : BuildConfig.FLAVOR;
            HeaderLayout headerLayout2 = new HeaderLayout(context);
            C84018m.m133908c(headerLayout2.f228718a, Html.fromHtml(str2), TextView.BufferType.NORMAL, headerLayout2);
            C84018m.m133908c(headerLayout2.f228719b, (CharSequence) null, TextView.BufferType.NORMAL, headerLayout2);
            headerLayout2.setId(R.id.consent_header_opa_header);
            addView(headerLayout2);
        } else if (i3 == 2) {
            setVisibility(8);
        }
    }
}
