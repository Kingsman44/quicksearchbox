package com.google.assistant.p3886c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.cm */
/* compiled from: PG */
public final class C50789cm extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50789cm f132161f;

    /* renamed from: g */
    private static volatile C63010eb f132162g;

    /* renamed from: a */
    public int f132163a;

    /* renamed from: b */
    public String f132164b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C50733r f132165c;

    /* renamed from: d */
    public C50729n f132166d;

    /* renamed from: e */
    public int f132167e;

    static {
        C50789cm cmVar = new C50789cm();
        f132161f = cmVar;
        C62942bv.registerDefaultInstance(C50789cm.class, cmVar);
    }

    private C50789cm() {
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
                return newMessageInfo(f132161f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C50786cj.f132160a});
            case 3:
                return new C50789cm();
            case 4:
                return new C50788cl();
            case 5:
                return f132161f;
            case 6:
                C63010eb ebVar = f132162g;
                if (ebVar == null) {
                    synchronized (C50789cm.class) {
                        ebVar = f132162g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132161f);
                            f132162g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
