package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3825an.p3826a.p3827a.C49248a;
import com.google.assistant.p3825an.p3826a.p3827a.C49249b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.eg */
/* compiled from: PG */
public final class C71088eg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71088eg f189593d;

    /* renamed from: e */
    private static volatile C63010eb f189594e;

    /* renamed from: a */
    public int f189595a;

    /* renamed from: b */
    public int f189596b;

    /* renamed from: c */
    public int f189597c;

    static {
        C71088eg egVar = new C71088eg();
        f189593d = egVar;
        C62942bv.registerDefaultInstance(C71088eg.class, egVar);
    }

    private C71088eg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f189593d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C49249b.f127318a, C45240c.f118157a, C49248a.f127317a});
            case 3:
                return new C71088eg();
            case 4:
                return new C71087ef();
            case 5:
                return f189593d;
            case 6:
                C63010eb ebVar = f189594e;
                if (ebVar == null) {
                    synchronized (C71088eg.class) {
                        ebVar = f189594e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189593d);
                            f189594e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
