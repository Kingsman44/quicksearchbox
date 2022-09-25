package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.aw.a.a.a.bt */
/* compiled from: PG */
public final class C63933bt extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63933bt f172892d;

    /* renamed from: e */
    public static final C62940bt f172893e;

    /* renamed from: g */
    private static volatile C63010eb f172894g;

    /* renamed from: a */
    public int f172895a;

    /* renamed from: b */
    public C63961y f172896b;

    /* renamed from: c */
    public int f172897c;

    /* renamed from: f */
    private int f172898f;

    static {
        C63933bt btVar = new C63933bt();
        f172892d = btVar;
        C62942bv.registerDefaultInstance(C63933bt.class, btVar);
        f172893e = C62942bv.newSingularGeneratedExtension(C63959w.f172981b, btVar, btVar, (C62958ce) null, 1004, C63066gd.MESSAGE, C63933bt.class);
    }

    private C63933bt() {
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
                return newMessageInfo(f172892d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, C63932bs.m96321b()});
            case 3:
                return new C63933bt();
            case 4:
                return new C63930bq();
            case 5:
                return f172892d;
            case 6:
                C63010eb ebVar = f172894g;
                if (ebVar == null) {
                    synchronized (C63933bt.class) {
                        ebVar = f172894g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172892d);
                            f172894g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
