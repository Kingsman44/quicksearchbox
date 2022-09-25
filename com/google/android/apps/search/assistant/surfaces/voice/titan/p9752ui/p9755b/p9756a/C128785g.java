package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128098bt;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.g */
/* compiled from: PG */
final class C128785g {

    /* renamed from: a */
    public final C83320io f354017a;

    /* renamed from: b */
    public final C128098bt f354018b;

    /* renamed from: c */
    public final boolean f354019c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C128785g(com.google.android.apps.gsa.nga.shared.p6407v.C83320io r1, com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128098bt r2, int r3) {
        /*
            r0 = this;
            r3 = r3 & 1
            if (r3 == 0) goto L_0x000b
            com.google.android.apps.gsa.nga.shared.v.io r1 = com.google.android.apps.gsa.nga.shared.p6407v.C83320io.f227132d
            java.lang.String r3 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)
        L_0x000b:
            r3 = 0
            r0.<init>((com.google.android.apps.gsa.nga.shared.p6407v.C83320io) r1, (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128098bt) r2, (boolean) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128785g.<init>(com.google.android.apps.gsa.nga.shared.v.io, com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.bt, int):void");
    }

    public C128785g(C83320io ioVar, C128098bt btVar, boolean z) {
        C69664n.m101061g(ioVar, "utteranceId");
        C69664n.m101061g(btVar, "stateCase");
        this.f354017a = ioVar;
        this.f354018b = btVar;
        this.f354019c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C128785g)) {
            return false;
        }
        C128785g gVar = (C128785g) obj;
        return C69664n.m101066l(this.f354017a, gVar.f354017a) && this.f354018b == gVar.f354018b && this.f354019c == gVar.f354019c;
    }

    public final int hashCode() {
        return (((this.f354017a.hashCode() * 31) + this.f354018b.hashCode()) * 31) + (this.f354019c ? 1 : 0);
    }

    public final String toString() {
        C83320io ioVar = this.f354017a;
        C128098bt btVar = this.f354018b;
        boolean z = this.f354019c;
        return "EscapeHatchInputState(utteranceId=" + ioVar + ", stateCase=" + btVar + ", isTtsPlaying=" + z + ")";
    }
}
