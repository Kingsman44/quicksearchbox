package com.google.android.apps.search.googleapp.search.p10415i;

/* renamed from: com.google.android.apps.search.googleapp.search.i.l */
/* compiled from: PG */
public final class C137510l {
    /* renamed from: a */
    public static final C137511m m223397a(int i) {
        C137511m mVar;
        C137511m[] values = C137511m.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                mVar = null;
                break;
            }
            mVar = values[i2];
            if (i >= mVar.f374017g && i <= mVar.f374018h) {
                break;
            }
            i2++;
        }
        return mVar == null ? C137511m.UNKNOWN : mVar;
    }
}
