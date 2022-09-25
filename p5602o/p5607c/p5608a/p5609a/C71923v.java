package p5602o.p5607c.p5608a.p5609a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C59751eh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.c.a.a.v */
/* compiled from: PG */
public final class C71923v extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71923v f191546d;

    /* renamed from: e */
    private static volatile C63010eb f191547e;

    /* renamed from: a */
    public int f191548a;

    /* renamed from: b */
    public C59751eh f191549b;

    /* renamed from: c */
    public boolean f191550c;

    static {
        C71923v vVar = new C71923v();
        f191546d = vVar;
        C62942bv.registerDefaultInstance(C71923v.class, vVar);
    }

    private C71923v() {
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
                return newMessageInfo(f191546d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71923v();
            case 4:
                return new C71922u();
            case 5:
                return f191546d;
            case 6:
                C63010eb ebVar = f191547e;
                if (ebVar == null) {
                    synchronized (C71923v.class) {
                        ebVar = f191547e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191546d);
                            f191547e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
