package com.google.android.libraries.assistant.auto.tng.p894c.p895a.p896a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.c.a.a.b */
/* compiled from: PG */
public final class C13196b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C13196b f40836b;

    /* renamed from: d */
    private static volatile C63010eb f40837d;

    /* renamed from: a */
    public String f40838a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f40839c;

    static {
        C13196b bVar = new C13196b();
        f40836b = bVar;
        C62942bv.registerDefaultInstance(C13196b.class, bVar);
    }

    private C13196b() {
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
                return newMessageInfo(f40836b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C13196b();
            case 4:
                return new C13195a();
            case 5:
                return f40836b;
            case 6:
                C63010eb ebVar = f40837d;
                if (ebVar == null) {
                    synchronized (C13196b.class) {
                        ebVar = f40837d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40836b);
                            f40837d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
