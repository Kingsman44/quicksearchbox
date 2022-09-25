package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import com.google.assistant.p3861at.C50362ug;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.c */
/* compiled from: PG */
final class C109807c extends C109784ad {

    /* renamed from: a */
    public C58833ax f305978a;

    /* renamed from: b */
    public C50362ug f305979b;

    /* renamed from: c */
    public C58833ax f305980c;

    /* renamed from: d */
    public boolean f305981d;

    /* renamed from: e */
    public boolean f305982e;

    /* renamed from: f */
    public byte f305983f;

    public C109807c() {
        C58836b bVar = C58836b.f156633a;
        this.f305978a = bVar;
        this.f305980c = bVar;
    }

    /* renamed from: a */
    public final void mo98110a(boolean z) {
        this.f305981d = z;
        this.f305983f = (byte) (this.f305983f | 1);
    }

    /* renamed from: b */
    public final void mo98111b(C50362ug ugVar) {
        if (ugVar != null) {
            this.f305979b = ugVar;
            return;
        }
        throw new NullPointerException("Null omniconsentUi");
    }

    /* renamed from: c */
    public final void mo98112c(boolean z) {
        this.f305982e = z;
        this.f305983f = (byte) (this.f305983f | 2);
    }
}
