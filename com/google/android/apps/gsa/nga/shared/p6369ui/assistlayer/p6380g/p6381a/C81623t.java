package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6380g.p6381a;

import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80750dy;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80830ai;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80859e;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80869o;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.g.a.t */
/* compiled from: PG */
public final /* synthetic */ class C81623t implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C81603ae f223281a;

    /* renamed from: b */
    public final /* synthetic */ View f223282b;

    /* renamed from: c */
    public final /* synthetic */ C80750dy f223283c;

    public /* synthetic */ C81623t(C81603ae aeVar, View view, C80750dy dyVar) {
        this.f223281a = aeVar;
        this.f223282b = view;
        this.f223283c = dyVar;
    }

    public final void onClick(View view) {
        C81603ae aeVar = this.f223281a;
        View view2 = this.f223282b;
        C80750dy dyVar = this.f223283c;
        aeVar.f223230j.mo75430a(view2);
        int i = dyVar.f221648a;
        int i2 = i != 0 ? i != 6 ? i != 7 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            C81564g gVar = aeVar.f223229i;
            C80859e eVar = (C80859e) C80831aj.f221751c.createBuilder();
            C80869o oVar = C80869o.f221817a;
            eVar.copyOnWrite();
            C80831aj ajVar = (C80831aj) eVar.instance;
            oVar.getClass();
            ajVar.f221754b = oVar;
            ajVar.f221753a = 9;
            gVar.mo73552a((C80831aj) eVar.build());
        } else if (i3 == 1) {
            C81564g gVar2 = aeVar.f223229i;
            C80859e eVar2 = (C80859e) C80831aj.f221751c.createBuilder();
            C80830ai aiVar = C80830ai.f221749a;
            eVar2.copyOnWrite();
            C80831aj ajVar2 = (C80831aj) eVar2.instance;
            aiVar.getClass();
            ajVar2.f221754b = aiVar;
            ajVar2.f221753a = 11;
            gVar2.mo73552a((C80831aj) eVar2.build());
        }
    }
}
