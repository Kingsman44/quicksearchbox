package com.google.p4184bj.p4189b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.b.ab */
/* compiled from: PG */
public final class C55882ab extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C55882ab f148700g;

    /* renamed from: h */
    private static volatile C63010eb f148701h;

    /* renamed from: a */
    public int f148702a;

    /* renamed from: b */
    public int f148703b;

    /* renamed from: c */
    public String f148704c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f148705d;

    /* renamed from: e */
    public long f148706e;

    /* renamed from: f */
    public boolean f148707f;

    static {
        C55882ab abVar = new C55882ab();
        f148700g = abVar;
        C62942bv.registerDefaultInstance(C55882ab.class, abVar);
    }

    private C55882ab() {
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
                return newMessageInfo(f148700g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0006ဇ\u0005", new Object[]{"a", "b", C55909z.f148769a, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C55882ab();
            case 4:
                return new C55908y();
            case 5:
                return f148700g;
            case 6:
                C63010eb ebVar = f148701h;
                if (ebVar == null) {
                    synchronized (C55882ab.class) {
                        ebVar = f148701h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148700g);
                            f148701h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
