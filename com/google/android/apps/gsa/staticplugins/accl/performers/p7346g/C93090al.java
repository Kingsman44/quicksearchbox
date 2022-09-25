package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.C0320v;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.apps.gsa.shared.p7066m.C90050db;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.al */
/* compiled from: PG */
final class C93090al implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ boolean f259679a;

    /* renamed from: b */
    final /* synthetic */ C0320v f259680b;

    /* renamed from: c */
    final /* synthetic */ C93094ap f259681c;

    public C93090al(C93094ap apVar, boolean z, C0320v vVar) {
        this.f259681c = apVar;
        this.f259679a = z;
        this.f259680b = vVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C93094ap.f259690a.mo56225c()).mo56382g(th)).mo56372aa(13356)).mo56386p("Failed to set execution result.");
        if (this.f259679a) {
            this.f259681c.f259697g.mo19974a(C37176a.f97220hT.mo40815i(C62722b.OK));
            C87594r rVar = (C87594r) this.f259681c.f259694d.mo27525b();
            this.f259680b.mo1041i(this.f259681c.f259696f);
            return;
        }
        this.f259680b.mo1041i(((C87594r) this.f259681c.f259694d.mo27525b()).f236650c);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C52070ec ecVar = (C52070ec) obj;
        if (this.f259679a) {
            this.f259681c.f259697g.mo19974a(C37176a.f97214hN.mo40815i(C62722b.OK));
            C93094ap apVar = this.f259681c;
            C0320v vVar = this.f259680b;
            C0310l lVar = apVar.f259696f;
            long a = ((C86124t) apVar.f259693c.mo27525b()).mo79743a(C90050db.f248765b);
            apVar.f259692b.mo85137b(new C93091am(apVar, vVar, lVar), a);
            return;
        }
        this.f259680b.mo1041i(((C87594r) this.f259681c.f259694d.mo27525b()).f236650c);
    }
}
