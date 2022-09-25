package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.um */
/* compiled from: PG */
public final class C52512um extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52512um f137845d;

    /* renamed from: e */
    private static volatile C63010eb f137846e;

    /* renamed from: a */
    public int f137847a;

    /* renamed from: b */
    public String f137848b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f137849c;

    static {
        C52512um umVar = new C52512um();
        f137845d = umVar;
        C62942bv.registerDefaultInstance(C52512um.class, umVar);
    }

    private C52512um() {
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
                return newMessageInfo(f137845d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52512um();
            case 4:
                return new C52511ul();
            case 5:
                return f137845d;
            case 6:
                C63010eb ebVar = f137846e;
                if (ebVar == null) {
                    synchronized (C52512um.class) {
                        ebVar = f137846e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137845d);
                            f137846e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
