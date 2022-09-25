package com.google.common.p4552o.p4566l;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.bl */
/* compiled from: PG */
public final class C60147bl extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C60147bl f162705h;

    /* renamed from: i */
    private static volatile C63010eb f162706i;

    /* renamed from: a */
    public int f162707a;

    /* renamed from: b */
    public C60126ar f162708b;

    /* renamed from: c */
    public int f162709c;

    /* renamed from: d */
    public long f162710d;

    /* renamed from: e */
    public long f162711e;

    /* renamed from: f */
    public String f162712f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f162713g;

    static {
        C60147bl blVar = new C60147bl();
        f162705h = blVar;
        C62942bv.registerDefaultInstance(C60147bl.class, blVar);
    }

    private C60147bl() {
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
                return newMessageInfo(f162705h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006င\u0005", new Object[]{"a", "b", C45240c.f118157a, C60185cw.f162812a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C60147bl();
            case 4:
                return new C60146bk();
            case 5:
                return f162705h;
            case 6:
                C63010eb ebVar = f162706i;
                if (ebVar == null) {
                    synchronized (C60147bl.class) {
                        ebVar = f162706i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162705h);
                            f162706i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
