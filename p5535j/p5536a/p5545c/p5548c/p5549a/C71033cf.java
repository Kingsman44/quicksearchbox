package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.cf */
/* compiled from: PG */
public final class C71033cf extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71033cf f189447d;

    /* renamed from: e */
    private static volatile C63010eb f189448e;

    /* renamed from: a */
    public int f189449a;

    /* renamed from: b */
    public int f189450b;

    /* renamed from: c */
    public C71032ce f189451c;

    static {
        C71033cf cfVar = new C71033cf();
        f189447d = cfVar;
        C62942bv.registerDefaultInstance(C71033cf.class, cfVar);
    }

    private C71033cf() {
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
                return newMessageInfo(f189447d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C71029cb.m103858b(), C45240c.f118157a});
            case 3:
                return new C71033cf();
            case 4:
                return new C71026bz();
            case 5:
                return f189447d;
            case 6:
                C63010eb ebVar = f189448e;
                if (ebVar == null) {
                    synchronized (C71033cf.class) {
                        ebVar = f189448e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189447d);
                            f189448e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
