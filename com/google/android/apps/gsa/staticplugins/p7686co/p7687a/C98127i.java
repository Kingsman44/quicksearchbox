package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import androidx.p060c.C0977g;
import androidx.p060c.C0978h;
import androidx.p060c.C0979i;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7744ii;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.i */
/* compiled from: PG */
public final class C98127i {

    /* renamed from: a */
    public final Object f274021a = new Object();

    /* renamed from: b */
    public final C0977g f274022b = new C0977g();

    /* renamed from: a */
    public final Map mo90982a() {
        C0977g gVar;
        synchronized (this.f274021a) {
            gVar = this.f274022b;
        }
        return gVar;
    }

    /* renamed from: b */
    public final void mo90983b(C7744ii iiVar) {
        C98118cs csVar = new C98118cs(this);
        csVar.mo86660l(iiVar);
        C0978h hVar = new C0978h((C0979i) csVar.f273979a);
        while (hVar.hasNext()) {
            C7669fo foVar = (C7669fo) hVar.next();
            synchronized (this.f274021a) {
                this.f274022b.remove(foVar);
            }
        }
    }
}
