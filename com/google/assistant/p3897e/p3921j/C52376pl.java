package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.pl */
/* compiled from: PG */
public final class C52376pl extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52376pl f137440b;

    /* renamed from: d */
    private static volatile C63010eb f137441d;

    /* renamed from: a */
    public String f137442a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f137443c;

    static {
        C52376pl plVar = new C52376pl();
        f137440b = plVar;
        C62942bv.registerDefaultInstance(C52376pl.class, plVar);
    }

    private C52376pl() {
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
                return newMessageInfo(f137440b, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C52376pl();
            case 4:
                return new C52375pk();
            case 5:
                return f137440b;
            case 6:
                C63010eb ebVar = f137441d;
                if (ebVar == null) {
                    synchronized (C52376pl.class) {
                        ebVar = f137441d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137440b);
                            f137441d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
