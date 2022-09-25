package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9643a;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127746g;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130348b;
import com.google.common.base.C58817ah;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.b.a.h */
/* compiled from: PG */
public final /* synthetic */ class C127772h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130348b f351699a;

    public /* synthetic */ C127772h(C130348b bVar) {
        this.f351699a = bVar;
    }

    public final Object apply(Object obj) {
        if (Collection.EL.stream(C127773i.m208813a(this.f351699a)).anyMatch(new C127770f((Map) obj))) {
            return C127746g.MODE_OVERAPP_USER_INPUT_PLATE;
        }
        return C127746g.MODE_UNSPECIFIED;
    }
}
