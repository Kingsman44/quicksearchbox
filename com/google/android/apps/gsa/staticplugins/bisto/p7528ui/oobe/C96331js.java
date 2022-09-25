package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import com.google.android.apps.gsa.opaonboarding.C83895ba;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83914a;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83915b;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89642m;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142346by;
import com.google.android.p10712d.C142355cg;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.js */
/* compiled from: PG */
public final class C96331js {

    /* renamed from: a */
    public final List f269544a = new ArrayList();

    /* renamed from: b */
    private final C91189au f269545b;

    public C96331js(C91189au auVar) {
        this.f269545b = auVar;
    }

    /* renamed from: a */
    static C83915b m159639a(C124719q qVar) {
        return m159640b(qVar, false, C142324bc.f386113s);
    }

    /* renamed from: b */
    static C83915b m159640b(C124719q qVar, boolean z, C142324bc bcVar) {
        int i;
        String str = null;
        if (qVar.equals(C124719q.GACS_DEVICE)) {
            C142346by byVar = bcVar.f386120f;
            if (byVar == null) {
                byVar = C142346by.f386219m;
            }
            if ((byVar.f386221a & 256) != 0) {
                C142346by byVar2 = bcVar.f386120f;
                if (byVar2 == null) {
                    byVar2 = C142346by.f386219m;
                }
                C142355cg cgVar = byVar2.f386231k;
                if (cgVar == null) {
                    cgVar = C142355cg.f386263b;
                }
                str = C124525f.m203990f(cgVar.f386265a);
            }
        }
        if (!z) {
            if (!C58837ba.m90859h(str)) {
                C83914a g = m159643g();
                g.copyOnWrite();
                C83915b bVar = (C83915b) g.instance;
                C83915b bVar2 = C83915b.f228541j;
                str.getClass();
                bVar.f228543a |= 4;
                bVar.f228546d = str;
                return (C83915b) g.build();
            }
        } else if (qVar.equals(C124719q.GACS_DEVICE)) {
            i = R.string.assistant_bisto_oobe_exit_setup_after_success;
            C83914a g2 = m159643g();
            g2.copyOnWrite();
            C83915b bVar3 = (C83915b) g2.instance;
            C83915b bVar4 = C83915b.f228541j;
            bVar3.f228543a |= 8;
            bVar3.f228547e = i;
            return (C83915b) g2.build();
        }
        i = C89642m.m145915a(qVar);
        C83914a g22 = m159643g();
        g22.copyOnWrite();
        C83915b bVar32 = (C83915b) g22.instance;
        C83915b bVar42 = C83915b.f228541j;
        bVar32.f228543a |= 8;
        bVar32.f228547e = i;
        return (C83915b) g22.build();
    }

    /* renamed from: e */
    static void m159641e(Context context, Runnable runnable, C124719q qVar, boolean z, C142324bc bcVar) {
        C83895ba.m133621a(context, m159640b(qVar, z, bcVar), new C96328jp(runnable), C96329jq.f269542a).mo77277a();
    }

    /* renamed from: f */
    static boolean m159642f(String str) {
        return str.toLowerCase(Locale.getDefault()).endsWith(".png") || str.toLowerCase(Locale.getDefault()).endsWith(".jpg");
    }

    /* renamed from: g */
    private static C83914a m159643g() {
        C83914a aVar = (C83914a) C83915b.f228541j.createBuilder();
        aVar.copyOnWrite();
        C83915b bVar = (C83915b) aVar.instance;
        bVar.f228543a |= 2;
        bVar.f228545c = R.string.bisto_udc_cancel_confirm_title;
        aVar.copyOnWrite();
        C83915b bVar2 = (C83915b) aVar.instance;
        bVar2.f228543a |= 32;
        bVar2.f228549g = R.string.bisto_udc_cancel_confirm_button_positive;
        aVar.copyOnWrite();
        C83915b bVar3 = (C83915b) aVar.instance;
        bVar3.f228543a |= 128;
        bVar3.f228551i = R.string.bisto_udc_cancel_confirm_button_negative;
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo90076c(Context context, C58833ax axVar) {
        if (axVar.mo56113h()) {
            mo90077d(context, (String) axVar.mo56107c());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo90077d(Context context, String str) {
        C90476a aVar = C91018d.f254254a;
        WebView webView = new WebView(context);
        this.f269544a.add(webView);
        webView.setWebViewClient(new C96330jr(new C96327jo(this, webView)));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(str);
        if (m159642f(str)) {
            this.f269545b.mo85431u(Uri.parse(str));
        }
    }
}
