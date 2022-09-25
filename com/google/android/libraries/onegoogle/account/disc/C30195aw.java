package com.google.android.libraries.onegoogle.account.disc;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.aw */
/* compiled from: PG */
final class C30195aw {

    /* renamed from: a */
    public C30180ah f81635a;

    /* renamed from: b */
    public C30180ah f81636b;

    /* renamed from: c */
    public Object f81637c;

    /* renamed from: d */
    private final C30177ae f81638d;

    public C30195aw(C30177ae aeVar) {
        this.f81638d = aeVar;
    }

    /* renamed from: a */
    public static C58833ax m56129a(C30178af afVar) {
        C30175ac acVar = afVar != null ? afVar.f81609b : null;
        return (acVar == null || !acVar.mo35624b().mo56113h()) ? C58836b.f156633a : acVar.mo35624b();
    }

    /* renamed from: b */
    public final void mo35652b(C30180ah ahVar, Object obj) {
        C30178af a;
        if (obj != null && ahVar != null && (a = ahVar.mo35633a(obj)) != null) {
            a.f81608a.add(this.f81638d);
        }
    }

    /* renamed from: c */
    public final void mo35653c(C30180ah ahVar, Object obj) {
        C30178af a;
        if (obj != null && ahVar != null && (a = ahVar.mo35633a(obj)) != null) {
            a.f81608a.remove(this.f81638d);
        }
    }
}
