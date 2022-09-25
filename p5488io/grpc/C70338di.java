package p5488io.grpc;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: io.grpc.di */
/* compiled from: PG */
public final class C70338di {

    /* renamed from: a */
    public final C70337dh f187496a;

    /* renamed from: b */
    public final String f187497b;

    /* renamed from: c */
    public final String f187498c;

    /* renamed from: d */
    public final C70336dg f187499d;

    /* renamed from: e */
    public final C70336dg f187500e;

    /* renamed from: f */
    public final boolean f187501f;

    /* renamed from: g */
    public final boolean f187502g;

    public C70338di(C70337dh dhVar, String str, C70336dg dgVar, C70336dg dgVar2, boolean z) {
        String str2;
        new AtomicReferenceArray(2);
        C58838bb.m90866a(dhVar, "type");
        this.f187496a = dhVar;
        C58838bb.m90866a(str, "fullMethodName");
        this.f187497b = str;
        C58838bb.m90866a(str, "fullMethodName");
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf == -1) {
            str2 = null;
        } else {
            str2 = str.substring(0, lastIndexOf);
        }
        this.f187498c = str2;
        C58838bb.m90866a(dgVar, "requestMarshaller");
        this.f187499d = dgVar;
        C58838bb.m90866a(dgVar2, "responseMarshaller");
        this.f187500e = dgVar2;
        this.f187501f = false;
        this.f187502g = z;
    }

    /* renamed from: b */
    public static String m102601b(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    /* renamed from: c */
    public static String m102602c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        C58838bb.m90866a(str, "fullServiceName");
        sb.append(str);
        sb.append("/");
        C58838bb.m90866a(str2, "methodName");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: d */
    public static C70335df m102603d() {
        C70335df dfVar = new C70335df();
        dfVar.f187485a = null;
        dfVar.f187486b = null;
        return dfVar;
    }

    /* renamed from: a */
    public final InputStream mo62043a(Object obj) {
        return this.f187499d.mo23738a(obj);
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("fullMethodName", this.f187497b);
        b.mo56102b("type", this.f187496a);
        b.mo56103c("idempotent", "false");
        b.mo56103c("safe", "false");
        b.mo56103c("sampledToLocalTracing", String.valueOf(this.f187502g));
        b.mo56102b("requestMarshaller", this.f187499d);
        b.mo56102b("responseMarshaller", this.f187500e);
        b.mo56102b("schemaDescriptor", (Object) null);
        b.f156627a = true;
        return b.toString();
    }
}
