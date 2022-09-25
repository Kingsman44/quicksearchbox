package p5285d.p5290b.p5291a.p5292a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.by */
/* compiled from: PG */
public final class C68189by extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C68189by f184505b;

    /* renamed from: c */
    private static volatile C63010eb f184506c;

    /* renamed from: a */
    public C62971cq f184507a = emptyProtobufList();

    static {
        C68189by byVar = new C68189by();
        f184505b = byVar;
        C62942bv.registerDefaultInstance(C68189by.class, byVar);
    }

    private C68189by() {
    }

    /* renamed from: a */
    public final void mo60285a() {
        C62971cq cqVar = this.f184507a;
        if (!cqVar.mo58948c()) {
            this.f184507a = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f184505b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C68183bs.class});
            case 3:
                return new C68189by();
            case 4:
                return new C68188bx();
            case 5:
                return f184505b;
            case 6:
                C63010eb ebVar = f184506c;
                if (ebVar == null) {
                    synchronized (C68189by.class) {
                        ebVar = f184506c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184505b);
                            f184506c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
