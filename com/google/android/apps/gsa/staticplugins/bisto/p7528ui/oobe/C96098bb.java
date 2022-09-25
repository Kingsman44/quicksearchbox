package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.webkit.WebView;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.bb */
/* compiled from: PG */
public abstract class C96098bb extends C96093ax {

    /* renamed from: m */
    private static final C59071e f269048m = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.bb");

    /* renamed from: k */
    public C96325jm f269049k;

    /* renamed from: l */
    public C96095az f269050l;

    /* renamed from: g */
    public void mo89941g(OpaPageLayout opaPageLayout) {
        C96095az a = this.f269049k.f269538a.mo89952a(mo89934e());
        this.f269050l = a;
        if (a != null) {
            String str = a.f269040a;
            if (str != null) {
                mo89946l(str);
            }
            String str2 = a.f269043d;
            if (str2 != null) {
                mo89945k(str2);
            }
            String str3 = a.f269044e;
            if (str3 != null) {
                mo89943i(str3, false);
            }
            String str4 = a.f269041b;
            if (str4 == null) {
                return;
            }
            if (C96331js.m159642f(str4)) {
                String str5 = a.f269042c;
                WebImageView webImageView = this.f269036j;
                if (webImageView == null) {
                    C59104x c = C96093ax.f269027b.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "BistoOobe");
                    ((C59052c) ((C59052c) c).mo56372aa(16950)).mo56386p("Null webImageView!");
                    return;
                }
                if (str5 != null) {
                    webImageView.setContentDescription(str5);
                }
                this.f269036j.mo76738i(str4, this.f269029c);
                super.mo89947m(this.f269036j);
                return;
            }
            String str6 = a.f269042c;
            WebView webView = this.f269035i;
            if (webView == null) {
                C59104x c2 = C96093ax.f269027b.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "BistoOobe");
                ((C59052c) ((C59052c) c2).mo56372aa(16954)).mo56386p("Null webView!");
                return;
            }
            if (str6 != null) {
                webView.setContentDescription(str6);
            }
            new C96153dc((LegacyOpaStandardPage) null, (C68214a) null, 0).mo89991a(this.f269035i, str4, C58833ax.m90833j(str6));
            super.mo89947m(this.f269035i);
            return;
        }
        C59104x c3 = f269048m.mo56225c();
        c3.mo56378ag(C58975e.f156826a, "BistoOobe");
        ((C59052c) ((C59052c) c3).mo56372aa(16956)).mo56386p("OobeScreen is null!");
    }
}
