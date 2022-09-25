package com.google.p4184bj.p4193c.p4197c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3562ao.p3570b.p3575b.p3576a.C45602f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bj.c.c.ay */
/* compiled from: PG */
public final class C55951ay extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C55951ay f148932g;

    /* renamed from: h */
    private static volatile C63010eb f148933h;

    /* renamed from: a */
    public int f148934a;

    /* renamed from: b */
    public int f148935b = 0;

    /* renamed from: c */
    public Object f148936c;

    /* renamed from: d */
    public C62961ch f148937d = emptyIntList();

    /* renamed from: e */
    public C63088z f148938e = C63088z.f170246b;

    /* renamed from: f */
    public int f148939f;

    static {
        C55951ay ayVar = new C55951ay();
        f148932g = ayVar;
        C62942bv.registerDefaultInstance(C55951ay.class, ayVar);
    }

    private C55951ay() {
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
                return newMessageInfo(f148932g, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ြ\u0000\u0002ဿ\u0000\u0004\u0016\u0005ည\u0002\u0006င\u0003", new Object[]{C45240c.f118157a, "b", "a", C45602f.class, C55950ax.m87867b(), "d", "e", C10662f.f35572a});
            case 3:
                return new C55951ay();
            case 4:
                return new C55947au();
            case 5:
                return f148932g;
            case 6:
                C63010eb ebVar = f148933h;
                if (ebVar == null) {
                    synchronized (C55951ay.class) {
                        ebVar = f148933h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148932g);
                            f148933h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
