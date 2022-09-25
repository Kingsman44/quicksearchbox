package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9034c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119670b;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119799au;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119800av;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119801aw;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119804az;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.c.t */
/* compiled from: PG */
final class C119770t {

    /* renamed from: a */
    public static final C59071e f333628a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.b.a.c.t");

    /* renamed from: b */
    public final C119670b f333629b;

    /* renamed from: c */
    public final Executor f333630c;

    /* renamed from: d */
    public final Object f333631d = new Object();

    /* renamed from: e */
    public final Map f333632e = new HashMap();

    /* renamed from: f */
    public boolean f333633f = false;

    /* renamed from: g */
    private final C17597g f333634g;

    public C119770t(C17597g gVar, C119670b bVar, Executor executor) {
        this.f333634g = gVar;
        this.f333629b = bVar;
        this.f333630c = executor;
    }

    /* renamed from: a */
    public final void mo104513a(C119769s sVar, C119799au auVar) {
        synchronized (this.f333631d) {
            if (!this.f333633f) {
                this.f333632e.remove(Long.valueOf(sVar.f333623a));
                C17597g gVar = this.f333634g;
                C119801aw awVar = (C119801aw) C119804az.f333703c.createBuilder();
                long j = sVar.f333623a;
                auVar.copyOnWrite();
                C119800av avVar = C119800av.f333693d;
                ((C119800av) auVar.instance).f333697c = j;
                awVar.copyOnWrite();
                C119804az azVar = (C119804az) awVar.instance;
                C119800av avVar2 = (C119800av) auVar.build();
                avVar2.getClass();
                azVar.f333706b = avVar2;
                azVar.f333705a = 3;
                gVar.mo20123c((C119804az) awVar.build());
            }
        }
    }
}
