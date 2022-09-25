package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.da */
/* compiled from: PG */
public final class C54889da extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C54889da f144219g;

    /* renamed from: h */
    private static volatile C63010eb f144220h;

    /* renamed from: a */
    public int f144221a;

    /* renamed from: b */
    public C54886cy f144222b;

    /* renamed from: c */
    public C54882cu f144223c;

    /* renamed from: d */
    public C54882cu f144224d;

    /* renamed from: e */
    public C54882cu f144225e;

    /* renamed from: f */
    public C54882cu f144226f;

    static {
        C54889da daVar = new C54889da();
        f144219g = daVar;
        C62942bv.registerDefaultInstance(C54889da.class, daVar);
    }

    private C54889da() {
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
                return newMessageInfo(f144219g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C54889da();
            case 4:
                return new C54887cz();
            case 5:
                return f144219g;
            case 6:
                C63010eb ebVar = f144220h;
                if (ebVar == null) {
                    synchronized (C54889da.class) {
                        ebVar = f144220h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144219g);
                            f144220h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
