package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9851a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.common.base.C58851bo;
import com.google.common.p4526f.C59052c;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65514ah;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65515ai;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.a.h */
/* compiled from: PG */
final class C129816h {

    /* renamed from: a */
    public final C46428ao f356187a;

    /* renamed from: b */
    public final String f356188b = Long.toHexString(C58851bo.f156650b.nextLong());

    /* renamed from: c */
    final /* synthetic */ C129817i f356189c;

    /* renamed from: d */
    private final String f356190d;

    /* renamed from: e */
    private final Duration f356191e;

    /* renamed from: f */
    private final C21370a f356192f;

    /* renamed from: g */
    private boolean f356193g = false;

    public C129816h(C129817i iVar, String str, Duration duration, C21370a aVar, C46428ao aoVar) {
        this.f356189c = iVar;
        this.f356190d = str;
        this.f356191e = duration;
        this.f356192f = aVar;
        this.f356187a = aoVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Optional mo109284a() {
        ((C59052c) ((C59052c) C129817i.f356194a.mo56224b()).mo56372aa(38497)).mo56389s("Executing PendingUpdate: %s", this.f356188b);
        if (this.f356193g) {
            return Optional.empty();
        }
        this.f356193g = true;
        this.f356187a.postAtTime(new C129815g(this), this, this.f356192f.mo26874f() + this.f356191e.toMillis());
        C65514ah ahVar = (C65514ah) C65515ai.f178081c.createBuilder();
        String str = this.f356188b;
        ahVar.copyOnWrite();
        str.getClass();
        ((C65515ai) ahVar.instance).f178083a = str;
        String str2 = this.f356190d;
        ahVar.copyOnWrite();
        ((C65515ai) ahVar.instance).f178084b = str2;
        return Optional.m71637of((C65515ai) ahVar.build());
    }
}
