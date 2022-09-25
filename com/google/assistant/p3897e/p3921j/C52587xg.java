package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.xg */
/* compiled from: PG */
public final class C52587xg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52587xg f138084e;

    /* renamed from: f */
    private static volatile C63010eb f138085f;

    /* renamed from: a */
    public int f138086a;

    /* renamed from: b */
    public String f138087b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f138088c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f138089d = BuildConfig.FLAVOR;

    static {
        C52587xg xgVar = new C52587xg();
        f138084e = xgVar;
        C62942bv.registerDefaultInstance(C52587xg.class, xgVar);
    }

    private C52587xg() {
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
                return newMessageInfo(f138084e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C52587xg();
            case 4:
                return new C52586xf();
            case 5:
                return f138084e;
            case 6:
                C63010eb ebVar = f138085f;
                if (ebVar == null) {
                    synchronized (C52587xg.class) {
                        ebVar = f138085f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138084e);
                            f138085f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
