package com.google.assistant.p4003x.p4004a.p4005a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.assistant.x.a.a.h */
/* compiled from: PG */
public final class C53518h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53518h f140456c;

    /* renamed from: d */
    private static volatile C63010eb f140457d;

    /* renamed from: a */
    public int f140458a;

    /* renamed from: b */
    public C65682h f140459b;

    static {
        C53518h hVar = new C53518h();
        f140456c = hVar;
        C62942bv.registerDefaultInstance(C53518h.class, hVar);
    }

    private C53518h() {
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
                return newMessageInfo(f140456c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53518h();
            case 4:
                return new C53517g();
            case 5:
                return f140456c;
            case 6:
                C63010eb ebVar = f140457d;
                if (ebVar == null) {
                    synchronized (C53518h.class) {
                        ebVar = f140457d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140456c);
                            f140457d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
