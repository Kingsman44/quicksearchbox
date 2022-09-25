package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.ag */
/* compiled from: PG */
public final class C48488ag extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48488ag f125253d;

    /* renamed from: e */
    private static volatile C63010eb f125254e;

    /* renamed from: a */
    public int f125255a;

    /* renamed from: b */
    public C48484ac f125256b;

    /* renamed from: c */
    public C62971cq f125257c = emptyProtobufList();

    static {
        C48488ag agVar = new C48488ag();
        f125253d = agVar;
        C62942bv.registerDefaultInstance(C48488ag.class, agVar);
    }

    private C48488ag() {
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
                return newMessageInfo(f125253d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C48498aq.class});
            case 3:
                return new C48488ag();
            case 4:
                return new C48487af();
            case 5:
                return f125253d;
            case 6:
                C63010eb ebVar = f125254e;
                if (ebVar == null) {
                    synchronized (C48488ag.class) {
                        ebVar = f125254e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125253d);
                            f125254e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
