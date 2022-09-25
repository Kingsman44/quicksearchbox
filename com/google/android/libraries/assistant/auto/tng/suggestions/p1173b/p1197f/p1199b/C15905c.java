package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1197f.p1199b;

import android.location.Location;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16381q;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16382r;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.f.b.c */
/* compiled from: PG */
public final /* synthetic */ class C15905c implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C15905c f47227a = new C15905c();

    private /* synthetic */ C15905c() {
    }

    public final Object apply(Object obj) {
        Location location = (Location) obj;
        int i = C15906d.f47228a;
        C16381q qVar = (C16381q) C16382r.f48214d.createBuilder();
        double latitude = location.getLatitude();
        qVar.copyOnWrite();
        C16382r rVar = (C16382r) qVar.instance;
        rVar.f48216a |= 1;
        rVar.f48217b = latitude;
        double longitude = location.getLongitude();
        qVar.copyOnWrite();
        C16382r rVar2 = (C16382r) qVar.instance;
        rVar2.f48216a |= 2;
        rVar2.f48218c = longitude;
        return (C16382r) qVar.build();
    }
}
