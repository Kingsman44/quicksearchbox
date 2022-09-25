package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4129b.p4134b.p4135a.C54742b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.tf */
/* compiled from: PG */
public final class C50334tf extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50334tf f130998e;

    /* renamed from: f */
    private static volatile C63010eb f130999f;

    /* renamed from: a */
    public int f131000a;

    /* renamed from: b */
    public long f131001b;

    /* renamed from: c */
    public C54742b f131002c;

    /* renamed from: d */
    public long f131003d;

    static {
        C50334tf tfVar = new C50334tf();
        f130998e = tfVar;
        C62942bv.registerDefaultInstance(C50334tf.class, tfVar);
    }

    private C50334tf() {
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
                return newMessageInfo(f130998e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50334tf();
            case 4:
                return new C50333te();
            case 5:
                return f130998e;
            case 6:
                C63010eb ebVar = f130999f;
                if (ebVar == null) {
                    synchronized (C50334tf.class) {
                        ebVar = f130999f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130998e);
                            f130999f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
