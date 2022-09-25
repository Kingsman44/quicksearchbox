package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p832a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12863g;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12864h;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.a.m */
/* compiled from: PG */
public final /* synthetic */ class C12706m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12709p f39785a;

    /* renamed from: b */
    public final /* synthetic */ C16754d f39786b;

    public /* synthetic */ C12706m(C12709p pVar, C16754d dVar) {
        this.f39785a = pVar;
        this.f39786b = dVar;
    }

    public final void run() {
        C12709p pVar = this.f39785a;
        C16754d dVar = this.f39786b;
        C12863g gVar = pVar.f39794d;
        gVar.copyOnWrite();
        C12864h hVar = (C12864h) gVar.instance;
        C12864h hVar2 = C12864h.f40117i;
        hVar.f40125g = dVar;
        hVar.f40119a |= 32;
        pVar.f39794d = gVar;
        pVar.f39793c.f155056f.mo54591h((C12864h) pVar.f39794d.build());
    }
}
