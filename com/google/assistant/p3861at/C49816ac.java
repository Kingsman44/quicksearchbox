package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ac */
/* compiled from: PG */
public final class C49816ac extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49816ac f128826d;

    /* renamed from: e */
    private static volatile C63010eb f128827e;

    /* renamed from: a */
    public int f128828a;

    /* renamed from: b */
    public String f128829b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f128830c = BuildConfig.FLAVOR;

    static {
        C49816ac acVar = new C49816ac();
        f128826d = acVar;
        C62942bv.registerDefaultInstance(C49816ac.class, acVar);
    }

    private C49816ac() {
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
                return newMessageInfo(f128826d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C49816ac();
            case 4:
                return new C49815ab();
            case 5:
                return f128826d;
            case 6:
                C63010eb ebVar = f128827e;
                if (ebVar == null) {
                    synchronized (C49816ac.class) {
                        ebVar = f128827e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128826d);
                            f128827e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
