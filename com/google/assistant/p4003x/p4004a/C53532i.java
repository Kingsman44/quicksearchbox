package com.google.assistant.p4003x.p4004a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.x.a.i */
/* compiled from: PG */
public final class C53532i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53532i f140485b;

    /* renamed from: d */
    private static volatile C63010eb f140486d;

    /* renamed from: a */
    public C52070ec f140487a;

    /* renamed from: c */
    private int f140488c;

    static {
        C53532i iVar = new C53532i();
        f140485b = iVar;
        C62942bv.registerDefaultInstance(C53532i.class, iVar);
    }

    private C53532i() {
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
                return newMessageInfo(f140485b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C53532i();
            case 4:
                return new C53531h();
            case 5:
                return f140485b;
            case 6:
                C63010eb ebVar = f140486d;
                if (ebVar == null) {
                    synchronized (C53532i.class) {
                        ebVar = f140486d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140485b);
                            f140486d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
