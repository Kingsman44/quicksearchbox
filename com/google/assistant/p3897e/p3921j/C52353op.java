package com.google.assistant.p3897e.p3921j;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.op */
/* compiled from: PG */
public final class C52353op extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52353op f137398e;

    /* renamed from: g */
    private static volatile C63010eb f137399g;

    /* renamed from: a */
    public float f137400a;

    /* renamed from: b */
    public float f137401b;

    /* renamed from: c */
    public float f137402c;

    /* renamed from: d */
    public float f137403d = 1.0f;

    /* renamed from: f */
    private int f137404f;

    static {
        C52353op opVar = new C52353op();
        f137398e = opVar;
        C62942bv.registerDefaultInstance(C52353op.class, opVar);
    }

    private C52353op() {
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
                return newMessageInfo(f137398e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C52353op();
            case 4:
                return new C52352oo();
            case 5:
                return f137398e;
            case 6:
                C63010eb ebVar = f137399g;
                if (ebVar == null) {
                    synchronized (C52353op.class) {
                        ebVar = f137399g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137398e);
                            f137399g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
