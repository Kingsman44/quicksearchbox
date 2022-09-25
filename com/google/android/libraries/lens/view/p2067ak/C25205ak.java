package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.lens.view.ak.ak */
/* compiled from: PG */
public final /* synthetic */ class C25205ak implements C25240bs {

    /* renamed from: a */
    public final /* synthetic */ long f68647a;

    public /* synthetic */ C25205ak(long j) {
        this.f68647a = j;
    }

    /* renamed from: a */
    public final MessageLite mo30341a(MessageLite messageLite) {
        long j = this.f68647a;
        C25199ae aeVar = (C25199ae) messageLite;
        C25198ad adVar = (C25198ad) aeVar.toBuilder();
        C25244bw bwVar = aeVar.f68634g;
        if (bwVar == null) {
            bwVar = C25244bw.f68702b;
        }
        C25243bv bvVar = (C25243bv) bwVar.toBuilder();
        bvVar.copyOnWrite();
        ((C25244bw) bvVar.instance).f68704a = j;
        adVar.copyOnWrite();
        C25244bw bwVar2 = (C25244bw) bvVar.build();
        bwVar2.getClass();
        ((C25199ae) adVar.instance).f68634g = bwVar2;
        return (C25199ae) adVar.build();
    }
}
