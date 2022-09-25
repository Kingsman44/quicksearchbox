package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.C143865e;
import com.google.android.gms.common.data.C143869i;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.C146528k;

/* renamed from: com.google.android.gms.wearable.internal.ah */
/* compiled from: PG */
public final class C146423ah extends C143865e implements C143869i {

    /* renamed from: d */
    private final int f395648d;

    public C146423ah(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f395648d = i2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    /* renamed from: h */
    public final C146528k mo123206h() {
        return new C146427al(this.f389974a, this.f389975b, this.f395648d);
    }

    public final String toString() {
        String str = mo119336ks("event_type") == 1 ? "changed" : mo119336ks("event_type") == 2 ? "deleted" : "unknown";
        String obj = mo123206h().toString();
        return "DataEventRef{ type=" + str + ", dataitem=" + obj + " }";
    }
}
