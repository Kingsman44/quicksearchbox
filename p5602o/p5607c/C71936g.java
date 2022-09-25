package p5602o.p5607c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.c.g */
/* compiled from: PG */
public final class C71936g extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C71936g f191596f;

    /* renamed from: g */
    private static volatile C63010eb f191597g;

    /* renamed from: a */
    public int f191598a;

    /* renamed from: b */
    public long f191599b;

    /* renamed from: c */
    public long f191600c;

    /* renamed from: d */
    public long f191601d;

    /* renamed from: e */
    public int f191602e;

    static {
        C71936g gVar = new C71936g();
        f191596f = gVar;
        C62942bv.registerDefaultInstance(C71936g.class, gVar);
    }

    private C71936g() {
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
                return newMessageInfo(f191596f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0005င\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C71936g();
            case 4:
                return new C71935f();
            case 5:
                return f191596f;
            case 6:
                C63010eb ebVar = f191597g;
                if (ebVar == null) {
                    synchronized (C71936g.class) {
                        ebVar = f191597g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191596f);
                            f191597g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
