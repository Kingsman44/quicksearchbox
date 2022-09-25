package com.google.android.apps.gsa.nga.shared.p6339f.p6342c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51718bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.c.h */
/* compiled from: PG */
public final class C81050h extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C81050h f222144i;

    /* renamed from: j */
    private static volatile C63010eb f222145j;

    /* renamed from: a */
    public int f222146a;

    /* renamed from: b */
    public String f222147b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f222148c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f222149d;

    /* renamed from: e */
    public int f222150e;

    /* renamed from: f */
    public C51718bp f222151f;

    /* renamed from: g */
    public boolean f222152g;

    /* renamed from: h */
    public String f222153h = BuildConfig.FLAVOR;

    static {
        C81050h hVar = new C81050h();
        f222144i = hVar;
        C62942bv.registerDefaultInstance(C81050h.class, hVar);
    }

    private C81050h() {
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
                return newMessageInfo(f222144i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004\u0007ဇ\u0005\bဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C81050h();
            case 4:
                return new C81049g();
            case 5:
                return f222144i;
            case 6:
                C63010eb ebVar = f222145j;
                if (ebVar == null) {
                    synchronized (C81050h.class) {
                        ebVar = f222145j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222144i);
                            f222145j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
