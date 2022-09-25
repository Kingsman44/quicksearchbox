package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9843a;

import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38072b;
import com.google.android.libraries.search.p2904c.p2967t.p2971c.C38086j;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C129708e implements Predicate {
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
        C38072b bVar = (C38072b) obj;
        C38086j a = C38086j.m67233a(bVar.f100885b);
        if (a == null) {
            a = C38086j.CLIENT_TYPE_UNKNOWN;
        }
        if (a.equals(C38086j.CLIENT_TYPE_PLATFORM_EXTERNAL)) {
            return false;
        }
        C37561eb ebVar = bVar.f100886c;
        if (ebVar == null) {
            ebVar = C37561eb.f99800c;
        }
        return ebVar.f99802a == 1;
    }
}
