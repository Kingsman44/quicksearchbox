package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import androidx.preference.Preference;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.i */
/* compiled from: PG */
final class C9626i implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C9627j f33325a;

    public C9626i(C9627j jVar) {
        this.f33325a = jVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C9627j.f33326i.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoDAController");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(345)).mo56389s("Failed to get deviceinfo for %s", this.f33325a.f33328k);
        this.f33325a.mo17798i();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C59104x b = C9627j.f33326i.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoDAController");
        ((C59052c) ((C59052c) b).mo56372aa(346)).mo56386p("onSuccess");
        C9627j jVar = this.f33325a;
        String O = ((C124548d) obj).mo106474O();
        Preference preference = jVar.f33327j;
        if (preference != null && O != null) {
            preference.mo8329n(O);
        }
    }
}
