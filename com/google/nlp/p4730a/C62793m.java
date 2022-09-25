package com.google.nlp.p4730a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.m */
/* compiled from: PG */
public final class C62793m extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C62793m f169568a;

    /* renamed from: e */
    private static volatile C63010eb f169569e;

    /* renamed from: b */
    private int f169570b;

    /* renamed from: c */
    private String f169571c = BuildConfig.FLAVOR;

    /* renamed from: d */
    private byte f169572d = 2;

    static {
        C62793m mVar = new C62793m();
        f169568a = mVar;
        C62942bv.registerDefaultInstance(C62793m.class, mVar);
    }

    private C62793m() {
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169572d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169572d = b;
                return null;
            case 2:
                return newMessageInfo(f169568a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C62793m();
            case 4:
                return new C62792l();
            case 5:
                return f169568a;
            case 6:
                C63010eb ebVar = f169569e;
                if (ebVar == null) {
                    synchronized (C62793m.class) {
                        ebVar = f169569e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169568a);
                            f169569e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
