package com.google.android.apps.gsa.staticplugins.nowcards.p8123ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.C83420i;
import com.google.p375ai.p378b.C7811kv;
import com.google.p375ai.p378b.C7812kw;
import com.google.p375ai.p378b.C7818lb;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ui.c */
/* compiled from: PG */
final class C105066c extends MetadataLineView {
    public C105066c(Context context, C83420i iVar) {
        super(context);
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        if (iVar != null) {
            this.f292773c = iVar;
        }
    }

    /* renamed from: a */
    public final void mo94507a(C105069f fVar, C7818lb lbVar) {
        ArrayList<List> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        for (C7811kv kvVar : lbVar.f27419b) {
            if ((kvVar.f27307a & 2048) != 0) {
                if (!arrayList2.isEmpty()) {
                    arrayList.add(arrayList2);
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(kvVar);
                arrayList.add(arrayList2);
                arrayList2 = new ArrayList();
            } else {
                arrayList2.add(kvVar);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(arrayList2);
        }
        C7812kw kwVar = (C7812kw) lbVar.toBuilder();
        kwVar.copyOnWrite();
        ((C7818lb) kwVar.instance).f27419b = C7818lb.emptyProtobufList();
        C7818lb lbVar2 = (C7818lb) kwVar.build();
        boolean z = true;
        for (List list : arrayList) {
            if (!list.isEmpty()) {
                C7812kw kwVar2 = (C7812kw) lbVar2.toBuilder();
                kwVar2.mo16970a(list);
                if (!z) {
                    kwVar2.copyOnWrite();
                    C7818lb lbVar3 = (C7818lb) kwVar2.instance;
                    lbVar3.f27418a |= 16;
                    lbVar3.f27424g = true;
                }
                TextView b = super.mo94500b(fVar, (C7818lb) kwVar2.build());
                if (!((((C7811kv) list.get(0)).f27307a & 2048) == 0 || b == null)) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b.getLayoutParams();
                    layoutParams.weight = (float) ((C7811kv) list.get(0)).f27313g;
                    b.setLayoutParams(layoutParams);
                }
                z = false;
            }
        }
    }
}
