package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.zn */
/* compiled from: PG */
public final class C50504zn extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50504zn f131466b;

    /* renamed from: d */
    private static volatile C63010eb f131467d;

    /* renamed from: a */
    public String f131468a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f131469c;

    static {
        C50504zn znVar = new C50504zn();
        f131466b = znVar;
        C62942bv.registerDefaultInstance(C50504zn.class, znVar);
    }

    private C50504zn() {
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
                return newMessageInfo(f131466b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50504zn();
            case 4:
                return new C50503zm();
            case 5:
                return f131466b;
            case 6:
                C63010eb ebVar = f131467d;
                if (ebVar == null) {
                    synchronized (C50504zn.class) {
                        ebVar = f131467d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131466b);
                            f131467d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
