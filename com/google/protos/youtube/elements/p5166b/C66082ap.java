package com.google.protos.youtube.elements.p5166b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* renamed from: com.google.protos.youtube.elements.b.ap */
/* compiled from: PG */
public final class C66082ap extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66082ap f179695e;

    /* renamed from: g */
    private static volatile C63010eb f179696g;

    /* renamed from: a */
    public int f179697a;

    /* renamed from: b */
    public C66086at f179698b;

    /* renamed from: c */
    public CommandOuterClass$Command f179699c;

    /* renamed from: d */
    public SenderStateOuterClass$SenderState f179700d;

    /* renamed from: f */
    private byte f179701f = 2;

    static {
        C66082ap apVar = new C66082ap();
        f179695e = apVar;
        C62942bv.registerDefaultInstance(C66082ap.class, apVar);
    }

    private C66082ap() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179701f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179701f = b;
                return null;
            case 2:
                return newMessageInfo(f179695e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C66082ap();
            case 4:
                return new C66081ao();
            case 5:
                return f179695e;
            case 6:
                C63010eb ebVar = f179696g;
                if (ebVar == null) {
                    synchronized (C66082ap.class) {
                        ebVar = f179696g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179695e);
                            f179696g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
