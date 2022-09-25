package com.google.android.libraries.onegoogle.accountmenu.p2358f;

import com.google.android.libraries.onegoogle.owners.C30975j;
import com.google.android.libraries.onegoogle.owners.C30976k;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.f.g */
/* compiled from: PG */
public final class C30494g extends C30488a {

    /* renamed from: a */
    public static final C58817ah f82363a = new C30494g();

    /* renamed from: b */
    public final void mo36108b(C30976k kVar, C30491d dVar) {
        int l = kVar.mo36663l();
        int i = l - 1;
        if (l != 0) {
            int i2 = 1;
            if (i != 0) {
                if (i == 1) {
                    i2 = 2;
                } else if (i == 2) {
                    i2 = 3;
                } else {
                    throw new IllegalArgumentException("unknown enum value: ".concat(C30975j.m57822a(l)));
                }
            }
            ((C30489b) dVar).f82348g = i2;
            return;
        }
        throw null;
    }
}
