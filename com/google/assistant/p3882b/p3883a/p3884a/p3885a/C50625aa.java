package com.google.assistant.p3882b.p3883a.p3884a.p3885a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.b.a.a.a.aa */
/* compiled from: PG */
public final class C50625aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50625aa f131703c;

    /* renamed from: e */
    private static volatile C63010eb f131704e;

    /* renamed from: a */
    public String f131705a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f131706b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f131707d;

    static {
        C50625aa aaVar = new C50625aa();
        f131703c = aaVar;
        C62942bv.registerDefaultInstance(C50625aa.class, aaVar);
    }

    private C50625aa() {
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
                return newMessageInfo(f131703c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C50625aa();
            case 4:
                return new C50663z();
            case 5:
                return f131703c;
            case 6:
                C63010eb ebVar = f131704e;
                if (ebVar == null) {
                    synchronized (C50625aa.class) {
                        ebVar = f131704e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131703c);
                            f131704e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
