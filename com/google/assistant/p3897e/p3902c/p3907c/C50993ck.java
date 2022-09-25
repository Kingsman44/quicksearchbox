package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.ck */
/* compiled from: PG */
public final class C50993ck extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50993ck f132751e;

    /* renamed from: g */
    private static volatile C63010eb f132752g;

    /* renamed from: a */
    public int f132753a;

    /* renamed from: b */
    public String f132754b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f132755c = emptyProtobufList();

    /* renamed from: d */
    public C50991ci f132756d;

    /* renamed from: f */
    private byte f132757f = 2;

    static {
        C50993ck ckVar = new C50993ck();
        f132751e = ckVar;
        C62942bv.registerDefaultInstance(C50993ck.class, ckVar);
    }

    private C50993ck() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132757f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132757f = b;
                return null;
            case 2:
                return newMessageInfo(f132751e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0003Л\u0004ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a, C50991ci.class, "d"});
            case 3:
                return new C50993ck();
            case 4:
                return new C50992cj();
            case 5:
                return f132751e;
            case 6:
                C63010eb ebVar = f132752g;
                if (ebVar == null) {
                    synchronized (C50993ck.class) {
                        ebVar = f132752g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132751e);
                            f132752g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
