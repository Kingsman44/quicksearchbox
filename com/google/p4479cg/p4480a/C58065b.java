package com.google.p4479cg.p4480a;

import com.google.p4479cg.C58072d;

/* renamed from: com.google.cg.a.b */
/* compiled from: PG */
public final class C58065b {
    /* renamed from: a */
    public static boolean m88818a(int i, C58072d dVar) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                int i3 = dVar.f155220a;
                int i4 = dVar.f155221b;
                return C58066c.m88820b(i3, 9999) && C58066c.m88820b(i4, 12) && C58066c.m88820b(dVar.f155222c, C58066c.m88819a(i4, i3 % 4 == 0 && (i3 % 100 != 0 || i3 % 400 == 0)));
            } else if (i2 == 2) {
                int i5 = dVar.f155221b;
                return C58066c.m88820b(i5, 12) && C58066c.m88820b(dVar.f155222c, C58066c.m88819a(i5, true));
            } else if (i2 != 3) {
                return C58066c.m88820b(dVar.f155220a, 9999);
            } else {
                return C58066c.m88820b(dVar.f155220a, 9999) && C58066c.m88820b(dVar.f155221b, 12);
            }
        }
    }
}
