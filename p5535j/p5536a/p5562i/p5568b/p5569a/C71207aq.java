package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.aq */
/* compiled from: PG */
public final class C71207aq extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C71207aq f190077a;

    /* renamed from: c */
    private static volatile C63010eb f190078c;

    /* renamed from: b */
    private byte f190079b = 2;

    static {
        C71207aq aqVar = new C71207aq();
        f190077a = aqVar;
        C62942bv.registerDefaultInstance(C71207aq.class, aqVar);
    }

    private C71207aq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f190079b);
            case 1:
                this.f190079b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f190077a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C71207aq();
            case 4:
                return new C71206ap();
            case 5:
                return f190077a;
            case 6:
                C63010eb ebVar = f190078c;
                if (ebVar == null) {
                    synchronized (C71207aq.class) {
                        ebVar = f190078c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190077a);
                            f190078c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
