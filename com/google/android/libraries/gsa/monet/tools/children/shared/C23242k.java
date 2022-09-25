package com.google.android.libraries.gsa.monet.tools.children.shared;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.tools.children.shared.p1915a.C23231a;
import com.google.android.libraries.gsa.monet.tools.children.shared.p1915a.C23232b;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.shared.k */
/* compiled from: PG */
public final class C23242k {
    /* renamed from: a */
    public static Bundle m43541a(String str, boolean z) {
        Bundle bundle = new Bundle();
        C23231a aVar = (C23231a) C23232b.f63678c.createBuilder();
        aVar.copyOnWrite();
        C23232b bVar = (C23232b) aVar.instance;
        bVar.f63680a |= 1;
        bVar.f63681b = z;
        bundle.putParcelable(str, C23245b.m43556a((C23232b) aVar.build()));
        return bundle;
    }

    /* renamed from: b */
    public static String m43542b(String str) {
        return "CHILD_BUNDLE_".concat(String.valueOf(str));
    }
}
