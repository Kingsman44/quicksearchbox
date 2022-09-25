package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.gj */
/* compiled from: PG */
public final class C14361gj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C14361gj f43456e;

    /* renamed from: f */
    private static volatile C63010eb f43457f;

    /* renamed from: a */
    public C63088z f43458a = C63088z.f170246b;

    /* renamed from: b */
    public int f43459b;

    /* renamed from: c */
    public int f43460c;

    /* renamed from: d */
    public String f43461d = BuildConfig.FLAVOR;

    static {
        C14361gj gjVar = new C14361gj();
        f43456e = gjVar;
        C62942bv.registerDefaultInstance(C14361gj.class, gjVar);
    }

    private C14361gj() {
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
                return newMessageInfo(f43456e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\u0004\u0004Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C14361gj();
            case 4:
                return new C14360gi();
            case 5:
                return f43456e;
            case 6:
                C63010eb ebVar = f43457f;
                if (ebVar == null) {
                    synchronized (C14361gj.class) {
                        ebVar = f43457f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43456e);
                            f43457f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
