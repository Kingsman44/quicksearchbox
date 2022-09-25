package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.bi */
/* compiled from: PG */
public final class C49851bi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49851bi f129552c;

    /* renamed from: d */
    private static volatile C63010eb f129553d;

    /* renamed from: a */
    public int f129554a;

    /* renamed from: b */
    public String f129555b = BuildConfig.FLAVOR;

    static {
        C49851bi biVar = new C49851bi();
        f129552c = biVar;
        C62942bv.registerDefaultInstance(C49851bi.class, biVar);
    }

    private C49851bi() {
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
                return newMessageInfo(f129552c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49851bi();
            case 4:
                return new C49850bh();
            case 5:
                return f129552c;
            case 6:
                C63010eb ebVar = f129553d;
                if (ebVar == null) {
                    synchronized (C49851bi.class) {
                        ebVar = f129553d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129552c);
                            f129553d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
