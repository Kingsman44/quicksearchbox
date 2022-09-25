package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.cg */
/* compiled from: PG */
public final class C51754cg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51754cg f135778e;

    /* renamed from: f */
    private static volatile C63010eb f135779f;

    /* renamed from: a */
    public int f135780a;

    /* renamed from: b */
    public int f135781b = 2;

    /* renamed from: c */
    public int f135782c = 1;

    /* renamed from: d */
    public int f135783d = 2;

    static {
        C51754cg cgVar = new C51754cg();
        f135778e = cgVar;
        C62942bv.registerDefaultInstance(C51754cg.class, cgVar);
    }

    private C51754cg() {
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
                return newMessageInfo(f135778e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0004", new Object[]{"a", "b", C51756ci.m86373b(), C45240c.f118157a, C51802dr.m86387b(), "d", C51758ck.m86375b()});
            case 3:
                return new C51754cg();
            case 4:
                return new C51753cf();
            case 5:
                return f135778e;
            case 6:
                C63010eb ebVar = f135779f;
                if (ebVar == null) {
                    synchronized (C51754cg.class) {
                        ebVar = f135779f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135778e);
                            f135779f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
