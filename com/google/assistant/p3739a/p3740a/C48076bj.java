package com.google.assistant.p3739a.p3740a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.bj */
/* compiled from: PG */
public final class C48076bj extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C48076bj f124425g;

    /* renamed from: h */
    private static volatile C63010eb f124426h;

    /* renamed from: a */
    public int f124427a;

    /* renamed from: b */
    public int f124428b;

    /* renamed from: c */
    public int f124429c;

    /* renamed from: d */
    public int f124430d;

    /* renamed from: e */
    public int f124431e;

    /* renamed from: f */
    public int f124432f;

    static {
        C48076bj bjVar = new C48076bj();
        f124425g = bjVar;
        C62942bv.registerDefaultInstance(C48076bj.class, bjVar);
    }

    private C48076bj() {
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
                return newMessageInfo(f124425g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0006\f\u0007\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C48076bj();
            case 4:
                return new C48075bi();
            case 5:
                return f124425g;
            case 6:
                C63010eb ebVar = f124426h;
                if (ebVar == null) {
                    synchronized (C48076bj.class) {
                        ebVar = f124426h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124425g);
                            f124426h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
