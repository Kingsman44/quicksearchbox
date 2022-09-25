package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.aj */
/* compiled from: PG */
public final class C88412aj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C88412aj f239054b;

    /* renamed from: d */
    private static volatile C63010eb f239055d;

    /* renamed from: a */
    public String f239056a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f239057c;

    static {
        C88412aj ajVar = new C88412aj();
        f239054b = ajVar;
        C62942bv.registerDefaultInstance(C88412aj.class, ajVar);
    }

    private C88412aj() {
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
                return newMessageInfo(f239054b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C88412aj();
            case 4:
                return new C88411ai();
            case 5:
                return f239054b;
            case 6:
                C63010eb ebVar = f239055d;
                if (ebVar == null) {
                    synchronized (C88412aj.class) {
                        ebVar = f239055d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239054b);
                            f239055d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
