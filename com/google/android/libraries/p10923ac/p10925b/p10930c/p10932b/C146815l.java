package com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b;

import com.google.common.p4522b.C58485gu;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.ac.b.c.b.l */
/* compiled from: PG */
public abstract class C146815l {

    /* renamed from: a */
    public static final C146815l f396375a = new C146806c().mo123677a();

    /* renamed from: b */
    public static final C146815l f396376b;

    /* renamed from: c */
    private static final byte[] f396377c;

    static {
        byte[] bArr = new byte[0];
        f396377c = bArr;
        C146806c cVar = new C146806c();
        cVar.mo123709c(bArr, 2);
        f396376b = cVar.mo123677a();
    }

    /* renamed from: b */
    public static C146814k m239247b() {
        return new C146806c();
    }

    /* renamed from: a */
    public abstract C58485gu mo123679a();

    /* renamed from: c */
    public final boolean mo123710c(byte[] bArr) {
        byte[] bArr2;
        boolean z;
        C58485gu a = mo123679a();
        int size = a.size();
        int i = 0;
        while (i < size) {
            C146819p pVar = (C146819p) a.get(i);
            if (bArr != null) {
                bArr2 = bArr;
            } else {
                bArr2 = f396377c;
            }
            int a2 = pVar.mo123694a();
            if (a2 == 1) {
                z = Arrays.equals(pVar.mo123695b(), bArr2);
            } else if (a2 == 2) {
                z = C146804a.m239222a(pVar.mo123695b(), bArr2);
            } else {
                int a3 = pVar.mo123694a();
                throw new IllegalStateException("Unknown matching type " + a3);
            }
            i++;
            if (z) {
                return true;
            }
        }
        return false;
    }
}
