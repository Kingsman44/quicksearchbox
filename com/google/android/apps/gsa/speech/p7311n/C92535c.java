package com.google.android.apps.gsa.speech.p7311n;

import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.speech.n.c */
/* compiled from: PG */
final class C92535c implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C92536d.f258235a.mo56226d()).mo56372aa(12829)).mo56386p("couldn't get TISID model filepath");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            ((C59052c) ((C59052c) C92536d.f258235a.mo56226d()).mo56372aa(12832)).mo56386p("couldn't get TISID model path");
            return;
        }
        File file = new File((String) axVar.mo56107c());
        if (!file.exists()) {
            ((C59052c) ((C59052c) C92536d.f258235a.mo56226d()).mo56372aa(12831)).mo56386p("couldn't find TISID models to delete");
        } else if (!file.delete()) {
            ((C59052c) ((C59052c) C92536d.f258235a.mo56225c()).mo56372aa(12830)).mo56386p("error deleting TISID model");
        }
    }
}
