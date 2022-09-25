package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119785ag;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9536b.C127130a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9538d.C127168a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129566ah;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128556m;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.f */
/* compiled from: PG */
public final class C127172f implements C127120a {

    /* renamed from: f */
    public static final C59071e f350111f = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.f");

    /* renamed from: g */
    public final C127118j f350112g;

    /* renamed from: h */
    public final Context f350113h;

    /* renamed from: i */
    public final C127130a f350114i;

    /* renamed from: j */
    private final C127168a f350115j;

    /* renamed from: k */
    private final C127168a f350116k;

    /* renamed from: l */
    private final C127168a f350117l;

    /* renamed from: m */
    private final C128556m f350118m;

    public C127172f(C127168a aVar, C127168a aVar2, C127168a aVar3, C127130a aVar4, C128556m mVar, C127118j jVar, Context context) {
        this.f350115j = aVar;
        this.f350116k = aVar2;
        this.f350117l = aVar3;
        this.f350114i = aVar4;
        this.f350118m = mVar;
        this.f350112g = jVar;
        this.f350113h = context;
    }

    /* renamed from: a */
    public final C119785ag mo107942a() {
        return (C119785ag) this.f350115j.f350103b.get();
    }

    /* renamed from: b */
    public final C46851e mo107943b() {
        return new C127174h(this.f350116k);
    }

    /* renamed from: c */
    public final C46851e mo107944c() {
        return new C127167d(this);
    }

    /* renamed from: d */
    public final C46851e mo107945d() {
        return new C127174h(this.f350117l);
    }

    /* renamed from: e */
    public final void mo107946e(int i, Consumer consumer, Consumer consumer2) {
        this.f350118m.mo108516a(i, new C127171e(consumer, consumer2));
    }

    /* renamed from: f */
    public final void mo107947f(C46855i iVar, int i, C129566ah ahVar) {
        iVar.mo50829i(i, new C127167d(this), new C127129b(this, ahVar), C127132c.f350045a);
    }
}
