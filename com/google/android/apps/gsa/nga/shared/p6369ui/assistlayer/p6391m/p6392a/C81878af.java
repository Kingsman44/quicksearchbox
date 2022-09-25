package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a;

import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80824ac;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80859e;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.m.a.af */
/* compiled from: PG */
public final /* synthetic */ class C81878af implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C81889aq f223895a;

    /* renamed from: b */
    public final /* synthetic */ AssistantP6GlowView f223896b;

    public /* synthetic */ C81878af(C81889aq aqVar, AssistantP6GlowView assistantP6GlowView) {
        this.f223895a = aqVar;
        this.f223896b = assistantP6GlowView;
    }

    public final void onClick(View view) {
        C81889aq aqVar = this.f223895a;
        aqVar.f223931p.mo75430a(this.f223896b);
        if (((Boolean) ((C83361k) aqVar.f223928m).f227199b.get()).booleanValue()) {
            C81564g gVar = aqVar.f223921f;
            C80859e eVar = (C80859e) C80831aj.f221751c.createBuilder();
            C80824ac acVar = C80824ac.f221743a;
            eVar.copyOnWrite();
            C80831aj ajVar = (C80831aj) eVar.instance;
            acVar.getClass();
            ajVar.f221754b = acVar;
            ajVar.f221753a = 14;
            gVar.mo73552a((C80831aj) eVar.build());
        }
    }
}
