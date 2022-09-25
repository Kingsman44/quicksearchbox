package com.google.protos.p4798af;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4672c.p4673a.C61835b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.af.h */
/* compiled from: PG */
public final class C63158h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63158h f170539d;

    /* renamed from: f */
    private static volatile C63010eb f170540f;

    /* renamed from: a */
    public int f170541a = 0;

    /* renamed from: b */
    public Object f170542b;

    /* renamed from: c */
    public String f170543c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f170544e;

    static {
        C63158h hVar = new C63158h();
        f170539d = hVar;
        C62942bv.registerDefaultInstance(C63158h.class, hVar);
    }

    private C63158h() {
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
                return newMessageInfo(f170539d, "\u0001\r\u0001\u0001\u0001\r\r\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000\u0003်\u0000\u0004ဵ\u0000\u0005ံ\u0000\u0006ဳ\u0000\u0007ြ\u0000\bဵ\u0000\tံ\u0000\nြ\u0000\u000bဈ\f\fြ\u0000\rျ\u0000", new Object[]{"b", "a", "e", C61835b.class, C63157g.class, C45240c.f118157a, C63154d.class});
            case 3:
                return new C63158h();
            case 4:
                return new C63155e();
            case 5:
                return f170539d;
            case 6:
                C63010eb ebVar = f170540f;
                if (ebVar == null) {
                    synchronized (C63158h.class) {
                        ebVar = f170540f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170539d);
                            f170540f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
