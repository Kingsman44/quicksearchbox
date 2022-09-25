package com.google.android.apps.gsa.searchplate;

import android.content.DialogInterface;
import com.google.android.apps.gsa.search.shared.overlay.p6933a.C87638l;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.aak;
import com.google.android.apps.gsa.search.shared.service.p6935b.aal;
import com.google.android.apps.gsa.search.shared.service.p6935b.aam;
import com.google.protobuf.C62940bt;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.searchplate.au */
/* compiled from: PG */
final class C88919au implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C88922ax f240873a;

    public C88919au(C88922ax axVar) {
        this.f240873a = axVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C88922ax axVar = this.f240873a;
        axVar.f240876b.remove(axVar.f240875a);
        C88922ax axVar2 = this.f240873a;
        C87638l lVar = axVar2.f240877c.f240891n;
        String str = axVar2.f240875a;
        ArrayList arrayList = new ArrayList(axVar2.f240876b);
        lVar.f236897a.f236813aP.mo82799d(str, arrayList);
        C87673aa aaVar = lVar.f236897a.f236773C;
        C88489j jVar = new C88489j(C87739bu.SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SELECTED);
        C62940bt btVar = aak.f237085a;
        aal aal = (aal) aam.f237086e.createBuilder();
        aal.copyOnWrite();
        aam aam = (aam) aal.instance;
        str.getClass();
        aam.f237088a |= 1;
        aam.f237089b = str;
        aal.mo81977a(arrayList);
        aal.copyOnWrite();
        aam aam2 = (aam) aal.instance;
        aam2.f237088a |= 2;
        aam2.f237091d = false;
        jVar.mo82014b(btVar, (aam) aal.build());
        aaVar.mo81937i(jVar.mo82013a());
        dialogInterface.dismiss();
    }
}
