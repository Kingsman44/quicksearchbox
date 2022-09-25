package com.airbnb.lottie.p238c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.e */
/* compiled from: PG */
public final class C4890e {

    /* renamed from: a */
    public static final C4890e f15624a = new C4890e("COMPOSITION");

    /* renamed from: b */
    public C4891f f15625b;

    /* renamed from: c */
    private final List f15626c;

    private C4890e(C4890e eVar) {
        this.f15626c = new ArrayList(eVar.f15626c);
        this.f15625b = eVar.f15625b;
    }

    /* renamed from: g */
    private final boolean m13580g() {
        List list = this.f15626c;
        return ((String) list.get(list.size() - 1)).equals("**");
    }

    /* renamed from: a */
    public final int mo9822a(String str, int i) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (!((String) this.f15626c.get(i)).equals("**")) {
            return 1;
        }
        if (i != this.f15626c.size() - 1 && ((String) this.f15626c.get(i + 1)).equals(str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: b */
    public final C4890e mo9823b(String str) {
        C4890e eVar = new C4890e(this);
        eVar.f15626c.add(str);
        return eVar;
    }

    /* renamed from: c */
    public final C4890e mo9824c(C4891f fVar) {
        C4890e eVar = new C4890e(this);
        eVar.f15625b = fVar;
        return eVar;
    }

    /* renamed from: d */
    public final boolean mo9825d(String str, int i) {
        if (i >= this.f15626c.size()) {
            return false;
        }
        int size = this.f15626c.size() - 1;
        String str2 = (String) this.f15626c.get(i);
        if (!str2.equals("**")) {
            boolean z = str2.equals(str) || str2.equals("*");
            if ((i == size || (i == this.f15626c.size() - 2 && m13580g())) && z) {
                return true;
            }
            return false;
        } else if (i == size) {
            return true;
        } else {
            int i2 = i + 1;
            if (((String) this.f15626c.get(i2)).equals(str)) {
                if (i == this.f15626c.size() - 2 || (i == this.f15626c.size() - 3 && m13580g())) {
                    return true;
                }
                return false;
            } else if (i2 < this.f15626c.size() - 1) {
                return false;
            } else {
                return ((String) this.f15626c.get(i2)).equals(str);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo9826e(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.f15626c.size()) {
            return false;
        }
        if (((String) this.f15626c.get(i)).equals(str) || ((String) this.f15626c.get(i)).equals("**") || ((String) this.f15626c.get(i)).equals("*")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo9827f(String str, int i) {
        if (!"__container".equals(str) && i >= this.f15626c.size() - 1 && !((String) this.f15626c.get(i)).equals("**")) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15626c);
        boolean z = this.f15625b != null;
        return "KeyPath{keys=" + valueOf + ",resolved=" + z + "}";
    }

    public C4890e(String... strArr) {
        this.f15626c = Arrays.asList(strArr);
    }
}
