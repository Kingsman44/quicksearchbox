package p5488io.grpc.p5525e;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import java.util.Arrays;
import java.util.Map;

/* renamed from: io.grpc.e.lh */
/* compiled from: PG */
public final class C70662lh {

    /* renamed from: a */
    public final String f188385a;

    /* renamed from: b */
    public final Map f188386b;

    public C70662lh(String str, Map map) {
        C58838bb.m90866a(str, "policyName");
        this.f188385a = str;
        C58838bb.m90866a(map, "rawConfigValue");
        this.f188386b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C70662lh) {
            C70662lh lhVar = (C70662lh) obj;
            if (!this.f188385a.equals(lhVar.f188385a) || !this.f188386b.equals(lhVar.f188386b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f188385a, this.f188386b});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("policyName", this.f188385a);
        b.mo56102b("rawConfigValue", this.f188386b);
        return b.toString();
    }
}
