package com.google.p4017at.p4060h.p4073d.p4074a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.d.a.f */
/* compiled from: PG */
public final class C54242f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54242f f142415f;

    /* renamed from: g */
    private static volatile C63010eb f142416g;

    /* renamed from: a */
    public int f142417a;

    /* renamed from: b */
    public String f142418b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f142419c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f142420d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f142421e = BuildConfig.FLAVOR;

    static {
        C54242f fVar = new C54242f();
        f142415f = fVar;
        C62942bv.registerDefaultInstance(C54242f.class, fVar);
    }

    private C54242f() {
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
                return newMessageInfo(f142415f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C54242f();
            case 4:
                return new C54241e();
            case 5:
                return f142415f;
            case 6:
                C63010eb ebVar = f142416g;
                if (ebVar == null) {
                    synchronized (C54242f.class) {
                        ebVar = f142416g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142415f);
                            f142416g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
