package com.google.common.p4552o.p4561g;

import com.google.common.p4552o.apr;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.g.h */
/* compiled from: PG */
public final class C59807h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59807h f161626c;

    /* renamed from: d */
    public static final C62940bt f161627d;

    /* renamed from: e */
    private static volatile C63010eb f161628e;

    /* renamed from: a */
    public int f161629a;

    /* renamed from: b */
    public C59805f f161630b;

    static {
        C59807h hVar = new C59807h();
        f161626c = hVar;
        C62942bv.registerDefaultInstance(C59807h.class, hVar);
        f161627d = C62942bv.newSingularGeneratedExtension(apr.f159695c, hVar, hVar, (C62958ce) null, 330405379, C63066gd.MESSAGE, C59807h.class);
    }

    private C59807h() {
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
                return newMessageInfo(f161626c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59807h();
            case 4:
                return new C59806g();
            case 5:
                return f161626c;
            case 6:
                C63010eb ebVar = f161628e;
                if (ebVar == null) {
                    synchronized (C59807h.class) {
                        ebVar = f161628e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161626c);
                            f161628e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
