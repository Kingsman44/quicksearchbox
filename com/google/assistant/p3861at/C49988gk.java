package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.gk */
/* compiled from: PG */
public final class C49988gk extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49988gk f129941e;

    /* renamed from: f */
    private static volatile C63010eb f129942f;

    /* renamed from: a */
    public int f129943a;

    /* renamed from: b */
    public int f129944b = 0;

    /* renamed from: c */
    public Object f129945c;

    /* renamed from: d */
    public boolean f129946d;

    static {
        C49988gk gkVar = new C49988gk();
        f129941e = gkVar;
        C62942bv.registerDefaultInstance(C49988gk.class, gkVar);
    }

    private C49988gk() {
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
                return newMessageInfo(f129941e, "\u0001\u0005\u0001\u0001\u0002\u0007\u0005\u0000\u0000\u0000\u0002ြ\u0000\u0003ြ\u0000\u0005ြ\u0000\u0006ဇ\u0004\u0007ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", C49967fq.class, C49969fs.class, C49965fo.class, "d", C49990gm.class});
            case 3:
                return new C49988gk();
            case 4:
                return new C49987gj();
            case 5:
                return f129941e;
            case 6:
                C63010eb ebVar = f129942f;
                if (ebVar == null) {
                    synchronized (C49988gk.class) {
                        ebVar = f129942f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129941e);
                            f129942f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
