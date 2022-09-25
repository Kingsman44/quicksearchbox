package com.google.android.apps.gsa.nga.shared.p6364s3.p6365a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.a.q */
/* compiled from: PG */
public final class C81482q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C81482q f222910d;

    /* renamed from: e */
    private static volatile C63010eb f222911e;

    /* renamed from: a */
    public int f222912a;

    /* renamed from: b */
    public String f222913b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62961ch f222914c = emptyIntList();

    static {
        C81482q qVar = new C81482q();
        f222910d = qVar;
        C62942bv.registerDefaultInstance(C81482q.class, qVar);
    }

    private C81482q() {
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
                return newMessageInfo(f222910d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0004'", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C81482q();
            case 4:
                return new C81480o();
            case 5:
                return f222910d;
            case 6:
                C63010eb ebVar = f222911e;
                if (ebVar == null) {
                    synchronized (C81482q.class) {
                        ebVar = f222911e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222910d);
                            f222911e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
