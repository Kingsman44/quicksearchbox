package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.databinding.C0118a;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32953f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33231i;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.C33265f;
import com.google.assistant.p3897e.p3902c.p3907c.C51038eb;
import com.google.assistant.p3897e.p3902c.p3907c.C51043eg;
import com.google.assistant.p3897e.p3902c.p3907c.C51044eh;
import com.google.assistant.p3897e.p3902c.p3907c.C51045ei;
import com.google.assistant.p3897e.p3902c.p3907c.C51046ej;
import com.google.assistant.p3897e.p3902c.p3907c.C51047ek;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52497ty;
import com.google.assistant.p3897e.p3921j.C52498tz;
import com.google.assistant.p3897e.p3921j.C52500ua;
import com.google.assistant.p3897e.p3921j.C52501ub;
import com.google.assistant.p3897e.p3921j.C52506ug;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ct */
/* compiled from: PG */
public final class C33341ct implements C33177b, C33334cm {

    /* renamed from: f */
    private static final C59071e f89374f = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ct");

    /* renamed from: a */
    public C51941eu f89375a;

    /* renamed from: b */
    public C33182g f89376b;

    /* renamed from: c */
    public C32942a f89377c;

    /* renamed from: d */
    public C32953f f89378d;

    /* renamed from: e */
    public C32951d f89379e;

    /* renamed from: g */
    private final RecyclerView f89380g;

    /* renamed from: h */
    private final Context f89381h;

    /* renamed from: i */
    private final Fragment f89382i;

    /* renamed from: j */
    private final C21370a f89383j;

    public C33341ct(MessageCarouselField messageCarouselField, Fragment fragment, C21370a aVar) {
        this.f89381h = messageCarouselField.getContext();
        this.f89382i = fragment;
        this.f89383j = aVar;
        RecyclerView recyclerView = (RecyclerView) messageCarouselField.findViewById(R.id.fa_message_carousel_field_carousel);
        recyclerView.getClass();
        this.f89380g = recyclerView;
    }

