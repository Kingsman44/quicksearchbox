package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ahf */
/* compiled from: PG */
public final class ahf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final ahf f129297c;

    /* renamed from: d */
    private static volatile C63010eb f129298d;

    /* renamed from: a */
    public int f129299a;

    /* renamed from: b */
    public String f129300b = BuildConfig.FLAVOR;

    static {
        ahf ahf = new ahf();
        f129297c = ahf;
        C62942bv.registerDefaultInstance(ahf.class, ahf);
    }

    private ahf() {
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
                return newMessageInfo(f129297c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new ahf();
            case 4:
                return new ahe();
            case 5:
                return f129297c;
            case 6:
                C63010eb ebVar = f129298d;
                if (ebVar == null) {
                    synchronized (ahf.class) {
                        ebVar = f129298d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129297c);
                            f129298d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
