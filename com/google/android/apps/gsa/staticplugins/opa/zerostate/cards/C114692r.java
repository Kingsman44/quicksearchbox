package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114802az;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114874f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3897e.p3921j.C52282lz;
import com.google.assistant.p3897e.p3921j.C52395qd;
import com.google.assistant.p3994s.p3995a.C53354ku;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Collections;
import org.p5633c.p5634a.C72210d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.r */
/* compiled from: PG */
public final /* synthetic */ class C114692r implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C114693s f318244a;

    public /* synthetic */ C114692r(C114693s sVar) {
        this.f318244a = sVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C58833ax axVar;
        C114693s sVar = this.f318244a;
        C58976aa aaVar = C58975e.f156826a;
        C52395qd qdVar = null;
        ViewGroup viewGroup = (ViewGroup) sVar.f318248d.inflate(R.layout.zero_state_docked_agenda, (ViewGroup) null);
        C62971cq<C53354ku> cqVar = sVar.f318246b.f139994b;
        ArrayList arrayList = new ArrayList();
        for (C53354ku kuVar : cqVar) {
            if (C114874f.m190418r(kuVar)) {
                C52282lz lzVar = kuVar.f140002b;
                if (lzVar == null) {
                    lzVar = C52282lz.f137236h;
                }
                if (C114874f.m190413m(lzVar) && !C114874f.m190412l(kuVar)) {
                    arrayList.add(kuVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            axVar = C58836b.f156633a;
        } else {
            Collections.sort(arrayList, C114693s.f318245a);
            axVar = C58833ax.m90834k((C53354ku) arrayList.get(0));
        }
        sVar.f318250f = axVar;
        if (sVar.f318250f.mo56113h()) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.calendar_description);
            C52282lz lzVar2 = ((C53354ku) sVar.f318250f.mo56107c()).f140002b;
            if (lzVar2 == null) {
                lzVar2 = C52282lz.f137236h;
            }
            textView.setText(lzVar2.f137239b);
            C52282lz lzVar3 = ((C53354ku) sVar.f318250f.mo56107c()).f140002b;
            if (lzVar3 == null) {
                lzVar3 = C52282lz.f137236h;
            }
            if ((lzVar3.f137238a & 2) != 0) {
                C52282lz lzVar4 = ((C53354ku) sVar.f318250f.mo56107c()).f140002b;
                if (lzVar4 == null) {
                    lzVar4 = C52282lz.f137236h;
                }
                qdVar = lzVar4.f137240c;
                if (qdVar == null) {
                    qdVar = C52395qd.f137485e;
                }
            }
            C58833ax b = C114802az.m190315b(qdVar);
            if (b.mo56113h()) {
                ((TextView) viewGroup.findViewById(R.id.calendar_start_time)).setText(C114874f.m190405e(sVar.f318247c, (C72210d) b.mo56107c(), true, true));
            }
        }
        C28292j jVar = new C28292j(51730);
        jVar.f76976d = true;
        sVar.f318251g = C28293k.m52907d(jVar, sVar.f318249e);
        viewGroup.getClass();
        return viewGroup;
    }
}
