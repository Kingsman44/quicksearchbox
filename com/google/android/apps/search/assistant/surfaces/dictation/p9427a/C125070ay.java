package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.ay */
/* compiled from: PG */
public final class C125070ay extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C125070ay f345047b;

    /* renamed from: c */
    private static volatile C63010eb f345048c;

    /* renamed from: a */
    public String f345049a = BuildConfig.FLAVOR;

    static {
        C125070ay ayVar = new C125070ay();
        f345047b = ayVar;
        C62942bv.registerDefaultInstance(C125070ay.class, ayVar);
    }

    private C125070ay() {
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
                return newMessageInfo(f345047b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C125070ay();
            case 4:
                return new C125069ax();
            case 5:
                return f345047b;
            case 6:
                C63010eb ebVar = f345048c;
                if (ebVar == null) {
                    synchronized (C125070ay.class) {
                        ebVar = f345048c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345047b);
                            f345048c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
