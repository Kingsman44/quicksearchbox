package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.amz */
/* compiled from: PG */
public final class amz extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final amz f135409e;

    /* renamed from: f */
    private static volatile C63010eb f135410f;

    /* renamed from: a */
    public int f135411a;

    /* renamed from: b */
    public int f135412b = 0;

    /* renamed from: c */
    public Object f135413c;

    /* renamed from: d */
    public String f135414d = BuildConfig.FLAVOR;

    static {
        amz amz = new amz();
        f135409e = amz;
        C62942bv.registerDefaultInstance(amz.class, amz);
    }

    private amz() {
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
                return newMessageInfo(f135409e, "\u0001\u0003\u0001\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0004ဈ\u0005\u0005ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", amy.class, "d", amy.class});
            case 3:
                return new amz();
            case 4:
                return new amw();
            case 5:
                return f135409e;
            case 6:
                C63010eb ebVar = f135410f;
                if (ebVar == null) {
                    synchronized (amz.class) {
                        ebVar = f135410f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135409e);
                            f135410f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
