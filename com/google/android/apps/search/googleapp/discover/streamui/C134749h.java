package com.google.android.apps.search.googleapp.discover.streamui;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10310h.C136123d;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4027c.p4028a.p4029a.C53842b;
import com.google.p4283bv.p4354e.C57528m;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57252bg;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.h */
/* compiled from: PG */
public final class C134749h extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C134749h f366906k;

    /* renamed from: m */
    private static volatile C63010eb f366907m;

    /* renamed from: a */
    public int f366908a;

    /* renamed from: b */
    public int f366909b;

    /* renamed from: c */
    public C136123d f366910c;

    /* renamed from: d */
    public C53842b f366911d;

    /* renamed from: e */
    public C57315dp f366912e;

    /* renamed from: f */
    public boolean f366913f;

    /* renamed from: g */
    public C57252bg f366914g;

    /* renamed from: h */
    public int f366915h = 1;

    /* renamed from: i */
    public String f366916i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public int f366917j;

    /* renamed from: l */
    private byte f366918l = 2;

    static {
        C134749h hVar = new C134749h();
        f366906k = hVar;
        C62942bv.registerDefaultInstance(C134749h.class, hVar);
    }

    private C134749h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f366918l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f366918l = b;
                return null;
            case 2:
                return newMessageInfo(f366906k, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0000\u0003\u0001ဌ\u0000\u0005ᐉ\u0001\bᐉ\u0002\nᐉ\u0003\u000bဇ\u0004\rဉ\u0005\u000eဌ\u0006\u000fဈ\u0007\u0010င\b", new Object[]{"a", "b", C57528m.m88370b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C134699b.m218535b(), "i", "j"});
            case 3:
                return new C134749h();
            case 4:
                return new C134747g();
            case 5:
                return f366906k;
            case 6:
                C63010eb ebVar = f366907m;
                if (ebVar == null) {
                    synchronized (C134749h.class) {
                        ebVar = f366907m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366906k);
                            f366907m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
