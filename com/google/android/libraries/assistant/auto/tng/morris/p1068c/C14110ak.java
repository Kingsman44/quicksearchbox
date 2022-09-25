package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14533mt;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59710cy;
import com.google.common.p4552o.C59711cz;
import com.google.common.p4552o.C59736du;
import com.google.common.p4552o.C59737dv;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p001a.p007b.p011b.p012a.C0027c;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p3186j$.util.OptionalInt;
import p3186j$.util.OptionalLong;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.ak */
/* compiled from: PG */
public final class C14110ak {

    /* renamed from: a */
    public static final C58495hd f42794a;

    /* renamed from: c */
    private static final C59071e f42795c = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.c.ak");

    /* renamed from: d */
    private static final C58528ij f42796d = C58528ij.m90013M(Integer.valueOf(C37182a.f98158hS.f99011a.f98876a.f98906a), Integer.valueOf(C37182a.f98159hT.f99011a.f98876a.f98906a), Integer.valueOf(C37182a.f98160hU.f99011a.f98876a.f98906a), Integer.valueOf(C37182a.f98161hV.f99011a.f98876a.f98906a));

    /* renamed from: b */
    public final AtomicBoolean f42797b = new AtomicBoolean(false);

    /* renamed from: e */
    private final AtomicReference f42798e = new AtomicReference(OptionalLong.empty());

    /* renamed from: f */
    private final C37215b f42799f;

    /* renamed from: g */
    private final AtomicReference f42800g = new AtomicReference(Optional.empty());

