package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.xo */
/* compiled from: PG */
public final class C50451xo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50451xo f131302c;

    /* renamed from: e */
    private static volatile C63010eb f131303e;

    /* renamed from: a */
    public String f131304a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C50453xq f131305b;

    /* renamed from: d */
    private int f131306d;

    static {
        C50451xo xoVar = new C50451xo();
        f131302c = xoVar;
        C62942bv.registerDefaultInstance(C50451xo.class, xoVar);
    }

    private C50451xo() {
        emptyProtobufList();
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
                return newMessageInfo(f131302c, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0000\u0003ဈ\u0000\u0005ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C50451xo();
            case 4:
                return new C50450xn();
            case 5:
                return f131302c;
            case 6:
                C63010eb ebVar = f131303e;
                if (ebVar == null) {
                    synchronized (C50451xo.class) {
                        ebVar = f131303e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131302c);
                            f131303e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
