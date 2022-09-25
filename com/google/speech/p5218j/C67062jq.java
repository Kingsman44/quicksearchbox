package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.jq */
/* compiled from: PG */
public final class C67062jq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67062jq f182294b;

    /* renamed from: d */
    private static volatile C63010eb f182295d;

    /* renamed from: a */
    public C66865ck f182296a;

    /* renamed from: c */
    private int f182297c;

    static {
        C67062jq jqVar = new C67062jq();
        f182294b = jqVar;
        C62942bv.registerDefaultInstance(C67062jq.class, jqVar);
    }

    private C67062jq() {
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
                return newMessageInfo(f182294b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C67062jq();
            case 4:
                return new C67061jp();
            case 5:
                return f182294b;
            case 6:
                C63010eb ebVar = f182295d;
                if (ebVar == null) {
                    synchronized (C67062jq.class) {
                        ebVar = f182295d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182294b);
                            f182295d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
