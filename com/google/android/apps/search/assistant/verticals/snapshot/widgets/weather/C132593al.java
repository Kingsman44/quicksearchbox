package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e.C132639f;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.al */
/* compiled from: PG */
public final /* synthetic */ class C132593al implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C132593al f361854a = new C132593al();

    private /* synthetic */ C132593al() {
    }

    public final Object apply(Object obj) {
        C132639f fVar = (C132639f) obj;
        if ((fVar.f361973a & 1) == 0) {
            return Optional.empty();
        }
        C63042fg fgVar = fVar.f361975c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        return Optional.m71637of(fgVar);
    }
}
