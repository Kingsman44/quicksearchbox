package com.google.android.gms.measurement.internal;

import androidx.p060c.C0983m;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.measurement.p10848a.C145173v;
import com.google.p4583d.p4584a.C60969c;

/* renamed from: com.google.android.gms.measurement.internal.et */
/* compiled from: PG */
final class C145348et extends C0983m {

    /* renamed from: c */
    final /* synthetic */ C145351ew f392884c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145348et(C145351ew ewVar) {
        super(20);
        this.f392884c = ewVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo3689c(Object obj) {
        String str = (String) obj;
        C143919bh.m233969l(str);
        C145351ew ewVar = this.f392884c;
        ewVar.mo121194J();
        C143919bh.m233969l(str);
        if (!ewVar.mo120942h(str)) {
            return null;
        }
        if (!ewVar.f392892e.containsKey(str) || ewVar.f392892e.get(str) == null) {
            ewVar.mo120939d(str);
        } else {
            ewVar.mo120940e(str, (C145173v) ewVar.f392892e.get(str));
        }
        return (C60969c) ewVar.f392894g.mo3692f().get(str);
    }
}
