package p5535j.p5536a.p5537a.p5541c.p5542a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.a.c.a.b */
/* compiled from: PG */
public final class C70933b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C70933b f189144d;

    /* renamed from: e */
    private static volatile C63010eb f189145e;

    /* renamed from: a */
    public boolean f189146a;

    /* renamed from: b */
    public C70935d f189147b;

    /* renamed from: c */
    public C62971cq f189148c = C62942bv.emptyProtobufList();

    static {
        C70933b bVar = new C70933b();
        f189144d = bVar;
        C62942bv.registerDefaultInstance(C70933b.class, bVar);
    }

    private C70933b() {
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
                return newMessageInfo(f189144d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0007\u0002\t\u0003Ț", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C70933b();
            case 4:
                return new C70932a();
            case 5:
                return f189144d;
            case 6:
                C63010eb ebVar = f189145e;
                if (ebVar == null) {
                    synchronized (C70933b.class) {
                        ebVar = f189145e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189144d);
                            f189145e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
