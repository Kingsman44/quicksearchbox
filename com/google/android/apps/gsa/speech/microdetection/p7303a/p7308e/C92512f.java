package com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e;

import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.a.e.f */
/* compiled from: PG */
public final /* synthetic */ class C92512f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f258188a;

    /* renamed from: b */
    public final /* synthetic */ String f258189b;

    public /* synthetic */ C92512f(String str, String str2) {
        this.f258188a = str;
        this.f258189b = str2;
    }

    public final Object apply(Object obj) {
        String str = this.f258188a;
        String str2 = this.f258189b;
        C29690f fVar = (C29690f) obj;
        C59071e eVar = C92513g.f258190a;
        if (fVar != null) {
            return ((C28595b) fVar.f80416g.get(0)).f77799c;
        }
        C59104x c = C92513g.f258190a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "MicroModelsUtil");
        ((C59052c) ((C59052c) c).mo56372aa(12754)).mo56354G("Hotword file group is null with group name: %s, locale: %s", str, str2);
        return null;
    }
}
