package androidx.media3.extractor;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2633u;

/* renamed from: androidx.media3.extractor.n */
/* compiled from: PG */
public final class C3624n {
    /* renamed from: a */
    public static void m10438a(long j, C2604ac acVar, C3368bf[] bfVarArr) {
        int i;
        while (true) {
            boolean z = true;
            if (acVar.f7236c - acVar.f7235b > 1) {
                int c = m10440c(acVar);
                int c2 = m10440c(acVar);
                int i2 = acVar.f7235b;
                int i3 = i2 + c2;
                if (c2 == -1 || c2 > acVar.f7236c - i2) {
                    C2633u.m7050e("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i3 = acVar.f7236c;
                } else if (c == 4 && c2 >= 8) {
                    int g = acVar.mo6139g();
                    int j2 = acVar.mo6142j();
                    if (j2 == 49) {
                        i = acVar.mo6134b();
                        j2 = 49;
                    } else {
                        i = 0;
                    }
                    int g2 = acVar.mo6139g();
                    if (j2 == 47) {
                        acVar.mo6131A(acVar.f7235b + 1);
                        j2 = 47;
                    }
                    boolean z2 = g == 181 && (j2 == 49 || j2 == 47) && g2 == 3;
                    if (j2 == 49) {
                        if (i != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        m10439b(j, acVar, bfVarArr);
                    }
                }
                acVar.mo6131A(i3);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m10439b(long j, C2604ac acVar, C3368bf[] bfVarArr) {
        int g = acVar.mo6139g();
        if ((g & 64) != 0) {
            acVar.mo6131A(acVar.f7235b + 1);
            int i = (g & 31) * 3;
            int i2 = acVar.f7235b;
            for (C3368bf bfVar : bfVarArr) {
                acVar.mo6131A(i2);
                bfVar.mo6851c(acVar, i);
                if (j != -9223372036854775807L) {
                    bfVar.mo6852d(j, 1, i, 0, (C3367be) null);
                }
            }
        }
    }

    /* renamed from: c */
    private static int m10440c(C2604ac acVar) {
        int i = 0;
        while (acVar.f7236c - acVar.f7235b != 0) {
            int g = acVar.mo6139g();
            i += g;
            if (g != 255) {
                return i;
            }
        }
        return -1;
    }
}
