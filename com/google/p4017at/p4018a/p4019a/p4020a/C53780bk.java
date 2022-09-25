package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.bk */
/* compiled from: PG */
public final class C53780bk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53780bk f141161c;

    /* renamed from: d */
    private static volatile C63010eb f141162d;

    /* renamed from: a */
    public int f141163a = 0;

    /* renamed from: b */
    public Object f141164b;

    static {
        C53780bk bkVar = new C53780bk();
        f141161c = bkVar;
        C62942bv.registerDefaultInstance(C53780bk.class, bkVar);
    }

    private C53780bk() {
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
                return newMessageInfo(f141161c, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000", new Object[]{"b", "a", C53779bj.class, C53771bb.class, C53760ar.class, C53762at.class, C53757ao.class, C53765aw.class, C53767ay.class, C53775bf.class});
            case 3:
                return new C53780bk();
            case 4:
                return new C53754al();
            case 5:
                return f141161c;
            case 6:
                C63010eb ebVar = f141162d;
                if (ebVar == null) {
                    synchronized (C53780bk.class) {
                        ebVar = f141162d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141161c);
                            f141162d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
