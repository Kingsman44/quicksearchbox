package com.google.assistant.p3882b.p3883a.p3884a.p3885a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.b.a.a.a.b */
/* compiled from: PG */
public final class C50639b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50639b f131735b;

    /* renamed from: d */
    private static volatile C63010eb f131736d;

    /* renamed from: a */
    public String f131737a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f131738c;

    static {
        C50639b bVar = new C50639b();
        f131735b = bVar;
        C62942bv.registerDefaultInstance(C50639b.class, bVar);
    }

    private C50639b() {
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
                return newMessageInfo(f131735b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50639b();
            case 4:
                return new C50624a();
            case 5:
                return f131735b;
            case 6:
                C63010eb ebVar = f131736d;
                if (ebVar == null) {
                    synchronized (C50639b.class) {
                        ebVar = f131736d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131735b);
                            f131736d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
