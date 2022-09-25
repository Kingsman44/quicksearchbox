package com.google.protos.youtube.elements.p5166b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.b.r */
/* compiled from: PG */
public final class C66113r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66113r f179786e;

    /* renamed from: g */
    private static volatile C63010eb f179787g;

    /* renamed from: a */
    public int f179788a;

    /* renamed from: b */
    public C62971cq f179789b = emptyProtobufList();

    /* renamed from: c */
    public String f179790c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f179791d = emptyProtobufList();

    /* renamed from: f */
    private byte f179792f = 2;

    static {
        C66113r rVar = new C66113r();
        f179786e = rVar;
        C62942bv.registerDefaultInstance(C66113r.class, rVar);
    }

    private C66113r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179792f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179792f = b;
                return null;
            case 2:
                return newMessageInfo(f179786e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001Л\u0002ဈ\u0000\u0003\u001b", new Object[]{"a", "b", C66105j.class, C45240c.f118157a, "d", C66111p.class});
            case 3:
                return new C66113r();
            case 4:
                return new C66112q();
            case 5:
                return f179786e;
            case 6:
                C63010eb ebVar = f179787g;
                if (ebVar == null) {
                    synchronized (C66113r.class) {
                        ebVar = f179787g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179786e);
                            f179787g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
