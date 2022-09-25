package com.google.protos.p4985f.p4986a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4184bj.p4193c.p4200e.C55998f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.e */
/* compiled from: PG */
public final class C64695e extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C64695e f175359g;

    /* renamed from: h */
    private static volatile C63010eb f175360h;

    /* renamed from: a */
    public int f175361a;

    /* renamed from: b */
    public C64704n f175362b;

    /* renamed from: c */
    public C64702l f175363c;

    /* renamed from: d */
    public int f175364d;

    /* renamed from: e */
    public int f175365e;

    /* renamed from: f */
    public C62971cq f175366f = emptyProtobufList();

    static {
        C64695e eVar = new C64695e();
        f175359g = eVar;
        C62942bv.registerDefaultInstance(C64695e.class, eVar);
    }

    private C64695e() {
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
                return newMessageInfo(f175359g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C55998f.m87879b(), "e", C55421x.m87687b(), C10662f.f35572a, C64700j.class});
            case 3:
                return new C64695e();
            case 4:
                return new C64694d();
            case 5:
                return f175359g;
            case 6:
                C63010eb ebVar = f175360h;
                if (ebVar == null) {
                    synchronized (C64695e.class) {
                        ebVar = f175360h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175359g);
                            f175360h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
