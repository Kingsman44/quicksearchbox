package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.cv */
/* compiled from: PG */
public final class C113191cv {

    /* renamed from: a */
    private final C86124t f313524a;

    /* renamed from: b */
    private final boolean f313525b;

    public C113191cv(C86124t tVar, C58833ax axVar) {
        this.f313524a = tVar;
        this.f313525b = ((Boolean) ((C58847bk) axVar).f156646a).booleanValue();
    }

    /* renamed from: f */
    private final boolean m187219f() {
        return this.f313524a.mo79746e(C90014bt.f247452hS) && this.f313525b;
    }

    /* renamed from: a */
    public final boolean mo99905a() {
        return m187219f() && this.f313524a.mo79746e(C90063do.f249392cf);
    }

    /* renamed from: b */
    public final boolean mo99906b() {
        return m187219f() && this.f313524a.mo79746e(C90063do.f249383cW) && !this.f313524a.mo79746e(C90063do.f249455dp);
    }

    /* renamed from: c */
    public final boolean mo99907c() {
        return !this.f313524a.mo79746e(C90014bt.f247794nq) && m187219f();
    }

    /* renamed from: d */
    public final boolean mo99908d(e eVar) {
        return mo99907c() && this.f313524a.mo79749o(C90014bt.f247741mq).contains(Integer.valueOf(eVar.ca));
    }

    /* renamed from: e */
    public final boolean mo99909e() {
        return m187219f() && this.f313524a.mo79746e(C90063do.f249455dp);
    }
}
