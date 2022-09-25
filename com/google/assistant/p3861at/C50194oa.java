package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.oa */
/* compiled from: PG */
public final class C50194oa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50194oa f130485d;

    /* renamed from: e */
    private static volatile C63010eb f130486e;

    /* renamed from: a */
    public C62971cq f130487a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f130488b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f130489c = emptyProtobufList();

    static {
        C50194oa oaVar = new C50194oa();
        f130485d = oaVar;
        C62942bv.registerDefaultInstance(C50194oa.class, oaVar);
    }

    private C50194oa() {
        emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f130485d, "\u0001\u0003\u0000\u0000\u0001\t\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\t\u001b", new Object[]{"b", C50175ni.class, C45240c.f118157a, C50187nu.class, "a", C50183nq.class});
            case 3:
                return new C50194oa();
            case 4:
                return new C50192nz();
            case 5:
                return f130485d;
            case 6:
                C63010eb ebVar = f130486e;
                if (ebVar == null) {
                    synchronized (C50194oa.class) {
                        ebVar = f130486e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130485d);
                            f130486e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
