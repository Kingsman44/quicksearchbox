package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c.p807a.p808a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.C12224f;
import com.google.android.libraries.assistant.auto.tng.common.p926m.p927a.C13293a;
import com.google.android.libraries.assistant.auto.tng.common.p931p.C13314n;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.c.a.a.l */
/* compiled from: PG */
public final class C12448l extends C68247h {

    /* renamed from: a */
    private final C68283d f39317a;

    /* renamed from: c */
    private final C68283d f39318c;

    /* renamed from: d */
    private final C68283d f39319d;

    public C12448l(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C12448l.class), aVar);
        this.f39317a = C68236af.m98549d(dVar);
        this.f39318c = C68236af.m98549d(dVar2);
        this.f39319d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C57981b bVar;
        C16730ar arVar;
        List list = (List) obj;
        Optional optional = (Optional) list.get(0);
        C13293a aVar = (C13293a) list.get(1);
        Executor executor = (Executor) list.get(2);
        if (optional.isPresent()) {
            bVar = C13314n.m29569a(((C12224f) optional.get()).mo20496d(), executor);
        } else {
            if (aVar.mo21011a()) {
                arVar = C16730ar.ASSUMING_GOOD_NETWORK;
            } else {
                arVar = C16730ar.OFFLINE;
            }
            C57987f fVar = new C57987f();
            fVar.f155056f.mo54591h(arVar);
            fVar.f155056f.mo54589f(false);
            bVar = fVar;
        }
        return C60856cj.m92900i(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f39317a.mo60297gq(), this.f39318c.mo60297gq(), this.f39319d.mo60297gq());
    }
}
