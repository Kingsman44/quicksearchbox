package com.google.assistant.p3825an.p3830c.p3831a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.bf */
/* compiled from: PG */
public final class C49287bf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49287bf f127390b;

    /* renamed from: d */
    private static volatile C63010eb f127391d;

    /* renamed from: a */
    public String f127392a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f127393c;

    static {
        C49287bf bfVar = new C49287bf();
        f127390b = bfVar;
        C62942bv.registerDefaultInstance(C49287bf.class, bfVar);
    }

    private C49287bf() {
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
                return newMessageInfo(f127390b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C49287bf();
            case 4:
                return new C49286be();
            case 5:
                return f127390b;
            case 6:
                C63010eb ebVar = f127391d;
                if (ebVar == null) {
                    synchronized (C49287bf.class) {
                        ebVar = f127391d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127390b);
                            f127391d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
