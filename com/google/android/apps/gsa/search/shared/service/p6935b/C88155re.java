package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.p6919a.C87394b;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.re */
/* compiled from: PG */
public final class C88155re extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C88155re f238306i;

    /* renamed from: j */
    public static final C62940bt f238307j;

    /* renamed from: k */
    private static volatile C63010eb f238308k;

    /* renamed from: a */
    public int f238309a;

    /* renamed from: b */
    public String f238310b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f238311c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public int f238312d;

    /* renamed from: e */
    public String f238313e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f238314f;

    /* renamed from: g */
    public long f238315g;

    /* renamed from: h */
    public boolean f238316h;

    static {
        C88155re reVar = new C88155re();
        f238306i = reVar;
        C62942bv.registerDefaultInstance(C88155re.class, reVar);
        f238307j = C62942bv.newSingularGeneratedExtension(C87741bw.f237477c, reVar, reVar, (C62958ce) null, 127715520, C63066gd.MESSAGE, C88155re.class);
    }

    private C88155re() {
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
                return newMessageInfo(f238306i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001\u001a\u0002င\u0001\u0003ဈ\u0000\u0004ဈ\u0003\u0006ဌ\u0004\u0007ဂ\u0005\bဇ\u0006", new Object[]{"a", C45240c.f118157a, "d", "b", "e", C10662f.f35572a, C87394b.f235982a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C88155re();
            case 4:
                return new C88154rd();
            case 5:
                return f238306i;
            case 6:
                C63010eb ebVar = f238308k;
                if (ebVar == null) {
                    synchronized (C88155re.class) {
                        ebVar = f238308k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238306i);
                            f238308k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
