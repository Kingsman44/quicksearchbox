package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80792fm;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.bd */
/* compiled from: PG */
public final /* synthetic */ class C81752bd implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C81772bx f223604a;

    /* renamed from: b */
    public final /* synthetic */ C80792fm f223605b;

    public /* synthetic */ C81752bd(C81772bx bxVar, C80792fm fmVar) {
        this.f223604a = bxVar;
        this.f223605b = fmVar;
    }

    public final void onClick(View view) {
        C81772bx bxVar = this.f223604a;
        C80792fm fmVar = this.f223605b;
        C81782cg cgVar = bxVar.f223669u;
        if (cgVar != null) {
            cgVar.mo75308a(view);
        }
        C81564g gVar = bxVar.f223666r;
        C80831aj ajVar = fmVar.f221701d;
        if (ajVar == null) {
            ajVar = C80831aj.f221751c;
        }
        gVar.mo73552a(ajVar);
    }
}
