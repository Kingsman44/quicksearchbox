package com.google.android.libraries.notifications.data.impl;

import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.p11027an.p11028a.C147766b;
import com.google.android.libraries.p11027an.p11028a.C147767c;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.notifications.data.impl.o */
/* compiled from: PG */
public final class C29810o {

    /* renamed from: a */
    public final C29809n f80828a;

    public C29810o(C29809n nVar) {
        this.f80828a = nVar;
    }

    /* renamed from: e */
    private static final C147767c m55061e() {
        C147767c cVar = new C147767c();
        cVar.f398712a.append("reference");
        cVar.mo124446b("& ? > 0", 1L);
        return cVar;
    }

    /* renamed from: a */
    public final C58485gu mo35111a(C29820k kVar) {
        return this.f80828a.mo35106a(kVar, C58485gu.m89846n(m55061e().mo124445a()));
    }

    /* renamed from: b */
    public final C58485gu mo35112b(C29820k kVar, String str) {
        C147767c e = m55061e();
        e.f398712a.append(" AND ");
        e.f398712a.append("group_id");
        e.mo124446b("=?", str);
        return this.f80828a.mo35106a(kVar, C58485gu.m89846n(e.mo124445a()));
    }

    /* renamed from: c */
    public final C58485gu mo35113c(C29820k kVar, String... strArr) {
        return this.f80828a.mo35106a(kVar, C29812q.m55070e(m55061e().mo124445a(), "thread_id", strArr));
    }

    /* renamed from: d */
    public final void mo35114d(C29820k kVar, String... strArr) {
        this.f80828a.mo35107b(kVar, C29812q.m55070e((C147766b) null, "thread_id", strArr));
    }
}
