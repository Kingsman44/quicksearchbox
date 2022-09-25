package com.google.speech.p5228m;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.o */
/* compiled from: PG */
public final class C67351o extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C67351o f183066g;

    /* renamed from: i */
    private static volatile C63010eb f183067i;

    /* renamed from: a */
    public long f183068a;

    /* renamed from: b */
    public long f183069b;

    /* renamed from: c */
    public long f183070c;

    /* renamed from: d */
    public long f183071d;

    /* renamed from: e */
    public C67287ar f183072e;

    /* renamed from: f */
    public long f183073f;

    /* renamed from: h */
    private int f183074h;

    static {
        C67351o oVar = new C67351o();
        f183066g = oVar;
        C62942bv.registerDefaultInstance(C67351o.class, oVar);
    }

    private C67351o() {
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
                return newMessageInfo(f183066g, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\bဉ\u0006\nဂ\b", new Object[]{C19618h.f54585a, "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C67351o();
            case 4:
                return new C67350n();
            case 5:
                return f183066g;
            case 6:
                C63010eb ebVar = f183067i;
                if (ebVar == null) {
                    synchronized (C67351o.class) {
                        ebVar = f183067i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183066g);
                            f183067i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
