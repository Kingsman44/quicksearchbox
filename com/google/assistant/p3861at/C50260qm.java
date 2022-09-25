package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.qm */
/* compiled from: PG */
public final class C50260qm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50260qm f130697e;

    /* renamed from: f */
    private static volatile C63010eb f130698f;

    /* renamed from: a */
    public int f130699a;

    /* renamed from: b */
    public String f130700b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f130701c = emptyProtobufList();

    /* renamed from: d */
    public C50279re f130702d;

    static {
        C50260qm qmVar = new C50260qm();
        f130697e = qmVar;
        C62942bv.registerDefaultInstance(C50260qm.class, qmVar);
    }

    private C50260qm() {
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
                return newMessageInfo(f130697e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a, C50264qq.class, "d"});
            case 3:
                return new C50260qm();
            case 4:
                return new C50259ql();
            case 5:
                return f130697e;
            case 6:
                C63010eb ebVar = f130698f;
                if (ebVar == null) {
                    synchronized (C50260qm.class) {
                        ebVar = f130698f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130697e);
                            f130698f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
