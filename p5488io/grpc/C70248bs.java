package p5488io.grpc;

import com.google.common.base.C58838bb;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.grpc.bs */
/* compiled from: PG */
public final class C70248bs {

    /* renamed from: b */
    private static final AtomicLong f187245b = new AtomicLong();

    /* renamed from: a */
    public final long f187246a;

    /* renamed from: c */
    private final String f187247c;

    /* renamed from: d */
    private final String f187248d;

    public C70248bs(String str, String str2, long j) {
        C58838bb.m90866a(str, "typeName");
        C58838bb.m90869d(!str.isEmpty(), "empty type");
        this.f187247c = str;
        this.f187248d = str2;
        this.f187246a = j;
    }

    /* renamed from: a */
    public static C70248bs m102395a(String str, String str2) {
        return new C70248bs(str, str2, f187245b.incrementAndGet());
    }

    /* renamed from: b */
    public static String m102396b(Class cls) {
        C58838bb.m90866a(cls, "type");
        String simpleName = cls.getSimpleName();
        if (!simpleName.isEmpty()) {
            return simpleName;
        }
        return cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f187247c + "<" + this.f187246a + ">");
        if (this.f187248d != null) {
            sb.append(": (");
            sb.append(this.f187248d);
            sb.append(')');
        }
        return sb.toString();
    }
}
