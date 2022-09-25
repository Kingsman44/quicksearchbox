package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34684d;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.i */
/* compiled from: PG */
public final class C34299i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C34299i f91213c;

    /* renamed from: e */
    private static volatile C63010eb f91214e;

    /* renamed from: a */
    public C34684d f91215a;

    /* renamed from: b */
    public C62910ar f91216b;

    /* renamed from: d */
    private byte f91217d = 2;

    static {
        C34299i iVar = new C34299i();
        f91213c = iVar;
        C62942bv.registerDefaultInstance(C34299i.class, iVar);
    }

    private C34299i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f91217d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f91217d = b;
                return null;
            case 2:
                return newMessageInfo(f91213c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C34299i();
            case 4:
                return new C34298h();
            case 5:
                return f91213c;
            case 6:
                C63010eb ebVar = f91214e;
                if (ebVar == null) {
                    synchronized (C34299i.class) {
                        ebVar = f91214e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f91213c);
                            f91214e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
