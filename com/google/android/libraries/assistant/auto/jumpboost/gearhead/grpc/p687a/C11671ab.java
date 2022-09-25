package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.ab */
/* compiled from: PG */
public final class C11671ab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C11671ab f37655d;

    /* renamed from: e */
    private static volatile C63010eb f37656e;

    /* renamed from: a */
    public int f37657a;

    /* renamed from: b */
    public String f37658b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f37659c = BuildConfig.FLAVOR;

    static {
        C11671ab abVar = new C11671ab();
        f37655d = abVar;
        C62942bv.registerDefaultInstance(C11671ab.class, abVar);
    }

    private C11671ab() {
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
                return newMessageInfo(f37655d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C11671ab();
            case 4:
                return new C11670aa();
            case 5:
                return f37655d;
            case 6:
                C63010eb ebVar = f37656e;
                if (ebVar == null) {
                    synchronized (C11671ab.class) {
                        ebVar = f37656e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37655d);
                            f37656e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
