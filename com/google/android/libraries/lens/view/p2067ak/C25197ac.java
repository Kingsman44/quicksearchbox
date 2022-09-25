package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.C62995dn;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.ak.ac */
/* compiled from: PG */
public final class C25197ac {

    /* renamed from: a */
    public final C25241bt f68625a;

    public C25197ac(C25241bt btVar) {
        this.f68625a = btVar;
    }

    /* renamed from: b */
    public static String m46570b(String str, int i) {
        return String.format(Locale.ENGLISH, "%s,%d", new Object[]{str, Integer.valueOf(i)});
    }

    /* renamed from: a */
    public final long mo30342a(String str, int i) {
        C25265d dVar = ((C25284w) this.f68625a.mo30362b(false)).f68781b;
        if (dVar == null) {
            dVar = C25265d.f68732c;
        }
        String b = m46570b(str, i);
        b.getClass();
        C62995dn dnVar = dVar.f68735b;
        if (dnVar.containsKey(b)) {
            return ((Long) dnVar.get(b)).longValue();
        }
        return -1;
    }

    /* renamed from: c */
    public final void mo30343c(String str, int i, long j) {
        this.f68625a.mo30363c(new C25286y(str, i, j));
    }

    /* renamed from: d */
    public final boolean mo30344d() {
        C25269h hVar = ((C25284w) this.f68625a.mo30362b(false)).f68782c;
        if (hVar == null) {
            hVar = C25269h.f68742d;
        }
        return hVar.f68746c;
    }
}
