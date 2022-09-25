package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.sf */
/* compiled from: PG */
public final class C50307sf extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50307sf f130929e;

    /* renamed from: f */
    private static volatile C63010eb f130930f;

    /* renamed from: a */
    public int f130931a;

    /* renamed from: b */
    public C62971cq f130932b = emptyProtobufList();

    /* renamed from: c */
    public String f130933c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C50296rv f130934d;

    static {
        C50307sf sfVar = new C50307sf();
        f130929e = sfVar;
        C62942bv.registerDefaultInstance(C50307sf.class, sfVar);
    }

    private C50307sf() {
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
                return newMessageInfo(f130929e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0004ဉ\u0002", new Object[]{"a", "b", C50305sd.class, C45240c.f118157a, "d"});
            case 3:
                return new C50307sf();
            case 4:
                return new C50306se();
            case 5:
                return f130929e;
            case 6:
                C63010eb ebVar = f130930f;
                if (ebVar == null) {
                    synchronized (C50307sf.class) {
                        ebVar = f130930f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130929e);
                            f130930f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
