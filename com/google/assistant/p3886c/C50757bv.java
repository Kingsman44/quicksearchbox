package com.google.assistant.p3886c;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123708ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.c.bv */
/* compiled from: PG */
public final class C50757bv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50757bv f132083c;

    /* renamed from: d */
    public static final C62940bt f132084d;

    /* renamed from: e */
    private static volatile C63010eb f132085e;

    /* renamed from: a */
    public int f132086a;

    /* renamed from: b */
    public C123708ab f132087b;

    static {
        C50757bv bvVar = new C50757bv();
        f132083c = bvVar;
        C62942bv.registerDefaultInstance(C50757bv.class, bvVar);
        f132084d = C62942bv.newSingularGeneratedExtension(C50813dj.f132278a, bvVar, bvVar, (C62958ce) null, 436506506, C63066gd.MESSAGE, C50757bv.class);
    }

    private C50757bv() {
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
                return newMessageInfo(f132083c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50757bv();
            case 4:
                return new C50756bu();
            case 5:
                return f132083c;
            case 6:
                C63010eb ebVar = f132085e;
                if (ebVar == null) {
                    synchronized (C50757bv.class) {
                        ebVar = f132085e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132083c);
                            f132085e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
