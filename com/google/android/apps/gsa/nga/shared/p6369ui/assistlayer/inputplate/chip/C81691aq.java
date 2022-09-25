package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80784fe;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4985f.p5042u.C65342d;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.aq */
/* compiled from: PG */
final class C81691aq {

    /* renamed from: a */
    private static final C59071e f223417a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.aq");

    /* renamed from: a */
    static void m129832a(View view, C80784fe feVar, C81674a aVar, C81688an anVar, C81698d dVar) {
        view.setOnClickListener((View.OnClickListener) null);
        view.setOnLongClickListener((View.OnLongClickListener) null);
        if (C80831aj.f221751c.equals(feVar.mo74605c())) {
            ((C59052c) ((C59052c) f223417a.mo56226d()).mo56372aa(6219)).mo56386p("No tap action provided; ignoring chipData");
            return;
        }
        if (!feVar.mo74606d().equals(C65342d.f176699e)) {
            view.setOnLongClickListener(new C81689ao(dVar, feVar));
        } else {
            ((C59052c) ((C59052c) f223417a.mo56224b()).mo56372aa(6218)).mo56386p("No long press handler provided.");
        }
        view.setOnClickListener(new C81690ap(aVar, feVar, anVar));
    }
}
