package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.cw */
/* compiled from: PG */
public final class C49593cw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49593cw f127968c;

    /* renamed from: d */
    private static volatile C63010eb f127969d;

    /* renamed from: a */
    public int f127970a;

    /* renamed from: b */
    public boolean f127971b;

    static {
        C49593cw cwVar = new C49593cw();
        f127968c = cwVar;
        C62942bv.registerDefaultInstance(C49593cw.class, cwVar);
    }

    private C49593cw() {
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
                return newMessageInfo(f127968c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0007\u0003\f", new Object[]{"b", "a"});
            case 3:
                return new C49593cw();
            case 4:
                return new C49592cv();
            case 5:
                return f127968c;
            case 6:
                C63010eb ebVar = f127969d;
                if (ebVar == null) {
                    synchronized (C49593cw.class) {
                        ebVar = f127969d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127968c);
                            f127969d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
