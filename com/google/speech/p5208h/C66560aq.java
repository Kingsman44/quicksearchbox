package com.google.speech.p5208h;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.h.aq */
/* compiled from: PG */
public final class C66560aq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66560aq f181048d;

    /* renamed from: e */
    private static volatile C63010eb f181049e;

    /* renamed from: a */
    public int f181050a;

    /* renamed from: b */
    public String f181051b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f181052c = BuildConfig.FLAVOR;

    static {
        C66560aq aqVar = new C66560aq();
        f181048d = aqVar;
        C62942bv.registerDefaultInstance(C66560aq.class, aqVar);
    }

    private C66560aq() {
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
                return newMessageInfo(f181048d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66560aq();
            case 4:
                return new C66559ap();
            case 5:
                return f181048d;
            case 6:
                C63010eb ebVar = f181049e;
                if (ebVar == null) {
                    synchronized (C66560aq.class) {
                        ebVar = f181049e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181048d);
                            f181049e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
