package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92367e;
import com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92368f;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C101523e implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C101523e f283342a = new C101523e();

    private /* synthetic */ C101523e() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C89057m mVar = (C89057m) obj;
        if (mVar == null) {
            C101526h d = C101527i.m167899d();
            ((C101505a) d).f283266a = C58833ax.m90834k("httpResponse is null");
            d.mo92365b(false);
            return d.mo92364a();
        }
        C92367e a = C92368f.m151685a(mVar);
        if (a == null) {
            ((C59052c) ((C59052c) C101525g.f283343a.mo56225c()).mo56372aa(20285)).mo56386p("readyCheckResponse is null; do not retry.");
            C101526h d2 = C101527i.m167899d();
            ((C101505a) d2).f283266a = C58833ax.m90834k("readyCheckResponse is null");
            d2.mo92365b(false);
            return d2.mo92364a();
        } else if (((Boolean) a.mo87013e().mo56109e(false)).booleanValue()) {
            C101526h d3 = C101527i.m167899d();
            d3.mo92366c(true);
            d3.mo92365b(false);
            return d3.mo92364a();
        } else {
            C101526h d4 = C101527i.m167899d();
            d4.mo92366c(false);
            d4.mo92365b(true);
            return d4.mo92364a();
        }
    }
}
