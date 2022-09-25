package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.bk */
/* compiled from: PG */
public final class C71011bk extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71011bk f189375d;

    /* renamed from: e */
    private static volatile C63010eb f189376e;

    /* renamed from: a */
    public int f189377a;

    /* renamed from: b */
    public int f189378b;

    /* renamed from: c */
    public boolean f189379c;

    static {
        C71011bk bkVar = new C71011bk();
        f189375d = bkVar;
        C62942bv.registerDefaultInstance(C71011bk.class, bkVar);
    }

    private C71011bk() {
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
                return newMessageInfo(f189375d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71011bk();
            case 4:
                return new C71010bj();
            case 5:
                return f189375d;
            case 6:
                C63010eb ebVar = f189376e;
                if (ebVar == null) {
                    synchronized (C71011bk.class) {
                        ebVar = f189376e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189375d);
                            f189376e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
