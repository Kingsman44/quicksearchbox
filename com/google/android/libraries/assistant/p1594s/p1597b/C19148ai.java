package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.ai */
/* compiled from: PG */
public final class C19148ai extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C19148ai f53631d;

    /* renamed from: e */
    private static volatile C63010eb f53632e;

    /* renamed from: a */
    public int f53633a;

    /* renamed from: b */
    public int f53634b;

    /* renamed from: c */
    public int f53635c;

    static {
        C19148ai aiVar = new C19148ai();
        f53631d = aiVar;
        C62942bv.registerDefaultInstance(C19148ai.class, aiVar);
    }

    private C19148ai() {
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
                return newMessageInfo(f53631d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", C48672ag.m85260c(), C45240c.f118157a});
            case 3:
                return new C19148ai();
            case 4:
                return new C19147ah();
            case 5:
                return f53631d;
            case 6:
                C63010eb ebVar = f53632e;
                if (ebVar == null) {
                    synchronized (C19148ai.class) {
                        ebVar = f53632e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53631d);
                            f53632e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
