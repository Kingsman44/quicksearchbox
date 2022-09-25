package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.fl */
/* compiled from: PG */
public final class C51959fl extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51959fl f136335f;

    /* renamed from: g */
    private static volatile C63010eb f136336g;

    /* renamed from: a */
    public int f136337a;

    /* renamed from: b */
    public int f136338b;

    /* renamed from: c */
    public int f136339c;

    /* renamed from: d */
    public String f136340d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f136341e = BuildConfig.FLAVOR;

    static {
        C51959fl flVar = new C51959fl();
        f136335f = flVar;
        C62942bv.registerDefaultInstance(C51959fl.class, flVar);
    }

    private C51959fl() {
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
                return newMessageInfo(f136335f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဌ\u0001\u0004ဈ\u0002\u0005ဈ\u0003", new Object[]{"a", "b", C51958fk.m86454b(), C45240c.f118157a, C51955fh.f136329a, "d", "e"});
            case 3:
                return new C51959fl();
            case 4:
                return new C51954fg();
            case 5:
                return f136335f;
            case 6:
                C63010eb ebVar = f136336g;
                if (ebVar == null) {
                    synchronized (C51959fl.class) {
                        ebVar = f136336g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136335f);
                            f136336g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
