package com.google.assistant.p3897e.p3912f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.f.b */
/* compiled from: PG */
public final class C51207b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51207b f133303d;

    /* renamed from: e */
    private static volatile C63010eb f133304e;

    /* renamed from: a */
    public int f133305a;

    /* renamed from: b */
    public String f133306b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f133307c = BuildConfig.FLAVOR;

    static {
        C51207b bVar = new C51207b();
        f133303d = bVar;
        C62942bv.registerDefaultInstance(C51207b.class, bVar);
    }

    private C51207b() {
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
                return newMessageInfo(f133303d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51207b();
            case 4:
                return new C51206a();
            case 5:
                return f133303d;
            case 6:
                C63010eb ebVar = f133304e;
                if (ebVar == null) {
                    synchronized (C51207b.class) {
                        ebVar = f133304e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133303d);
                            f133304e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
