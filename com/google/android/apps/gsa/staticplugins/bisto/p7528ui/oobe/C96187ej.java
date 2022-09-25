package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ej */
/* compiled from: PG */
public final /* synthetic */ class C96187ej implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C96206fb f269255a;

    public /* synthetic */ C96187ej(C96206fb fbVar) {
        this.f269255a = fbVar;
    }

    public final Object apply(Object obj) {
        boolean z;
        C96206fb fbVar = this.f269255a;
        MessageEventParcelable messageEventParcelable = (MessageEventParcelable) obj;
        C59104x b = C96206fb.f269286a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoDataLayerSeq");
        ((C59052c) ((C59052c) b).mo56372aa(16991)).mo56386p("Message received.");
        if (!messageEventParcelable.f395610b.equals("/assistant/activate")) {
            C59104x d = C96206fb.f269286a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoDataLayerSeq");
            ((C59052c) ((C59052c) d).mo56372aa(16992)).mo56386p("Path is wrong.");
            z = false;
        } else {
            z = fbVar.mo90006b(messageEventParcelable.f395611c);
        }
        return Boolean.valueOf(z);
    }
}
