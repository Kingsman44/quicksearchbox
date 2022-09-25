package com.google.speech.p5199c.p5200a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.c.a.b */
/* compiled from: PG */
public final class C66457b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66457b f180706c;

    /* renamed from: d */
    private static volatile C63010eb f180707d;

    /* renamed from: a */
    public int f180708a;

    /* renamed from: b */
    public boolean f180709b;

    static {
        C66457b bVar = new C66457b();
        f180706c = bVar;
        C62942bv.registerDefaultInstance(C66457b.class, bVar);
    }

    private C66457b() {
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
                return newMessageInfo(f180706c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66457b();
            case 4:
                return new C66456a();
            case 5:
                return f180706c;
            case 6:
                C63010eb ebVar = f180707d;
                if (ebVar == null) {
                    synchronized (C66457b.class) {
                        ebVar = f180707d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180706c);
                            f180707d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
