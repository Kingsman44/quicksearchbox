package p5591n.p5592a.p5593a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: n.a.a.b */
/* compiled from: PG */
public final class C71851b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71851b f191386d;

    /* renamed from: e */
    private static volatile C63010eb f191387e;

    /* renamed from: a */
    public int f191388a;

    /* renamed from: b */
    public String f191389b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C71855f f191390c;

    static {
        C71851b bVar = new C71851b();
        f191386d = bVar;
        C62942bv.registerDefaultInstance(C71851b.class, bVar);
    }

    private C71851b() {
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
                return newMessageInfo(f191386d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71851b();
            case 4:
                return new C71850a();
            case 5:
                return f191386d;
            case 6:
                C63010eb ebVar = f191387e;
                if (ebVar == null) {
                    synchronized (C71851b.class) {
                        ebVar = f191387e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191386d);
                            f191387e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
