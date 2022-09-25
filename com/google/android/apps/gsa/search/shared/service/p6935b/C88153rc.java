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
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.rc */
/* compiled from: PG */
public final class C88153rc extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C88153rc f238294j;

    /* renamed from: k */
    public static final C62940bt f238295k;

    /* renamed from: l */
    private static volatile C63010eb f238296l;

    /* renamed from: a */
    public int f238297a;

    /* renamed from: b */
    public String f238298b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f238299c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f238300d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f238301e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f238302f;

    /* renamed from: g */
    public long f238303g;

    /* renamed from: h */
    public boolean f238304h;

    /* renamed from: i */
    public C88148qy f238305i;

    static {
        C88153rc rcVar = new C88153rc();
        f238294j = rcVar;
        C62942bv.registerDefaultInstance(C88153rc.class, rcVar);
        f238295k = C62942bv.newSingularGeneratedExtension(C87741bw.f237477c, rcVar, rcVar, (C62958ce) null, 183270912, C63066gd.MESSAGE, C88153rc.class);
    }

    private C88153rc() {
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
                return newMessageInfo(f238294j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004ဌ\u0004\u0005ဂ\u0005\u0006ဇ\u0006\u0007ဉ\u0007\bဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, C87394b.f235982a, C30325g.f82003a, C19618h.f54585a, "i", "d"});
            case 3:
                return new C88153rc();
            case 4:
                return new C88152rb();
            case 5:
                return f238294j;
            case 6:
                C63010eb ebVar = f238296l;
                if (ebVar == null) {
                    synchronized (C88153rc.class) {
                        ebVar = f238296l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238294j);
                            f238296l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
