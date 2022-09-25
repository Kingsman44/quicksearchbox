package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.framework.media.C143484aq;

/* renamed from: com.google.android.gms.cast.internal.ah */
/* compiled from: PG */
public final class C143569ah implements C143573al {

    /* renamed from: a */
    final /* synthetic */ C143573al f389271a;

    /* renamed from: b */
    final /* synthetic */ C143572ak f389272b;

    public C143569ah(C143572ak akVar, C143573al alVar) {
        this.f389272b = akVar;
        this.f389271a = alVar;
    }

    /* renamed from: a */
    public final void mo118753a(long j, int i, Object obj) {
        if (this.f389271a != null) {
            if (i == 2001) {
                C143572ak akVar = this.f389272b;
                akVar.f389318b.mo118889g("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", Integer.valueOf(akVar.f389282i));
                for (C143484aq w : this.f389272b.f389278E.f389119a.f389132g) {
                    w.mo118746w();
                }
                i = 2001;
            }
            this.f389271a.mo118753a(j, i, obj);
        }
    }

    /* renamed from: b */
    public final void mo118754b(long j) {
        C143573al alVar = this.f389271a;
        if (alVar != null) {
            alVar.mo118754b(j);
        }
    }
}
