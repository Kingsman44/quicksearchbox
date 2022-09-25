package com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.a.a.l */
/* compiled from: PG */
public final class C79890l extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C79890l f218968e;

    /* renamed from: g */
    private static volatile C63010eb f218969g;

    /* renamed from: a */
    public int f218970a;

    /* renamed from: b */
    public String f218971b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public float f218972c;

    /* renamed from: d */
    public float f218973d;

    /* renamed from: f */
    private byte f218974f = 2;

    static {
        C79890l lVar = new C79890l();
        f218968e = lVar;
        C62942bv.registerDefaultInstance(C79890l.class, lVar);
    }

    private C79890l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f218974f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f218974f = b;
                return null;
            case 2:
                return newMessageInfo(f218968e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0004ခ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C79890l();
            case 4:
                return new C79889k();
            case 5:
                return f218968e;
            case 6:
                C63010eb ebVar = f218969g;
                if (ebVar == null) {
                    synchronized (C79890l.class) {
                        ebVar = f218969g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f218968e);
                            f218969g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
