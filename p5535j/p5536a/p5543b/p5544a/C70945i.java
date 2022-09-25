package p5535j.p5536a.p5543b.p5544a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.b.a.i */
/* compiled from: PG */
public final class C70945i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C70945i f189164d;

    /* renamed from: e */
    private static volatile C63010eb f189165e;

    /* renamed from: a */
    public int f189166a;

    /* renamed from: b */
    public int f189167b;

    /* renamed from: c */
    public C70952p f189168c;

    static {
        C70945i iVar = new C70945i();
        f189164d = iVar;
        C62942bv.registerDefaultInstance(C70945i.class, iVar);
    }

    private C70945i() {
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
                return newMessageInfo(f189164d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C70944h.f189163a, C45240c.f118157a});
            case 3:
                return new C70945i();
            case 4:
                return new C70943g();
            case 5:
                return f189164d;
            case 6:
                C63010eb ebVar = f189165e;
                if (ebVar == null) {
                    synchronized (C70945i.class) {
                        ebVar = f189165e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189164d);
                            f189165e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
