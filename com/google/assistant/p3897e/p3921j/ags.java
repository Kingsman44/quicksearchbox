package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ags */
/* compiled from: PG */
public final class ags extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final ags f135073d;

    /* renamed from: e */
    private static volatile C63010eb f135074e;

    /* renamed from: a */
    public int f135075a;

    /* renamed from: b */
    public boolean f135076b;

    /* renamed from: c */
    public boolean f135077c;

    static {
        ags ags = new ags();
        f135073d = ags;
        C62942bv.registerDefaultInstance(ags.class, ags);
    }

    private ags() {
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
                return newMessageInfo(f135073d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new ags();
            case 4:
                return new agr();
            case 5:
                return f135073d;
            case 6:
                C63010eb ebVar = f135074e;
                if (ebVar == null) {
                    synchronized (ags.class) {
                        ebVar = f135074e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135073d);
                            f135074e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
