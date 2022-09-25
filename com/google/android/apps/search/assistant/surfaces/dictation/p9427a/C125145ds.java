package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.ds */
/* compiled from: PG */
public final class C125145ds extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C125145ds f345225b;

    /* renamed from: c */
    private static volatile C63010eb f345226c;

    /* renamed from: a */
    public String f345227a = BuildConfig.FLAVOR;

    static {
        C125145ds dsVar = new C125145ds();
        f345225b = dsVar;
        C62942bv.registerDefaultInstance(C125145ds.class, dsVar);
    }

    private C125145ds() {
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
                return newMessageInfo(f345225b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C125145ds();
            case 4:
                return new C125144dr();
            case 5:
                return f345225b;
            case 6:
                C63010eb ebVar = f345226c;
                if (ebVar == null) {
                    synchronized (C125145ds.class) {
                        ebVar = f345226c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345225b);
                            f345226c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
