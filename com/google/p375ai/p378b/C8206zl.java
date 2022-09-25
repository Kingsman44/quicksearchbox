package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.zl */
/* compiled from: PG */
public final class C8206zl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8206zl f28815c;

    /* renamed from: e */
    private static volatile C63010eb f28816e;

    /* renamed from: a */
    public String f28817a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C8205zk f28818b;

    /* renamed from: d */
    private int f28819d;

    static {
        C8206zl zlVar = new C8206zl();
        f28815c = zlVar;
        C62942bv.registerDefaultInstance(C8206zl.class, zlVar);
    }

    private C8206zl() {
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
                return newMessageInfo(f28815c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002", new Object[]{"d", "a", "b"});
            case 3:
                return new C8206zl();
            case 4:
                return new C8201zg();
            case 5:
                return f28815c;
            case 6:
                C63010eb ebVar = f28816e;
                if (ebVar == null) {
                    synchronized (C8206zl.class) {
                        ebVar = f28816e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28815c);
                            f28816e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
