package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114890v;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.p3926e.C51987gm;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import com.google.assistant.p3994s.p3995a.C53375lo;
import com.google.assistant.p3994s.p3995a.C53376lp;
import com.google.assistant.p3994s.p3995a.C53429no;
import com.google.assistant.p3994s.p3995a.C53430np;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bj */
/* compiled from: PG */
public final class C115006bj extends C115033cj {

    /* renamed from: a */
    public final C58833ax f319204a;

    /* renamed from: b */
    private final C114890v f319205b;

    /* renamed from: c */
    private final Context f319206c;

    public C115006bj(Context context, C114890v vVar) {
        this.f319206c = context;
        this.f319205b = vVar;
        C51987gm gmVar = (C51987gm) C51992gr.f136445r.createBuilder();
        String string = context.getString(R.string.play_music_query);
        gmVar.copyOnWrite();
        C51992gr grVar = (C51992gr) gmVar.instance;
        string.getClass();
        grVar.f136447a |= 8;
        grVar.f136451e = string;
        int i = e.ab.ca;
        gmVar.copyOnWrite();
        C51992gr grVar2 = (C51992gr) gmVar.instance;
        grVar2.f136447a |= 4;
        grVar2.f136450d = i;
        C51992gr grVar3 = (C51992gr) gmVar.build();
        C53429no noVar = (C53429no) C53430np.f140222e.createBuilder();
        noVar.copyOnWrite();
        C53430np npVar = (C53430np) noVar.instance;
        grVar3.getClass();
        C62971cq cqVar = npVar.f140225b;
        if (!cqVar.mo58948c()) {
            npVar.f140225b = C62942bv.mutableCopy(cqVar);
        }
        npVar.f140225b.add(grVar3);
        C53430np npVar2 = (C53430np) noVar.build();
        C53375lo loVar = (C53375lo) C53376lp.f140063c.createBuilder();
        loVar.copyOnWrite();
        C53376lp lpVar = (C53376lp) loVar.instance;
        npVar2.getClass();
        lpVar.f140066b = npVar2;
        lpVar.f140065a |= 1;
        C53430np npVar3 = ((C53376lp) loVar.build()).f140066b;
        List a = vVar.mo101687a(npVar3 == null ? C53430np.f140222e : npVar3, e.ab);
        this.f319204a = !a.isEmpty() ? C58833ax.m90834k((C108430ik) a.get(0)) : C58836b.f156633a;
    }

    /* renamed from: b */
    public final int mo101585b() {
        return 11;
    }
}