    /* renamed from: l */
    private static List m61929l(C51047ek ekVar) {
        if ((ekVar.f132923a & 1) != 0) {
            int i = -1;
            for (int i2 = 0; i2 < ekVar.f132924b.size(); i2++) {
                if (((C51045ei) ekVar.f132924b.get(i2)).f132915b == 5) {
                    if (i >= 0) {
                        C59104x c = f89374f.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "MsgCarouselFieldPeer");
                        C0118a.m96d(c, "Invalid carousel data, found more than one reply cards", 51115, C58979ad.SMALL);
                        return null;
                    } else if (i2 == ekVar.f132925c) {
                        i = i2;
                    } else {
                        C59104x c2 = f89374f.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "MsgCarouselFieldPeer");
                        C0118a.m96d(c2, "Invalid carousel data, reply card index does not match focused_card_index", 51116, C58979ad.SMALL);
                        return null;
                    }
                }
            }
            return i >= 0 ? C58485gu.m89846n((C51045ei) ekVar.f132924b.get(i)) : ekVar.f132924b;
        }
        C59104x c3 = f89374f.mo56225c();
        c3.mo56378ag(C58975e.f156826a, "MsgCarouselFieldPeer");
        C0118a.m96d(c3, "Invalid carousel data, focused_card_index is not set", 51114, C58979ad.SMALL);
        return null;
    }

    /* renamed from: m */
    private final void m61930m(C51047ek ekVar) {
        if ((ekVar.f132923a & 1) != 0) {
            C51045ei eiVar = (C51045ei) ekVar.f132924b.get(ekVar.f132925c);
            if (eiVar.f132915b == 6) {
                C51805du c = C33231i.m61626c(eiVar.f132917d, 4, (C52236kg) null);
                C32942a aVar = this.f89377c;
                if (aVar == null) {
                    C59104x d = f89374f.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "MsgCarouselFieldPeer");
                    ((C59052c) ((C59052c) d).mo56372aa(51122)).mo56386p("#sendReplySentInput: Failed due to invalid args");
                    return;
                }
                aVar.mo38365b("FA MessageCarousel Reply Sent", c);
            }
        }
    }

    /* renamed from: n */
    private final void m61931n(C51047ek ekVar) {
        if ((ekVar.f132923a & 1) != 0) {
            C0640fb fbVar = this.f89380g.mAdapter;
            fbVar.getClass();
            if (fbVar.getItemCount() > 1) {
                this.f89380g.scrollToPosition(ekVar.f132925c);
            }
        }
    }

    /* renamed from: a */
    public final void mo38789a(C51805du duVar) {
        C32942a aVar = this.f89377c;
        if (aVar == null) {
            C59104x d = f89374f.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MsgCarouselFieldPeer");
            ((C59052c) ((C59052c) d).mo56372aa(51119)).mo56386p("#sendCancelReplyInput: Failed due to invalid args");
            return;
        }
        aVar.mo38365b("FA MessageCarousel Cancel Reply", duVar);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo38561b(C33176f fVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo38562c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo38563d(boolean z) {
    }

    /* renamed from: e */
    public final void mo38564e(C33180e eVar) {
        C51047ek ekVar;
        C51941eu euVar = this.f89375a;
        if (euVar == null || this.f89376b == null) {
            C59104x d = f89374f.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MsgCarouselFieldPeer");
            ((C59052c) ((C59052c) d).mo56372aa(51128)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89375a = euVar2;
            this.f89376b.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89375a;
        if (euVar3.f136277e == 37) {
            ekVar = (C51047ek) euVar3.f136278f;
        } else {
            ekVar = C51047ek.f132921d;
        }
        if (this.f89380g.mAdapter != null) {
            List l = m61929l(ekVar);
            if (l == null || l.isEmpty()) {
                C59104x d2 = f89374f.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "MsgCarouselFieldPeer");
                ((C59052c) ((C59052c) d2).mo56372aa(51127)).mo56386p("Did not render MessageCarousel, invalid rendering data");
                return;
            }
            C33338cq cqVar = (C33338cq) this.f89380g.mAdapter;
            cqVar.getClass();
            List list = cqVar.f89369e;
            cqVar.f89369e = new ArrayList(l);
            int min = Math.min(cqVar.f89369e.size(), list.size());
            for (int i = 0; i < min; i++) {
                if (!((C51045ei) cqVar.f89369e.get(i)).equals(list.get(i))) {
                    cqVar.notifyItemChanged(i);
                }
            }
            if (cqVar.f89369e.size() > list.size()) {
                cqVar.mObservable.mo2882d(min, cqVar.f89369e.size() - min);
            } else if (cqVar.f89369e.size() < list.size()) {
                cqVar.mObservable.mo2883e(min, list.size() - min);
            }
            m61930m(ekVar);
            m61931n(ekVar);
        } else if (this.f89378d == null || this.f89379e == null) {
            C59104x d3 = f89374f.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "MsgCarouselFieldPeer");
            ((C59052c) ((C59052c) d3).mo56372aa(51117)).mo56386p("Failed to initialize MessageCarousel view due to invalid args");
        } else {
            List l2 = m61929l(ekVar);
            if (l2 == null || l2.isEmpty()) {
                C59104x d4 = f89374f.mo56226d();
                d4.mo56378ag(C58975e.f156826a, "MsgCarouselFieldPeer");
                ((C59052c) ((C59052c) d4).mo56372aa(51118)).mo56386p("Did not render MessageCarousel, invalid rendering data");
                return;
            }
            C33338cq cqVar2 = new C33338cq(this.f89381h, this.f89382i, this.f89378d, this.f89379e, this, this.f89383j, l2);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f89381h, 0, false);
            C33265f fVar = new C33265f(this.f89381h);
            this.f89380g.setAdapter(cqVar2);
            this.f89380g.setLayoutManager(linearLayoutManager);
            this.f89380g.addItemDecoration$ar$ds(fVar);
            m61930m(ekVar);
            m61931n(ekVar);
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void mo38565f() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo38566g() {
    }

    /* renamed from: h */
    public final void mo38790h(C51805du duVar) {
        C32942a aVar = this.f89377c;
        if (aVar == null) {
            C59104x d = f89374f.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MsgCarouselFieldPeer");
            ((C59052c) ((C59052c) d).mo56372aa(51120)).mo56386p("#sendFailedToSendReplyInput: Failed due to invalid args");
            return;
        }
        aVar.mo38365b("FA MessageCarousel Send Reply", duVar);
    }

    /* renamed from: i */
    public final void mo38791i(C51805du duVar) {
        C32942a aVar = this.f89377c;
        if (aVar == null) {
            C59104x d = f89374f.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MsgCarouselFieldPeer");
            ((C59052c) ((C59052c) d).mo56372aa(51121)).mo56386p("#sendPreviewReplayInput: Failed due to invalid args");
            return;
        }
        aVar.mo38365b("FA MessageCarousel Replay", duVar);
    }

    /* renamed from: j */
    public final void mo38792j(int i, String str) {
        C51047ek ekVar;
        C51047ek ekVar2;
        C51047ek ekVar3;
        C51044eh ehVar;
        C51941eu euVar = this.f89375a;
        if (euVar == null || this.f89376b == null || this.f89377c == null) {
            C59104x d = f89374f.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MsgCarouselFieldPeer");
            ((C59052c) ((C59052c) d).mo56372aa(51123)).mo56386p("#sendSendReplyInput: Failed due to invalid args");
            return;
        }
        if (euVar.f136277e == 37) {
            ekVar = (C51047ek) euVar.f136278f;
        } else {
            ekVar = C51047ek.f132921d;
        }
        int a = C58557jl.m90120a(ekVar.f132924b, new C33339cr(i));
        if (a == -1) {
            C59104x d2 = f89374f.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "MsgCarouselFieldPeer");
            ((C59052c) ((C59052c) d2).mo56372aa(51125)).mo56386p("#sendSendReplyInput: Failed to find the card to reply to");
            return;
        }
        C51941eu euVar2 = this.f89375a;
        if (euVar2.f136277e == 37) {
            ekVar2 = (C51047ek) euVar2.f136278f;
        } else {
            ekVar2 = C51047ek.f132921d;
        }
        C51045ei eiVar = (C51045ei) ekVar2.f132924b.get(a);
        if (eiVar.f132915b == 5) {
            C51937eq eqVar = (C51937eq) this.f89375a.toBuilder();
            C51941eu euVar3 = this.f89375a;
            if (euVar3.f136277e == 37) {
                ekVar3 = (C51047ek) euVar3.f136278f;
            } else {
                ekVar3 = C51047ek.f132921d;
            }
            C51046ej ejVar = (C51046ej) ekVar3.toBuilder();
            C51038eb ebVar = (C51038eb) eiVar.toBuilder();
            if (eiVar.f132915b == 5) {
                ehVar = (C51044eh) eiVar.f132916c;
            } else {
                ehVar = C51044eh.f132906d;
            }
            C51043eg egVar = (C51043eg) ehVar.toBuilder();
            egVar.copyOnWrite();
            C51044eh ehVar2 = (C51044eh) egVar.instance;
            str.getClass();
            ehVar2.f132908a |= 2;
            ehVar2.f132910c = str;
            ebVar.copyOnWrite();
            C51045ei eiVar2 = (C51045ei) ebVar.instance;
            C51044eh ehVar3 = (C51044eh) egVar.build();
            ehVar3.getClass();
            eiVar2.f132916c = ehVar3;
            eiVar2.f132915b = 5;
            ejVar.copyOnWrite();
            C51047ek ekVar4 = (C51047ek) ejVar.instance;
            C51045ei eiVar3 = (C51045ei) ebVar.build();
            eiVar3.getClass();
            ekVar4.mo53510a();
            ekVar4.f132924b.add(a, eiVar3);
            eqVar.copyOnWrite();
            C51941eu euVar4 = (C51941eu) eqVar.instance;
            C51047ek ekVar5 = (C51047ek) ejVar.build();
            ekVar5.getClass();
            euVar4.f136278f = ekVar5;
            euVar4.f136277e = 37;
            C51941eu euVar5 = (C51941eu) eqVar.build();
            this.f89375a = euVar5;
            this.f89376b.mo38581f(euVar5);
            C52497ty tyVar = (C52497ty) C52501ub.f137826c.createBuilder();
            C52498tz tzVar = (C52498tz) C52500ua.f137822c.createBuilder();
            tzVar.copyOnWrite();
            C52500ua uaVar = (C52500ua) tzVar.instance;
            uaVar.f137824a |= 1;
            uaVar.f137825b = a;
            C52500ua uaVar2 = (C52500ua) tzVar.build();
            tyVar.copyOnWrite();
            C52501ub ubVar = (C52501ub) tyVar.instance;
            uaVar2.getClass();
            ubVar.f137829b = uaVar2;
            ubVar.f137828a |= 1;
            C52501ub ubVar2 = (C52501ub) tyVar.build();
            C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
            String str2 = this.f89375a.f136279g;
            tpVar.copyOnWrite();
            C52490tr trVar = (C52490tr) tpVar.instance;
            str2.getClass();
            trVar.f137797a |= 1;
            trVar.f137800d = str2;
            String str3 = this.f89375a.f136280h;
            tpVar.copyOnWrite();
            C52490tr trVar2 = (C52490tr) tpVar.instance;
            str3.getClass();
            trVar2.f137797a |= 2;
            trVar2.f137801e = str3;
            tpVar.copyOnWrite();
            C52490tr trVar3 = (C52490tr) tpVar.instance;
            trVar3.f137797a |= 4;
            trVar3.f137802f = true;
            tpVar.copyOnWrite();
            C52490tr trVar4 = (C52490tr) tpVar.instance;
            ubVar2.getClass();
            trVar4.f137799c = ubVar2;
            trVar4.f137798b = 18;
            C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
            C51953ff a2 = this.f89376b.mo38576a();
            tsVar.copyOnWrite();
            C52492tt ttVar = (C52492tt) tsVar.instance;
            a2.getClass();
            ttVar.f137806b = a2;
            ttVar.f137805a |= 1;
            C52506ug ugVar = (C52506ug) C52507uh.f137838b.createBuilder();
            ugVar.mo53877a((C52490tr) tpVar.build());
            tsVar.copyOnWrite();
            C52492tt ttVar2 = (C52492tt) tsVar.instance;
            C52507uh uhVar = (C52507uh) ugVar.build();
            uhVar.getClass();
            ttVar2.f137807c = uhVar;
            ttVar2.f137805a |= 2;
            this.f89377c.mo38366c("FA MessageCarousel Send Reply", (C52492tt) tsVar.build());
            return;
        }
        C59104x d3 = f89374f.mo56226d();
        d3.mo56378ag(C58975e.f156826a, "MsgCarouselFieldPeer");
        ((C59052c) ((C59052c) d3).mo56372aa(51124)).mo56386p("#sendSendReplyInput: Failed due to error card type");
    }

    /* renamed from: k */
    public final void mo38793k(C51805du duVar) {
        C32942a aVar = this.f89377c;
        if (aVar == null) {
            C59104x d = f89374f.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MsgCarouselFieldPeer");
            ((C59052c) ((C59052c) d).mo56372aa(51126)).mo56386p("#sendStartReplyInput: Failed due to invalid args");
            return;
        }
        aVar.mo38365b("FA MessageCarousel Reply", duVar);
    }
}
