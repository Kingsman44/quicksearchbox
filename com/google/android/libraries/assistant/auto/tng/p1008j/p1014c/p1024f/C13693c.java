package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1024f;

import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.f.c */
/* compiled from: PG */
public final class C13693c extends C68247h {

    /* renamed from: a */
    private final C68283d f41779a;

    /* renamed from: c */
    private final C68283d f41780c;

    public C13693c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C13693c.class), aVar);
        this.f41779a = C68236af.m98549d(dVar);
        this.f41780c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Optional optional;
        List list = (List) obj;
        C51715bm bmVar = (C51715bm) list.get(0);
        C51715bm bmVar2 = (C51715bm) list.get(1);
        if (bmVar2.equals(C51715bm.f135662t)) {
            optional = Optional.empty();
        } else if (bmVar == null) {
            throw new NullPointerException("Null localAssistantDeviceCapabilities");
        } else if (bmVar2 != null) {
            optional = Optional.m71637of(new C13691a(bmVar, bmVar2));
        } else {
            throw new NullPointerException("Null connectedAssistantDeviceCapabilities");
        }
        return C60856cj.m92900i(optional);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f41779a.mo60297gq(), this.f41780c.mo60297gq());
    }
}
