package com.google.android.libraries.assistant.auto.tng.media.mediabrowser;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52170hv;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52406qo;
import com.google.assistant.p3897e.p3921j.C52407qp;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.e */
/* compiled from: PG */
public final class C14043e {

    /* renamed from: a */
    public static final C59071e f42662a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.media.mediabrowser.e");

    /* renamed from: b */
    final C14037d f42663b = new C14037d();

    /* renamed from: c */
    public final ScheduledExecutorService f42664c;

    /* renamed from: d */
    public final ConcurrentLinkedQueue f42665d = new ConcurrentLinkedQueue();

    /* renamed from: e */
    private final C42876ab f42666e;

    /* renamed from: f */
    private final C21370a f42667f;

    public C14043e(C42876ab abVar, C21370a aVar, ScheduledExecutorService scheduledExecutorService) {
        this.f42666e = abVar;
        this.f42667f = aVar;
        this.f42664c = scheduledExecutorService;
    }

    /* renamed from: a */
    public final void mo21391a(C52176ia iaVar) {
        C52170hv hvVar = (C52170hv) C52176ia.f136911k.createBuilder(iaVar);
        C52406qo qoVar = (C52406qo) C52407qp.f137523d.createBuilder();
        long b = this.f42667f.mo26870b();
        qoVar.copyOnWrite();
        C52407qp qpVar = (C52407qp) qoVar.instance;
        qpVar.f137525a |= 1;
        qpVar.f137526b = b / 1000;
        C52407qp qpVar2 = (C52407qp) qoVar.build();
        hvVar.copyOnWrite();
        C52176ia iaVar2 = (C52176ia) hvVar.instance;
        qpVar2.getClass();
        iaVar2.f136921i = qpVar2;
        iaVar2.f136913a |= 512;
        C52176ia iaVar3 = (C52176ia) hvVar.build();
        C60870cx a = this.f42666e.mo46039a(new C14015b(iaVar3), this.f42664c);
        C14037d dVar = this.f42663b;
        while (!dVar.f42659a.isEmpty()) {
            C2164c cVar = (C2164c) dVar.f42659a.poll();
            cVar.getClass();
            cVar.mo5437b(iaVar3);
        }
        C60856cj.m92911t(a, C47810es.m84974n(new C14028c(this)), this.f42664c);
    }
}
