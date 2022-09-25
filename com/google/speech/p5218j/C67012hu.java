package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.p5219a.C66711ao;

/* renamed from: com.google.speech.j.hu */
/* compiled from: PG */
public final class C67012hu extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67012hu f182161c;

    /* renamed from: d */
    private static volatile C63010eb f182162d;

    /* renamed from: a */
    public int f182163a;

    /* renamed from: b */
    public C66711ao f182164b;

    static {
        C67012hu huVar = new C67012hu();
        f182161c = huVar;
        C62942bv.registerDefaultInstance(C67012hu.class, huVar);
    }

    private C67012hu() {
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
                return newMessageInfo(f182161c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67012hu();
            case 4:
                return new C67011ht();
            case 5:
                return f182161c;
            case 6:
                C63010eb ebVar = f182162d;
                if (ebVar == null) {
                    synchronized (C67012hu.class) {
                        ebVar = f182162d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182161c);
                            f182162d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
