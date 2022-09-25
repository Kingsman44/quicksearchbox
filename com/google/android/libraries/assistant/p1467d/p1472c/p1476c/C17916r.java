package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.c.r */
/* compiled from: PG */
public final class C17916r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C17916r f51325b;

    /* renamed from: d */
    private static volatile C63010eb f51326d;

    /* renamed from: a */
    public String f51327a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f51328c;

    static {
        C17916r rVar = new C17916r();
        f51325b = rVar;
        C62942bv.registerDefaultInstance(C17916r.class, rVar);
    }

    private C17916r() {
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
                return newMessageInfo(f51325b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C17916r();
            case 4:
                return new C17915q();
            case 5:
                return f51325b;
            case 6:
                C63010eb ebVar = f51326d;
                if (ebVar == null) {
                    synchronized (C17916r.class) {
                        ebVar = f51326d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51325b);
                            f51326d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
