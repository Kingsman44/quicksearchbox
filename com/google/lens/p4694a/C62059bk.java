package com.google.lens.p4694a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.bk */
/* compiled from: PG */
public final class C62059bk extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62059bk f167647d;

    /* renamed from: f */
    private static volatile C63010eb f167648f;

    /* renamed from: a */
    public C62033al f167649a;

    /* renamed from: b */
    public String f167650b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f167651c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f167652e;

    static {
        C62059bk bkVar = new C62059bk();
        f167647d = bkVar;
        C62942bv.registerDefaultInstance(C62059bk.class, bkVar);
    }

    private C62059bk() {
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
                return newMessageInfo(f167647d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C62059bk();
            case 4:
                return new C62058bj();
            case 5:
                return f167647d;
            case 6:
                C63010eb ebVar = f167648f;
                if (ebVar == null) {
                    synchronized (C62059bk.class) {
                        ebVar = f167648f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167647d);
                            f167648f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
