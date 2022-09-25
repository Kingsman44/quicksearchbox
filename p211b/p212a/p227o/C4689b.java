package p211b.p212a.p227o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p211b.p212a.p216d.C4659f;

/* renamed from: b.a.o.b */
/* compiled from: PG */
public final class C4689b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C4689b f14726d;

    /* renamed from: f */
    private static volatile C63010eb f14727f;

    /* renamed from: a */
    public boolean f14728a = true;

    /* renamed from: b */
    public boolean f14729b;

    /* renamed from: c */
    public C4659f f14730c;

    /* renamed from: e */
    private int f14731e;

    static {
        C4689b bVar = new C4689b();
        f14726d = bVar;
        C62942bv.registerDefaultInstance(C4689b.class, bVar);
    }

    private C4689b() {
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
                return newMessageInfo(f14726d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C4689b();
            case 4:
                return new C4688a();
            case 5:
                return f14726d;
            case 6:
                C63010eb ebVar = f14727f;
                if (ebVar == null) {
                    synchronized (C4689b.class) {
                        ebVar = f14727f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14726d);
                            f14727f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
