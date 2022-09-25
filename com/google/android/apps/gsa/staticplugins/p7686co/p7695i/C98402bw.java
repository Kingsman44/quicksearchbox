package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.bw */
/* compiled from: PG */
public final class C98402bw extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C98402bw f274696f;

    /* renamed from: h */
    private static volatile C63010eb f274697h;

    /* renamed from: a */
    public int f274698a;

    /* renamed from: b */
    public C62971cq f274699b = emptyProtobufList();

    /* renamed from: c */
    public C98416cj f274700c;

    /* renamed from: d */
    public int f274701d;

    /* renamed from: e */
    public boolean f274702e;

    /* renamed from: g */
    private byte f274703g = 2;

    static {
        C98402bw bwVar = new C98402bw();
        f274696f = bwVar;
        C62942bv.registerDefaultInstance(C98402bw.class, bwVar);
    }

    private C98402bw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f274703g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f274703g = b;
                return null;
            case 2:
                return newMessageInfo(f274696f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003င\u0001\u0004ဇ\u0002", new Object[]{"a", "b", C98400bu.class, C45240c.f118157a, "d", "e"});
            case 3:
                return new C98402bw();
            case 4:
                return new C98401bv();
            case 5:
                return f274696f;
            case 6:
                C63010eb ebVar = f274697h;
                if (ebVar == null) {
                    synchronized (C98402bw.class) {
                        ebVar = f274697h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f274696f);
                            f274697h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
