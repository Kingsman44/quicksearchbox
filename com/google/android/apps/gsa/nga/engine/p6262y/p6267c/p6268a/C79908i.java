package com.google.android.apps.gsa.nga.engine.p6262y.p6267c.p6268a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.c.a.i */
/* compiled from: PG */
public final class C79908i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C79908i f219034b;

    /* renamed from: d */
    private static volatile C63010eb f219035d;

    /* renamed from: a */
    public String f219036a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f219037c;

    static {
        C79908i iVar = new C79908i();
        f219034b = iVar;
        C62942bv.registerDefaultInstance(C79908i.class, iVar);
    }

    private C79908i() {
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
                return newMessageInfo(f219034b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C79908i();
            case 4:
                return new C79907h();
            case 5:
                return f219034b;
            case 6:
                C63010eb ebVar = f219035d;
                if (ebVar == null) {
                    synchronized (C79908i.class) {
                        ebVar = f219035d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219034b);
                            f219035d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
