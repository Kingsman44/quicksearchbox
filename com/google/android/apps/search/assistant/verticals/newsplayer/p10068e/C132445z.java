package com.google.android.apps.search.assistant.verticals.newsplayer.p10068e;

import com.google.android.apps.search.assistant.verticals.newsplayer.p10067d.C132414a;
import com.google.android.apps.search.assistant.verticals.newsplayer.p10067d.C132415b;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.e.z */
/* compiled from: PG */
public final /* synthetic */ class C132445z implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ float f361492a;

    public /* synthetic */ C132445z(float f) {
        this.f361492a = f;
    }

    public final Object apply(Object obj) {
        float f = this.f361492a;
        C132414a aVar = (C132414a) ((C132415b) obj).toBuilder();
        aVar.copyOnWrite();
        C132415b bVar = (C132415b) aVar.instance;
        bVar.f361422a |= 1;
        bVar.f361423b = f;
        return (C132415b) aVar.build();
    }
}
