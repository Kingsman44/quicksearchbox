package p5451f.p5452a.p5453a.p5454a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: f.a.a.a.b */
/* compiled from: PG */
public final class C69405b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C69405b f185711e;

    /* renamed from: g */
    private static volatile C63010eb f185712g;

    /* renamed from: a */
    public C69442g f185713a;

    /* renamed from: b */
    public C69442g f185714b;

    /* renamed from: c */
    public C69442g f185715c;

    /* renamed from: d */
    public C69442g f185716d;

    /* renamed from: f */
    private int f185717f;

    static {
        C69405b bVar = new C69405b();
        f185711e = bVar;
        C62942bv.registerDefaultInstance(C69405b.class, bVar);
    }

    private C69405b() {
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
                return newMessageInfo(f185711e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C69405b();
            case 4:
                return new C69378a();
            case 5:
                return f185711e;
            case 6:
                C63010eb ebVar = f185712g;
                if (ebVar == null) {
                    synchronized (C69405b.class) {
                        ebVar = f185712g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f185711e);
                            f185712g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
