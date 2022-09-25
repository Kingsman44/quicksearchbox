package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.a.bk */
/* compiled from: PG */
public final class C55558bk extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55558bk f146588d;

    /* renamed from: f */
    private static volatile C63010eb f146589f;

    /* renamed from: a */
    public int f146590a;

    /* renamed from: b */
    public long f146591b;

    /* renamed from: c */
    public C55557bj f146592c;

    /* renamed from: e */
    private int f146593e;

    static {
        C55558bk bkVar = new C55558bk();
        f146588d = bkVar;
        C62942bv.registerDefaultInstance(C55558bk.class, bkVar);
    }

    private C55558bk() {
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
                return newMessageInfo(f146588d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", C55552be.f146579a, "b", C45240c.f118157a});
            case 3:
                return new C55558bk();
            case 4:
                return new C55551bd();
            case 5:
                return f146588d;
            case 6:
                C63010eb ebVar = f146589f;
                if (ebVar == null) {
                    synchronized (C55558bk.class) {
                        ebVar = f146589f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146588d);
                            f146589f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
