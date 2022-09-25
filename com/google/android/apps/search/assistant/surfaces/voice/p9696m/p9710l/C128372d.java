package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l;

import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17495bd;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17496be;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import com.google.protobuf.C63088z;
import com.google.speech.p5224k.p5225a.C67186ad;
import com.google.speech.p5224k.p5225a.C67194al;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.l.d */
/* compiled from: PG */
final class C128372d implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C128377i f353053a;

    /* renamed from: b */
    final /* synthetic */ C57987f f353054b;

    public C128372d(C128377i iVar, C57987f fVar) {
        this.f353053a = iVar;
        this.f353054b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20883a(Object obj, C69577g gVar) {
        C67186ad adVar = (C67186ad) obj;
        if ((adVar.f182613a & 16) != 0) {
            C128384p pVar = this.f353053a.f353078i;
            C67194al alVar = adVar.f182616d;
            if (alVar == null) {
                alVar = C67194al.f182643d;
            }
            pVar.mo108405b(alVar);
        }
        if ((adVar.f182613a & 1) != 0) {
            C57987f fVar = this.f353054b;
            C17495bd bdVar = (C17495bd) C17496be.f50505c.createBuilder();
            C63088z zVar = adVar.f182614b;
            bdVar.copyOnWrite();
            C17496be beVar = (C17496be) bdVar.instance;
            zVar.getClass();
            beVar.f50507a |= 1;
            beVar.f50508b = zVar;
            fVar.f155056f.mo54591h(bdVar.build());
        }
        return C69788q.f186170a;
    }
}
