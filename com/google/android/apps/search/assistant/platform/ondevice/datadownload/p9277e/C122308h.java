package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e;

import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.h */
/* compiled from: PG */
public final /* synthetic */ class C122308h implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C122308h f339160a = new C122308h();

    private /* synthetic */ C122308h() {
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
        C58528ij ijVar = C122314n.f339170b;
        C29689e a = C29689e.m54781a(((C29690f) obj).f80415f);
        if (a == null) {
            a = C29689e.UNSPECIFIED;
        }
        return ijVar.contains(a);
    }
}
