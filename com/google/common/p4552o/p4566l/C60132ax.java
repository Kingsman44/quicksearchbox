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

/* renamed from: com.google.common.o.l.ax */
/* compiled from: PG */
public final class C60132ax extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C60132ax f162652j;

    /* renamed from: k */
    private static volatile C63010eb f162653k;

    /* renamed from: a */
    public int f162654a;

    /* renamed from: b */
    public int f162655b;

    /* renamed from: c */
    public String f162656c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f162657d;

    /* renamed from: e */
    public String f162658e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f162659f;

    /* renamed from: g */
    public long f162660g;

    /* renamed from: h */
    public long f162661h;

    /* renamed from: i */
    public String f162662i = BuildConfig.FLAVOR;

    static {
        C60132ax axVar = new C60132ax();
        f162652j = axVar;
        C62942bv.registerDefaultInstance(C60132ax.class, axVar);
    }

    private C60132ax() {
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
                return newMessageInfo(f162652j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\bဂ\u0007\tဈ\b", new Object[]{"a", "b", C60181cs.f162810a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C60132ax();
            case 4:
                return new C60131aw();
            case 5:
                return f162652j;
            case 6:
                C63010eb ebVar = f162653k;
                if (ebVar == null) {
                    synchronized (C60132ax.class) {
                        ebVar = f162653k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162652j);
                            f162653k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
