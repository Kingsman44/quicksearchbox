package com.google.assistant.p3838ao.p3839a.p3842c;

import com.google.p4242bp.p4257f.p4264d.p4265a.C56346b;
import com.google.p4242bp.p4257f.p4264d.p4265a.C56348d;
import com.google.p4242bp.p4257f.p4264d.p4265a.C56350f;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.assistant.ao.a.c.y */
/* compiled from: PG */
public final /* synthetic */ class C49501y implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C49501y f127719a = new C49501y();

    private /* synthetic */ C49501y() {
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C56346b bVar;
        C56350f fVar = (C56350f) obj;
        if (fVar.f150290a.size() < 2) {
            return false;
        }
        C56348d dVar = (C56348d) fVar.f150290a.get(1);
        if (dVar.f150286a == 5) {
            bVar = (C56346b) dVar.f150287b;
        } else {
            bVar = C56346b.f150280c;
        }
        if ((bVar.f150282a & 1) != 0) {
            return true;
        }
        return false;
    }
}
