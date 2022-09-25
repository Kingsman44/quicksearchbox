package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.gp */
/* compiled from: PG */
public final class C52137gp extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C52137gp f136808f;

    /* renamed from: g */
    private static volatile C63010eb f136809g;

    /* renamed from: a */
    public int f136810a;

    /* renamed from: b */
    public int f136811b;

    /* renamed from: c */
    public int f136812c;

    /* renamed from: d */
    public int f136813d;

    /* renamed from: e */
    public boolean f136814e;

    static {
        C52137gp gpVar = new C52137gp();
        f136808f = gpVar;
        C62942bv.registerDefaultInstance(C52137gp.class, gpVar);
    }

    private C52137gp() {
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
                return newMessageInfo(f136808f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, C52133gl.f136798a, "d", C52136go.m86518b(), "e"});
            case 3:
                return new C52137gp();
            case 4:
                return new C52132gk();
            case 5:
                return f136808f;
            case 6:
                C63010eb ebVar = f136809g;
                if (ebVar == null) {
                    synchronized (C52137gp.class) {
                        ebVar = f136809g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136808f);
                            f136809g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
