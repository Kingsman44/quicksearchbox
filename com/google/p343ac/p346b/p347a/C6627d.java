package com.google.p343ac.p346b.p347a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ac.b.a.d */
/* compiled from: PG */
public final class C6627d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C6627d f19760f;

    /* renamed from: g */
    private static volatile C63010eb f19761g;

    /* renamed from: a */
    public int f19762a;

    /* renamed from: b */
    public int f19763b;

    /* renamed from: c */
    public int f19764c;

    /* renamed from: d */
    public int f19765d;

    /* renamed from: e */
    public long f19766e;

    static {
        C6627d dVar = new C6627d();
        f19760f = dVar;
        C62942bv.registerDefaultInstance(C6627d.class, dVar);
    }

    private C6627d() {
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
                return newMessageInfo(f19760f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C6627d();
            case 4:
                return new C6626c();
            case 5:
                return f19760f;
            case 6:
                C63010eb ebVar = f19761g;
                if (ebVar == null) {
                    synchronized (C6627d.class) {
                        ebVar = f19761g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19760f);
                            f19761g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
