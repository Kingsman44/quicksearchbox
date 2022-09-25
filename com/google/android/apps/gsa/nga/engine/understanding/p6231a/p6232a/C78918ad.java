package com.google.android.apps.gsa.nga.engine.understanding.p6231a.p6232a;

import com.google.android.apps.gsa.nga.engine.cortex.CortexWrapper;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79879a;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79881c;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79882d;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79885g;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79890l;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79891m;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79892n;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79893o;
import com.google.android.apps.gsa.nga.engine.understanding.teleport.C79326x;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.assistant.p3817aj.p3818a.p3819a.C49190b;
import com.google.assistant.p3817aj.p3818a.p3819a.C49191c;
import com.google.assistant.p3817aj.p3818a.p3819a.C49192d;
import com.google.assistant.p3817aj.p3818a.p3819a.C49195g;
import com.google.assistant.p3817aj.p3818a.p3819a.C49196h;
import com.google.assistant.p3817aj.p3818a.p3819a.C49197i;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63088z;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.a.ad */
/* compiled from: PG */
public final class C78918ad {

    /* renamed from: b */
    private static final C58974d f217143b = C58974d.m91136j();

    /* renamed from: a */
    public final C91142g f217144a;

    /* renamed from: c */
    private final CortexWrapper f217145c;

    public C78918ad(CortexWrapper cortexWrapper, C91142g gVar) {
        C63088z zVar = C63088z.f170246b;
        C49195g gVar2 = C49195g.f127206a;
        this.f217145c = cortexWrapper;
        this.f217144a = gVar;
    }

    /* renamed from: a */
    public final boolean mo73694a(C49190b bVar, String str, List list) {
        Optional optional;
        C79326x a = new C79326x(Optional.m71637of(f217143b)).mo73900a("\nDeeplinkClassifier");
        if (!this.f217145c.b(4)) {
            return false;
        }
        C79882d dVar = (C79882d) C79885g.f218957h.createBuilder();
        C79879a aVar = (C79879a) C79881c.f218947d.createBuilder();
        aVar.copyOnWrite();
        C79881c cVar = (C79881c) aVar.instance;
        cVar.f218950b = 3;
        cVar.f218949a |= 1;
        dVar.copyOnWrite();
        C79885g gVar = (C79885g) dVar.instance;
        C79881c cVar2 = (C79881c) aVar.build();
        cVar2.getClass();
        gVar.f218963e = cVar2;
        gVar.f218959a |= 8;
        C79892n nVar = (C79892n) C79893o.f218982d.createBuilder();
        nVar.copyOnWrite();
        C79893o oVar = (C79893o) nVar.instance;
        str.getClass();
        oVar.f218984a |= 1;
        oVar.f218985b = str;
        nVar.mo74272a(list);
        C79893o oVar2 = (C79893o) nVar.build();
        dVar.copyOnWrite();
        C79885g gVar2 = (C79885g) dVar.instance;
        oVar2.getClass();
        gVar2.f218960b = oVar2;
        gVar2.f218959a |= 1;
        C62940bt btVar = C49197i.f127209e;
        C49196h hVar = (C49196h) C49197i.f127208d.createBuilder();
        C49191c cVar3 = (C49191c) C49192d.f127199e.createBuilder();
        cVar3.copyOnWrite();
        C49192d dVar2 = (C49192d) cVar3.instance;
        dVar2.f127202b = bVar.f127198r;
        dVar2.f127201a |= 1;
        C49192d dVar3 = (C49192d) cVar3.build();
        hVar.copyOnWrite();
        C49197i iVar = (C49197i) hVar.instance;
        dVar3.getClass();
        iVar.f127212b = dVar3;
        iVar.f127211a |= 1;
        hVar.copyOnWrite();
        C49197i iVar2 = (C49197i) hVar.instance;
        iVar2.f127213c = 27;
        iVar2.f127211a |= 2;
        dVar.mo58885m(btVar, (C49197i) hVar.build());
        C79891m a2 = this.f217145c.a((C79885g) dVar.build());
        if (a2 == null) {
            a.mo73900a("ModelResponse is null.");
            optional = Optional.empty();
        } else if (!a2.f218979c.isEmpty()) {
            a.mo73900a(String.format("Model returned error: %s", new Object[]{a2.f218979c}));
            optional = Optional.empty();
        } else if (a2.f218978b.size() != 1) {
            a.mo73900a("ModelResponse contains wrong number of classes.");
            optional = Optional.empty();
        } else {
            optional = Optional.m71637of((C79890l) a2.f218978b.get(0));
        }
        return ((Boolean) optional.map(new C78917ac(this, a)).orElse(false)).booleanValue();
    }
}
