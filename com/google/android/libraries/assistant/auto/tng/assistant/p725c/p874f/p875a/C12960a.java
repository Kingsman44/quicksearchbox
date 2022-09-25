package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p874f.p875a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15471a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15474b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17473ai;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;
import p3186j$.util.Optional;
import p5535j.p5536a.p5543b.C70967n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.f.a.a */
/* compiled from: PG */
final class C12960a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70967n f40326a;

    /* renamed from: b */
    final /* synthetic */ C12962c f40327b;

    public C12960a(C12962c cVar, C70967n nVar) {
        this.f40327b = cVar;
        this.f40326a = nVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof CancellationException) {
            C59071e eVar = C12962c.f40330a;
        } else {
            ((C59052c) ((C59052c) ((C59052c) C12962c.f40330a.mo56226d()).mo56382g(th)).mo56372aa(44566)).mo56386p("sessionStatus.getPlaybackStartStatus() future failed");
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (((C17473ai) obj).f50460b != 1) {
            ((C59052c) ((C59052c) C12962c.f40330a.mo56226d()).mo56372aa(44568)).mo56386p("sessionStatus.getPlaybackStartStatus() has failure");
        } else if (C12962c.f40331b.contains(this.f40326a)) {
            C15471a aVar = (C15471a) C15474b.f46404j.createBuilder();
            C70967n nVar = this.f40326a;
            aVar.copyOnWrite();
            C15474b bVar = (C15474b) aVar.instance;
            bVar.f46412g = nVar.f189241p;
            bVar.f46406a |= 8;
            this.f40327b.f40332c.mo22353c(C37179a.f97455aa.mo40779c(), Optional.m71637of((C15474b) aVar.build()));
        }
    }
}
