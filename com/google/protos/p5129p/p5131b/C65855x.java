package com.google.protos.p5129p.p5131b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.x */
/* compiled from: PG */
public final class C65855x extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C65855x f179020f;

    /* renamed from: h */
    private static volatile C63010eb f179021h;

    /* renamed from: a */
    public int f179022a;

    /* renamed from: b */
    public C62971cq f179023b = emptyProtobufList();

    /* renamed from: c */
    public String f179024c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C65808cl f179025d;

    /* renamed from: e */
    public int f179026e = 3;

    /* renamed from: g */
    private byte f179027g = 2;

    static {
        C65855x xVar = new C65855x();
        f179020f = xVar;
        C62942bv.registerDefaultInstance(C65855x.class, xVar);
    }

    private C65855x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179027g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179027g = b;
                return null;
            case 2:
                return newMessageInfo(f179020f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ဈ\u0000\u0003ᐉ\u0001\u0004ဌ\u0002", new Object[]{"a", "b", C65854w.class, C45240c.f118157a, "d", "e", C65816ct.f178925a});
            case 3:
                return new C65855x();
            case 4:
                return new C65852u();
            case 5:
                return f179020f;
            case 6:
                C63010eb ebVar = f179021h;
                if (ebVar == null) {
                    synchronized (C65855x.class) {
                        ebVar = f179021h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179020f);
                            f179021h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
