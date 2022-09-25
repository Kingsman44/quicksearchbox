package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ahy */
/* compiled from: PG */
public final class ahy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final ahy f129350c;

    /* renamed from: e */
    private static volatile C63010eb f129351e;

    /* renamed from: a */
    public String f129352a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f129353b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f129354d;

    static {
        ahy ahy = new ahy();
        f129350c = ahy;
        C62942bv.registerDefaultInstance(ahy.class, ahy);
    }

    private ahy() {
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
                return newMessageInfo(f129350c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new ahy();
            case 4:
                return new ahx();
            case 5:
                return f129350c;
            case 6:
                C63010eb ebVar = f129351e;
                if (ebVar == null) {
                    synchronized (ahy.class) {
                        ebVar = f129351e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129350c);
                            f129351e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
