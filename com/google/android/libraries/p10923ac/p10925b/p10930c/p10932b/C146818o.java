package com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b;

import java.util.Comparator;

/* renamed from: com.google.android.libraries.ac.b.c.b.o */
/* compiled from: PG */
public final class C146818o implements Comparator {

    /* renamed from: a */
    public static final C146818o f396379a = new C146818o();

    private C146818o() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        C146819p pVar = (C146819p) obj;
        C146819p pVar2 = (C146819p) obj2;
        byte[] b = pVar.mo123695b();
        byte[] b2 = pVar2.mo123695b();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = b.length;
            if (i2 >= length || i3 >= b2.length) {
                i = length - b2.length;
            } else {
                byte b3 = b[i2] & 255;
                byte b4 = b2[i3] & 255;
                if (b3 != b4) {
                    i = b3 - b4;
                    break;
                }
                i2++;
                i3++;
            }
        }
        if (i != 0) {
            return i;
        }
        if (pVar.mo123694a() == pVar2.mo123694a()) {
            return 0;
        }
        return pVar.mo123694a() == 2 ? -1 : 1;
    }
}
