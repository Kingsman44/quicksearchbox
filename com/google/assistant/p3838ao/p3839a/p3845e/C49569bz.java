package com.google.assistant.p3838ao.p3839a.p3845e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.bz */
/* compiled from: PG */
public final class C49569bz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49569bz f127901d;

    /* renamed from: e */
    private static volatile C63010eb f127902e;

    /* renamed from: a */
    public int f127903a;

    /* renamed from: b */
    public String f127904b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public double f127905c;

    static {
        C49569bz bzVar = new C49569bz();
        f127901d = bzVar;
        C62942bv.registerDefaultInstance(C49569bz.class, bzVar);
    }

    private C49569bz() {
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
                return newMessageInfo(f127901d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C49569bz();
            case 4:
                return new C49568by();
            case 5:
                return f127901d;
            case 6:
                C63010eb ebVar = f127902e;
                if (ebVar == null) {
                    synchronized (C49569bz.class) {
                        ebVar = f127902e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127901d);
                            f127902e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
