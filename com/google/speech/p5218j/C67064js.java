package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.js */
/* compiled from: PG */
public final class C67064js extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67064js f182298c;

    /* renamed from: d */
    private static volatile C63010eb f182299d;

    /* renamed from: a */
    public int f182300a = 0;

    /* renamed from: b */
    public Object f182301b;

    static {
        C67064js jsVar = new C67064js();
        f182298c = jsVar;
        C62942bv.registerDefaultInstance(C67064js.class, jsVar);
    }

    private C67064js() {
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
                return newMessageInfo(f182298c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဵ\u0000\u0002ဵ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C67064js();
            case 4:
                return new C67063jr();
            case 5:
                return f182298c;
            case 6:
                C63010eb ebVar = f182299d;
                if (ebVar == null) {
                    synchronized (C67064js.class) {
                        ebVar = f182299d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182298c);
                            f182299d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
