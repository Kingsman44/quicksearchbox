package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.bc */
/* compiled from: PG */
public final class C124460bc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C124460bc f343475c;

    /* renamed from: e */
    private static volatile C63010eb f343476e;

    /* renamed from: a */
    public int f343477a = 0;

    /* renamed from: b */
    public Object f343478b;

    /* renamed from: d */
    private byte f343479d = 2;

    static {
        C124460bc bcVar = new C124460bc();
        f343475c = bcVar;
        C62942bv.registerDefaultInstance(C124460bc.class, bcVar);
    }

    private C124460bc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f343479d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f343479d = b;
                return null;
            case 2:
                return newMessageInfo(f343475c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001<\u0000\u0002м\u0000", new Object[]{"b", "a", C124459bb.class, C124455az.class});
            case 3:
                return new C124460bc();
            case 4:
                return new C124439aj();
            case 5:
                return f343475c;
            case 6:
                C63010eb ebVar = f343476e;
                if (ebVar == null) {
                    synchronized (C124460bc.class) {
                        ebVar = f343476e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343475c);
                            f343476e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
