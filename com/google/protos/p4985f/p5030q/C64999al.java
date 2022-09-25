package com.google.protos.p4985f.p5030q;

import com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.al */
/* compiled from: PG */
public final class C64999al extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64999al f176037b;

    /* renamed from: c */
    private static volatile C63010eb f176038c;

    /* renamed from: a */
    public C62971cq f176039a = emptyProtobufList();

    static {
        C64999al alVar = new C64999al();
        f176037b = alVar;
        C62942bv.registerDefaultInstance(C64999al.class, alVar);
    }

    private C64999al() {
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
                return newMessageInfo(f176037b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C22104g.class});
            case 3:
                return new C64999al();
            case 4:
                return new C64998ak();
            case 5:
                return f176037b;
            case 6:
                C63010eb ebVar = f176038c;
                if (ebVar == null) {
                    synchronized (C64999al.class) {
                        ebVar = f176038c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176037b);
                            f176038c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
