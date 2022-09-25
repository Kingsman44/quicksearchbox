package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9488c.C126436e;
import com.google.android.libraries.assistant.p1363c.p1398g.p1402b.p1403a.C17362b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17495bd;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17496be;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17500c;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17501d;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17506i;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17510m;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17522y;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import com.google.protobuf.C63088z;
import com.google.speech.p5224k.p5225a.C67186ad;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.d.av */
/* compiled from: PG */
final class C126537av implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C69648ae f348482a;

    /* renamed from: b */
    final /* synthetic */ C126436e f348483b;

    /* renamed from: c */
    final /* synthetic */ C126557bo f348484c;

    /* renamed from: d */
    final /* synthetic */ C57987f f348485d;

    public C126537av(C69648ae aeVar, C126436e eVar, C126557bo boVar, C57987f fVar) {
        this.f348482a = aeVar;
        this.f348483b = eVar;
        this.f348484c = boVar;
        this.f348485d = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20883a(Object obj, C69577g gVar) {
        C67186ad adVar = (C67186ad) obj;
        if (adVar.f182614b.mo59173M()) {
            return C69788q.f186170a;
        }
        if (this.f348482a.f186027a == null) {
            this.f348483b.mo107610b();
            C69648ae aeVar = this.f348482a;
            C17362b bVar = this.f348484c.f348535e;
            C17506i iVar = (C17506i) C17508k.f50521c.createBuilder();
            C69664n.m101060f(iVar, "newBuilder()");
            C17510m a = C69664n.m101061g(iVar, "builder");
            C17500c cVar = (C17500c) C17501d.f50516a.createBuilder();
            C69664n.m101060f(cVar, "newBuilder()");
            a.mo23376b(C69664n.m101061g(cVar, "builder").mo23374a());
            aeVar.f186027a = bVar.mo23309a(a.mo23375a()).mo23307b(this.f348485d, C17522y.f50535c);
        }
        C57987f fVar = this.f348485d;
        C17495bd bdVar = (C17495bd) C17496be.f50505c.createBuilder();
        C63088z zVar = adVar.f182614b;
        bdVar.copyOnWrite();
        C17496be beVar = (C17496be) bdVar.instance;
        zVar.getClass();
        beVar.f50507a |= 1;
        beVar.f50508b = zVar;
        fVar.f155056f.mo54591h(bdVar.build());
        return C69788q.f186170a;
    }
}
