package p5535j.p5536a.p5543b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.b.d */
/* compiled from: PG */
public final class C70957d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C70957d f189190f;

    /* renamed from: g */
    private static volatile C63010eb f189191g;

    /* renamed from: a */
    public int f189192a;

    /* renamed from: b */
    public int f189193b;

    /* renamed from: c */
    public long f189194c;

    /* renamed from: d */
    public long f189195d;

    /* renamed from: e */
    public long f189196e;

    static {
        C70957d dVar = new C70957d();
        f189190f = dVar;
        C62942bv.registerDefaultInstance(C70957d.class, dVar);
    }

    private C70957d() {
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
                return newMessageInfo(f189190f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C70956c.f189189a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C70957d();
            case 4:
                return new C70955b();
            case 5:
                return f189190f;
            case 6:
                C63010eb ebVar = f189191g;
                if (ebVar == null) {
                    synchronized (C70957d.class) {
                        ebVar = f189191g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189190f);
                            f189191g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
