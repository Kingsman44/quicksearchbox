package com.google.lens.p4707j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.dh */
/* compiled from: PG */
public final class C62485dh extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62485dh f168693e;

    /* renamed from: f */
    private static volatile C63010eb f168694f;

    /* renamed from: a */
    public int f168695a;

    /* renamed from: b */
    public String f168696b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f168697c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f168698d = C62942bv.emptyProtobufList();

    static {
        C62485dh dhVar = new C62485dh();
        f168693e = dhVar;
        C62942bv.registerDefaultInstance(C62485dh.class, dhVar);
    }

    private C62485dh() {
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
                return newMessageInfo(f168693e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62485dh();
            case 4:
                return new C62484dg();
            case 5:
                return f168693e;
            case 6:
                C63010eb ebVar = f168694f;
                if (ebVar == null) {
                    synchronized (C62485dh.class) {
                        ebVar = f168694f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168693e);
                            f168694f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
