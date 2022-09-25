package com.google.android.libraries.assistant.auto.tng.common.p909f.p913b.p915b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.f.b.b.b */
/* compiled from: PG */
public final class C13262b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C13262b f40943e;

    /* renamed from: f */
    private static volatile C63010eb f40944f;

    /* renamed from: a */
    public int f40945a;

    /* renamed from: b */
    public String f40946b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public double f40947c;

    /* renamed from: d */
    public String f40948d = BuildConfig.FLAVOR;

    static {
        C13262b bVar = new C13262b();
        f40943e = bVar;
        C62942bv.registerDefaultInstance(C13262b.class, bVar);
    }

    private C13262b() {
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
                return newMessageInfo(f40943e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003က\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C13262b();
            case 4:
                return new C13261a();
            case 5:
                return f40943e;
            case 6:
                C63010eb ebVar = f40944f;
                if (ebVar == null) {
                    synchronized (C13262b.class) {
                        ebVar = f40944f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40943e);
                            f40944f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
