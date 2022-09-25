package com.google.android.play.core.p3538g.p3541c;

import java.util.List;

/* renamed from: com.google.android.play.core.g.c.c */
/* compiled from: PG */
public final /* synthetic */ class C45149c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C45160n f117851a;

    /* renamed from: b */
    public final /* synthetic */ List f117852b;

    /* renamed from: c */
    public final /* synthetic */ List f117853c;

    /* renamed from: d */
    public final /* synthetic */ List f117854d;

    /* renamed from: e */
    public final /* synthetic */ long f117855e;

    public /* synthetic */ C45149c(C45160n nVar, List list, List list2, List list3, long j) {
        this.f117851a = nVar;
        this.f117852b = list;
        this.f117853c = list2;
        this.f117854d = list3;
        this.f117855e = j;
    }

    public final void run() {
        C45160n nVar = this.f117851a;
        List list = this.f117852b;
        List list2 = this.f117853c;
        List list3 = this.f117854d;
        long j = this.f117855e;
        if (nVar.f117890g.get()) {
            nVar.mo49006n(6, -6, (Long) null, (Long) null, (List) null, (Integer) null, (List) null);
        } else if (nVar.f117889f.mo49010a() != null) {
            nVar.mo49004l(list, list2, list3, j, false);
        } else {
            nVar.mo49005m(list2, list3, j);
        }
    }
}
