package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9643a;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127743d;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C127765a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Map f351688a;

    public /* synthetic */ C127765a(Map map) {
        this.f351688a = map;
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
        return ((Integer) Map.EL.getOrDefault(this.f351688a, ((C127743d) obj).f351636a, 0)).intValue() < 2;
    }
}
