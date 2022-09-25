package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.search.shared.p6928f.C87545a;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.assistant.p3897e.p3921j.p3926e.C51965fr;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hk */
/* compiled from: PG */
final class C109204hk implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C51965fr f304055a;

    /* renamed from: b */
    final /* synthetic */ C54201r f304056b;

    /* renamed from: c */
    final /* synthetic */ C108212aj f304057c;

    /* renamed from: d */
    final /* synthetic */ C58833ax f304058d;

    /* renamed from: e */
    final /* synthetic */ C109258hw f304059e;

    public C109204hk(C109258hw hwVar, C51965fr frVar, C54201r rVar, C108212aj ajVar, C58833ax axVar) {
        this.f304059e = hwVar;
        this.f304055a = frVar;
        this.f304056b = rVar;
        this.f304057c = ajVar;
        this.f304058d = axVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C109258hw.f304227a.mo56225c()).mo56382g(th)).mo56372aa(22732)).mo56386p("Invalid card data.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        try {
            this.f304059e.mo97715e(this.f304055a, this.f304056b, (C87545a) obj, this.f304057c, false, this.f304058d);
        } catch (C22534k unused) {
        }
        C108230ba baVar = this.f304059e.f304280c;
        if (baVar instanceof C113989h) {
            ((C113989h) baVar).mo100879cP();
        }
    }
}
