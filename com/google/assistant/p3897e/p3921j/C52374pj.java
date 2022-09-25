package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.pj */
/* compiled from: PG */
public final class C52374pj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52374pj f137434e;

    /* renamed from: f */
    private static volatile C63010eb f137435f;

    /* renamed from: a */
    public int f137436a;

    /* renamed from: b */
    public int f137437b = 0;

    /* renamed from: c */
    public Object f137438c;

    /* renamed from: d */
    public String f137439d = BuildConfig.FLAVOR;

    static {
        C52374pj pjVar = new C52374pj();
        f137434e = pjVar;
        C62942bv.registerDefaultInstance(C52374pj.class, pjVar);
    }

    private C52374pj() {
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
                return newMessageInfo(f137434e, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000\u0003ျ\u0000\u0004ျ\u0000\u0005ျ\u0000\u0006ျ\u0000\u0007ဈ\b\bျ\u0000\tျ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d"});
            case 3:
                return new C52374pj();
            case 4:
                return new C52373pi();
            case 5:
                return f137434e;
            case 6:
                C63010eb ebVar = f137435f;
                if (ebVar == null) {
                    synchronized (C52374pj.class) {
                        ebVar = f137435f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137434e);
                            f137435f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
