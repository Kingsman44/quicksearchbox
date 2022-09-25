package p5285d.p5290b.p5291a.p5292a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.bj */
/* compiled from: PG */
public final class C68174bj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C68174bj f184478c;

    /* renamed from: d */
    private static volatile C63010eb f184479d;

    /* renamed from: a */
    public C62971cq f184480a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public int f184481b;

    static {
        C68174bj bjVar = new C68174bj();
        f184478c = bjVar;
        C62942bv.registerDefaultInstance(C68174bj.class, bjVar);
    }

    private C68174bj() {
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
                return newMessageInfo(f184478c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002Ț\u0003\f", new Object[]{"a", "b"});
            case 3:
                return new C68174bj();
            case 4:
                return new C68173bi();
            case 5:
                return f184478c;
            case 6:
                C63010eb ebVar = f184479d;
                if (ebVar == null) {
                    synchronized (C68174bj.class) {
                        ebVar = f184479d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184478c);
                            f184479d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
