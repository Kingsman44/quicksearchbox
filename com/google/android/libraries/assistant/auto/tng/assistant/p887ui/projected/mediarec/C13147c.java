package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import android.net.Uri;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13018af;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13019ag;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13020ah;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13021ai;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13022aj;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13023ak;
import com.google.android.libraries.assistant.pcp.p1573k.C18914ac;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52152hd;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C62995dn;
import com.google.protos.p4850an.p4855d.p4858c.C63531d;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.c */
/* compiled from: PG */
public final /* synthetic */ class C13147c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C13153i f40747a;

    /* renamed from: b */
    public final /* synthetic */ C13152h f40748b;

    public /* synthetic */ C13147c(C13153i iVar, C13152h hVar) {
        this.f40747a = iVar;
        this.f40748b = hVar;
    }

    public final void onClick(View view) {
        C51016dg dgVar;
        C51016dg dgVar2;
        C58833ax axVar;
        C51058ev evVar;
        C13153i iVar = this.f40747a;
        C13152h hVar = this.f40748b;
        iVar.f40753b.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C13169y yVar = iVar.f40754c;
        C52560wg b = hVar.mo20929b();
        C13118ab abVar = yVar.f40777a;
        C58976aa aaVar = C58975e.f156826a;
        C46459k.m82829b(abVar.f40694s.mo20906e(Duration.ofSeconds(((Long) abVar.f40685j.mo17428b()).longValue())), "Failed to schedule a delayed cache refresh", new Object[0]);
        C13117aa aaVar2 = new C13117aa(abVar);
        if (b.f137946b == 16) {
            dgVar = (C51016dg) b.f137947c;
        } else {
            dgVar = C51016dg.f132827g;
        }
        boolean z = true;
        if ((dgVar.f132829a & 8) != 0) {
            if (b.f137946b == 16) {
                dgVar2 = (C51016dg) b.f137947c;
            } else {
                dgVar2 = C51016dg.f132827g;
            }
            C51805du duVar = dgVar2.f132833e;
            if (duVar == null) {
                duVar = C51805du.f135924e;
            }
            try {
                C62995dn dnVar = duVar.f135929d;
                if (dnVar.containsKey("intent_input")) {
                    Optional findFirst = Collection.EL.stream(((C61752n) C62942bv.parseFrom((C62942bv) C61752n.f166808f, ((C52152hd) C62942bv.parseFrom((C62942bv) C52152hd.f136850c, ((C52230ka) dnVar.get("intent_input")).f137061c, C62921ba.m95368a())).f136853b, C62921ba.m95368a())).f166812c).flatMap(C13162r.f40768a).flatMap(C13163s.f40769a).findFirst();
                    axVar = findFirst.isPresent() ? C58833ax.m90834k(((C63531d) findFirst.get()).f171839a) : C58836b.f156633a;
                    if (axVar.mo56113h()) {
                        C18914ac acVar = abVar.f40690o;
                        C51098gh ghVar = b.f137949e;
                        if (ghVar == null) {
                            ghVar = C51098gh.f133009e;
                        }
                        if (ghVar.f133012b == 1) {
                            evVar = (C51058ev) ghVar.f133013c;
                        } else {
                            evVar = C51058ev.f132941o;
                        }
                        acVar.mo24212g(evVar.f132944b, Uri.parse((String) axVar.mo56107c()), Optional.empty(), Optional.m71637of(aaVar2));
                    } else {
                        View findViewById = abVar.f40687l.requireView().findViewById(R.id.media_rec_content_container);
                        findViewById.getClass();
                        C51805du a = abVar.f40698w.mo20350a((C51803ds) duVar.toBuilder(), findViewById);
                        C13018af afVar = (C13018af) C13023ak.f40447c.createBuilder();
                        C13019ag agVar = (C13019ag) C13020ah.f40439c.createBuilder();
                        agVar.copyOnWrite();
                        C13020ah ahVar = (C13020ah) agVar.instance;
                        a.getClass();
                        ahVar.f40442b = a;
                        ahVar.f40441a |= 1;
                        afVar.copyOnWrite();
                        C13023ak akVar = (C13023ak) afVar.instance;
                        C13020ah ahVar2 = (C13020ah) agVar.build();
                        ahVar2.getClass();
                        akVar.f40450b = ahVar2;
                        akVar.f40449a = 2;
                        abVar.f40693r.mo20328d(abVar.mo20910a((C13023ak) afVar.build()));
                        z = false;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (C62974ct | IllegalArgumentException e) {
                C59104x d = C13118ab.f40669a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MediaRecFragment");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(44605)).mo56386p("Failed to parse deeplink from client input");
                axVar = C58836b.f156633a;
            }
        } else if ((b.f137945a & 32) != 0) {
            C13018af afVar2 = (C13018af) C13023ak.f40447c.createBuilder();
            C13021ai aiVar = (C13021ai) C13022aj.f40443c.createBuilder();
            String str = b.f137951g;
            aiVar.copyOnWrite();
            C13022aj ajVar = (C13022aj) aiVar.instance;
            str.getClass();
            ajVar.f40445a |= 1;
            ajVar.f40446b = str;
            afVar2.copyOnWrite();
            C13023ak akVar2 = (C13023ak) afVar2.instance;
            C13022aj ajVar2 = (C13022aj) aiVar.build();
            ajVar2.getClass();
            akVar2.f40450b = ajVar2;
            akVar2.f40449a = 1;
            abVar.f40693r.mo20328d(abVar.mo20910a((C13023ak) afVar2.build()));
        } else {
            abVar.f40690o.mo24211f(b, Optional.empty(), Optional.m71637of(aaVar2));
        }
        C52567wn wnVar = C52567wn.UNKNOWN;
        C52568wo woVar = b.f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        C52567wn b2 = C52567wn.m86649b(woVar.f138003j);
        if (b2 == null) {
            b2 = C52567wn.UNKNOWN;
        }
        int ordinal = b2.ordinal();
        if (ordinal != 0) {
            if (ordinal != 14) {
                if (ordinal == 21) {
                    abVar.f40695t.mo19974a(C37179a.f97680ev);
                } else if (ordinal == 9) {
                    abVar.f40695t.mo19974a(C37179a.f97682ex);
                } else if (ordinal != 10) {
                    abVar.f40695t.mo19974a(C37179a.f97419R);
                }
            }
            abVar.f40695t.mo19974a(C37179a.f97679eu);
        } else {
            abVar.f40695t.mo19974a(C37179a.f97681ew);
        }
        if (z) {
            C28443m mVar = abVar.f40699x;
            C28442l a2 = C28442l.m53142h().mo33894a();
            View findViewById2 = abVar.f40687l.requireView().findViewById(R.id.media_rec_content_container);
            findViewById2.getClass();
            mVar.mo33853c(a2, C28485y.m53234a(findViewById2));
        }
        yVar.f40777a.mo20913d(false);
    }
}
