package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.yz */
/* compiled from: PG */
public final class C50489yz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50489yz f131384d;

    /* renamed from: e */
    private static volatile C63010eb f131385e;

    /* renamed from: a */
    public int f131386a;

    /* renamed from: b */
    public String f131387b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f131388c = BuildConfig.FLAVOR;

    static {
        C50489yz yzVar = new C50489yz();
        f131384d = yzVar;
        C62942bv.registerDefaultInstance(C50489yz.class, yzVar);
    }

    private C50489yz() {
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
                return newMessageInfo(f131384d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50489yz();
            case 4:
                return new C50488yy();
            case 5:
                return f131384d;
            case 6:
                C63010eb ebVar = f131385e;
                if (ebVar == null) {
                    synchronized (C50489yz.class) {
                        ebVar = f131385e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131384d);
                            f131385e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
