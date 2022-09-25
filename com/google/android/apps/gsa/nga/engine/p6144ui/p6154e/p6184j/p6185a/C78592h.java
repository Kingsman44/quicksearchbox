package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6184j.p6185a;

import android.graphics.Bitmap;
import com.google.android.apps.gsa.nga.engine.p6056o.C76534ab;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.j.a.h */
/* compiled from: PG */
public final /* synthetic */ class C78592h implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C78592h f216391a = new C78592h();

    private /* synthetic */ C78592h() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76534ab abVar = (C76534ab) obj;
        C59071e eVar = C78583aa.f216340a;
        if (!abVar.mo72226b().isEmpty()) {
            return (Bitmap) abVar.mo72226b().get();
        }
        C59104x c = C78583aa.f216340a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AvsController");
        ((C59052c) ((C59052c) c).mo56372aa(5223)).mo56386p("Bitmap from screenshot is empty");
        throw new IllegalStateException("Bitmap from screenshot is empty.");
    }
}
