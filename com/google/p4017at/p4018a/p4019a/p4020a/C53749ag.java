package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.ag */
/* compiled from: PG */
public final class C53749ag extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C53749ag f141103h;

    /* renamed from: i */
    private static volatile C63010eb f141104i;

    /* renamed from: a */
    public int f141105a;

    /* renamed from: b */
    public int f141106b;

    /* renamed from: c */
    public C53805p f141107c;

    /* renamed from: d */
    public C53753ak f141108d;

    /* renamed from: e */
    public C53780bk f141109e;

    /* renamed from: f */
    public C53782bm f141110f;

    /* renamed from: g */
    public C53784bo f141111g;

    static {
        C53749ag agVar = new C53749ag();
        f141103h = agVar;
        C62942bv.registerDefaultInstance(C53749ag.class, agVar);
    }

    private C53749ag() {
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
                return newMessageInfo(f141103h, "\u0001\u0005\u0000\u0002\n?\u0005\u0000\u0000\u0000\nဉ\u0004\u000bဉ\u0015\u0015ဉ\u00169ဉ\u0017?ဉ+", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C53749ag();
            case 4:
                return new C53748af();
            case 5:
                return f141103h;
            case 6:
                C63010eb ebVar = f141104i;
                if (ebVar == null) {
                    synchronized (C53749ag.class) {
                        ebVar = f141104i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141103h);
                            f141104i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
