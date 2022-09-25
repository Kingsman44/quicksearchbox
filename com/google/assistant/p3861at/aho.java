package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aho */
/* compiled from: PG */
public final class aho extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aho f129321c;

    /* renamed from: e */
    private static volatile C63010eb f129322e;

    /* renamed from: a */
    public String f129323a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public long f129324b;

    /* renamed from: d */
    private int f129325d;

    static {
        aho aho = new aho();
        f129321c = aho;
        C62942bv.registerDefaultInstance(aho.class, aho);
    }

    private aho() {
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
                return newMessageInfo(f129321c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new aho();
            case 4:
                return new ahn();
            case 5:
                return f129321c;
            case 6:
                C63010eb ebVar = f129322e;
                if (ebVar == null) {
                    synchronized (aho.class) {
                        ebVar = f129322e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129321c);
                            f129322e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
