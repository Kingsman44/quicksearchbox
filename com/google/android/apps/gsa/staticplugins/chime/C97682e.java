package com.google.android.apps.gsa.staticplugins.chime;

import android.location.Location;
import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.search.core.google.C85881bd;
import com.google.common.p4522b.C58528ij;
import com.google.p4283bv.p4345d.p4350b.p4352b.C56995e;
import com.google.p4283bv.p4345d.p4350b.p4352b.C56996f;
import com.google.p4283bv.p4345d.p4350b.p4352b.C56998h;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.e */
/* compiled from: PG */
public final class C97682e implements C97679d {

    /* renamed from: c */
    private static final C58528ij f272779c = C58528ij.m90012L(C56995e.AND, C56995e.OR, C56995e.NOT);

    /* renamed from: a */
    public final C74637ae f272780a;

    /* renamed from: b */
    public final C85881bd f272781b;

    public C97682e(C74637ae aeVar, C85881bd bdVar) {
        this.f272780a = aeVar;
        this.f272781b = bdVar;
    }

    /* renamed from: a */
    public static boolean m161926a(C56996f fVar) {
        C56995e a = C56995e.m88250a(fVar.f152145a);
        if (a == null) {
            a = C56995e.CONTEXT_FENCE_TYPE_UNSPECIFIED;
        }
        if (a == C56995e.LOCATION_FENCE) {
            return true;
        }
        C58528ij ijVar = f272779c;
        C56995e a2 = C56995e.m88250a(fVar.f152145a);
        if (a2 == null) {
            a2 = C56995e.CONTEXT_FENCE_TYPE_UNSPECIFIED;
        }
        if (!ijVar.contains(a2)) {
            return false;
        }
        for (C56996f a3 : fVar.f152146b) {
            if (m161926a(a3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m161927b(C56996f fVar, Location location) {
        C56996f fVar2 = fVar;
        Location location2 = location;
        C56995e eVar = C56995e.CONTEXT_FENCE_TYPE_UNSPECIFIED;
        C56995e a = C56995e.m88250a(fVar2.f152145a);
        if (a == null) {
            a = C56995e.CONTEXT_FENCE_TYPE_UNSPECIFIED;
        }
        int ordinal = a.ordinal();
        int i = 3;
        int i2 = 2;
        if (ordinal == 1) {
            for (C56996f b : fVar2.f152146b) {
                int b2 = m161927b(b, location2);
                if (b2 == 2) {
                    return 2;
                }
                if (b2 == 1) {
                    i = 1;
                }
            }
            return i;
        } else if (ordinal == 2) {
            int i3 = 1;
            for (C56996f b3 : fVar2.f152146b) {
                int b4 = m161927b(b3, location2);
                if (b4 == i3) {
                    return i3;
                }
                i3 = 1;
                if (b4 == i2) {
                    i = 2;
                    i2 = 2;
                }
            }
            return i;
        } else if (ordinal == 3) {
            int b5 = m161927b((C56996f) fVar2.f152146b.get(0), location2);
            int i4 = b5 - 1;
            if (i4 == 0) {
                return 2;
            }
            if (i4 != 1) {
                return b5;
            }
            return 1;
        } else if (ordinal != 4) {
            return 4;
        } else {
            C56998h hVar = fVar2.f152147c;
            if (hVar == null) {
                hVar = C56998h.f152149d;
            }
            float[] fArr = new float[1];
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            double d = (double) hVar.f152151a;
            Double.isNaN(d);
            double d2 = (double) hVar.f152152b;
            Double.isNaN(d2);
            Location.distanceBetween(latitude, longitude, d / 1.0E7d, d2 / 1.0E7d, fArr);
            if (((double) fArr[0]) >= hVar.f152153c) {
                return 2;
            }
            float accuracy = location.getAccuracy();
            double d3 = hVar.f152153c;
            return ((double) accuracy) < d3 + d3 ? 1 : 2;
        }
    }
}
