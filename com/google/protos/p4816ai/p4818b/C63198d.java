package com.google.protos.p4816ai.p4818b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.b.d */
/* compiled from: PG */
public final class C63198d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63198d f170738c;

    /* renamed from: e */
    private static volatile C63010eb f170739e;

    /* renamed from: a */
    public int f170740a;

    /* renamed from: b */
    public C63202h f170741b;

    /* renamed from: d */
    private byte f170742d = 2;

    static {
        C63198d dVar = new C63198d();
        f170738c = dVar;
        C62942bv.registerDefaultInstance(C63198d.class, dVar);
    }

    private C63198d() {
        emptyIntList();
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f170742d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f170742d = b;
                return null;
            case 2:
                return newMessageInfo(f170738c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0002", new Object[]{"a", "b"});
            case 3:
                return new C63198d();
            case 4:
                return new C63197c();
            case 5:
                return f170738c;
            case 6:
                C63010eb ebVar = f170739e;
                if (ebVar == null) {
                    synchronized (C63198d.class) {
                        ebVar = f170739e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170738c);
                            f170739e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
