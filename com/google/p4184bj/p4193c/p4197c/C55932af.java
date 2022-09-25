package com.google.p4184bj.p4193c.p4197c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.af */
/* compiled from: PG */
public final class C55932af extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C55932af f148888h;

    /* renamed from: i */
    private static volatile C63010eb f148889i;

    /* renamed from: a */
    public int f148890a;

    /* renamed from: b */
    public boolean f148891b;

    /* renamed from: c */
    public int f148892c;

    /* renamed from: d */
    public long f148893d;

    /* renamed from: e */
    public int f148894e;

    /* renamed from: f */
    public boolean f148895f;

    /* renamed from: g */
    public boolean f148896g;

    static {
        C55932af afVar = new C55932af();
        f148888h = afVar;
        C62942bv.registerDefaultInstance(C55932af.class, afVar);
    }

    private C55932af() {
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
                return newMessageInfo(f148888h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဌ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, C55912b.m87802b(), "d", "e", C55931ae.m87859b(), C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C55932af();
            case 4:
                return new C55929ac();
            case 5:
                return f148888h;
            case 6:
                C63010eb ebVar = f148889i;
                if (ebVar == null) {
                    synchronized (C55932af.class) {
                        ebVar = f148889i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148888h);
                            f148889i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
