package p5602o.p5607c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.c.ag */
/* compiled from: PG */
public final class C71930ag extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C71930ag f191576f;

    /* renamed from: g */
    private static volatile C63010eb f191577g;

    /* renamed from: a */
    public int f191578a;

    /* renamed from: b */
    public int f191579b;

    /* renamed from: c */
    public C62971cq f191580c = emptyProtobufList();

    /* renamed from: d */
    public C71929af f191581d;

    /* renamed from: e */
    public C71944o f191582e;

    static {
        C71930ag agVar = new C71930ag();
        f191576f = agVar;
        C62942bv.registerDefaultInstance(C71930ag.class, agVar);
    }

    private C71930ag() {
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
                return newMessageInfo(f191576f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", C71926ac.f191568a, C45240c.f118157a, C71946q.class, "d", "e"});
            case 3:
                return new C71930ag();
            case 4:
                return new C71937h();
            case 5:
                return f191576f;
            case 6:
                C63010eb ebVar = f191577g;
                if (ebVar == null) {
                    synchronized (C71930ag.class) {
                        ebVar = f191577g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191576f);
                            f191577g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
