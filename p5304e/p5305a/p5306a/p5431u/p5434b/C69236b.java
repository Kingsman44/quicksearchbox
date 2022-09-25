package p5304e.p5305a.p5306a.p5431u.p5434b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: e.a.a.u.b.b */
/* compiled from: PG */
public final class C69236b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C69236b f185328f;

    /* renamed from: g */
    private static volatile C63010eb f185329g;

    /* renamed from: a */
    public int f185330a;

    /* renamed from: b */
    public int f185331b;

    /* renamed from: c */
    public boolean f185332c;

    /* renamed from: d */
    public C69258x f185333d;

    /* renamed from: e */
    public C62910ar f185334e;

    static {
        C69236b bVar = new C69236b();
        f185328f = bVar;
        C62942bv.registerDefaultInstance(C69236b.class, bVar);
    }

    private C69236b() {
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
                return newMessageInfo(f185328f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C69236b();
            case 4:
                return new C69235a();
            case 5:
                return f185328f;
            case 6:
                C63010eb ebVar = f185329g;
                if (ebVar == null) {
                    synchronized (C69236b.class) {
                        ebVar = f185329g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185328f);
                            f185329g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
