package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80832ak;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80833al;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80859e;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80879y;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83352b;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.ao */
/* compiled from: PG */
public final /* synthetic */ class C82060ao implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C82071az f224293a;

    public /* synthetic */ C82060ao(C82071az azVar) {
        this.f224293a = azVar;
    }

    public final void onClick(View view) {
        C82071az azVar = this.f224293a;
        azVar.f224340q.mo75430a(azVar.f224333j);
        C82074bb bbVar = azVar.f224337n;
        if (((Boolean) ((C83352b) bbVar.f224365a.f224405e).mo76654b()).booleanValue() && bbVar.f224368d.f221681a != null) {
            bbVar.f224365a.mo75503e(C82083bk.GONE);
            C81564g gVar = bbVar.f224366b;
            C80832ak akVar = (C80832ak) C80833al.f221756c.createBuilder();
            C80859e eVar = (C80859e) C80831aj.f221751c.createBuilder();
            C80879y yVar = C80879y.f221830a;
            eVar.copyOnWrite();
            C80831aj ajVar = (C80831aj) eVar.instance;
            yVar.getClass();
            ajVar.f221754b = yVar;
            ajVar.f221753a = 1;
            akVar.copyOnWrite();
            C80833al alVar = (C80833al) akVar.instance;
            C80831aj ajVar2 = (C80831aj) eVar.build();
            ajVar2.getClass();
            alVar.f221759b = ajVar2;
            alVar.f221758a = 1;
            gVar.mo73553b((C80833al) akVar.build());
        }
    }
}
