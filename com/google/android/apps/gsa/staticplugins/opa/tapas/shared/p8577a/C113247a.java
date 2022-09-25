package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8577a;

import com.google.android.apps.gsa.assist.C9347ar;
import com.google.android.apps.gsa.assist.p501a.C9321i;
import com.google.common.base.C58892db;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.a.a */
/* compiled from: PG */
public final class C113247a {

    /* renamed from: a */
    public final C9321i f313603a;

    public C113247a(C9321i iVar) {
        this.f313603a = iVar;
    }

    /* renamed from: a */
    public static String m187289a(C9347ar arVar, int i) {
        if (arVar != null && i < 50) {
            String str = arVar.f32454m;
            if (str != null) {
                try {
                    C58892db.m90995a(str.toString());
                    if (arVar.f32454m.length() > 0) {
                        return arVar.f32454m;
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
            for (int i2 = 0; i2 < arVar.f32443b.size(); i2++) {
                String a = m187289a((C9347ar) arVar.f32443b.get(i2), i + 1);
                if (a != null && a.length() > 0) {
                    return a;
                }
            }
        }
        return null;
    }
}
