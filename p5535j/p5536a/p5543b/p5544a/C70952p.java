package p5535j.p5536a.p5543b.p5544a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.b.a.p */
/* compiled from: PG */
public final class C70952p extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C70952p f189179d;

    /* renamed from: e */
    private static volatile C63010eb f189180e;

    /* renamed from: a */
    public int f189181a;

    /* renamed from: b */
    public int f189182b;

    /* renamed from: c */
    public C62971cq f189183c = emptyProtobufList();

    static {
        C70952p pVar = new C70952p();
        f189179d = pVar;
        C62942bv.registerDefaultInstance(C70952p.class, pVar);
    }

    private C70952p() {
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
                return newMessageInfo(f189179d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", C70950n.f189178a, C45240c.f118157a, C70942f.class});
            case 3:
                return new C70952p();
            case 4:
                return new C70949m();
            case 5:
                return f189179d;
            case 6:
                C63010eb ebVar = f189180e;
                if (ebVar == null) {
                    synchronized (C70952p.class) {
                        ebVar = f189180e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189179d);
                            f189180e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
