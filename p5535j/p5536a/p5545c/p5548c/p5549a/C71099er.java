package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.er */
/* compiled from: PG */
public final class C71099er extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71099er f189622c;

    /* renamed from: d */
    private static volatile C63010eb f189623d;

    /* renamed from: a */
    public int f189624a = 0;

    /* renamed from: b */
    public Object f189625b;

    static {
        C71099er erVar = new C71099er();
        f189622c = erVar;
        C62942bv.registerDefaultInstance(C71099er.class, erVar);
    }

    private C71099er() {
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
                return newMessageInfo(f189622c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", C71097ep.class});
            case 3:
                return new C71099er();
            case 4:
                return new C71098eq();
            case 5:
                return f189622c;
            case 6:
                C63010eb ebVar = f189623d;
                if (ebVar == null) {
                    synchronized (C71099er.class) {
                        ebVar = f189623d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189622c);
                            f189623d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
