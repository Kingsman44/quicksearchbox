package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.zl */
/* compiled from: PG */
public final class C50502zl extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50502zl f131459f;

    /* renamed from: g */
    private static volatile C63010eb f131460g;

    /* renamed from: a */
    public int f131461a;

    /* renamed from: b */
    public C50500zj f131462b;

    /* renamed from: c */
    public C50500zj f131463c;

    /* renamed from: d */
    public C62971cq f131464d = emptyProtobufList();

    /* renamed from: e */
    public String f131465e = BuildConfig.FLAVOR;

    static {
        C50502zl zlVar = new C50502zl();
        f131459f = zlVar;
        C62942bv.registerDefaultInstance(C50502zl.class, zlVar);
    }

    private C50502zl() {
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
                return newMessageInfo(f131459f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C50500zj.class, "e"});
            case 3:
                return new C50502zl();
            case 4:
                return new C50501zk();
            case 5:
                return f131459f;
            case 6:
                C63010eb ebVar = f131460g;
                if (ebVar == null) {
                    synchronized (C50502zl.class) {
                        ebVar = f131460g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131459f);
                            f131460g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
