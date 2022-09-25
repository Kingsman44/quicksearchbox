package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.lh */
/* compiled from: PG */
public final class C14494lh extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C14494lh f43803f;

    /* renamed from: g */
    private static volatile C63010eb f43804g;

    /* renamed from: a */
    public int f43805a = 0;

    /* renamed from: b */
    public Object f43806b;

    /* renamed from: c */
    public C14241by f43807c;

    /* renamed from: d */
    public C14432j f43808d;

    /* renamed from: e */
    public C62961ch f43809e = emptyIntList();

    static {
        C14494lh lhVar = new C14494lh();
        f43803f = lhVar;
        C62942bv.registerDefaultInstance(C14494lh.class, lhVar);
    }

    private C14494lh() {
        emptyIntList();
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
                return newMessageInfo(f43803f, "\u0000\u0007\u0001\u0000\u0001\t\u0007\u0000\u0001\u0000\u0001<\u0000\u0003<\u0000\u0004\t\u0005,\u0007<\u0000\b<\u0000\t\t", new Object[]{"b", "a", C14357gf.class, C14275de.class, C45240c.f118157a, "e", C14230bn.class, C14353gb.class, "d"});
            case 3:
                return new C14494lh();
            case 4:
                return new C14493lg();
            case 5:
                return f43803f;
            case 6:
                C63010eb ebVar = f43804g;
                if (ebVar == null) {
                    synchronized (C14494lh.class) {
                        ebVar = f43804g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43803f);
                            f43804g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
