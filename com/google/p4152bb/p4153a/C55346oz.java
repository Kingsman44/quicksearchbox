package com.google.p4152bb.p4153a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.oz */
/* compiled from: PG */
public final class C55346oz extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C55346oz f145815g;

    /* renamed from: h */
    public static final C62940bt f145816h;

    /* renamed from: i */
    private static volatile C63010eb f145817i;

    /* renamed from: a */
    public int f145818a;

    /* renamed from: b */
    public int f145819b;

    /* renamed from: c */
    public int f145820c;

    /* renamed from: d */
    public int f145821d;

    /* renamed from: e */
    public int f145822e;

    /* renamed from: f */
    public int f145823f;

    static {
        C55346oz ozVar = new C55346oz();
        f145815g = ozVar;
        C62942bv.registerDefaultInstance(C55346oz.class, ozVar);
        f145816h = C62942bv.newSingularGeneratedExtension(C55330oj.f145769e, ozVar, ozVar, (C62958ce) null, 127400334, C63066gd.MESSAGE, C55346oz.class);
    }

    private C55346oz() {
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
                return newMessageInfo(f145815g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C55346oz();
            case 4:
                return new C55345oy();
            case 5:
                return f145815g;
            case 6:
                C63010eb ebVar = f145817i;
                if (ebVar == null) {
                    synchronized (C55346oz.class) {
                        ebVar = f145817i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145815g);
                            f145817i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
