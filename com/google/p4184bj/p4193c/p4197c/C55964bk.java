package com.google.p4184bj.p4193c.p4197c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bj.c.c.bk */
/* compiled from: PG */
public final class C55964bk extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C55964bk f149032g;

    /* renamed from: h */
    private static volatile C63010eb f149033h;

    /* renamed from: a */
    public int f149034a;

    /* renamed from: b */
    public C62971cq f149035b = emptyProtobufList();

    /* renamed from: c */
    public C55979o f149036c;

    /* renamed from: d */
    public C63088z f149037d = C63088z.f170246b;

    /* renamed from: e */
    public C55928ab f149038e;

    /* renamed from: f */
    public C55928ab f149039f;

    static {
        C55964bk bkVar = new C55964bk();
        f149032g = bkVar;
        C62942bv.registerDefaultInstance(C55964bk.class, bkVar);
    }

    private C55964bk() {
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
                return newMessageInfo(f149032g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ည\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", C55963bj.class, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C55964bk();
            case 4:
                return new C55961bh();
            case 5:
                return f149032g;
            case 6:
                C63010eb ebVar = f149033h;
                if (ebVar == null) {
                    synchronized (C55964bk.class) {
                        ebVar = f149033h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149032g);
                            f149033h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
