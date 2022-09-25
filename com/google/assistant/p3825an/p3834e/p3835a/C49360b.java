package com.google.assistant.p3825an.p3834e.p3835a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.e.a.b */
/* compiled from: PG */
public final class C49360b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49360b f127587b;

    /* renamed from: d */
    private static volatile C63010eb f127588d;

    /* renamed from: a */
    public String f127589a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f127590c;

    static {
        C49360b bVar = new C49360b();
        f127587b = bVar;
        C62942bv.registerDefaultInstance(C49360b.class, bVar);
    }

    private C49360b() {
        emptyLongList();
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
                return newMessageInfo(f127587b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C49360b();
            case 4:
                return new C49359a();
            case 5:
                return f127587b;
            case 6:
                C63010eb ebVar = f127588d;
                if (ebVar == null) {
                    synchronized (C49360b.class) {
                        ebVar = f127588d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127587b);
                            f127588d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
