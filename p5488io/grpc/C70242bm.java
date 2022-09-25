package p5488io.grpc;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import java.util.Arrays;

/* renamed from: io.grpc.bm */
/* compiled from: PG */
public final class C70242bm {

    /* renamed from: a */
    public final String f187230a;

    /* renamed from: b */
    public final C70241bl f187231b;

    /* renamed from: c */
    public final long f187232c;

    /* renamed from: d */
    public final C70254by f187233d = null;

    /* renamed from: e */
    public final C70254by f187234e;

    public C70242bm(String str, C70241bl blVar, long j, C70254by byVar) {
        this.f187230a = str;
        C58838bb.m90866a(blVar, "severity");
        this.f187231b = blVar;
        this.f187232c = j;
        this.f187234e = byVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C70242bm) {
            C70242bm bmVar = (C70242bm) obj;
            if (C58832aw.m90831a(this.f187230a, bmVar.f187230a) && C58832aw.m90831a(this.f187231b, bmVar.f187231b) && this.f187232c == bmVar.f187232c) {
                C70254by byVar = bmVar.f187233d;
                if (!C58832aw.m90831a((Object) null, (Object) null) || !C58832aw.m90831a(this.f187234e, bmVar.f187234e)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f187230a, this.f187231b, Long.valueOf(this.f187232c), null, this.f187234e});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("description", this.f187230a);
        b.mo56102b("severity", this.f187231b);
        b.mo56103c("timestampNanos", String.valueOf(this.f187232c));
        b.mo56102b("channelRef", (Object) null);
        b.mo56102b("subchannelRef", this.f187234e);
        return b.toString();
    }
}
