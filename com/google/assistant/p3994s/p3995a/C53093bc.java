package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.bc */
/* compiled from: PG */
public final class C53093bc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53093bc f139133e;

    /* renamed from: g */
    private static volatile C63010eb f139134g;

    /* renamed from: a */
    public int f139135a;

    /* renamed from: b */
    public String f139136b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f139137c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f139138d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f139139f = 2;

    static {
        C53093bc bcVar = new C53093bc();
        f139133e = bcVar;
        C62942bv.registerDefaultInstance(C53093bc.class, bcVar);
    }

    private C53093bc() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139139f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139139f = b;
                return null;
            case 2:
                return newMessageInfo(f139133e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C53093bc();
            case 4:
                return new C53092bb();
            case 5:
                return f139133e;
            case 6:
                C63010eb ebVar = f139134g;
                if (ebVar == null) {
                    synchronized (C53093bc.class) {
                        ebVar = f139134g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139133e);
                            f139134g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
