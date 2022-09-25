package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.p3926e.C52016ho;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.gs */
/* compiled from: PG */
public final class C53244gs extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C53244gs f139553j;

    /* renamed from: k */
    private static volatile C63010eb f139554k;

    /* renamed from: a */
    public int f139555a;

    /* renamed from: b */
    public String f139556b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f139557c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f139558d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f139559e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f139560f;

    /* renamed from: g */
    public String f139561g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f139562h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f139563i;

    static {
        C53244gs gsVar = new C53244gs();
        f139553j = gsVar;
        C62942bv.registerDefaultInstance(C53244gs.class, gsVar);
    }

    private C53244gs() {
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
                return newMessageInfo(f139553j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0005\u0006ဈ\u0006\u0007ဌ\u0007\bဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, C19618h.f54585a, "i", C52016ho.f136522a, C10662f.f35572a, C53236gk.m86794b()});
            case 3:
                return new C53244gs();
            case 4:
                return new C53243gr();
            case 5:
                return f139553j;
            case 6:
                C63010eb ebVar = f139554k;
                if (ebVar == null) {
                    synchronized (C53244gs.class) {
                        ebVar = f139554k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139553j);
                            f139554k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
