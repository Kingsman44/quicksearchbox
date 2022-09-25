package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.cj */
/* compiled from: PG */
public final class C98416cj extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C98416cj f274753f;

    /* renamed from: g */
    private static volatile C63010eb f274754g;

    /* renamed from: a */
    public int f274755a;

    /* renamed from: b */
    public int f274756b;

    /* renamed from: c */
    public int f274757c;

    /* renamed from: d */
    public C62961ch f274758d = emptyIntList();

    /* renamed from: e */
    public C62971cq f274759e = emptyProtobufList();

    static {
        C98416cj cjVar = new C98416cj();
        f274753f = cjVar;
        C62942bv.registerDefaultInstance(C98416cj.class, cjVar);
    }

    private C98416cj() {
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
                return newMessageInfo(f274753f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003\u0016\u0004\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C98398bs.class});
            case 3:
                return new C98416cj();
            case 4:
                return new C98415ci();
            case 5:
                return f274753f;
            case 6:
                C63010eb ebVar = f274754g;
                if (ebVar == null) {
                    synchronized (C98416cj.class) {
                        ebVar = f274754g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f274753f);
                            f274754g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
