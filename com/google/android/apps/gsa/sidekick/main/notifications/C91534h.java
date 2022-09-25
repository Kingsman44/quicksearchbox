package com.google.android.apps.gsa.sidekick.main.notifications;

import android.content.Context;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90462d;
import com.google.android.apps.gsa.sidekick.shared.p7240i.C91743a;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C7767je;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.h */
/* compiled from: PG */
public final class C91534h implements C91743a {

    /* renamed from: a */
    private final C68214a f255290a;

    /* renamed from: b */
    private final Context f255291b;

    public C91534h(C68214a aVar, Context context) {
        this.f255290a = aVar;
        this.f255291b = context;
    }

    /* renamed from: a */
    public final void mo85910a() {
        throw new UnsupportedOperationException("This mode does not make sense in a notification context");
    }

    /* renamed from: b */
    public final void mo85911b(C7718hj hjVar) {
        C90461c cVar = new C90461c();
        cVar.f252699k = false;
        cVar.f252698j = true;
        cVar.f252693e = "com.google.android.googlequicksearchbox.NOTIFICATIONS_AGA";
        if (hjVar != null) {
            C7746ik a = C7746ik.m22834a(hjVar.f26966g);
            if (a == null) {
                a = C7746ik.UNKNOWN;
            }
            cVar.mo84200d("Entry type", Integer.toString(a.f27108J));
            for (C7767je jeVar : hjVar.f26948T) {
                int i = jeVar.f27205a;
                if (!((i & 1) == 0 || (i & 2) == 0)) {
                    cVar.mo84200d(jeVar.f27206b, jeVar.f27207c);
                }
            }
        }
        ((C90462d) this.f255290a.mo27525b()).mo84204a(this.f255291b, cVar);
    }
}
