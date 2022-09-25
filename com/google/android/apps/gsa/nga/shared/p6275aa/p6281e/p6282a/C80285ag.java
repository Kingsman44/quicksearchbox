package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6284f.C80406b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.ag */
/* compiled from: PG */
public final class C80285ag extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80285ag f220305b;

    /* renamed from: e */
    private static volatile C63010eb f220306e;

    /* renamed from: a */
    public C80406b f220307a;

    /* renamed from: c */
    private int f220308c;

    /* renamed from: d */
    private byte f220309d = 2;

    static {
        C80285ag agVar = new C80285ag();
        f220305b = agVar;
        C62942bv.registerDefaultInstance(C80285ag.class, agVar);
    }

    private C80285ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220309d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220309d = b;
                return null;
            case 2:
                return newMessageInfo(f220305b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C80285ag();
            case 4:
                return new C80284af();
            case 5:
                return f220305b;
            case 6:
                C63010eb ebVar = f220306e;
                if (ebVar == null) {
                    synchronized (C80285ag.class) {
                        ebVar = f220306e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220305b);
                            f220306e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
