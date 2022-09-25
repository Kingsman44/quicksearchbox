package com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1499a;

import android.os.Bundle;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18102c;
import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.C18109a;
import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1500b.C18123e;
import com.google.android.libraries.assistant.p1484g.p1490c.p1497d.p1498a.p1500b.C18126h;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52802d;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.g.c.d.a.a.b */
/* compiled from: PG */
public final class C18112b implements C18109a {

    /* renamed from: a */
    public final String f51578a;

    /* renamed from: b */
    private final C18116f f51579b;

    /* renamed from: c */
    private final C18115e f51580c;

    /* renamed from: d */
    private final C18114d f51581d;

    public C18112b(String str, C18116f fVar, C18115e eVar, C18114d dVar) {
        this.f51578a = str;
        this.f51579b = fVar;
        this.f51580c = eVar;
        this.f51581d = dVar;
    }

    /* renamed from: e */
    public static C58485gu m35276e(C58485gu guVar) {
        return C58485gu.m89843k(Collection.EL.stream(guVar).map(C18111a.f51577a).iterator());
    }

    /* renamed from: a */
    public final Bundle mo23502a(Object obj) {
        C18116f fVar = this.f51579b;
        if (fVar.f51590a.isEmpty()) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        C58485gu guVar = fVar.f51590a;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            ((C18126h) guVar.get(i)).mo23621c(obj, bundle);
        }
        return bundle;
    }

    /* renamed from: b */
    public final Object mo23503b(Bundle bundle) {
        C18115e eVar = this.f51580c;
        Object obj = eVar.f51587a.get();
        if (eVar.f51588b.isEmpty()) {
            return eVar.f51589c.apply(obj);
        }
        C58485gu guVar = eVar.f51588b;
        int size = guVar.size();
        int i = 0;
        while (i < size) {
            try {
                ((C18126h) guVar.get(i)).mo23620b(bundle, obj);
                i++;
            } catch (C18123e e) {
                throw new C52802d("Missing: ".concat(String.valueOf(e.f51603a)));
            }
        }
        return eVar.f51589c.apply(obj);
    }

    /* renamed from: c */
    public final String mo23504c() {
        return this.f51578a;
    }

    /* renamed from: d */
    public final boolean mo23505d(C18102c cVar) {
        C18114d dVar = this.f51581d;
        Bundle a = cVar.mo23595a();
        return cVar.mo23599e().equals(dVar.f51584a) && a != null && C18114d.m35281a(a.getBundle("arguments"), dVar.f51585b) && C18114d.m35282b(a.getBundle("results"), dVar.f51586c);
    }
}
