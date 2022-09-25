package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
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

/* renamed from: com.google.bb.a.ju */
/* compiled from: PG */
public final class C55206ju extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C55206ju f145303h;

    /* renamed from: i */
    public static final C62940bt f145304i;

    /* renamed from: j */
    private static volatile C63010eb f145305j;

    /* renamed from: a */
    public int f145306a;

    /* renamed from: b */
    public int f145307b;

    /* renamed from: c */
    public int f145308c;

    /* renamed from: d */
    public int f145309d;

    /* renamed from: e */
    public int f145310e;

    /* renamed from: f */
    public String f145311f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f145312g;

    static {
        C55206ju juVar = new C55206ju();
        f145303h = juVar;
        C62942bv.registerDefaultInstance(C55206ju.class, juVar);
        f145304i = C62942bv.newSingularGeneratedExtension(C55240la.f145449k, juVar, juVar, (C62958ce) null, 68201902, C63066gd.MESSAGE, C55206ju.class);
    }

    private C55206ju() {
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
                return newMessageInfo(f145303h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0005င\u0003\bဈ\u0004\tဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C55206ju();
            case 4:
                return new C55205jt();
            case 5:
                return f145303h;
            case 6:
                C63010eb ebVar = f145305j;
                if (ebVar == null) {
                    synchronized (C55206ju.class) {
                        ebVar = f145305j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145303h);
                            f145305j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
