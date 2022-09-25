package com.google.p4283bv.p4345d.p4350b.p4351a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4283bv.p4354e.p4356b.p4357a.C57054b;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58131b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.a.f */
/* compiled from: PG */
public final class C56970f extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C56970f f152060o;

    /* renamed from: p */
    private static volatile C63010eb f152061p;

    /* renamed from: a */
    public int f152062a;

    /* renamed from: b */
    public String f152063b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f152064c;

    /* renamed from: d */
    public String f152065d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f152066e;

    /* renamed from: f */
    public int f152067f;

    /* renamed from: g */
    public boolean f152068g;

    /* renamed from: h */
    public boolean f152069h;

    /* renamed from: i */
    public boolean f152070i;

    /* renamed from: j */
    public C58131b f152071j;

    /* renamed from: k */
    public boolean f152072k;

    /* renamed from: l */
    public long f152073l;

    /* renamed from: m */
    public boolean f152074m;

    /* renamed from: n */
    public boolean f152075n;

    static {
        C56970f fVar = new C56970f();
        f152060o = fVar;
        C62942bv.registerDefaultInstance(C56970f.class, fVar);
    }

    private C56970f() {
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
                return newMessageInfo(f152060o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဌ\u0004\u0004ဇ\u0005\u0005ဇ\u0006\u0006ဈ\u0002\bဉ\t\tဇ\b\nဇ\u0003\u000bဇ\n\fဂ\u000b\rဇ\f\u000eဇ\r", new Object[]{"a", "b", C45240c.f118157a, C10662f.f35572a, C57054b.f152309a, C30325g.f82003a, C19618h.f54585a, "d", "j", "i", "e", C19621k.f54601a, "l", "m", C48004n.f124238a});
            case 3:
                return new C56970f();
            case 4:
                return new C56969e();
            case 5:
                return f152060o;
            case 6:
                C63010eb ebVar = f152061p;
                if (ebVar == null) {
                    synchronized (C56970f.class) {
                        ebVar = f152061p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152060o);
                            f152061p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
