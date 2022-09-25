package com.google.assistant.p3897e.p3921j;

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

/* renamed from: com.google.assistant.e.j.fi */
/* compiled from: PG */
public final class C52103fi extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C52103fi f136729i;

    /* renamed from: j */
    private static volatile C63010eb f136730j;

    /* renamed from: a */
    public int f136731a;

    /* renamed from: b */
    public String f136732b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f136733c;

    /* renamed from: d */
    public int f136734d;

    /* renamed from: e */
    public int f136735e;

    /* renamed from: f */
    public String f136736f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f136737g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C52103fi f136738h;

    static {
        C52103fi fiVar = new C52103fi();
        f136729i = fiVar;
        C62942bv.registerDefaultInstance(C52103fi.class, fiVar);
    }

    private C52103fi() {
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
                return newMessageInfo(f136729i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဉ\u0006\u0007ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", C52100ff.f136727a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "d", C52101fg.f136728a});
            case 3:
                return new C52103fi();
            case 4:
                return new C52099fe();
            case 5:
                return f136729i;
            case 6:
                C63010eb ebVar = f136730j;
                if (ebVar == null) {
                    synchronized (C52103fi.class) {
                        ebVar = f136730j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136729i);
                            f136730j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
