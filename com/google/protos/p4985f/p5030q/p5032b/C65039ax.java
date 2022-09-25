package com.google.protos.p4985f.p5030q.p5032b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.ax */
/* compiled from: PG */
public final class C65039ax extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65039ax f176126b;

    /* renamed from: d */
    private static volatile C63010eb f176127d;

    /* renamed from: a */
    public C62971cq f176128a = emptyProtobufList();

    /* renamed from: c */
    private byte f176129c = 2;

    static {
        C65039ax axVar = new C65039ax();
        f176126b = axVar;
        C62942bv.registerDefaultInstance(C65039ax.class, axVar);
    }

    private C65039ax() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176129c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176129c = b;
                return null;
            case 2:
                return newMessageInfo(f176126b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C65042b.class});
            case 3:
                return new C65039ax();
            case 4:
                return new C65038aw();
            case 5:
                return f176126b;
            case 6:
                C63010eb ebVar = f176127d;
                if (ebVar == null) {
                    synchronized (C65039ax.class) {
                        ebVar = f176127d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176126b);
                            f176127d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
