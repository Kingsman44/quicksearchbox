package com.google.p3728as.p3729a.p3730a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.as.a.a.h */
/* compiled from: PG */
public final class C48028h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48028h f124310c;

    /* renamed from: d */
    private static volatile C63010eb f124311d;

    /* renamed from: a */
    public String f124312a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62910ar f124313b;

    static {
        C48028h hVar = new C48028h();
        f124310c = hVar;
        C62942bv.registerDefaultInstance(C48028h.class, hVar);
    }

    private C48028h() {
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
                return newMessageInfo(f124310c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C48028h();
            case 4:
                return new C48027g();
            case 5:
                return f124310c;
            case 6:
                C63010eb ebVar = f124311d;
                if (ebVar == null) {
                    synchronized (C48028h.class) {
                        ebVar = f124311d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124310c);
                            f124311d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