    /* renamed from: h */
    private final C21370a f42801h;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C14533mt.STARTUP_ON_CALL_TILE, C37182a.f98158hS.mo40813g());
        gzVar.mo55429h(C14533mt.STARTUP_ON_CALL_TOP_CONTACT, C37182a.f98159hT.mo40813g());
        gzVar.mo55429h(C14533mt.STARTUP_ON_CALL_SOMEONE_ELSE, C37182a.f98160hU.mo40813g());
        gzVar.mo55429h(C14533mt.STARTUP_ON_CALL_RECENT_CALL, C37182a.f98161hV.mo40813g());
        gzVar.mo55429h(C14533mt.STARTUP_ON_GVIS, C37182a.f98163hX.mo40813g());
        gzVar.mo55429h(C14533mt.STARTUP_ON_SCREEN_MIC, C37182a.f98212iT.mo40813g());
        gzVar.mo55429h(C14533mt.STARTUP_ON_HOTWORD, C37182a.f98157hR.mo40813g());
        gzVar.mo55429h(C14533mt.CANCEL_ONGOING_CONVERSATION, C37182a.f98214ia.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C14533mt.CANCEL_CLOSE_IMMERSIVE_TASK, C37182a.f98217id.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C14533mt.CANCEL_MODE_CHANGE, C37182a.f98218ie.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C14533mt.CANCEL_SEARCH_IN_MAPS_TAP, C37182a.f98220ig.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C14533mt.CANCEL_TASK_REJECTED, C37182a.f98219if.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C14533mt.CANCEL_ACTIVITY_STOP, C37182a.f98215ib.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C14533mt.CANCEL_ON_SCREEN_MIC, C37182a.f98165hZ.mo40805c(C62722b.CANCELLED));
        gzVar.mo55429h(C14533mt.END_FAILURE_CANNOT_CONNECT, C37182a.f98216ic.mo40805c(C62722b.CANCELLED));
        f42794a = gzVar.mo55427f(false);
    }

    public C14110ak(C37215b bVar, C21370a aVar) {
        this.f42799f = bVar;
        this.f42801h = aVar;
    }

    /* renamed from: a */
    public final void mo21416a() {
        C59071e eVar = f42795c;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.CommsAppFlowLog");
        ((C59052c) ((C59052c) b).mo56372aa(45809)).mo56386p("Activate Flow.");
        this.f42797b.set(true);
        if (((Optional) this.f42800g.get()).isPresent()) {
            String b2 = C39191a.m68623b(((OptionalLong) this.f42798e.get()).orElse(0));
            C59104x b3 = eVar.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "Morris.CommsAppFlowLog");
            ((C59052c) ((C59052c) b3).mo56372aa(45810)).mo56389s("Log start event (%s).", ((C37252a) ((Optional) this.f42800g.get()).get()).mo40778b());
            C37215b bVar = this.f42799f;
            C37252a aVar = (C37252a) ((Optional) this.f42800g.get()).get();
            aVar.mo40794r(b2);
            aVar.mo40795s("requestId", b2);
            bVar.mo19974a(aVar);
            this.f42800g.set(Optional.empty());
        }
    }

    /* renamed from: b */
    public final void mo21417b(C14533mt mtVar, C0027c cVar, OptionalInt optionalInt, Optional optional) {
        mo21418c((C37252a) f42794a.getOrDefault(mtVar, C37182a.f98162hW.mo40813g()), cVar, optionalInt, optional);
    }

    /* renamed from: c */
    public final void mo21418c(C37252a aVar, C0027c cVar, OptionalInt optionalInt, Optional optional) {
        long j;
        long j2;
        int i = 0;
        if (this.f42797b.get()) {
            String b = C39191a.m68623b(((OptionalLong) this.f42798e.get()).orElse(0));
            if (((Optional) this.f42800g.get()).isPresent()) {
                C59104x b2 = f42795c.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "Morris.CommsAppFlowLog");
                ((C59052c) ((C59052c) b2).mo56372aa(45812)).mo56354G("Existing outgoing call flow started by (%s) is interrupted by (%s).", ((C37252a) ((Optional) this.f42800g.get()).get()).mo40778b(), aVar.mo40778b());
                C37215b bVar = this.f42799f;
                C37252a aVar2 = (C37252a) ((Optional) this.f42800g.get()).get();
                aVar2.mo40794r(b);
                aVar2.mo40795s("requestId", b);
                bVar.mo19974a(aVar2);
            }
            C37215b bVar2 = this.f42799f;
            C37252a c = C37182a.f98221ih.mo40805c(C62722b.ABORTED);
            C37253b bVar3 = (C37253b) c;
            bVar3.mo40794r(b);
            bVar3.mo40795s("requestId", b);
            if (optional.isPresent()) {
                j2 = ((Duration) optional.get()).toNanos();
            } else {
                j2 = this.f42801h.mo26872d();
            }
            bVar3.mo40791o(j2);
            bVar2.mo19974a(c);
            this.f42800g.set(Optional.empty());
            this.f42797b.set(false);
            this.f42798e.set(OptionalLong.empty());
        }
        C59104x b3 = f42795c.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "Morris.CommsAppFlowLog");
        ((C59052c) ((C59052c) b3).mo56372aa(45811)).mo56389s("cacheStartEvent (%s).", aVar.mo40778b());
        AtomicReference atomicReference = this.f42800g;
        if (optional.isPresent()) {
            j = ((Duration) optional.get()).toNanos();
        } else {
            j = this.f42801h.mo26872d();
        }
        aVar.mo40791o(j);
        C62940bt btVar = C59711cz.f160208s;
        C59710cy cyVar = (C59710cy) C59711cz.f160207r.createBuilder();
        C59736du duVar = (C59736du) C59737dv.f160341d.createBuilder();
        duVar.copyOnWrite();
        C59737dv dvVar = (C59737dv) duVar.instance;
        dvVar.f160344b = cVar.getNumber();
        dvVar.f160343a |= 1;
        if (optionalInt.isPresent()) {
            i = optionalInt.getAsInt();
        }
        duVar.copyOnWrite();
        C59737dv dvVar2 = (C59737dv) duVar.instance;
        dvVar2.f160343a |= 2;
        dvVar2.f160345c = i;
        cyVar.copyOnWrite();
        C59711cz czVar = (C59711cz) cyVar.instance;
        C59737dv dvVar3 = (C59737dv) duVar.build();
        dvVar3.getClass();
        czVar.f160218i = dvVar3;
        czVar.f160210a |= 512;
        aVar.mo40792p(btVar, (C59711cz) cyVar.build());
        atomicReference.set(Optional.m71637of(aVar));
        this.f42798e.set(OptionalLong.empty());
        this.f42797b.set(f42796d.contains(Integer.valueOf(aVar.mo40778b().f98906a)));
    }

    /* renamed from: d */
    public final void mo21419d(C14533mt mtVar) {
        C58495hd hdVar = f42794a;
        if (hdVar.containsKey(mtVar)) {
            mo21420e((C37252a) hdVar.get(mtVar));
        }
    }

    /* renamed from: e */
    public final void mo21420e(C37252a aVar) {
        String b = C39191a.m68623b(((OptionalLong) this.f42798e.get()).orElse(0));
        if (((Optional) this.f42800g.get()).isPresent() && this.f42797b.get()) {
            C59104x b2 = f42795c.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "Morris.CommsAppFlowLog");
            ((C59052c) ((C59052c) b2).mo56372aa(45814)).mo56389s("Log non-Assistant start event (%s).", ((C37252a) ((Optional) this.f42800g.get()).get()).mo40778b());
            C37215b bVar = this.f42799f;
            C37252a aVar2 = (C37252a) ((Optional) this.f42800g.get()).get();
            aVar2.mo40794r(b);
            aVar2.mo40795s("requestId", b);
            bVar.mo19974a(aVar2);
            this.f42800g.set(Optional.empty());
        }
        C59104x b3 = f42795c.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "Morris.CommsAppFlowLog");
        ((C59052c) ((C59052c) b3).mo56372aa(45813)).mo56389s("logEndEvent (%s).", aVar.mo40778b());
        C37215b bVar2 = this.f42799f;
        aVar.mo40794r(b);
        aVar.mo40795s("requestId", b);
        bVar2.mo19974a(aVar);
        this.f42797b.set(false);
        this.f42798e.set(OptionalLong.empty());
        this.f42800g.set(Optional.empty());
    }

    /* renamed from: f */
    public final void mo21421f(C37252a aVar) {
        C37215b bVar = this.f42799f;
        aVar.mo40787k();
        bVar.mo19974a(aVar);
    }

    /* renamed from: g */
    public final void mo21422g(long j) {
        if (((OptionalLong) this.f42798e.get()).isEmpty()) {
            this.f42798e.set(OptionalLong.m71641of(j));
            if (((Optional) this.f42800g.get()).isPresent() && this.f42797b.get()) {
                String b = C39191a.m68623b(j);
                C59104x b2 = f42795c.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "Morris.CommsAppFlowLog");
                ((C59052c) ((C59052c) b2).mo56372aa(45815)).mo56389s("Log start event (%s).", ((C37252a) ((Optional) this.f42800g.get()).get()).mo40778b());
                C37215b bVar = this.f42799f;
                C37252a aVar = (C37252a) ((Optional) this.f42800g.get()).get();
                aVar.mo40794r(b);
                aVar.mo40795s("requestId", b);
                bVar.mo19974a(aVar);
                this.f42800g.set(Optional.empty());
            }
        }
    }
}
