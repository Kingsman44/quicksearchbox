package com.google.android.apps.search.googleapp.search.p10415i;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.i.r */
/* compiled from: PG */
public final class C137516r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C137516r f374025c;

    /* renamed from: d */
    private static volatile C63010eb f374026d;

    /* renamed from: a */
    public int f374027a;

    /* renamed from: b */
    public String f374028b = BuildConfig.FLAVOR;

    static {
        C137516r rVar = new C137516r();
        f374025c = rVar;
        C62942bv.registerDefaultInstance(C137516r.class, rVar);
    }

    private C137516r() {
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
                return newMessageInfo(f374025c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C137516r();
            case 4:
                return new C137515q();
            case 5:
                return f374025c;
            case 6:
                C63010eb ebVar = f374026d;
                if (ebVar == null) {
                    synchronized (C137516r.class) {
                        ebVar = f374026d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f374025c);
                            f374026d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
