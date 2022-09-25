package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.eh */
/* compiled from: PG */
public final class C71306eh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71306eh f190410c;

    /* renamed from: d */
    private static volatile C63010eb f190411d;

    /* renamed from: a */
    public int f190412a = 0;

    /* renamed from: b */
    public Object f190413b;

    static {
        C71306eh ehVar = new C71306eh();
        f190410c = ehVar;
        C62942bv.registerDefaultInstance(C71306eh.class, ehVar);
    }

    private C71306eh() {
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
                return newMessageInfo(f190410c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဵ\u0000\u0002ဵ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C71306eh();
            case 4:
                return new C71305eg();
            case 5:
                return f190410c;
            case 6:
                C63010eb ebVar = f190411d;
                if (ebVar == null) {
                    synchronized (C71306eh.class) {
                        ebVar = f190411d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190410c);
                            f190411d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
