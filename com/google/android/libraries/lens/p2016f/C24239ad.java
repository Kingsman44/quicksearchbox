package com.google.android.libraries.lens.p2016f;

import android.location.Location;
import com.google.android.libraries.lens.p1993a.C24065a;
import com.google.android.libraries.p2259n.p2260a.C29763b;
import com.google.lens.p4707j.C62433bj;
import com.google.lens.p4707j.C62471cu;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56751ae;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56756aj;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56757ak;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.lens.f.ad */
/* compiled from: PG */
public final class C24239ad {
    /* renamed from: a */
    public static C62471cu m45245a(C56751ae aeVar) {
        return (C62471cu) C24238ac.f66299g.mo56070hd(aeVar);
    }

    /* renamed from: b */
    public static Optional m45246b(C56757ak akVar) {
        C56756aj ajVar = akVar.f151478h;
        if (ajVar == null) {
            ajVar = C56756aj.f151463e;
        }
        int i = ajVar.f151465a;
        if ((i & 1) == 0 && (i & 2) == 0) {
            return Optional.empty();
        }
        Location location = new Location("silk");
        location.setLatitude(ajVar.f151466b);
        location.setLongitude(ajVar.f151467c);
        return Optional.m71637of(location);
    }

    /* renamed from: c */
    public static Integer m45247c(C56757ak akVar) {
        C29763b a = C29763b.m54880a(akVar.f151477g);
        if (a == null) {
            a = C29763b.ENTRY_POINT_ID_UNKNOWN;
        }
        return (Integer) C24065a.m44685a(a).mo56109e(Integer.valueOf(C62433bj.UNKNOWN.f168594ao));
    }
}
