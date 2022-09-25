package com.google.android.libraries.assistant.p1363c.p1371b.p1375c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.b.c.o */
/* compiled from: PG */
public final class C17070o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C17070o f49685d;

    /* renamed from: e */
    private static volatile C63010eb f49686e;

    /* renamed from: a */
    public int f49687a;

    /* renamed from: b */
    public String f49688b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f49689c = BuildConfig.FLAVOR;

    static {
        C17070o oVar = new C17070o();
        f49685d = oVar;
        C62942bv.registerDefaultInstance(C17070o.class, oVar);
    }

    private C17070o() {
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
                return newMessageInfo(f49685d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C17070o();
            case 4:
                return new C17069n();
            case 5:
                return f49685d;
            case 6:
                C63010eb ebVar = f49686e;
                if (ebVar == null) {
                    synchronized (C17070o.class) {
                        ebVar = f49686e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49685d);
                            f49686e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
