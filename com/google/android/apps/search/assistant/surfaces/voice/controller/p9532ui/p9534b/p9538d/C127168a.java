package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9538d;

import com.google.android.apps.search.assistant.libraries.p8959d.C119259a;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.common.util.concurrent.C60866ct;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.d.a */
/* compiled from: PG */
public final class C127168a {

    /* renamed from: a */
    public final C46691ai f350102a;

    /* renamed from: b */
    public final AtomicReference f350103b;

    /* renamed from: c */
    private final C46778cv f350104c;

    /* renamed from: d */
    private final C119259a f350105d;

    public C127168a(C46691ai aiVar, Object obj, C46778cv cvVar) {
        this.f350102a = aiVar;
        this.f350104c = cvVar;
        this.f350103b = new AtomicReference(obj);
        this.f350105d = new C119259a(obj);
    }

    /* renamed from: a */
    public final void mo107978a(Object obj) {
        this.f350103b.set(obj);
        this.f350105d.mo104263a(obj);
        this.f350104c.mo50787a(C60866ct.f164955a, this.f350102a);
    }
}
