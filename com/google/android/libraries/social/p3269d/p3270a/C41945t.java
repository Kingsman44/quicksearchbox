package com.google.android.libraries.social.p3269d.p3270a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.social.d.a.t */
/* compiled from: PG */
public final class C41945t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C41945t f109486d;

    /* renamed from: f */
    private static volatile C63010eb f109487f;

    /* renamed from: a */
    public int f109488a;

    /* renamed from: b */
    public C62971cq f109489b = emptyProtobufList();

    /* renamed from: c */
    public String f109490c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private byte f109491e = 2;

    static {
        C41945t tVar = new C41945t();
        f109486d = tVar;
        C62942bv.registerDefaultInstance(C41945t.class, tVar);
    }

    private C41945t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f109491e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f109491e = b;
                return null;
            case 2:
                return newMessageInfo(f109486d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000", new Object[]{"a", "b", C41949x.class, C45240c.f118157a});
            case 3:
                return new C41945t();
            case 4:
                return new C41944s();
            case 5:
                return f109486d;
            case 6:
                C63010eb ebVar = f109487f;
                if (ebVar == null) {
                    synchronized (C41945t.class) {
                        ebVar = f109487f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f109486d);
                            f109487f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
