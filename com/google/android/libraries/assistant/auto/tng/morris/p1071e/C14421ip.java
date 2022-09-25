package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ip */
/* compiled from: PG */
public final class C14421ip extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14421ip f43615d;

    /* renamed from: f */
    private static volatile C63010eb f43616f;

    /* renamed from: a */
    public C14216b f43617a;

    /* renamed from: b */
    public String f43618b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f43619c = emptyProtobufList();

    /* renamed from: e */
    private byte f43620e = 2;

    static {
        C14421ip ipVar = new C14421ip();
        f43615d = ipVar;
        C62942bv.registerDefaultInstance(C14421ip.class, ipVar);
    }

    private C14421ip() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43620e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43620e = b;
                return null;
            case 2:
                return newMessageInfo(f43615d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0001\u0001\t\u0002Ȉ\u0003Л", new Object[]{"a", "b", C45240c.f118157a, C14292dv.class});
            case 3:
                return new C14421ip();
            case 4:
                return new C14420io();
            case 5:
                return f43615d;
            case 6:
                C63010eb ebVar = f43616f;
                if (ebVar == null) {
                    synchronized (C14421ip.class) {
                        ebVar = f43616f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43615d);
                            f43616f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
