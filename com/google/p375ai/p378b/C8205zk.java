package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.zk */
/* compiled from: PG */
public final class C8205zk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8205zk f28810c;

    /* renamed from: e */
    private static volatile C63010eb f28811e;

    /* renamed from: a */
    public String f28812a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C8204zj f28813b;

    /* renamed from: d */
    private int f28814d;

    static {
        C8205zk zkVar = new C8205zk();
        f28810c = zkVar;
        C62942bv.registerDefaultInstance(C8205zk.class, zkVar);
    }

    private C8205zk() {
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
                return newMessageInfo(f28810c, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004ဈ\u0003\u0005ဉ\u0004", new Object[]{"d", "a", "b"});
            case 3:
                return new C8205zk();
            case 4:
                return new C8202zh();
            case 5:
                return f28810c;
            case 6:
                C63010eb ebVar = f28811e;
                if (ebVar == null) {
                    synchronized (C8205zk.class) {
                        ebVar = f28811e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28810c);
                            f28811e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
