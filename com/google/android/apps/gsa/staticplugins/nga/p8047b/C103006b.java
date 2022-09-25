package com.google.android.apps.gsa.staticplugins.nga.p8047b;

import android.provider.Settings;
import com.google.android.apps.gsa.nga.api.C74714bo;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4552o.ahi;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.b.b */
/* compiled from: PG */
public final /* synthetic */ class C103006b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C103009e f287593a;

    public /* synthetic */ C103006b(C103009e eVar) {
        this.f287593a = eVar;
    }

    public final void run() {
        C103009e eVar = this.f287593a;
        if (!((C74714bo) eVar.f287597c.mo27525b()).mo71079a().equals(ahi.ELIGIBLE)) {
            if (eVar.f287599e) {
                eVar.f287595a.unregisterContentObserver(eVar.f287600f);
            }
            eVar.f287599e = false;
        } else if (!eVar.f287599e) {
            eVar.f287595a.registerContentObserver(Settings.Secure.getUriFor("voice_interaction_service"), false, eVar.f287600f);
            eVar.f287599e = true;
        }
    }
}
