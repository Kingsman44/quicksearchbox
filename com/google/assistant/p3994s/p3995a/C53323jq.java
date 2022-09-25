package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.jq */
/* compiled from: PG */
public final class C53323jq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53323jq f139825c;

    /* renamed from: e */
    private static volatile C63010eb f139826e;

    /* renamed from: a */
    public String f139827a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f139828b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f139829d;

    static {
        C53323jq jqVar = new C53323jq();
        f139825c = jqVar;
        C62942bv.registerDefaultInstance(C53323jq.class, jqVar);
    }

    private C53323jq() {
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
                return newMessageInfo(f139825c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C53323jq();
            case 4:
                return new C53322jp();
            case 5:
                return f139825c;
            case 6:
                C63010eb ebVar = f139826e;
                if (ebVar == null) {
                    synchronized (C53323jq.class) {
                        ebVar = f139826e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139825c);
                            f139826e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
