package com.google.android.apps.gsa.staticplugins.webview;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.v */
/* compiled from: PG */
public final /* synthetic */ class C118265v implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C118119ai f328327a;

    public /* synthetic */ C118265v(C118119ai aiVar) {
        this.f328327a = aiVar;
    }

    public final void run() {
        C118119ai aiVar = this.f328327a;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (aiVar.f327786E) {
            Uri uri = null;
            boolean z = false;
            C118116af afVar = null;
            C118116af afVar2 = null;
            C118116af afVar3 = null;
            C118116af afVar4 = null;
            C118116af afVar5 = null;
            for (C118116af afVar6 : aiVar.f327786E) {
                afVar6.f327770e = aiVar.f327833n.mo26871c();
                synchronized (aiVar.f327823d) {
                    aiVar.f327826g.add(afVar6);
                }
                int i = afVar6.f327766a;
                if (i == 0) {
                    afVar2 = null;
                    afVar5 = null;
                    afVar = afVar6;
                } else if (i == 1) {
                    afVar2 = afVar6;
                    z = true;
                } else if (i != 2) {
                    if (i == 3) {
                        afVar5 = afVar6;
                    } else if (i == 4) {
                        afVar4 = afVar6;
                    }
                } else if (afVar3 == null) {
                    afVar3 = afVar6;
                }
            }
            if (z) {
                C118260q qVar = aiVar.f327785D;
                String b = qVar.f328307b.mo79763b();
                WebView webView = qVar.f328306a;
                if (webView != null) {
                    webView.loadUrl(b);
                }
            }
            if (afVar != null) {
                aiVar.mo103543q(afVar.f327767b, afVar.f327768c.f252749G);
                if (aiVar.mo103552z()) {
                    aiVar.mo103551y();
                }
            }
            if (afVar2 != null) {
                String str = afVar2.f327767b;
                long j = afVar2.f327768c.f252749G;
                aiVar.mo103541o(j);
                aiVar.mo103543q(str, j);
                C118118ah ahVar = (C118118ah) aiVar.f327824e.get();
                ahVar.mo103526d(ahVar.f327774b, j, C118826c.f331422a);
                aiVar.f327828i = str;
                Integer num = (Integer) aiVar.f327804W.get(aiVar.f327828i);
                int i2 = aiVar.f327812ae;
                if (!(i2 == 1 || i2 == 4 || num == null)) {
                    aiVar.f327830k.f327771a = num.intValue();
                    aiVar.mo83590a("if (document.readyState === 'complete') {  window.agsa_ext.restoreWebpageScrollPosition(history.scrollRestoration === 'auto');}else {  window.onload=function() {   window.agsa_ext.restoreWebpageScrollPosition(history.scrollRestoration === 'auto');  };}");
                }
                aiVar.f327812ae = 1;
            }
            if (afVar3 != null) {
                Uri parse = Uri.parse(afVar3.f327767b);
                String i3 = aiVar.mo103535i();
                if (!TextUtils.isEmpty(i3)) {
                    uri = Uri.parse(i3);
                }
                aiVar.f327838s.mo80892o(afVar3.f327768c, parse, uri);
            }
            if (afVar5 != null) {
                long j2 = afVar5.f327768c.f252749G;
                if (j2 != -1) {
                    aiVar.f327838s.mo80898u(j2);
                }
            }
            if (afVar4 != null) {
                aiVar.f327838s.mo80897t(afVar4.f327768c.f252749G, afVar4.f327769d);
            }
            aiVar.f327786E.clear();
        }
    }
}
