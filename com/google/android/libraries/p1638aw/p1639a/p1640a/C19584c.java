package com.google.android.libraries.p1638aw.p1639a.p1640a;

import com.google.android.libraries.p1638aw.p1639a.C19581a;
import com.google.android.libraries.p1638aw.p1639a.C19591b;
import com.google.android.libraries.p1638aw.p1639a.C19596e;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.aw.a.a.c */
/* compiled from: PG */
public final class C19584c implements C19581a, C19591b {

    /* renamed from: a */
    public final C19591b f54511a;

    /* renamed from: b */
    private final C19581a f54512b;

    public C19584c(C19581a aVar, C19591b bVar) {
        this.f54512b = aVar;
        this.f54511a = bVar;
    }

    /* renamed from: b */
    public static final int m37342b(String str) {
        return str == null ? C19583b.f54510a[0] : C19583b.f54510a[Math.abs(str.hashCode()) % 21];
    }

    /* renamed from: a */
    public final CharSequence mo24845a(C19596e eVar) {
        String str;
        C19581a aVar = this.f54512b;
        if (eVar == null || eVar.mo24851a() == null) {
            return null;
        }
        for (String str2 : eVar.mo24851a()) {
            if (str2 == null || str2.isEmpty() || str2.equals(".")) {
                str2 = null;
            } else if (str2.length() > 2) {
                C19589h hVar = ((C19582a) aVar).f54509a;
                C58838bb.m90883r(hVar.f54522e);
                C19588g gVar = (C19588g) hVar.f54521d.get();
                if (gVar == null) {
                    str = null;
                } else {
                    int length = str2.length();
                    str = null;
                    for (int i = 0; i < length && gVar != null; i++) {
                        C19587f fVar = (C19587f) gVar.get(Character.valueOf(str2.charAt(i)));
                        if (fVar == null) {
                            break;
                        }
                        String str3 = fVar.f54517b;
                        if (str3 != null) {
                            str = str3;
                        }
                        gVar = fVar.f54516a;
                    }
                }
                str2 = str == null ? new StringBuilder().appendCodePoint(str2.codePointAt(0)).toString() : str;
            }
            if (str2 != null) {
                return str2;
            }
        }
        return null;
    }
}
