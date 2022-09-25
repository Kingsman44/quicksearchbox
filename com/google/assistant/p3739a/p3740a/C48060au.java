package com.google.assistant.p3739a.p3740a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.au */
/* compiled from: PG */
public final class C48060au extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48060au f124384b;

    /* renamed from: c */
    private static volatile C63010eb f124385c;

    /* renamed from: a */
    public String f124386a = BuildConfig.FLAVOR;

    static {
        C48060au auVar = new C48060au();
        f124384b = auVar;
        C62942bv.registerDefaultInstance(C48060au.class, auVar);
    }

    private C48060au() {
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
                return newMessageInfo(f124384b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C48060au();
            case 4:
                return new C48059at();
            case 5:
                return f124384b;
            case 6:
                C63010eb ebVar = f124385c;
                if (ebVar == null) {
                    synchronized (C48060au.class) {
                        ebVar = f124385c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124384b);
                            f124385c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
