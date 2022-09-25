package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.abv */
/* compiled from: PG */
public final class abv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final abv f128812c;

    /* renamed from: d */
    private static volatile C63010eb f128813d;

    /* renamed from: a */
    public int f128814a;

    /* renamed from: b */
    public String f128815b = BuildConfig.FLAVOR;

    static {
        abv abv = new abv();
        f128812c = abv;
        C62942bv.registerDefaultInstance(abv.class, abv);
    }

    private abv() {
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
                return newMessageInfo(f128812c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new abv();
            case 4:
                return new abu();
            case 5:
                return f128812c;
            case 6:
                C63010eb ebVar = f128813d;
                if (ebVar == null) {
                    synchronized (abv.class) {
                        ebVar = f128813d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128812c);
                            f128813d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
