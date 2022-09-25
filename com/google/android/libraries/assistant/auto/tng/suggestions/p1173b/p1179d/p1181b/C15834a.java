package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1179d.p1181b;

import com.google.android.apps.auto.p450a.p451a.C8863ah;
import com.google.android.apps.auto.p450a.p451a.C8871ap;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11670aa;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11671ab;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11674ae;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11675af;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15973f;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.C15785a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15806p;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1179d.C15832a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1252d.C16267t;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.d.b.a */
/* compiled from: PG */
public final class C15834a implements C15832a {

    /* renamed from: a */
    private static final C59071e f47072a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.b.d.b.a");

    /* renamed from: b */
    private final C15973f f47073b;

    /* renamed from: c */
    private final C16267t f47074c;

    public C15834a(C15973f fVar, C16267t tVar) {
        this.f47073b = fVar;
        this.f47074c = tVar;
    }

    /* renamed from: a */
    public final C15785a mo22582a() {
        return C15806p.f47035b;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo22583b(C58833ax axVar, MessageLite messageLite) {
        C8871ap apVar = (C8871ap) messageLite;
        if (axVar.mo56113h()) {
            C8863ah ahVar = ((C8871ap) axVar.mo56107c()).f30807b;
            if (ahVar == null) {
                ahVar = C8863ah.f30783c;
            }
            C8863ah ahVar2 = apVar.f30807b;
            if (ahVar2 == null) {
                ahVar2 = C8863ah.f30783c;
            }
            if (ahVar.equals(ahVar2)) {
                C58976aa aaVar = C58975e.f156826a;
                return;
            }
        }
        C58833ax d = this.f47073b.mo22629d("coolwalk_media_card_display_id");
        if (!d.mo56113h()) {
            C59104x d2 = f47072a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "GearheadMediaSignalObsv");
            ((C59052c) ((C59052c) d2).mo56372aa(46438)).mo56386p("Unable to find Coolwalk media display, skip one-off fetch");
            return;
        }
        C11674ae aeVar = (C11674ae) C11675af.f37663c.createBuilder();
        if ((apVar.f30806a & 1) != 0) {
            C11670aa aaVar2 = (C11670aa) C11671ab.f37655d.createBuilder();
            C8863ah ahVar3 = apVar.f30807b;
            if (ahVar3 == null) {
                ahVar3 = C8863ah.f30783c;
            }
            String str = ahVar3.f30785a;
            aaVar2.copyOnWrite();
            C11671ab abVar = (C11671ab) aaVar2.instance;
            str.getClass();
            abVar.f37657a |= 1;
            abVar.f37658b = str;
            C8863ah ahVar4 = apVar.f30807b;
            if (ahVar4 == null) {
                ahVar4 = C8863ah.f30783c;
            }
            String str2 = ahVar4.f30786b;
            aaVar2.copyOnWrite();
            C11671ab abVar2 = (C11671ab) aaVar2.instance;
            str2.getClass();
            abVar2.f37657a |= 2;
            abVar2.f37659c = str2;
            aeVar.copyOnWrite();
            C11675af afVar = (C11675af) aeVar.instance;
            C11671ab abVar3 = (C11671ab) aaVar2.build();
            abVar3.getClass();
            afVar.f37667b = abVar3;
            afVar.f37666a |= 1;
        }
        C46459k.m82829b(this.f47074c.mo22866a((C16091aq) d.mo56107c(), (C11675af) aeVar.build()), "Failed to fetch media rec on context change", new Object[0]);
    }
}
