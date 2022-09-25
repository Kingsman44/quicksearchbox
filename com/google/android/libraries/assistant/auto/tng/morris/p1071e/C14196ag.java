package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ag */
/* compiled from: PG */
public final class C14196ag extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14196ag f42973b;

    /* renamed from: c */
    private static volatile C63010eb f42974c;

    /* renamed from: a */
    public String f42975a = BuildConfig.FLAVOR;

    static {
        C14196ag agVar = new C14196ag();
        f42973b = agVar;
        C62942bv.registerDefaultInstance(C14196ag.class, agVar);
    }

    private C14196ag() {
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
                return newMessageInfo(f42973b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C14196ag();
            case 4:
                return new C14195af();
            case 5:
                return f42973b;
            case 6:
                C63010eb ebVar = f42974c;
                if (ebVar == null) {
                    synchronized (C14196ag.class) {
                        ebVar = f42974c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42973b);
                            f42974c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
