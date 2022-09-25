package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9643a;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127743d;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127748i;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130348b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C127766b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C130348b f351689a;

    public /* synthetic */ C127766b(C130348b bVar) {
        this.f351689a = bVar;
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
        C130348b bVar = this.f351689a;
        C127748i iVar = ((C127743d) obj).f351641f;
        if (iVar == null) {
            iVar = C127748i.f351656e;
        }
        return iVar.f351659b.contains(bVar.mo109680d().get());
    }
}
