package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.fi */
/* compiled from: PG */
final class C145364fi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConditionalUserPropertyParcel f392963a;

    /* renamed from: b */
    final /* synthetic */ C145379fx f392964b;

    public C145364fi(C145379fx fxVar, ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        this.f392964b = fxVar;
        this.f392963a = conditionalUserPropertyParcel;
    }

    public final void run() {
        this.f392964b.f393008a.mo121217m();
        if (this.f392963a.f392526c.mo120761a() == null) {
            C145488jy jyVar = this.f392964b.f393008a;
            ConditionalUserPropertyParcel conditionalUserPropertyParcel = this.f392963a;
            String str = conditionalUserPropertyParcel.f392524a;
            C143919bh.m233958a(str);
            AppMetadata c = jyVar.mo121210c(str);
            if (c != null) {
                jyVar.mo121227w(conditionalUserPropertyParcel, c);
                return;
            }
            return;
        }
        C145488jy jyVar2 = this.f392964b.f393008a;
        ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = this.f392963a;
        String str2 = conditionalUserPropertyParcel2.f392524a;
        C143919bh.m233958a(str2);
        AppMetadata c2 = jyVar2.mo121210c(str2);
        if (c2 != null) {
            jyVar2.mo121200A(conditionalUserPropertyParcel2, c2);
        }
    }
}
