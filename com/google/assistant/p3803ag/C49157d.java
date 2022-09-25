package com.google.assistant.p3803ag;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.d */
/* compiled from: PG */
public final class C49157d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49157d f127116a;

    /* renamed from: c */
    private static volatile C63010eb f127117c;

    /* renamed from: b */
    private byte f127118b = 2;

    static {
        C49157d dVar = new C49157d();
        f127116a = dVar;
        C62942bv.registerDefaultInstance(C49157d.class, dVar);
    }

    private C49157d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127118b);
            case 1:
                this.f127118b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f127116a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49157d();
            case 4:
                return new C48925c();
            case 5:
                return f127116a;
            case 6:
                C63010eb ebVar = f127117c;
                if (ebVar == null) {
                    synchronized (C49157d.class) {
                        ebVar = f127117c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127116a);
                            f127117c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
