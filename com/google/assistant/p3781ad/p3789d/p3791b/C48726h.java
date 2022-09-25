package com.google.assistant.p3781ad.p3789d.p3791b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.h */
/* compiled from: PG */
public final class C48726h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48726h f126084c;

    /* renamed from: d */
    private static volatile C63010eb f126085d;

    /* renamed from: a */
    public int f126086a;

    /* renamed from: b */
    public boolean f126087b;

    static {
        C48726h hVar = new C48726h();
        f126084c = hVar;
        C62942bv.registerDefaultInstance(C48726h.class, hVar);
    }

    private C48726h() {
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
                return newMessageInfo(f126084c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C48726h();
            case 4:
                return new C48725g();
            case 5:
                return f126084c;
            case 6:
                C63010eb ebVar = f126085d;
                if (ebVar == null) {
                    synchronized (C48726h.class) {
                        ebVar = f126085d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126084c);
                            f126085d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
