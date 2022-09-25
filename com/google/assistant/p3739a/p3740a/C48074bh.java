package com.google.assistant.p3739a.p3740a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.bh */
/* compiled from: PG */
public final class C48074bh extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C48074bh f124417g;

    /* renamed from: h */
    private static volatile C63010eb f124418h;

    /* renamed from: a */
    public int f124419a;

    /* renamed from: b */
    public int f124420b;

    /* renamed from: c */
    public int f124421c;

    /* renamed from: d */
    public int f124422d;

    /* renamed from: e */
    public int f124423e;

    /* renamed from: f */
    public int f124424f;

    static {
        C48074bh bhVar = new C48074bh();
        f124417g = bhVar;
        C62942bv.registerDefaultInstance(C48074bh.class, bhVar);
    }

    private C48074bh() {
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
                return newMessageInfo(f124417g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\f\u0006\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C48074bh();
            case 4:
                return new C48073bg();
            case 5:
                return f124417g;
            case 6:
                C63010eb ebVar = f124418h;
                if (ebVar == null) {
                    synchronized (C48074bh.class) {
                        ebVar = f124418h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124417g);
                            f124418h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
