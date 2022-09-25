package com.google.android.apps.gsa.staticplugins.fedass.p7941c.p7942a;

import com.google.android.apps.search.assistant.libraries.p8946b.p8951d.p8952a.C119231a;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaterializerResult;
import com.google.android.libraries.geller.C21877g;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5130a.C65711aj;
import com.google.protos.p5129p.p5130a.C65712ak;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65845n;
import org.tensorflow.p5650a.C72641a;
import org.tensorflow.p5650a.C72642b;
import org.tensorflow.p5650a.C72643c;
import org.tensorflow.p5650a.C72644d;
import org.tensorflow.p5650a.C72645e;
import org.tensorflow.p5650a.C72646f;
import org.tensorflow.p5650a.C72652l;
import org.tensorflow.p5650a.C72654n;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C100813a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C100815c f281762a;

    public /* synthetic */ C100813a(C100815c cVar) {
        this.f281762a = cVar;
    }

    public final C60870cx apply(Object obj) {
        C72644d dVar;
        C100815c cVar = this.f281762a;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(new EkhoMaterializerResult());
        }
        C21877g gVar = cVar.f281769c;
        if (gVar.f60369a.isEmpty() || gVar.mo27170b()) {
            throw new GellerException(C62722b.UNKNOWN, "Unexpected error, ensure that hasNext() is called before calling next()");
        }
        gVar.f60372d++;
        C65768az azVar = (C65768az) gVar.f60369a.removeFirst();
        C65711aj ajVar = (C65711aj) C65712ak.f178531c.createBuilder();
        C65139d dVar2 = azVar.f178796b;
        if (dVar2 == null) {
            dVar2 = C65139d.f176307e;
        }
        long j = dVar2.f176310b;
        ajVar.copyOnWrite();
        C65712ak akVar = (C65712ak) ajVar.instance;
        akVar.f178533a |= 1;
        akVar.f178534b = j;
        EkhoMaterializerResult ekhoMaterializerResult = new EkhoMaterializerResult();
        ekhoMaterializerResult.resumptionToken = ((C65712ak) ajVar.build()).toByteArray();
        ekhoMaterializerResult.isTfExample = true;
        try {
            C63070h hVar = azVar.f178799e;
            if (hVar == null) {
                hVar = C63070h.f170215c;
            }
            C65845n nVar = (C65845n) C62942bv.parseFrom((C62942bv) C65845n.f178992c, hVar.f170218b, C62921ba.m95368a());
            C72643c cVar2 = (C72643c) C72644d.f193212b.createBuilder();
            C72652l lVar = (C72652l) C72654n.f193226b.createBuilder();
            C72645e eVar = (C72645e) C72646f.f193215c.createBuilder();
            C72641a aVar = (C72641a) C72642b.f193209b.createBuilder();
            C19088t tVar = nVar.f178995b;
            if (tVar == null) {
                tVar = C19088t.f53533p;
            }
            aVar.mo64490a(C63088z.m96143E(tVar.f53536b));
            eVar.copyOnWrite();
            C72646f fVar = (C72646f) eVar.instance;
            C72642b bVar = (C72642b) aVar.build();
            bVar.getClass();
            fVar.f193218b = bVar;
            fVar.f193217a = 1;
            lVar.mo64491a("query", (C72646f) eVar.build());
            C72645e eVar2 = (C72645e) C72646f.f193215c.createBuilder();
            C72641a aVar2 = (C72641a) C72642b.f193209b.createBuilder();
            C19088t tVar2 = nVar.f178995b;
            if (tVar2 == null) {
                tVar2 = C19088t.f53533p;
            }
            C61752n nVar2 = tVar2.f53540f;
            if (nVar2 == null) {
                nVar2 = C61752n.f166808f;
            }
            aVar2.mo64490a(C63088z.m96143E(nVar2.f166811b));
            C72642b bVar2 = (C72642b) aVar2.build();
            eVar2.copyOnWrite();
            C72646f fVar2 = (C72646f) eVar2.instance;
            bVar2.getClass();
            fVar2.f193218b = bVar2;
            fVar2.f193217a = 1;
            lVar.mo64491a("intent_name", (C72646f) eVar2.build());
            C72645e eVar3 = (C72645e) C72646f.f193215c.createBuilder();
            C72641a aVar3 = (C72641a) C72642b.f193209b.createBuilder();
            C19088t tVar3 = nVar.f178995b;
            if (tVar3 == null) {
                tVar3 = C19088t.f53533p;
            }
            C61752n nVar3 = tVar3.f53540f;
            if (nVar3 == null) {
                nVar3 = C61752n.f166808f;
            }
            aVar3.mo64490a(nVar3.toByteString());
            C72642b bVar3 = (C72642b) aVar3.build();
            eVar3.copyOnWrite();
            C72646f fVar3 = (C72646f) eVar3.instance;
            bVar3.getClass();
            fVar3.f193218b = bVar3;
            fVar3.f193217a = 1;
            lVar.mo64491a("function_call", (C72646f) eVar3.build());
            cVar2.copyOnWrite();
            C72654n nVar4 = (C72654n) lVar.build();
            nVar4.getClass();
            ((C72644d) cVar2.instance).f193214a = nVar4;
            dVar = (C72644d) cVar2.build();
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) C119231a.f332512a.mo56226d()).mo56382g(e)).mo56372aa(34377)).mo56386p("Invalid Assistant History Proto.");
            dVar = C72644d.f193212b;
        }
        ekhoMaterializerResult.exampleBytes = dVar.toByteArray();
        return C60856cj.m92900i(ekhoMaterializerResult);
    }
}
