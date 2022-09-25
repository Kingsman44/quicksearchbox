package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114874f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3897e.p3921j.C52282lz;
import com.google.assistant.p3994s.p3995a.C53350kq;
import com.google.assistant.p3994s.p3995a.C53354ku;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4816ai.p4818b.C63204j;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.a */
/* compiled from: PG */
public final /* synthetic */ class C114615a implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C114678d f317959a;

    public /* synthetic */ C114615a(C114678d dVar) {
        this.f317959a = dVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C114678d dVar = this.f317959a;
        ViewGroup viewGroup = (ViewGroup) dVar.f318173b.inflate(R.layout.zero_state_agenda_card, (ViewGroup) null);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.agenda_event_list);
        C62971cq<C53354ku> cqVar = dVar.f318175d.f139994b;
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.see_all_container);
        C28292j jVar = new C28292j(52567);
        jVar.mo33795i(5);
        viewGroup3.getClass();
        C28295m.m52919e(viewGroup3, jVar);
        C53350kq kqVar = dVar.f318175d;
        if ((kqVar.f139993a & 2) != 0) {
            C63204j jVar2 = kqVar.f139996d;
            if (jVar2 == null) {
                jVar2 = C63204j.f170749e;
            }
            jVar.mo33792f(jVar2);
        }
        boolean z = false;
        dVar.f318177f.add(C28293k.m52908e(jVar, new C28293k[0]));
        viewGroup3.setOnClickListener(new C89943l(new C114643b(dVar)));
        viewGroup3.setVisibility(0);
        String string = dVar.f318174c.getString(R.string.agenda_group_today_title);
        ArrayList arrayList = new ArrayList();
        for (C53354ku kuVar : cqVar) {
            if (C114874f.m190418r(kuVar)) {
                C52282lz lzVar = kuVar.f140002b;
                if (lzVar == null) {
                    lzVar = C52282lz.f137236h;
                }
                if (C114874f.m190416p(lzVar) && C114874f.m190412l(kuVar)) {
                    arrayList.add(kuVar);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C53354ku kuVar2 : cqVar) {
            if (C114874f.m190418r(kuVar2)) {
                C52282lz lzVar2 = kuVar2.f140002b;
                if (lzVar2 == null) {
                    lzVar2 = C52282lz.f137236h;
                }
                if (C114874f.m190413m(lzVar2) && !C114874f.m190412l(kuVar2)) {
                    arrayList2.add(kuVar2);
                }
            }
        }
        C58833ax g = dVar.mo101518g(arrayList, arrayList2, string, true);
        if (g.mo56113h()) {
            viewGroup2.addView((View) g.mo56107c());
        } else {
            z = true;
        }
        C58833ax axVar = C58836b.f156633a;
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(dVar.f318181j.mo26870b());
        if (instance.get(11) > 16) {
            ArrayList arrayList3 = new ArrayList();
            for (C53354ku kuVar3 : cqVar) {
                if (C114874f.m190418r(kuVar3)) {
                    C52282lz lzVar3 = kuVar3.f140002b;
                    if (lzVar3 == null) {
                        lzVar3 = C52282lz.f137236h;
                    }
                    if (C114874f.m190417q(lzVar3) && C114874f.m190412l(kuVar3)) {
                        arrayList3.add(kuVar3);
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (C53354ku kuVar4 : cqVar) {
                if (C114874f.m190418r(kuVar4)) {
                    C52282lz lzVar4 = kuVar4.f140002b;
                    if (lzVar4 == null) {
                        lzVar4 = C52282lz.f137236h;
                    }
                    if (C114874f.m190417q(lzVar4) && !C114874f.m190412l(kuVar4)) {
                        arrayList4.add(kuVar4);
                    }
                }
            }
            axVar = dVar.mo101518g(arrayList3, arrayList4, dVar.f318174c.getString(R.string.agenda_group_tomorrow_title), z);
            if (axVar.mo56113h()) {
                viewGroup2.addView((View) axVar.mo56107c());
            }
        }
        if (dVar.f318182k.mo101754c()) {
            viewGroup.addView(dVar.f318182k.mo101752a());
            dVar.f318177f.add(dVar.f318182k.mo101753b());
        }
        C28292j jVar3 = new C28292j(51730);
        jVar3.f76976d = true;
        dVar.f318178g = C28293k.m52907d(jVar3, dVar.f318177f);
        viewGroup.getClass();
        C28295m.m52919e(viewGroup, jVar3);
        if (!g.mo56113h() && !axVar.mo56113h()) {
            ((C59052c) ((C59052c) C114678d.f318171a.mo56226d()).mo56372aa(29259)).mo56386p("#getContentView(): no events to show. Agenda card will be empty.");
        }
        return viewGroup;
    }
}
