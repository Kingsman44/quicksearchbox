package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.dk */
/* compiled from: PG */
public final class C54899dk extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C54899dk f144254g;

    /* renamed from: h */
    private static volatile C63010eb f144255h;

    /* renamed from: a */
    public int f144256a;

    /* renamed from: b */
    public C54868cg f144257b;

    /* renamed from: c */
    public C54870ci f144258c;

    /* renamed from: d */
    public C54870ci f144259d;

    /* renamed from: e */
    public C54870ci f144260e;

    /* renamed from: f */
    public C54870ci f144261f;

    static {
        C54899dk dkVar = new C54899dk();
        f144254g = dkVar;
        C62942bv.registerDefaultInstance(C54899dk.class, dkVar);
    }

    private C54899dk() {
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
                return newMessageInfo(f144254g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C54899dk();
            case 4:
                return new C54898dj();
            case 5:
                return f144254g;
            case 6:
                C63010eb ebVar = f144255h;
                if (ebVar == null) {
                    synchronized (C54899dk.class) {
                        ebVar = f144255h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144254g);
                            f144255h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
