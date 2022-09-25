package com.google.android.libraries.notifications.p2268e.p2287j;

import android.text.TextUtils;
import com.google.p4160bf.p4161a.p4163b.C55498f;
import com.google.p4160bf.p4161a.p4163b.C55500h;

/* renamed from: com.google.android.libraries.notifications.e.j.d */
/* compiled from: PG */
public abstract class C29953d {
    /* renamed from: a */
    public abstract String mo35223a();

    /* renamed from: b */
    public abstract String mo35224b();

    /* renamed from: c */
    public abstract int mo35225c();

    /* renamed from: d */
    public final C55500h mo35256d() {
        C55498f fVar = (C55498f) C55500h.f146453e.createBuilder();
        String b = mo35224b();
        fVar.copyOnWrite();
        C55500h hVar = (C55500h) fVar.instance;
        b.getClass();
        int i = 1;
        hVar.f146455a |= 1;
        hVar.f146456b = b;
        int c = mo35225c();
        int i2 = c - 1;
        if (c != 0) {
            if (i2 == 1) {
                i = 3;
            } else if (i2 == 2) {
                i = 4;
            } else if (i2 == 3) {
                i = 5;
            } else if (i2 == 4) {
                i = 2;
            }
            fVar.copyOnWrite();
            C55500h hVar2 = (C55500h) fVar.instance;
            hVar2.f146458d = i - 1;
            hVar2.f146455a |= 4;
            if (!TextUtils.isEmpty(mo35223a())) {
                String a = mo35223a();
                fVar.copyOnWrite();
                C55500h hVar3 = (C55500h) fVar.instance;
                a.getClass();
                hVar3.f146455a |= 2;
                hVar3.f146457c = a;
            }
            return (C55500h) fVar.build();
        }
        throw null;
    }
}
