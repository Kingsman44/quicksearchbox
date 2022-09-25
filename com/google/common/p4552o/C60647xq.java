package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.xq */
/* compiled from: PG */
public final class C60647xq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60647xq f164533c;

    /* renamed from: d */
    private static volatile C63010eb f164534d;

    /* renamed from: a */
    public int f164535a;

    /* renamed from: b */
    public String f164536b = BuildConfig.FLAVOR;

    static {
        C60647xq xqVar = new C60647xq();
        f164533c = xqVar;
        C62942bv.registerDefaultInstance(C60647xq.class, xqVar);
    }

    private C60647xq() {
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
                return newMessageInfo(f164533c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C60647xq();
            case 4:
                return new C60646xp();
            case 5:
                return f164533c;
            case 6:
                C63010eb ebVar = f164534d;
                if (ebVar == null) {
                    synchronized (C60647xq.class) {
                        ebVar = f164534d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164533c);
                            f164534d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
