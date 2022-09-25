package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6151b.C78117b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6155a.p6156a.C78166a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6155a.p6156a.C78167b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78815q;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78816r;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.r */
/* compiled from: PG */
public final class C78712r {

    /* renamed from: a */
    private final Set f216673a;

    /* renamed from: b */
    private final C78117b f216674b;

    public C78712r(Set set, C78117b bVar) {
        this.f216673a = set;
        this.f216674b = bVar;
    }

    /* renamed from: a */
    public final void mo73589a(float f) {
        for (C78167b bVar : this.f216673a) {
            long millis = TimeUnit.NANOSECONDS.toMillis(bVar.f215224a.mo26884a());
            synchronized (bVar.f215228e) {
                if (C78816r.m126602g((C78815q) bVar.f215226c.mo76657c())) {
                    if (millis - bVar.f215229f > 100) {
                        bVar.f215225b.mo28212l("[NGA] setAudioInfo", new C78166a(bVar, f));
                        bVar.f215229f = millis;
                    }
                }
            }
        }
        this.f216674b.mo73091b(f);
    }
}
