package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8635i.C114773b;
import com.google.assistant.p3994s.p3995a.C53275hw;
import com.google.assistant.p3994s.p3995a.C53287ih;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bq */
/* compiled from: PG */
final class C115013bq implements C91096f {

    /* renamed from: a */
    final /* synthetic */ C115014br f319224a;

    public C115013bq(C115014br brVar) {
        this.f319224a = brVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        if (this.f319224a.f319237m.mo79746e(C90080ee.f249816o)) {
            C115014br brVar = this.f319224a;
            C114773b bVar = brVar.f319242r;
            C87571n nVar = brVar.f319243s;
            C53275hw hwVar = (C53275hw) C53287ih.f139693l.createBuilder();
            hwVar.copyOnWrite();
            C53287ih ihVar = (C53287ih) hwVar.instance;
            ihVar.f139698d = 2;
            ihVar.f139695a |= 1;
            hwVar.copyOnWrite();
            C53287ih ihVar2 = (C53287ih) hwVar.instance;
            ihVar2.f139702h = 4;
            ihVar2.f139695a |= 64;
            hwVar.copyOnWrite();
            C53287ih ihVar3 = (C53287ih) hwVar.instance;
            ihVar3.f139703i = 51;
            ihVar3.f139695a |= 128;
            bVar.mo101590b(nVar.mo81694a(context, (C53287ih) hwVar.build()));
        }
        return true;
    }
}
