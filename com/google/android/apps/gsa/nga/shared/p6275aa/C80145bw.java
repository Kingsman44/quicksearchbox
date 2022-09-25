package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.bw */
/* compiled from: PG */
public final class C80145bw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80145bw f219932c;

    /* renamed from: d */
    private static volatile C63010eb f219933d;

    /* renamed from: a */
    public int f219934a;

    /* renamed from: b */
    public C52091ex f219935b;

    static {
        C80145bw bwVar = new C80145bw();
        f219932c = bwVar;
        C62942bv.registerDefaultInstance(C80145bw.class, bwVar);
    }

    private C80145bw() {
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
                return newMessageInfo(f219932c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80145bw();
            case 4:
                return new C80144bv();
            case 5:
                return f219932c;
            case 6:
                C63010eb ebVar = f219933d;
                if (ebVar == null) {
                    synchronized (C80145bw.class) {
                        ebVar = f219933d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219932c);
                            f219933d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
