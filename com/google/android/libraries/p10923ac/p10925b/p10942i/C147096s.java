package com.google.android.libraries.p10923ac.p10925b.p10942i;

import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import java.util.Set;

/* renamed from: com.google.android.libraries.ac.b.i.s */
/* compiled from: PG */
public final class C147096s {

    /* renamed from: a */
    private final char f397152a;

    /* renamed from: b */
    private final C58528ij f397153b;

    public C147096s(char c, Set set) {
        C58526ih ihVar = new C58526ih();
        ihVar.mo55489i(set);
        ihVar.mo55373c(Character.valueOf(c));
        this.f397153b = ihVar.mo55486f();
        this.f397152a = c;
    }

    /* renamed from: a */
    public final String mo123916a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (this.f397153b.contains(Character.valueOf(charAt))) {
                sb.append(this.f397152a);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
