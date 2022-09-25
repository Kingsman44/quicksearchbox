package com.google.p5238v.p5239a.p5255j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.dh */
/* compiled from: PG */
public final class C67732dh extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67732dh f183764e;

    /* renamed from: f */
    private static volatile C63010eb f183765f;

    /* renamed from: a */
    public String f183766a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f183767b;

    /* renamed from: c */
    public int f183768c;

    /* renamed from: d */
    public int f183769d;

    static {
        C67732dh dhVar = new C67732dh();
        f183764e = dhVar;
        C62942bv.registerDefaultInstance(C67732dh.class, dhVar);
    }

    private C67732dh() {
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
                return newMessageInfo(f183764e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C67732dh();
            case 4:
                return new C67731dg();
            case 5:
                return f183764e;
            case 6:
                C63010eb ebVar = f183765f;
                if (ebVar == null) {
                    synchronized (C67732dh.class) {
                        ebVar = f183765f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183764e);
                            f183765f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
