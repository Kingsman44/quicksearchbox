package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ge */
/* compiled from: PG */
public final class C51397ge extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51397ge f133848b;

    /* renamed from: d */
    private static volatile C63010eb f133849d;

    /* renamed from: a */
    public String f133850a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f133851c;

    static {
        C51397ge geVar = new C51397ge();
        f133848b = geVar;
        C62942bv.registerDefaultInstance(C51397ge.class, geVar);
    }

    private C51397ge() {
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
                return newMessageInfo(f133848b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C51397ge();
            case 4:
                return new C51396gd();
            case 5:
                return f133848b;
            case 6:
                C63010eb ebVar = f133849d;
                if (ebVar == null) {
                    synchronized (C51397ge.class) {
                        ebVar = f133849d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133848b);
                            f133849d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
