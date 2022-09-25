package com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9720d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9015c.C119681i;
import com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128416ak;
import com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9719c.C128426a;
import com.google.android.libraries.assistant.p1533o.C18450am;
import com.google.android.libraries.assistant.p1533o.C18451an;
import com.google.android.libraries.assistant.p1533o.C18502t;
import com.google.android.libraries.assistant.p1533o.C18503u;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.base.C58827ar;
import com.google.common.base.C58869cf;
import com.google.common.base.C58911u;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62972cr;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66565av;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.d.d */
/* compiled from: PG */
public final /* synthetic */ class C128432d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C128433e f353207a;

    /* renamed from: b */
    public final /* synthetic */ C119681i f353208b;

    public /* synthetic */ C128432d(C128433e eVar, C119681i iVar) {
        this.f353207a = eVar;
        this.f353208b = iVar;
    }

    public final void run() {
        C128433e eVar = this.f353207a;
        C119681i iVar = this.f353208b;
        C33480d dVar = C128434f.f353213a;
        if (!eVar.f353211c) {
            C128416ak akVar = eVar.f353212d.f353217e;
            C18502t tVar = (C18502t) C18503u.f52450f.createBuilder();
            C18450am amVar = (C18450am) C18451an.f52363e.createBuilder();
            amVar.copyOnWrite();
            ((C18451an) amVar.instance).f52368d = true;
            tVar.copyOnWrite();
            C18451an anVar = (C18451an) amVar.build();
            anVar.getClass();
            ((C18503u) tVar.instance).f52452a = anVar;
            akVar.mo108415d((C18503u) tVar.build());
            eVar.f353211c = true;
        }
        try {
            C66565av avVar = (C66565av) C62942bv.parseFrom((C62942bv) C66565av.f181061f, iVar.f333479a, C62921ba.m95368a());
            if ((avVar.f181064a & 1) != 0) {
                eVar.f353210b.mo55396h(C58869cf.m90938d("\r\n").mo56152f(C58911u.f156751b).mo56151a().mo56153g(avVar.f181065b));
                if ((avVar.f181064a & 2) != 0 && avVar.f181066c) {
                    C58485gu f = eVar.f353210b.mo55394f();
                    eVar.f353212d.f353219g.mo38009i(new C58827ar(BuildConfig.FLAVOR).mo56097d(f));
                    C128416ak akVar2 = eVar.f353212d.f353217e;
                    akVar2.mo108417f();
                    Collection.EL.stream(f).collect(Collectors.joining("\n"));
                    C18502t tVar2 = (C18502t) C18503u.f52450f.createBuilder();
                    C18450am amVar2 = (C18450am) C18451an.f52363e.createBuilder();
                    amVar2.mo23990a(f);
                    tVar2.copyOnWrite();
                    C18451an anVar2 = (C18451an) amVar2.build();
                    anVar2.getClass();
                    ((C18503u) tVar2.instance).f52452a = anVar2;
                    akVar2.mo108415d((C18503u) tVar2.build());
                }
            }
            if (avVar.f181068e) {
                C128426a aVar = eVar.f353212d.f353217e.f353177c;
                C37258g gVar = C37176a.f96966ce;
                C69664n.m101060f(gVar, "MAIN_ASSISTANT_SEARCH_RESULT_RECEIVED_LAST_EVENT");
                aVar.mo108429g(gVar);
            }
            if ((avVar.f181064a & 4) != 0) {
                C128416ak akVar3 = eVar.f353212d.f353217e;
                C63088z zVar = avVar.f181067d;
                akVar3.mo108417f();
                String I = zVar.mo59170I(C62972cr.f170009a);
                if (I.length() >= 100) {
                    I.substring(0, 100);
                }
                C18502t tVar3 = (C18502t) C18503u.f52450f.createBuilder();
                C18450am amVar3 = (C18450am) C18451an.f52363e.createBuilder();
                amVar3.mo23991b(zVar);
                tVar3.copyOnWrite();
                C18451an anVar3 = (C18451an) amVar3.build();
                anVar3.getClass();
                ((C18503u) tVar3.instance).f52452a = anVar3;
                akVar3.mo108415d((C18503u) tVar3.build());
            }
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) C128434f.f353215c.mo56225c()).mo56382g(e)).mo56372aa(38863)).mo56386p("Failed to parse html chunk");
        }
    }
}
