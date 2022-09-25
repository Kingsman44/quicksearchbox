package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ha */
/* compiled from: PG */
public final class C50005ha extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50005ha f129994d;

    /* renamed from: e */
    private static volatile C63010eb f129995e;

    /* renamed from: a */
    public int f129996a;

    /* renamed from: b */
    public String f129997b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f129998c = emptyProtobufList();

    static {
        C50005ha haVar = new C50005ha();
        f129994d = haVar;
        C62942bv.registerDefaultInstance(C50005ha.class, haVar);
    }

    private C50005ha() {
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
                return newMessageInfo(f129994d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"a", C45240c.f118157a, C50003gz.class, "b"});
            case 3:
                return new C50005ha();
            case 4:
                return new C50001gx();
            case 5:
                return f129994d;
            case 6:
                C63010eb ebVar = f129995e;
                if (ebVar == null) {
                    synchronized (C50005ha.class) {
                        ebVar = f129995e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129994d);
                            f129995e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
