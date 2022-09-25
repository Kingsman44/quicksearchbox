package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8389a;

import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8389a.C109560n;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14533mt;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15480f;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p001a.p007b.p011b.p012a.C0027c;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p3186j$.util.OptionalInt;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C109550d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C109560n f305110a;

    /* renamed from: b */
    public final /* synthetic */ C12986d f305111b;

    /* renamed from: c */
    public final /* synthetic */ C14533mt f305112c;

    /* renamed from: d */
    public final /* synthetic */ C0027c f305113d;

    /* renamed from: e */
    public final /* synthetic */ int f305114e;

    /* renamed from: f */
    public final /* synthetic */ Duration f305115f;

    public /* synthetic */ C109550d(C109560n nVar, C12986d dVar, C14533mt mtVar, C0027c cVar, int i, Duration duration) {
        this.f305110a = nVar;
        this.f305111b = dVar;
        this.f305112c = mtVar;
        this.f305113d = cVar;
        this.f305114e = i;
        this.f305115f = duration;
    }

    public final C60870cx apply(Object obj) {
        C109560n nVar = this.f305110a;
        C12986d dVar = this.f305111b;
        C14533mt mtVar = this.f305112c;
        C0027c cVar = this.f305113d;
        int i = this.f305114e;
        Duration duration = this.f305115f;
        C109560n.C109561a aVar = (C109560n.C109561a) obj;
        Optional hX = aVar.mo97894hX();
        if (hX.isEmpty()) {
            return C60856cj.m92899h(new IllegalArgumentException("AssistantAutoAppFlowLogger is not provided"));
        }
        C12991i iVar = dVar.f40370d;
        if (iVar == null) {
            iVar = C12991i.f40380k;
        }
        C13007y yVar = iVar.f40383b;
        if (yVar == null) {
            yVar = C13007y.f40413d;
        }
        long j = yVar.f40416b;
        C37252a aVar2 = (C37252a) ((Supplier) C109560n.f305127b.getOrDefault(mtVar, C109553g.f305118a)).get();
        C15480f.m32212a(aVar2, Optional.m71637of(Long.valueOf(j)));
        ((C15481g) hX.get()).mo22352b(aVar2);
        C109538ae aeVar = nVar.f305129d;
        C58976aa aaVar = C58975e.f156826a;
        mtVar.name();
        if (aeVar.f305066d.isPresent()) {
            C59104x c = C109538ae.f305063a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.AssistantAppFlow");
            ((C59052c) ((C59052c) c).mo56372aa(24945)).mo56386p("#logStartEvent: Force ending existing appflow.");
            aeVar.mo97885a(C14533mt.CANCEL_GENERIC);
        }
        aeVar.f305066d = Optional.m71637of(C39191a.m68623b(j));
        aeVar.mo97886b((C37252a) ((Supplier) C109538ae.f305065c.getOrDefault(mtVar, C109568u.f305147a)).get());
        if (nVar.f305132g.mo79746e(C90051dc.f248927x)) {
            nVar.f305130e.mo21417b(mtVar, cVar, OptionalInt.m71640of(i), Optional.m71637of(duration));
            nVar.f305130e.mo21422g(j);
        }
        return aVar.mo97893dv().mo20852a(dVar);
    }
}
