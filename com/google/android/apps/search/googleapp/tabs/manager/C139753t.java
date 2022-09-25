package com.google.android.apps.search.googleapp.tabs.manager;

import com.google.android.apps.search.googleapp.p10117aa.C133125j;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.protobuf.C63033ey;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.t */
/* compiled from: PG */
public final /* synthetic */ class C139753t implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C139765f f379858a;

    public /* synthetic */ C139753t(C139765f fVar) {
        this.f379858a = fVar;
    }

    public final void accept(Object obj) {
        C139765f fVar = this.f379858a;
        C133125j jVar = (C133125j) obj;
        C63033ey eyVar = C139720ac.f379766a;
        String str = jVar.f362924d;
        fVar.copyOnWrite();
        C139767h hVar = (C139767h) fVar.instance;
        C139767h hVar2 = C139767h.f379869k;
        str.getClass();
        hVar.f379871a |= 8;
        hVar.f379876f = str;
        String str2 = jVar.f362925e;
        fVar.copyOnWrite();
        C139767h hVar3 = (C139767h) fVar.instance;
        str2.getClass();
        hVar3.f379871a |= 128;
        hVar3.f379880j = str2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
