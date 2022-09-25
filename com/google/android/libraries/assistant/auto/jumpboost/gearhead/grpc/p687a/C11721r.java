package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.r */
/* compiled from: PG */
public final class C11721r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C11721r f37763b;

    /* renamed from: d */
    private static volatile C63010eb f37764d;

    /* renamed from: a */
    public String f37765a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f37766c;

    static {
        C11721r rVar = new C11721r();
        f37763b = rVar;
        C62942bv.registerDefaultInstance(C11721r.class, rVar);
    }

    private C11721r() {
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
                return newMessageInfo(f37763b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C11721r();
            case 4:
                return new C11720q();
            case 5:
                return f37763b;
            case 6:
                C63010eb ebVar = f37764d;
                if (ebVar == null) {
                    synchronized (C11721r.class) {
                        ebVar = f37764d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37763b);
                            f37764d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
