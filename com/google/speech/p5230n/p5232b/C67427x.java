package com.google.speech.p5230n.p5232b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.x */
/* compiled from: PG */
public final class C67427x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67427x f183237a;

    /* renamed from: f */
    private static volatile C63010eb f183238f;

    /* renamed from: b */
    private int f183239b;

    /* renamed from: c */
    private String f183240c = BuildConfig.FLAVOR;

    /* renamed from: d */
    private String f183241d = BuildConfig.FLAVOR;

    /* renamed from: e */
    private byte f183242e = 2;

    static {
        C67427x xVar = new C67427x();
        f183237a = xVar;
        C62942bv.registerDefaultInstance(C67427x.class, xVar);
    }

    private C67427x() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183242e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183242e = b;
                return null;
            case 2:
                return newMessageInfo(f183237a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002ᔈ\u0001\u0003ᔈ\u0002", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C67427x();
            case 4:
                return new C67426w();
            case 5:
                return f183237a;
            case 6:
                C63010eb ebVar = f183238f;
                if (ebVar == null) {
                    synchronized (C67427x.class) {
                        ebVar = f183238f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183237a);
                            f183238f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
