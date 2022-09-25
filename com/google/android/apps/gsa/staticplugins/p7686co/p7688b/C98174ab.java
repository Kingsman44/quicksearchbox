package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C98174ab implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C98211bl f274142a;

    /* renamed from: b */
    public final /* synthetic */ C98203bd f274143b;

    /* renamed from: c */
    public final /* synthetic */ long f274144c;

    public /* synthetic */ C98174ab(C98211bl blVar, C98203bd bdVar, long j) {
        this.f274142a = blVar;
        this.f274143b = bdVar;
        this.f274144c = j;
    }

    public final Object apply(Object obj) {
        C98211bl blVar = this.f274142a;
        C98203bd bdVar = this.f274143b;
        long j = this.f274144c;
        int intValue = ((Integer) obj).intValue() - bdVar.mo91013d().size();
        C98208bi biVar = new C98208bi(blVar, j, bdVar.mo91010a(), bdVar.mo91013d(), bdVar.mo91012c(), intValue);
        blVar.f274231u.add(biVar);
        return biVar;
    }
}
