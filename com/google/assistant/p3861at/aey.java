package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aey */
/* compiled from: PG */
public final class aey extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final aey f129137e;

    /* renamed from: f */
    private static volatile C63010eb f129138f;

    /* renamed from: a */
    public int f129139a;

    /* renamed from: b */
    public String f129140b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f129141c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f129142d = 1;

    static {
        aey aey = new aey();
        f129137e = aey;
        C62942bv.registerDefaultInstance(aey.class, aey);
    }

    private aey() {
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
                return newMessageInfo(f129137e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", aex.f129136a});
            case 3:
                return new aey();
            case 4:
                return new aew();
            case 5:
                return f129137e;
            case 6:
                C63010eb ebVar = f129138f;
                if (ebVar == null) {
                    synchronized (aey.class) {
                        ebVar = f129138f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129137e);
                            f129138f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
