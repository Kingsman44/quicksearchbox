package p5488io.grpc;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import java.util.Arrays;

/* renamed from: io.grpc.ce */
/* compiled from: PG */
public final class C70276ce {

    /* renamed from: a */
    public static final C70276ce f187346a = new C70276ce((C70279ch) null, Status.f186902OK, false);

    /* renamed from: b */
    public final C70279ch f187347b;

    /* renamed from: c */
    public final Status f187348c;

    /* renamed from: d */
    public final boolean f187349d;

    /* renamed from: e */
    private final C70904s f187350e = null;

    private C70276ce(C70279ch chVar, Status status, boolean z) {
        this.f187347b = chVar;
        C58838bb.m90866a(status, "status");
        this.f187348c = status;
        this.f187349d = z;
    }

    /* renamed from: a */
    public static C70276ce m102449a(Status status) {
        C58838bb.m90869d(!status.mo61679g(), "drop status shouldn't be OK");
        return new C70276ce((C70279ch) null, status, true);
    }

    /* renamed from: b */
    public static C70276ce m102450b(Status status) {
        C58838bb.m90869d(!status.mo61679g(), "error status shouldn't be OK");
        return new C70276ce((C70279ch) null, status, false);
    }

    /* renamed from: c */
    public static C70276ce m102451c(C70279ch chVar) {
        C58838bb.m90866a(chVar, "subchannel");
        return new C70276ce(chVar, Status.f186902OK, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C70276ce)) {
            return false;
        }
        C70276ce ceVar = (C70276ce) obj;
        if (C58832aw.m90831a(this.f187347b, ceVar.f187347b) && C58832aw.m90831a(this.f187348c, ceVar.f187348c)) {
            C70904s sVar = ceVar.f187350e;
            if (!C58832aw.m90831a((Object) null, (Object) null) || this.f187349d != ceVar.f187349d) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f187347b, this.f187348c, null, Boolean.valueOf(this.f187349d)});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("subchannel", this.f187347b);
        b.mo56102b("streamTracerFactory", (Object) null);
        b.mo56102b("status", this.f187348c);
        b.mo56103c("drop", String.valueOf(this.f187349d));
        return b.toString();
    }
}
