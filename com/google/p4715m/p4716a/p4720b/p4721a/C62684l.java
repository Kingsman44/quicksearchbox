package com.google.p4715m.p4716a.p4720b.p4721a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.m.a.b.a.l */
/* compiled from: PG */
public final class C62684l extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C62684l f169235h;

    /* renamed from: i */
    private static volatile C63010eb f169236i;

    /* renamed from: a */
    public int f169237a;

    /* renamed from: b */
    public int f169238b;

    /* renamed from: c */
    public int f169239c;

    /* renamed from: d */
    public C62692t f169240d;

    /* renamed from: e */
    public boolean f169241e;

    /* renamed from: f */
    public int f169242f;

    /* renamed from: g */
    public boolean f169243g;

    static {
        C62684l lVar = new C62684l();
        f169235h = lVar;
        C62942bv.registerDefaultInstance(C62684l.class, lVar);
    }

    private C62684l() {
        emptyProtobufList();
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
                return newMessageInfo(f169235h, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0000\u0001င\u0001\u0002င\u0002\u0006ဉ\u0005\u0007ဇ\u0006\nင\u0007\u000bဇ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C62684l();
            case 4:
                return new C62683k();
            case 5:
                return f169235h;
            case 6:
                C63010eb ebVar = f169236i;
                if (ebVar == null) {
                    synchronized (C62684l.class) {
                        ebVar = f169236i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169235h);
                            f169236i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
