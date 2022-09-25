package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.dk */
/* compiled from: PG */
public final class C71065dk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71065dk f189524c;

    /* renamed from: d */
    private static volatile C63010eb f189525d;

    /* renamed from: a */
    public int f189526a;

    /* renamed from: b */
    public int f189527b;

    static {
        C71065dk dkVar = new C71065dk();
        f189524c = dkVar;
        C62942bv.registerDefaultInstance(C71065dk.class, dkVar);
    }

    private C71065dk() {
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
                return newMessageInfo(f189524c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဌ\u0000", new Object[]{"a", "b", C71064dj.m103868b()});
            case 3:
                return new C71065dk();
            case 4:
                return new C71062dh();
            case 5:
                return f189524c;
            case 6:
                C63010eb ebVar = f189525d;
                if (ebVar == null) {
                    synchronized (C71065dk.class) {
                        ebVar = f189525d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189524c);
                            f189525d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
