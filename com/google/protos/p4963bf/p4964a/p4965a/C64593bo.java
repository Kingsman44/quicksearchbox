package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.bo */
/* compiled from: PG */
public final class C64593bo extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C64593bo f175126g;

    /* renamed from: h */
    private static volatile C63010eb f175127h;

    /* renamed from: a */
    public int f175128a;

    /* renamed from: b */
    public int f175129b;

    /* renamed from: c */
    public int f175130c;

    /* renamed from: d */
    public int f175131d;

    /* renamed from: e */
    public int f175132e;

    /* renamed from: f */
    public float f175133f;

    static {
        C64593bo boVar = new C64593bo();
        f175126g = boVar;
        C62942bv.registerDefaultInstance(C64593bo.class, boVar);
    }

    private C64593bo() {
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
                return newMessageInfo(f175126g, "\u0001\u0005\u0000\u0001\u0005\t\u0005\u0000\u0000\u0000\u0005ခ\u0004\u0006င\u0000\u0007င\u0001\bင\u0002\tင\u0003", new Object[]{"a", C10662f.f35572a, "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C64593bo();
            case 4:
                return new C64592bn();
            case 5:
                return f175126g;
            case 6:
                C63010eb ebVar = f175127h;
                if (ebVar == null) {
                    synchronized (C64593bo.class) {
                        ebVar = f175127h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175126g);
                            f175127h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
