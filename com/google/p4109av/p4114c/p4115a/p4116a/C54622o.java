package com.google.p4109av.p4114c.p4115a.p4116a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.av.c.a.a.o */
/* compiled from: PG */
public final class C54622o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54622o f143400c;

    /* renamed from: d */
    private static volatile C63010eb f143401d;

    /* renamed from: a */
    public int f143402a;

    /* renamed from: b */
    public String f143403b = BuildConfig.FLAVOR;

    static {
        C54622o oVar = new C54622o();
        f143400c = oVar;
        C62942bv.registerDefaultInstance(C54622o.class, oVar);
    }

    private C54622o() {
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
                return newMessageInfo(f143400c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C54622o();
            case 4:
                return new C54621n();
            case 5:
                return f143400c;
            case 6:
                C63010eb ebVar = f143401d;
                if (ebVar == null) {
                    synchronized (C54622o.class) {
                        ebVar = f143401d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143400c);
                            f143401d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
