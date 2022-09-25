package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.apu */
/* compiled from: PG */
public final class apu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final apu f135583d;

    /* renamed from: e */
    private static volatile C63010eb f135584e;

    /* renamed from: a */
    public int f135585a;

    /* renamed from: b */
    public int f135586b;

    /* renamed from: c */
    public int f135587c;

    static {
        apu apu = new apu();
        f135583d = apu;
        C62942bv.registerDefaultInstance(apu.class, apu);
    }

    private apu() {
        emptyIntList();
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
                return newMessageInfo(f135583d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", apt.f135582a, C45240c.f118157a});
            case 3:
                return new apu();
            case 4:
                return new aps();
            case 5:
                return f135583d;
            case 6:
                C63010eb ebVar = f135584e;
                if (ebVar == null) {
                    synchronized (apu.class) {
                        ebVar = f135584e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135583d);
                            f135584e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
