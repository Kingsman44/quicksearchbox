package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.t */
/* compiled from: PG */
public final class C13707t extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C13707t f41806h;

    /* renamed from: i */
    private static volatile C63010eb f41807i;

    /* renamed from: a */
    public int f41808a;

    /* renamed from: b */
    public int f41809b = 0;

    /* renamed from: c */
    public Object f41810c;

    /* renamed from: d */
    public String f41811d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f41812e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f41813f;

    /* renamed from: g */
    public int f41814g;

    static {
        C13707t tVar = new C13707t();
        f41806h = tVar;
        C62942bv.registerDefaultInstance(C13707t.class, tVar);
    }

    private C13707t() {
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
                return newMessageInfo(f41806h, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002\f\u0003<\u0000\u0004<\u0000\u0005ဇ\u0002\u0006ለ\u0001", new Object[]{C45240c.f118157a, "b", "a", "d", C30325g.f82003a, C13699l.class, C13695h.class, C10662f.f35572a, "e"});
            case 3:
                return new C13707t();
            case 4:
                return new C13706s();
            case 5:
                return f41806h;
            case 6:
                C63010eb ebVar = f41807i;
                if (ebVar == null) {
                    synchronized (C13707t.class) {
                        ebVar = f41807i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41806h);
                            f41807i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
