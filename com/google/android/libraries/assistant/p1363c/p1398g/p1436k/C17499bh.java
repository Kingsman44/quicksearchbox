package com.google.android.libraries.assistant.p1363c.p1398g.p1436k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.g.k.bh */
/* compiled from: PG */
public final class C17499bh extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C17499bh f50509e;

    /* renamed from: g */
    private static volatile C63010eb f50510g;

    /* renamed from: a */
    public int f50511a;

    /* renamed from: b */
    public int f50512b = 0;

    /* renamed from: c */
    public Object f50513c;

    /* renamed from: d */
    public boolean f50514d;

    /* renamed from: f */
    private byte f50515f = 2;

    static {
        C17499bh bhVar = new C17499bh();
        f50509e = bhVar;
        C62942bv.registerDefaultInstance(C17499bh.class, bhVar);
    }

    private C17499bh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f50515f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f50515f = b;
                return null;
            case 2:
                return newMessageInfo(f50509e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ြ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ဇ\u0003", new Object[]{C45240c.f118157a, "b", "a", C17492ba.class, C17477am.class, C17479ao.class, "d"});
            case 3:
                return new C17499bh();
            case 4:
                return new C17497bf();
            case 5:
                return f50509e;
            case 6:
                C63010eb ebVar = f50510g;
                if (ebVar == null) {
                    synchronized (C17499bh.class) {
                        ebVar = f50510g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50509e);
                            f50510g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
