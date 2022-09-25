package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ho */
/* compiled from: PG */
public final class C14393ho extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14393ho f43534d;

    /* renamed from: e */
    private static volatile C63010eb f43535e;

    /* renamed from: a */
    public int f43536a;

    /* renamed from: b */
    public int f43537b;

    /* renamed from: c */
    public String f43538c = BuildConfig.FLAVOR;

    static {
        C14393ho hoVar = new C14393ho();
        f43534d = hoVar;
        C62942bv.registerDefaultInstance(C14393ho.class, hoVar);
    }

    private C14393ho() {
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
                return newMessageInfo(f43534d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ለ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C14393ho();
            case 4:
                return new C14392hn();
            case 5:
                return f43534d;
            case 6:
                C63010eb ebVar = f43535e;
                if (ebVar == null) {
                    synchronized (C14393ho.class) {
                        ebVar = f43535e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43534d);
                            f43535e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
