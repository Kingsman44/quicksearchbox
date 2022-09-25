package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.chips;

import android.support.p033v7.p040e.C0429k;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47274n;
import com.google.protobuf.C62971cq;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65496e;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65497f;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.f */
/* compiled from: PG */
public final class C128605f {

    /* renamed from: a */
    private final C128604e f353598a;

    public C128605f(C47274n nVar, C128604e eVar, AssistantChipsView assistantChipsView) {
        this.f353598a = eVar;
        LayoutInflater.from(nVar).inflate(R.layout.assistant_chips_recycler_view, assistantChipsView, true);
        View findViewById = assistantChipsView.findViewById(R.id.assistant_chips_recycler);
        C69664n.m101060f(findViewById, "assistantChipsView.findV…assistant_chips_recycler)");
        ((RecyclerView) findViewById).setAdapter(eVar);
    }

    /* renamed from: a */
    public final void mo108549a(C65497f fVar) {
        C69664n.m101061g(fVar, "chips");
        C128604e eVar = this.f353598a;
        C69664n.m101061g(fVar, "value");
        C0429k.m1383a(new C128603d(eVar, fVar), true).mo1399b(eVar);
        eVar.f353596g = fVar;
        C62971cq<C65496e> cqVar = fVar.f178059a;
        C69664n.m101060f(cqVar, "chips.chipsList");
        for (C65496e eVar2 : cqVar) {
            String str = eVar2.f178054c;
        }
    }

    /* renamed from: b */
    public final void mo108550b(C65496e eVar, C69626l lVar) {
        C69664n.m101061g(eVar, "chip");
        this.f353598a.f353597h.put(eVar, lVar);
        String str = eVar.f178053b;
    }
}
