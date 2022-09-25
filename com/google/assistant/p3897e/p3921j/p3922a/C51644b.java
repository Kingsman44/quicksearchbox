package com.google.assistant.p3897e.p3921j.p3922a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.a.b */
/* compiled from: PG */
public final class C51644b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51644b f134574d;

    /* renamed from: e */
    private static volatile C63010eb f134575e;

    /* renamed from: a */
    public int f134576a;

    /* renamed from: b */
    public boolean f134577b;

    /* renamed from: c */
    public boolean f134578c;

    static {
        C51644b bVar = new C51644b();
        f134574d = bVar;
        C62942bv.registerDefaultInstance(C51644b.class, bVar);
    }

    private C51644b() {
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
                return newMessageInfo(f134574d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51644b();
            case 4:
                return new C51643a();
            case 5:
                return f134574d;
            case 6:
                C63010eb ebVar = f134575e;
                if (ebVar == null) {
                    synchronized (C51644b.class) {
                        ebVar = f134575e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134574d);
                            f134575e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
