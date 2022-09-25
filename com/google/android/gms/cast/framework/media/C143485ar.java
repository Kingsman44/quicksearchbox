package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.internal.C143575an;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.tasks.C146039s;

/* renamed from: com.google.android.gms.cast.framework.media.ar */
/* compiled from: PG */
public final /* synthetic */ class C143485ar implements C146039s {

    /* renamed from: a */
    public final /* synthetic */ C143486as f389107a;

    /* renamed from: b */
    public final /* synthetic */ long f389108b;

    public /* synthetic */ C143485ar(C143486as asVar, long j) {
        this.f389107a = asVar;
        this.f389108b = j;
    }

    /* renamed from: d */
    public final void mo18633d(Exception exc) {
        C143486as asVar = this.f389107a;
        long j = this.f389108b;
        int i = exc instanceof C143842n ? ((C143842n) exc).f389919a.f389621g : 13;
        for (C143575an e : asVar.f389111c.f389129d.f389308a) {
            e.mo118909e(j, i, (Object) null);
        }
    }
}
