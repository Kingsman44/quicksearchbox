package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.bp */
/* compiled from: PG */
public final class C53583bp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53583bp f140635c;

    /* renamed from: d */
    private static volatile C63010eb f140636d;

    /* renamed from: a */
    public int f140637a = 0;

    /* renamed from: b */
    public Object f140638b;

    static {
        C53583bp bpVar = new C53583bp();
        f140635c = bpVar;
        C62942bv.registerDefaultInstance(C53583bp.class, bpVar);
    }

    private C53583bp() {
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
                return newMessageInfo(f140635c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002်\u0000", new Object[]{"b", "a"});
            case 3:
                return new C53583bp();
            case 4:
                return new C53582bo();
            case 5:
                return f140635c;
            case 6:
                C63010eb ebVar = f140636d;
                if (ebVar == null) {
                    synchronized (C53583bp.class) {
                        ebVar = f140636d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140635c);
                            f140636d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
