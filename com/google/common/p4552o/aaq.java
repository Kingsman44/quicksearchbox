package com.google.common.p4552o;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aaq */
/* compiled from: PG */
public final class aaq extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final aaq f158137g;

    /* renamed from: h */
    private static volatile C63010eb f158138h;

    /* renamed from: a */
    public int f158139a;

    /* renamed from: b */
    public long f158140b;

    /* renamed from: c */
    public long f158141c;

    /* renamed from: d */
    public long f158142d;

    /* renamed from: e */
    public long f158143e;

    /* renamed from: f */
    public long f158144f;

    static {
        aaq aaq = new aaq();
        f158137g = aaq;
        C62942bv.registerDefaultInstance(aaq.class, aaq);
    }

    private aaq() {
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
                return newMessageInfo(f158137g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new aaq();
            case 4:
                return new aap();
            case 5:
                return f158137g;
            case 6:
                C63010eb ebVar = f158138h;
                if (ebVar == null) {
                    synchronized (aaq.class) {
                        ebVar = f158138h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158137g);
                            f158138h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
