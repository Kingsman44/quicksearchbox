package com.google.speech.p5218j;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ju */
/* compiled from: PG */
public final class C67066ju extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C67066ju f182302g;

    /* renamed from: i */
    private static volatile C63010eb f182303i;

    /* renamed from: a */
    public int f182304a;

    /* renamed from: b */
    public C62971cq f182305b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C62971cq f182306c = emptyProtobufList();

    /* renamed from: d */
    public C67091ks f182307d;

    /* renamed from: e */
    public C67095kw f182308e;

    /* renamed from: f */
    public C67024if f182309f;

    /* renamed from: h */
    private byte f182310h = 2;

    static {
        C67066ju juVar = new C67066ju();
        f182302g = juVar;
        C62942bv.registerDefaultInstance(C67066ju.class, juVar);
    }

    private C67066ju() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182310h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182310h = b;
                return null;
            case 2:
                return newMessageInfo(f182302g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0001\u0001\u001a\u0002ဉ\u0000\u0003ဉ\u0001\u0004Л\u0006ဉ\u0002", new Object[]{"a", "b", "d", "e", C45240c.f118157a, C67058jm.class, C10662f.f35572a});
            case 3:
                return new C67066ju();
            case 4:
                return new C67065jt();
            case 5:
                return f182302g;
            case 6:
                C63010eb ebVar = f182303i;
                if (ebVar == null) {
                    synchronized (C67066ju.class) {
                        ebVar = f182303i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182302g);
                            f182303i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
