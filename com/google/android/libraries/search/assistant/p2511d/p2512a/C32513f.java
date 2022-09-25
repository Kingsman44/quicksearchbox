package com.google.android.libraries.search.assistant.p2511d.p2512a;

import androidx.p104d.p105a.C2168g;
import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62912at;

/* renamed from: com.google.android.libraries.search.assistant.d.a.f */
/* compiled from: PG */
public final /* synthetic */ class C32513f implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C32519l f87100a;

    /* renamed from: b */
    public final /* synthetic */ Object f87101b;

    public /* synthetic */ C32513f(C32519l lVar, Object obj) {
        this.f87100a = lVar;
        this.f87101b = obj;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C32519l lVar = this.f87100a;
        Object obj = this.f87101b;
        Throwable th = lVar.f87114d;
        if (th != null) {
            return C60856cj.m92899h(th);
        }
        long j = lVar.f87116f;
        lVar.f87116f = 1 + j;
        C32518k kVar = lVar.f87112b;
        C32509b bVar = (C32509b) C32510c.f87086e.createBuilder();
        bVar.copyOnWrite();
        C32510c cVar = (C32510c) bVar.instance;
        cVar.f87088a |= 1;
        cVar.f87091d = j;
        C62912at atVar = C62912at.f169862a;
        bVar.copyOnWrite();
        C32510c cVar2 = (C32510c) bVar.instance;
        atVar.getClass();
        cVar2.f87090c = atVar;
        cVar2.f87089b = 2;
        bVar.mo58885m(lVar.f87111a.f87084a, obj);
        kVar.mo38118a((C32510c) bVar.build());
        C60870cx a = C2169h.m6027a(new C32514g(lVar, j));
        ((C2168g) a).f6144b.mo4106b(C47810es.m84977q(new C32515h(lVar, a, j)), lVar.f87113c);
        return a;
    }
}
