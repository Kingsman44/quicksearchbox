package com.google.common.p4552o.p4566l;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.ar */
/* compiled from: PG */
public final class C60126ar extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C60126ar f162612j;

    /* renamed from: k */
    private static volatile C63010eb f162613k;

    /* renamed from: a */
    public int f162614a;

    /* renamed from: b */
    public String f162615b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f162616c;

    /* renamed from: d */
    public String f162617d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f162618e;

    /* renamed from: f */
    public int f162619f;

    /* renamed from: g */
    public boolean f162620g;

    /* renamed from: h */
    public long f162621h;

    /* renamed from: i */
    public String f162622i = BuildConfig.FLAVOR;

    static {
        C60126ar arVar = new C60126ar();
        f162612j = arVar;
        C62942bv.registerDefaultInstance(C60126ar.class, arVar);
    }

    private C60126ar() {
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
                return newMessageInfo(f162612j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0005\u0006ဂ\u0006\u0007ဈ\u0007\bင\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, C19618h.f54585a, "i", C10662f.f35572a});
            case 3:
                return new C60126ar();
            case 4:
                return new C60125aq();
            case 5:
                return f162612j;
            case 6:
                C63010eb ebVar = f162613k;
                if (ebVar == null) {
                    synchronized (C60126ar.class) {
                        ebVar = f162613k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162612j);
                            f162613k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
