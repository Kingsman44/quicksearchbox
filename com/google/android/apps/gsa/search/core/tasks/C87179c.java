package com.google.android.apps.gsa.search.core.tasks;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4536h.C59236ac;
import com.google.common.p4536h.C59237ad;
import com.google.common.p4541l.C59316ad;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.search.core.tasks.c */
/* compiled from: PG */
public final /* synthetic */ class C87179c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ TrimFromDiskTask f235579a;

    public /* synthetic */ C87179c(TrimFromDiskTask trimFromDiskTask) {
        this.f235579a = trimFromDiskTask;
    }

    public final Object apply(Object obj) {
        C118826c cVar = (C118826c) obj;
        File cacheDir = this.f235579a.f235576a.getCacheDir();
        C59236ac acVar = C59316ad.f157487a;
        for (File file : new C59237ad(acVar, acVar).mo56707b(new C58759qy(cacheDir))) {
            if (!file.equals(cacheDir)) {
                file.delete();
            }
        }
        return C118826c.f331422a;
    }
}
