package p3186j$.time.format;

import java.util.ArrayList;

/* renamed from: j$.time.format.f */
final class C40981f implements C40982g {

    /* renamed from: a */
    private final C40982g[] f107338a;

    /* renamed from: b */
    private final boolean f107339b;

    C40981f(ArrayList arrayList, boolean z) {
        this((C40982g[]) arrayList.toArray(new C40982g[arrayList.size()]), z);
    }

    C40981f(C40982g[] gVarArr, boolean z) {
        this.f107338a = gVarArr;
        this.f107339b = z;
    }

    /* renamed from: a */
    public final C40981f mo43297a(boolean z) {
        return z == this.f107339b ? this : new C40981f(this.f107338a, z);
    }

    /* renamed from: b */
    public final boolean mo43294b(C41001z zVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.f107339b;
        if (z) {
            zVar.mo43345g();
        }
        try {
            for (C40982g b : this.f107338a) {
                if (!b.mo43294b(zVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z) {
                zVar.mo43339a();
            }
            return true;
        } finally {
            if (z) {
                zVar.mo43339a();
            }
        }
    }

    /* renamed from: d */
    public final int mo43295d(C40999x xVar, CharSequence charSequence, int i) {
        boolean z = this.f107339b;
        C40982g[] gVarArr = this.f107338a;
        if (z) {
            xVar.mo43334r();
            int i2 = i;
            for (C40982g d : gVarArr) {
                i2 = d.mo43295d(xVar, charSequence, i2);
                if (i2 < 0) {
                    xVar.mo43322f(false);
                    return i;
                }
            }
            xVar.mo43322f(true);
            return i2;
        }
        for (C40982g d2 : gVarArr) {
            i = d2.mo43295d(xVar, charSequence, i);
            if (i < 0) {
                break;
            }
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C40982g[] gVarArr = this.f107338a;
        if (gVarArr != null) {
            boolean z = this.f107339b;
            sb.append(z ? "[" : "(");
            for (C40982g append : gVarArr) {
                sb.append(append);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }
}
