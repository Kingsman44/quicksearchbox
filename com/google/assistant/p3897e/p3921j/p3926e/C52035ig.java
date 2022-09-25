package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.ig */
/* compiled from: PG */
public final class C52035ig extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52035ig f136568e;

    /* renamed from: f */
    private static volatile C63010eb f136569f;

    /* renamed from: a */
    public int f136570a;

    /* renamed from: b */
    public int f136571b = 0;

    /* renamed from: c */
    public Object f136572c;

    /* renamed from: d */
    public String f136573d = BuildConfig.FLAVOR;

    static {
        C52035ig igVar = new C52035ig();
        f136568e = igVar;
        C62942bv.registerDefaultInstance(C52035ig.class, igVar);
    }

    private C52035ig() {
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
                return newMessageInfo(f136568e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003ျ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d"});
            case 3:
                return new C52035ig();
            case 4:
                return new C52034if();
            case 5:
                return f136568e;
            case 6:
                C63010eb ebVar = f136569f;
                if (ebVar == null) {
                    synchronized (C52035ig.class) {
                        ebVar = f136569f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136568e);
                            f136569f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
