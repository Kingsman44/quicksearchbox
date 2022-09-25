package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.dq */
/* compiled from: PG */
public final class C53161dq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53161dq f139332c;

    /* renamed from: d */
    private static volatile C63010eb f139333d;

    /* renamed from: a */
    public int f139334a;

    /* renamed from: b */
    public String f139335b = BuildConfig.FLAVOR;

    static {
        C53161dq dqVar = new C53161dq();
        f139332c = dqVar;
        C62942bv.registerDefaultInstance(C53161dq.class, dqVar);
    }

    private C53161dq() {
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
                return newMessageInfo(f139332c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53161dq();
            case 4:
                return new C53160dp();
            case 5:
                return f139332c;
            case 6:
                C63010eb ebVar = f139333d;
                if (ebVar == null) {
                    synchronized (C53161dq.class) {
                        ebVar = f139333d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139332c);
                            f139333d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
