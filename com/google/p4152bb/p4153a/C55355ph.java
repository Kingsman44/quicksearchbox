package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.ph */
/* compiled from: PG */
public final class C55355ph extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C55355ph f145852e;

    /* renamed from: f */
    public static final C62940bt f145853f;

    /* renamed from: h */
    private static volatile C63010eb f145854h;

    /* renamed from: a */
    public int f145855a;

    /* renamed from: b */
    public String f145856b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f145857c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f145858d;

    /* renamed from: g */
    private byte f145859g = 2;

    static {
        C55355ph phVar = new C55355ph();
        f145852e = phVar;
        C62942bv.registerDefaultInstance(C55355ph.class, phVar);
        f145853f = C62942bv.newSingularGeneratedExtension(C55361pn.f145866g, phVar, phVar, (C62958ce) null, 74866383, C63066gd.MESSAGE, C55355ph.class);
    }

    private C55355ph() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145859g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145859g = b;
                return null;
            case 2:
                return newMessageInfo(f145852e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C55355ph();
            case 4:
                return new C55354pg();
            case 5:
                return f145852e;
            case 6:
                C63010eb ebVar = f145854h;
                if (ebVar == null) {
                    synchronized (C55355ph.class) {
                        ebVar = f145854h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145852e);
                            f145854h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
