package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.oa */
/* compiled from: PG */
public final class C53442oa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53442oa f140266d;

    /* renamed from: f */
    private static volatile C63010eb f140267f;

    /* renamed from: a */
    public int f140268a;

    /* renamed from: b */
    public String f140269b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f140270c = emptyProtobufList();

    /* renamed from: e */
    private byte f140271e = 2;

    static {
        C53442oa oaVar = new C53442oa();
        f140266d = oaVar;
        C62942bv.registerDefaultInstance(C53442oa.class, oaVar);
    }

    private C53442oa() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140271e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140271e = b;
                return null;
            case 2:
                return newMessageInfo(f140266d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000", new Object[]{"a", C45240c.f118157a, C53435nu.class, "b"});
            case 3:
                return new C53442oa();
            case 4:
                return new C53440nz();
            case 5:
                return f140266d;
            case 6:
                C63010eb ebVar = f140267f;
                if (ebVar == null) {
                    synchronized (C53442oa.class) {
                        ebVar = f140267f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140266d);
                            f140267f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
