package com.google.android.apps.gsa.search.core.logging;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.search.core.p3548a.C45232b;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.search.core.logging.b */
/* compiled from: PG */
public final class C86174b implements C118549h {

    /* renamed from: a */
    private final C86176d f232863a;

    public C86174b(C86176d dVar) {
        this.f232863a = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C45232b a;
        C86176d dVar = this.f232863a;
        C90748e.m148224b();
        SharedPreferences sharedPreferences = dVar.f232865a.getSharedPreferences("ThrottlingLogger", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (dVar.f232869e) {
            a = dVar.mo79811a(sharedPreferences);
            if (a != null) {
                dVar.f232868d = null;
                edit.remove("aggregated_events").apply();
            }
        }
        if (!(a == null || a.f118028a.size() == 0)) {
            for (C60555uf j : a.f118028a) {
                C89949q.m146525j(j, (C60321oe) null, (C63196b) null, (String) null);
            }
        }
        dVar.f232867c.c();
        edit.apply();
        return C118826c.f331423b;
    }
}
