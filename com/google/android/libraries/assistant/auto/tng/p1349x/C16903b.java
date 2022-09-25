package com.google.android.libraries.assistant.auto.tng.p1349x;

import com.google.android.libraries.assistant.auto.tng.p935d.p940d.p941a.p942a.C13342a;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.x.b */
/* compiled from: PG */
final class C16903b implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C16905d.f49412a.mo56226d()).mo56382g(th)).mo56372aa(46734)).mo56386p("Failed to listen car property dats.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58800sl lA = ((C13342a) obj).mo21036a().iterator();
        while (lA.hasNext()) {
            int intValue = ((Integer) lA.next()).intValue();
            if (intValue == 1) {
                C59071e eVar = C16905d.f49412a;
            } else if (intValue == 7) {
                C59071e eVar2 = C16905d.f49412a;
            } else if (intValue == 47) {
                C59071e eVar3 = C16905d.f49412a;
            } else if (intValue != 54) {
                ((C59052c) ((C59052c) C16905d.f49412a.mo56225c()).mo56372aa(46735)).mo56387q("Unrecognized id %d is registered", intValue);
            } else {
                C59071e eVar4 = C16905d.f49412a;
            }
        }
    }
}
