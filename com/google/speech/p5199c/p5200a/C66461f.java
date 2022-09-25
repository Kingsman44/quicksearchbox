package com.google.speech.p5199c.p5200a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63259d;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63265j;

/* renamed from: com.google.speech.c.a.f */
/* compiled from: PG */
public final class C66461f extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C66461f f180719g;

    /* renamed from: h */
    private static volatile C63010eb f180720h;

    /* renamed from: a */
    public int f180721a;

    /* renamed from: b */
    public C66477v f180722b;

    /* renamed from: c */
    public C66459d f180723c;

    /* renamed from: d */
    public C66468m f180724d;

    /* renamed from: e */
    public C63259d f180725e;

    /* renamed from: f */
    public C63265j f180726f;

    static {
        C66461f fVar = new C66461f();
        f180719g = fVar;
        C62942bv.registerDefaultInstance(C66461f.class, fVar);
    }

    private C66461f() {
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
                return newMessageInfo(f180719g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C66461f();
            case 4:
                return new C66460e();
            case 5:
                return f180719g;
            case 6:
                C63010eb ebVar = f180720h;
                if (ebVar == null) {
                    synchronized (C66461f.class) {
                        ebVar = f180720h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180719g);
                            f180720h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
