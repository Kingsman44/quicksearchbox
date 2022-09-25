package com.google.android.apps.search.podcasts.show.p10616c;

import com.google.android.apps.search.podcasts.p10588n.p10589a.C140649a;
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140650b;
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140651c;
import com.google.apps.tiktok.cache.C46386ax;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.c.j */
/* compiled from: PG */
public final class C141149j implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C140649a f383220a;

    public C141149j(C140649a aVar) {
        this.f383220a = aVar;
    }

    public final /* synthetic */ Object apply(Object obj) {
        C140650b bVar;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            bVar = (C140650b) ((C140651c) axVar.mo56107c()).toBuilder();
        } else {
            bVar = (C140650b) C140651c.f382022c.createBuilder();
        }
        C69664n.m101060f(bVar, "if (cached.isPresent) ca…tPreferences.newBuilder()");
        C140649a aVar = this.f383220a;
        bVar.copyOnWrite();
        ((C140651c) bVar.instance).f382024a = aVar.getNumber();
        return new C46386ax(bVar.build());
    }
}
