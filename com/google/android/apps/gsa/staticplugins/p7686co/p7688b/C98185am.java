package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98324af;
import com.google.android.apps.gsa.store.C118329t;
import com.google.android.apps.gsa.store.C118333v;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.am */
/* compiled from: PG */
public final /* synthetic */ class C98185am implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C98211bl f274164a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f274165b;

    public /* synthetic */ C98185am(C98211bl blVar, C58485gu guVar) {
        this.f274164a = blVar;
        this.f274165b = guVar;
    }

    public final C60870cx apply(Object obj) {
        C98211bl blVar = this.f274164a;
        C58485gu guVar = this.f274165b;
        C58485gu guVar2 = (C58485gu) obj;
        C118329t e = blVar.f274218h.mo91760e();
        int i = ((C58724pq) guVar).f156474d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            C118333v vVar = new C118333v((String) guVar.get(i3), (byte[]) null, Long.MAX_VALUE, TimeUnit.SECONDS);
            e.f328455a.mo55395g(vVar);
            e.f328456b++;
            vVar.mo103672a(C98324af.f274462f, 0L);
            if (i2 < guVar2.size()) {
                vVar.mo103672a(C98324af.f274464h, (Long) guVar2.get(i2));
                i2++;
            }
        }
        return blVar.f274218h.mo91762h(e.mo103669c());
    }
}
