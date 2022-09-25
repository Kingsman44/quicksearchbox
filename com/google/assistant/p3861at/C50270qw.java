package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.qw */
/* compiled from: PG */
public final class C50270qw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50270qw f130726d;

    /* renamed from: f */
    private static volatile C63010eb f130727f;

    /* renamed from: a */
    public String f130728a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f130729b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f130730c = emptyProtobufList();

    /* renamed from: e */
    private int f130731e;

    static {
        C50270qw qwVar = new C50270qw();
        f130726d = qwVar;
        C62942bv.registerDefaultInstance(C50270qw.class, qwVar);
    }

    private C50270qw() {
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
                return newMessageInfo(f130726d, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0007\u001b", new Object[]{"e", "a", C45240c.f118157a, C50272qy.class, "b", C50277rc.class});
            case 3:
                return new C50270qw();
            case 4:
                return new C50269qv();
            case 5:
                return f130726d;
            case 6:
                C63010eb ebVar = f130727f;
                if (ebVar == null) {
                    synchronized (C50270qw.class) {
                        ebVar = f130727f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130726d);
                            f130727f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
