package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aku */
/* compiled from: PG */
public final class aku extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final aku f135290b;

    /* renamed from: d */
    private static volatile C63010eb f135291d;

    /* renamed from: a */
    public alb f135292a;

    /* renamed from: c */
    private int f135293c;

    static {
        aku aku = new aku();
        f135290b = aku;
        C62942bv.registerDefaultInstance(aku.class, aku);
    }

    private aku() {
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
                return newMessageInfo(f135290b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new aku();
            case 4:
                return new akt();
            case 5:
                return f135290b;
            case 6:
                C63010eb ebVar = f135291d;
                if (ebVar == null) {
                    synchronized (aku.class) {
                        ebVar = f135291d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135290b);
                            f135291d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
