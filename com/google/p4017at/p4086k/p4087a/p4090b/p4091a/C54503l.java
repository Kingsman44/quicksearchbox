package com.google.p4017at.p4086k.p4087a.p4090b.p4091a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.b.a.l */
/* compiled from: PG */
public final class C54503l extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C54503l f143106g;

    /* renamed from: h */
    private static volatile C63010eb f143107h;

    /* renamed from: a */
    public C62971cq f143108a = emptyProtobufList();

    /* renamed from: b */
    public C54497f f143109b;

    /* renamed from: c */
    public C54512u f143110c;

    /* renamed from: d */
    public C54514w f143111d;

    /* renamed from: e */
    public C54516y f143112e;

    /* renamed from: f */
    public long f143113f;

    static {
        C54503l lVar = new C54503l();
        f143106g = lVar;
        C62942bv.registerDefaultInstance(C54503l.class, lVar);
    }

    private C54503l() {
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
                return newMessageInfo(f143106g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\t\u0004\u0003\u0005\t\u0006\t", new Object[]{"a", C54499h.class, C45240c.f118157a, "d", C10662f.f35572a, "e", "b"});
            case 3:
                return new C54503l();
            case 4:
                return new C54502k();
            case 5:
                return f143106g;
            case 6:
                C63010eb ebVar = f143107h;
                if (ebVar == null) {
                    synchronized (C54503l.class) {
                        ebVar = f143107h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143106g);
                            f143107h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
