package com.google.android.libraries.notifications.p2292g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.notifications.g.l */
/* compiled from: PG */
public final class C30004l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C30004l f81216b;

    /* renamed from: c */
    private static volatile C63010eb f81217c;

    /* renamed from: a */
    public C62971cq f81218a = C62942bv.emptyProtobufList();

    static {
        C30004l lVar = new C30004l();
        f81216b = lVar;
        C62942bv.registerDefaultInstance(C30004l.class, lVar);
    }

    private C30004l() {
    }

    /* renamed from: a */
    public final void mo35308a() {
        C62971cq cqVar = this.f81218a;
        if (!cqVar.mo58948c()) {
            this.f81218a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f81216b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C30004l();
            case 4:
                return new C30003k();
            case 5:
                return f81216b;
            case 6:
                C63010eb ebVar = f81217c;
                if (ebVar == null) {
                    synchronized (C30004l.class) {
                        ebVar = f81217c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f81216b);
                            f81217c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
