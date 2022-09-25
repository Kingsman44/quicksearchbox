package com.google.p4653i.p4654a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.z */
/* compiled from: PG */
public final class C61716z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61716z f166735c;

    /* renamed from: d */
    private static volatile C63010eb f166736d;

    /* renamed from: a */
    public int f166737a;

    /* renamed from: b */
    public String f166738b = BuildConfig.FLAVOR;

    static {
        C61716z zVar = new C61716z();
        f166735c = zVar;
        C62942bv.registerDefaultInstance(C61716z.class, zVar);
    }

    private C61716z() {
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
                return newMessageInfo(f166735c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C61716z();
            case 4:
                return new C61715y();
            case 5:
                return f166735c;
            case 6:
                C63010eb ebVar = f166736d;
                if (ebVar == null) {
                    synchronized (C61716z.class) {
                        ebVar = f166736d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166735c);
                            f166736d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
