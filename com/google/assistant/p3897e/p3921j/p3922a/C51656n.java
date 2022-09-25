package com.google.assistant.p3897e.p3921j.p3922a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.a.n */
/* compiled from: PG */
public final class C51656n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51656n f134597e;

    /* renamed from: f */
    private static volatile C63010eb f134598f;

    /* renamed from: a */
    public int f134599a;

    /* renamed from: b */
    public String f134600b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f134601c = emptyProtobufList();

    /* renamed from: d */
    public boolean f134602d;

    static {
        C51656n nVar = new C51656n();
        f134597e = nVar;
        C62942bv.registerDefaultInstance(C51656n.class, nVar);
    }

    private C51656n() {
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
                return newMessageInfo(f134597e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a, C51655m.class, "d"});
            case 3:
                return new C51656n();
            case 4:
                return new C51649g();
            case 5:
                return f134597e;
            case 6:
                C63010eb ebVar = f134598f;
                if (ebVar == null) {
                    synchronized (C51656n.class) {
                        ebVar = f134598f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134597e);
                            f134598f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
