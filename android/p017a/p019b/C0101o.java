package android.p017a.p019b;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

@Deprecated
/* renamed from: android.a.b.o */
/* compiled from: PG */
public final class C0101o {
    @Deprecated

    /* renamed from: a */
    public final Set f277a;
    @Deprecated

    /* renamed from: b */
    public final boolean f278b;
    @Deprecated

    /* renamed from: c */
    public final int f279c;

    private C0101o(int i, Set set, boolean z) {
        this.f279c = i;
        this.f277a = set;
        this.f278b = z;
    }

    /* renamed from: a */
    static C0101o m55a(String str) {
        int i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (str.startsWith("integer")) {
            i = 1;
        } else if (str.startsWith("decimal")) {
            i = 2;
        } else {
            throw new IllegalArgumentException("Samples must start with 'integer' or 'decimal'");
        }
        boolean z = true;
        boolean z2 = false;
        for (String str2 : C0106t.f297e.split(str.substring(7).trim())) {
            if (str2.equals("…") || str2.equals("...")) {
                z = false;
                z2 = true;
            } else if (!z2) {
                String[] split = C0106t.f298f.split(str2);
                int length = split.length;
                if (length == 1) {
                    C0099m mVar = new C0099m(split[0]);
                    m56b(i, mVar);
                    linkedHashSet.add(new C0100n(mVar, mVar));
                } else if (length == 2) {
                    C0099m mVar2 = new C0099m(split[0]);
                    C0099m mVar3 = new C0099m(split[1]);
                    m56b(i, mVar2);
                    m56b(i, mVar3);
                    linkedHashSet.add(new C0100n(mVar2, mVar3));
                } else {
                    throw new IllegalArgumentException("Ill-formed number range: ".concat(String.valueOf(str2)));
                }
            } else {
                throw new IllegalArgumentException("Can only have … at the end of samples: ".concat(String.valueOf(str2)));
            }
        }
        return new C0101o(i, Collections.unmodifiableSet(linkedHashSet), z);
    }

    /* renamed from: b */
    private static void m56b(int i, C0099m mVar) {
        boolean z = false;
        boolean z2 = i == 1;
        if (mVar.f269b == 0) {
            z = true;
        }
        if (z2 != z) {
            throw new IllegalArgumentException("Ill-formed number range: ".concat(mVar.toString()));
        }
    }

    @Deprecated
    public final String toString() {
        StringBuilder sb = new StringBuilder("@");
        boolean z = true;
        sb.append((this.f279c != 1 ? "DECIMAL" : "INTEGER").toLowerCase(Locale.ENGLISH));
        for (C0100n nVar : this.f277a) {
            if (!z) {
                sb.append(",");
            }
            sb.append(' ');
            sb.append(nVar);
            z = false;
        }
        if (!this.f278b) {
            sb.append(", …");
        }
        return sb.toString();
    }
}
