package p5488io.grpc;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import java.util.Arrays;

/* renamed from: io.grpc.dk */
/* compiled from: PG */
public final class C70340dk {

    /* renamed from: a */
    public final Status f187510a;

    /* renamed from: b */
    public final Object f187511b;

    public C70340dk(Status status) {
        this.f187511b = null;
        this.f187510a = status;
        C58838bb.m90873h(!status.mo61679g(), "cannot use OK status: %s", status);
    }

    public C70340dk(Object obj) {
        this.f187511b = obj;
        this.f187510a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C70340dk dkVar = (C70340dk) obj;
            return C58832aw.m90831a(this.f187510a, dkVar.f187510a) && C58832aw.m90831a(this.f187511b, dkVar.f187511b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f187510a, this.f187511b});
    }

    public final String toString() {
        if (this.f187511b != null) {
            C58830au b = C58831av.m90829b(this);
            b.mo56102b("config", this.f187511b);
            return b.toString();
        }
        C58830au b2 = C58831av.m90829b(this);
        b2.mo56102b("error", this.f187510a);
        return b2.toString();
    }
}
