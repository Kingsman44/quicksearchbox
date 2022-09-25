package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.lens.p4707j.C62485dh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.bn */
/* compiled from: PG */
public final class C56260bn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56260bn f149946c;

    /* renamed from: d */
    private static volatile C63010eb f149947d;

    /* renamed from: a */
    public int f149948a;

    /* renamed from: b */
    public C62485dh f149949b;

    static {
        C56260bn bnVar = new C56260bn();
        f149946c = bnVar;
        C62942bv.registerDefaultInstance(C56260bn.class, bnVar);
    }

    private C56260bn() {
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
                return newMessageInfo(f149946c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56260bn();
            case 4:
                return new C56259bm();
            case 5:
                return f149946c;
            case 6:
                C63010eb ebVar = f149947d;
                if (ebVar == null) {
                    synchronized (C56260bn.class) {
                        ebVar = f149947d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149946c);
                            f149947d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
