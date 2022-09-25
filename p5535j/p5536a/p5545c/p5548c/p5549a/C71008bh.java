package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.bh */
/* compiled from: PG */
public final class C71008bh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71008bh f189371c;

    /* renamed from: d */
    private static volatile C63010eb f189372d;

    /* renamed from: a */
    public int f189373a;

    /* renamed from: b */
    public int f189374b;

    static {
        C71008bh bhVar = new C71008bh();
        f189371c = bhVar;
        C62942bv.registerDefaultInstance(C71008bh.class, bhVar);
    }

    private C71008bh() {
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
                return newMessageInfo(f189371c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C71007bg.f189370a});
            case 3:
                return new C71008bh();
            case 4:
                return new C71006bf();
            case 5:
                return f189371c;
            case 6:
                C63010eb ebVar = f189372d;
                if (ebVar == null) {
                    synchronized (C71008bh.class) {
                        ebVar = f189372d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189371c);
                            f189372d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
