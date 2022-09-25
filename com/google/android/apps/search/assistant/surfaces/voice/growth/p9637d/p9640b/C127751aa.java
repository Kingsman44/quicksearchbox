package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127743d;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.aa */
/* compiled from: PG */
public final /* synthetic */ class C127751aa implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f351666a;

    public /* synthetic */ C127751aa(List list) {
        this.f351666a = list;
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
        return Collection.EL.stream(this.f351666a).noneMatch(new C127752ab((C127743d) obj));
    }
}
