package com.google.assistant.p3897e.p3898a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51073fj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.a.f */
/* compiled from: PG */
public final class C50870f extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C50870f f132446g;

    /* renamed from: h */
    private static volatile C63010eb f132447h;

    /* renamed from: a */
    public int f132448a;

    /* renamed from: b */
    public String f132449b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f132450c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f132451d = emptyProtobufList();

    /* renamed from: e */
    public int f132452e = 1;

    /* renamed from: f */
    public C51073fj f132453f;

    static {
        C50870f fVar = new C50870f();
        f132446g = fVar;
        C62942bv.registerDefaultInstance(C50870f.class, fVar);
    }

    private C50870f() {
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
                return newMessageInfo(f132446g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဌ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C50867c.class, "e", C50868d.f132445a, C10662f.f35572a});
            case 3:
                return new C50870f();
            case 4:
                return new C50865a();
            case 5:
                return f132446g;
            case 6:
                C63010eb ebVar = f132447h;
                if (ebVar == null) {
                    synchronized (C50870f.class) {
                        ebVar = f132447h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132446g);
                            f132447h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
