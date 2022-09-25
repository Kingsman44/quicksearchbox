package com.google.p4184bj.p4193c.p4197c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.m */
/* compiled from: PG */
public final class C55977m extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C55977m f149067g;

    /* renamed from: h */
    private static volatile C63010eb f149068h;

    /* renamed from: a */
    public int f149069a;

    /* renamed from: b */
    public int f149070b;

    /* renamed from: c */
    public C55969e f149071c;

    /* renamed from: d */
    public C55971g f149072d;

    /* renamed from: e */
    public C55975k f149073e;

    /* renamed from: f */
    public int f149074f;

    static {
        C55977m mVar = new C55977m();
        f149067g = mVar;
        C62942bv.registerDefaultInstance(C55977m.class, mVar);
    }

    private C55977m() {
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
                return newMessageInfo(f149067g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0004\u0005ဉ\u0003", new Object[]{"a", "b", C55953b.f148940a, C45240c.f118157a, "d", C10662f.f35572a, C55976l.f149066a, "e"});
            case 3:
                return new C55977m();
            case 4:
                return new C55915a();
            case 5:
                return f149067g;
            case 6:
                C63010eb ebVar = f149068h;
                if (ebVar == null) {
                    synchronized (C55977m.class) {
                        ebVar = f149068h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149067g);
                            f149068h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
