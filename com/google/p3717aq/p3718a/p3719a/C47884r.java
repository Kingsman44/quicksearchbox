package com.google.p3717aq.p3718a.p3719a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aq.a.a.r */
/* compiled from: PG */
public final class C47884r extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C47884r f123965g;

    /* renamed from: h */
    private static volatile C63010eb f123966h;

    /* renamed from: a */
    public String f123967a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f123968b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f123969c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C47881o f123970d;

    /* renamed from: e */
    public C47883q f123971e;

    /* renamed from: f */
    public C62971cq f123972f = emptyProtobufList();

    static {
        C47884r rVar = new C47884r();
        f123965g = rVar;
        C62942bv.registerDefaultInstance(C47884r.class, rVar);
    }

    private C47884r() {
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
                return newMessageInfo(f123965g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0005\t\u0006\t\u0007\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C47883q.class});
            case 3:
                return new C47884r();
            case 4:
                return new C47879m();
            case 5:
                return f123965g;
            case 6:
                C63010eb ebVar = f123966h;
                if (ebVar == null) {
                    synchronized (C47884r.class) {
                        ebVar = f123966h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123965g);
                            f123966h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
