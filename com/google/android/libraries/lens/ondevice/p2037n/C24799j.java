package com.google.android.libraries.lens.ondevice.p2037n;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.n.j */
/* compiled from: PG */
public final class C24799j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C24799j f67763b;

    /* renamed from: c */
    private static volatile C63010eb f67764c;

    /* renamed from: a */
    public C62971cq f67765a = emptyProtobufList();

    static {
        C24799j jVar = new C24799j();
        f67763b = jVar;
        C62942bv.registerDefaultInstance(C24799j.class, jVar);
    }

    private C24799j() {
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
                return newMessageInfo(f67763b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C24440ab.class});
            case 3:
                return new C24799j();
            case 4:
                return new C24798i();
            case 5:
                return f67763b;
            case 6:
                C63010eb ebVar = f67764c;
                if (ebVar == null) {
                    synchronized (C24799j.class) {
                        ebVar = f67764c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67763b);
                            f67764c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
