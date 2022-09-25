package com.google.assistant.p3838ao.p3839a.p3845e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.j */
/* compiled from: PG */
public final class C49619j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49619j f128058c;

    /* renamed from: d */
    private static volatile C63010eb f128059d;

    /* renamed from: a */
    public int f128060a;

    /* renamed from: b */
    public String f128061b = BuildConfig.FLAVOR;

    static {
        C49619j jVar = new C49619j();
        f128058c = jVar;
        C62942bv.registerDefaultInstance(C49619j.class, jVar);
    }

    private C49619j() {
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
                return newMessageInfo(f128058c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49619j();
            case 4:
                return new C49618i();
            case 5:
                return f128058c;
            case 6:
                C63010eb ebVar = f128059d;
                if (ebVar == null) {
                    synchronized (C49619j.class) {
                        ebVar = f128059d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128058c);
                            f128059d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
