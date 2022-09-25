package com.google.android.apps.search.podcasts.p10576l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.l.ai */
/* compiled from: PG */
public final class C140447ai extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C140447ai f381502c;

    /* renamed from: d */
    private static volatile C63010eb f381503d;

    /* renamed from: a */
    public float f381504a;

    /* renamed from: b */
    public boolean f381505b;

    static {
        C140447ai aiVar = new C140447ai();
        f381502c = aiVar;
        C62942bv.registerDefaultInstance(C140447ai.class, aiVar);
    }

    private C140447ai() {
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
                return newMessageInfo(f381502c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C140447ai();
            case 4:
                return new C140446ah();
            case 5:
                return f381502c;
            case 6:
                C63010eb ebVar = f381503d;
                if (ebVar == null) {
                    synchronized (C140447ai.class) {
                        ebVar = f381503d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f381502c);
                            f381503d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
