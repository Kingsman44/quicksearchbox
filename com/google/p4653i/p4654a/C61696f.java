package com.google.p4653i.p4654a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.f */
/* compiled from: PG */
public final class C61696f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C61696f f166678d;

    /* renamed from: e */
    private static volatile C63010eb f166679e;

    /* renamed from: a */
    public int f166680a;

    /* renamed from: b */
    public String f166681b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f166682c;

    static {
        C61696f fVar = new C61696f();
        f166678d = fVar;
        C62942bv.registerDefaultInstance(C61696f.class, fVar);
    }

    private C61696f() {
        C62942bv.emptyProtobufList();
        this.f166682c = BuildConfig.FLAVOR;
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
                return newMessageInfo(f166678d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C61696f();
            case 4:
                return new C61695e();
            case 5:
                return f166678d;
            case 6:
                C63010eb ebVar = f166679e;
                if (ebVar == null) {
                    synchronized (C61696f.class) {
                        ebVar = f166679e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166678d);
                            f166679e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
