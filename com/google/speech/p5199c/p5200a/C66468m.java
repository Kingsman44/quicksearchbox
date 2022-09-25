package com.google.speech.p5199c.p5200a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.c.a.m */
/* compiled from: PG */
public final class C66468m extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66468m f180737e;

    /* renamed from: f */
    private static volatile C63010eb f180738f;

    /* renamed from: a */
    public int f180739a;

    /* renamed from: b */
    public String f180740b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f180741c;

    /* renamed from: d */
    public C62971cq f180742d = emptyProtobufList();

    static {
        C66468m mVar = new C66468m();
        f180737e = mVar;
        C62942bv.registerDefaultInstance(C66468m.class, mVar);
    }

    private C66468m() {
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
                return newMessageInfo(f180737e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C66465j.class});
            case 3:
                return new C66468m();
            case 4:
                return new C66463h();
            case 5:
                return f180737e;
            case 6:
                C63010eb ebVar = f180738f;
                if (ebVar == null) {
                    synchronized (C66468m.class) {
                        ebVar = f180738f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180737e);
                            f180738f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
