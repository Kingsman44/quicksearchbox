package com.google.p4017at.p4060h.p4073d.p4074a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4567m.C60256c;
import com.google.common.p4552o.p4567m.C60259f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.d.a.b */
/* compiled from: PG */
public final class C54238b extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C54238b f142399i;

    /* renamed from: j */
    private static volatile C63010eb f142400j;

    /* renamed from: a */
    public int f142401a;

    /* renamed from: b */
    public String f142402b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f142403c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f142404d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f142405e;

    /* renamed from: f */
    public String f142406f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C60259f f142407g;

    /* renamed from: h */
    public String f142408h = BuildConfig.FLAVOR;

    static {
        C54238b bVar = new C54238b();
        f142399i = bVar;
        C62942bv.registerDefaultInstance(C54238b.class, bVar);
    }

    private C54238b() {
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
                return newMessageInfo(f142399i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C60256c.f163032a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C54238b();
            case 4:
                return new C54211a();
            case 5:
                return f142399i;
            case 6:
                C63010eb ebVar = f142400j;
                if (ebVar == null) {
                    synchronized (C54238b.class) {
                        ebVar = f142400j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142399i);
                            f142400j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
