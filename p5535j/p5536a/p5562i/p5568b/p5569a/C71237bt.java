package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.i.b.a.bt */
/* compiled from: PG */
public final class C71237bt extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C71237bt f190195b;

    /* renamed from: d */
    private static volatile C63010eb f190196d;

    /* renamed from: a */
    public C62971cq f190197a = emptyProtobufList();

    /* renamed from: c */
    private byte f190198c = 2;

    static {
        C71237bt btVar = new C71237bt();
        f190195b = btVar;
        C62942bv.registerDefaultInstance(C71237bt.class, btVar);
    }

    private C71237bt() {
    }

    /* renamed from: a */
    public final void mo62660a() {
        C62971cq cqVar = this.f190197a;
        if (!cqVar.mo58948c()) {
            this.f190197a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f190198c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f190198c = b;
                return null;
            case 2:
                return newMessageInfo(f190195b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C71235br.class});
            case 3:
                return new C71237bt();
            case 4:
                return new C71236bs();
            case 5:
                return f190195b;
            case 6:
                C63010eb ebVar = f190196d;
                if (ebVar == null) {
                    synchronized (C71237bt.class) {
                        ebVar = f190196d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f190195b);
                            f190196d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
