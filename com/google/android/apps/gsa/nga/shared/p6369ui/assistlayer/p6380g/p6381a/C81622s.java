package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6380g.p6381a;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80760eh;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80826ae;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80859e;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80869o;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.g.a.s */
/* compiled from: PG */
public final /* synthetic */ class C81622s implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C81603ae f223278a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f223279b;

    /* renamed from: c */
    public final /* synthetic */ C80760eh f223280c;

    public /* synthetic */ C81622s(C81603ae aeVar, ImageView imageView, C80760eh ehVar) {
        this.f223278a = aeVar;
        this.f223279b = imageView;
        this.f223280c = ehVar;
    }

    public final void onClick(View view) {
        C81603ae aeVar = this.f223278a;
        ImageView imageView = this.f223279b;
        C80760eh ehVar = this.f223280c;
        aeVar.f223230j.mo75430a(imageView);
        int i = ehVar.f221670a;
        int i2 = 4;
        if (i != 0) {
            i2 = i != 7 ? i != 3 ? i != 4 ? 0 : 2 : 1 : 3;
        }
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
        } else if (i3 == 1 || i3 == 2) {
            C81564g gVar2 = aeVar.f223229i;
            C80859e eVar2 = (C80859e) C80831aj.f221751c.createBuilder();
            C80826ae aeVar2 = C80826ae.f221745a;
            eVar2.copyOnWrite();
            C80831aj ajVar2 = (C80831aj) eVar2.instance;
            aeVar2.getClass();
            ajVar2.f221754b = aeVar2;
            ajVar2.f221753a = 13;
            gVar2.mo73552a((C80831aj) eVar2.build());
        }
    }
}
