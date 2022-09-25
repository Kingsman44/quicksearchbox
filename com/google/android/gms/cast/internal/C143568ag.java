package com.google.android.gms.cast.internal;

import com.google.android.gms.tasks.C146010af;
import java.io.IOException;

/* renamed from: com.google.android.gms.cast.internal.ag */
/* compiled from: PG */
public final class C143568ag implements C143573al {

    /* renamed from: a */
    final /* synthetic */ C143572ak f389270a;

    public C143568ag(C143572ak akVar) {
        this.f389270a = akVar;
    }

    /* renamed from: a */
    public final void mo118753a(long j, int i, Object obj) {
        if (i != 0) {
            C146010af afVar = this.f389270a.f389277D;
            afVar.f394698a.mo122507u(new IOException("storing session is timeout"));
        }
    }

    /* renamed from: b */
    public final void mo118754b(long j) {
        this.f389270a.f389277D.f394698a.mo122508v((Object) null);
    }
}
