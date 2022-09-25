package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.m */
/* compiled from: PG */
public final class C52283m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52283m f137246d;

    /* renamed from: f */
    private static volatile C63010eb f137247f;

    /* renamed from: a */
    public String f137248a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f137249b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f137250c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f137251e;

    static {
        C52283m mVar = new C52283m();
        f137246d = mVar;
        C62942bv.registerDefaultInstance(C52283m.class, mVar);
    }

    private C52283m() {
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
                return newMessageInfo(f137246d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C52283m();
            case 4:
                return new C52256l();
            case 5:
                return f137246d;
            case 6:
                C63010eb ebVar = f137247f;
                if (ebVar == null) {
                    synchronized (C52283m.class) {
                        ebVar = f137247f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137246d);
                            f137247f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
