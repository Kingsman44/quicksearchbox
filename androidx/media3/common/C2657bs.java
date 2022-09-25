package androidx.media3.common;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4575r.C60745b;
import java.util.List;

/* renamed from: androidx.media3.common.bs */
/* compiled from: PG */
public final class C2657bs implements C2668l {

    /* renamed from: a */
    public static final C2657bs f7406a = new C2657bs(C58485gu.m89845m());

    /* renamed from: b */
    public final C58485gu f7407b;

    public C2657bs(List list) {
        this.f7407b = C58485gu.m89842j(list);
    }

    /* renamed from: a */
    public final boolean mo6314a(int i) {
        for (int i2 = 0; i2 < this.f7407b.size(); i2++) {
            C2656br brVar = (C2656br) this.f7407b.get(i2);
            if (C60745b.m92718c(brVar.f7403c) && brVar.f7402b.f7356c == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C58597ky.m90218i(this.f7407b, ((C2657bs) obj).f7407b);
    }

    public final int hashCode() {
        return this.f7407b.hashCode();
    }
}
