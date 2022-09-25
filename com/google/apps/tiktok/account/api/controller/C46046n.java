package com.google.apps.tiktok.account.api.controller;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.account.api.controller.n */
/* compiled from: PG */
public final class C46046n extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C46046n f120901j;

    /* renamed from: k */
    private static volatile C63010eb f120902k;

    /* renamed from: a */
    public int f120903a;

    /* renamed from: b */
    public int f120904b;

    /* renamed from: c */
    public int f120905c;

    /* renamed from: d */
    public int f120906d;

    /* renamed from: e */
    public C62971cq f120907e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public boolean f120908f;

    /* renamed from: g */
    public int f120909g;

    /* renamed from: h */
    public boolean f120910h;

    /* renamed from: i */
    public int f120911i;

    static {
        C46046n nVar = new C46046n();
        f120901j = nVar;
        C62942bv.registerDefaultInstance(C46046n.class, nVar);
    }

    private C46046n() {
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
                return newMessageInfo(f120901j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0004\u001a\u0005ဇ\u0003\u0006င\u0004\u0007ဇ\u0005\bင\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", C46044l.f120900a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C46046n();
            case 4:
                return new C46043k();
            case 5:
                return f120901j;
            case 6:
                C63010eb ebVar = f120902k;
                if (ebVar == null) {
                    synchronized (C46046n.class) {
                        ebVar = f120902k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120901j);
                            f120902k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
