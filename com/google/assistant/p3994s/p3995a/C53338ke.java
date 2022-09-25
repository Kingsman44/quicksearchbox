package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ke */
/* compiled from: PG */
public final class C53338ke extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53338ke f139964c;

    /* renamed from: e */
    private static volatile C63010eb f139965e;

    /* renamed from: a */
    public String f139966a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f139967b = emptyProtobufList();

    /* renamed from: d */
    private int f139968d;

    static {
        C53338ke keVar = new C53338ke();
        f139964c = keVar;
        C62942bv.registerDefaultInstance(C53338ke.class, keVar);
    }

    private C53338ke() {
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
                return newMessageInfo(f139964c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C53337kd.class});
            case 3:
                return new C53338ke();
            case 4:
                return new C53335kb();
            case 5:
                return f139964c;
            case 6:
                C63010eb ebVar = f139965e;
                if (ebVar == null) {
                    synchronized (C53338ke.class) {
                        ebVar = f139965e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139964c);
                            f139965e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
