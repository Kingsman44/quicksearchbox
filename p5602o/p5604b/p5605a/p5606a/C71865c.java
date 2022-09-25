package p5602o.p5604b.p5605a.p5606a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.b.a.a.c */
/* compiled from: PG */
public final class C71865c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C71865c f191409e;

    /* renamed from: f */
    private static volatile C63010eb f191410f;

    /* renamed from: a */
    public int f191411a;

    /* renamed from: b */
    public int f191412b = 0;

    /* renamed from: c */
    public Object f191413c;

    /* renamed from: d */
    public int f191414d;

    static {
        C71865c cVar = new C71865c();
        f191409e = cVar;
        C62942bv.registerDefaultInstance(C71865c.class, cVar);
    }

    private C71865c() {
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
                return newMessageInfo(f191409e, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C71864b.f191408a, C71869g.class});
            case 3:
                return new C71865c();
            case 4:
                return new C71863a();
            case 5:
                return f191409e;
            case 6:
                C63010eb ebVar = f191410f;
                if (ebVar == null) {
                    synchronized (C71865c.class) {
                        ebVar = f191410f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191409e);
                            f191410f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
