package com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88474x;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.C97016d;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7586b.C96994l;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57438di;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.c.t */
/* compiled from: PG */
public final class C97015t extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C97015t f271114l;

    /* renamed from: m */
    public static final C62940bt f271115m;

    /* renamed from: o */
    private static volatile C63010eb f271116o;

    /* renamed from: a */
    public int f271117a;

    /* renamed from: b */
    public C57438di f271118b;

    /* renamed from: c */
    public C57438di f271119c;

    /* renamed from: d */
    public C63088z f271120d = C63088z.f170246b;

    /* renamed from: e */
    public C63088z f271121e = C63088z.f170246b;

    /* renamed from: f */
    public C96994l f271122f;

    /* renamed from: g */
    public boolean f271123g;

    /* renamed from: h */
    public C97014s f271124h;

    /* renamed from: i */
    public String f271125i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f271126j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public C97016d f271127k;

    /* renamed from: n */
    private byte f271128n = 2;

    static {
        C97015t tVar = new C97015t();
        f271114l = tVar;
        C62942bv.registerDefaultInstance(C97015t.class, tVar);
        f271115m = C62942bv.newSingularGeneratedExtension(C88474x.f239172h, tVar, tVar, (C62958ce) null, 208781440, C63066gd.MESSAGE, C97015t.class);
    }

    private C97015t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f271128n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f271128n = b;
                return null;
            case 2:
                return newMessageInfo(f271114l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ည\u0002\u0004ဉ\u0004\u0005ဇ\u0005\u0006ဉ\u0006\u0007ဈ\u0007\bဈ\b\tဉ\t\nည\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "e"});
            case 3:
                return new C97015t();
            case 4:
                return new C97010o();
            case 5:
                return f271114l;
            case 6:
                C63010eb ebVar = f271116o;
                if (ebVar == null) {
                    synchronized (C97015t.class) {
                        ebVar = f271116o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271114l);
                            f271116o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
