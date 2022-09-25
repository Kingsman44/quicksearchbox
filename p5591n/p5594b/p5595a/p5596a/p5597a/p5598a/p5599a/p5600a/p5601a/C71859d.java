package p5591n.p5594b.p5595a.p5596a.p5597a.p5598a.p5599a.p5600a.p5601a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: n.b.a.a.a.a.a.a.a.d */
/* compiled from: PG */
public final class C71859d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71859d f191403c;

    /* renamed from: d */
    private static volatile C63010eb f191404d;

    /* renamed from: a */
    public int f191405a;

    /* renamed from: b */
    public C63088z f191406b = C63088z.f170246b;

    static {
        C71859d dVar = new C71859d();
        f191403c = dVar;
        C62942bv.registerDefaultInstance(C71859d.class, dVar);
    }

    private C71859d() {
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
                return newMessageInfo(f191403c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C71859d();
            case 4:
                return new C71858c();
            case 5:
                return f191403c;
            case 6:
                C63010eb ebVar = f191404d;
                if (ebVar == null) {
                    synchronized (C71859d.class) {
                        ebVar = f191404d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191403c);
                            f191404d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
