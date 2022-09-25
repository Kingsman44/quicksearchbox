package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.zd */
/* compiled from: PG */
public final class C60688zd extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C60688zd f164648k;

    /* renamed from: l */
    public static final C62940bt f164649l;

    /* renamed from: m */
    private static volatile C63010eb f164650m;

    /* renamed from: a */
    public int f164651a;

    /* renamed from: b */
    public String f164652b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f164653c;

    /* renamed from: d */
    public String f164654d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f164655e;

    /* renamed from: f */
    public boolean f164656f;

    /* renamed from: g */
    public String f164657g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f164658h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f164659i;

    /* renamed from: j */
    public int f164660j;

    static {
        C60688zd zdVar = new C60688zd();
        f164648k = zdVar;
        C62942bv.registerDefaultInstance(C60688zd.class, zdVar);
        f164649l = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, zdVar, zdVar, (C62958ce) null, 338104601, C63066gd.MESSAGE, C60688zd.class);
    }

    private C60688zd() {
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
                return newMessageInfo(f164648k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bင\u0007\tဌ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C60689ze.f164661a});
            case 3:
                return new C60688zd();
            case 4:
                return new C60687zc();
            case 5:
                return f164648k;
            case 6:
                C63010eb ebVar = f164650m;
                if (ebVar == null) {
                    synchronized (C60688zd.class) {
                        ebVar = f164650m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164648k);
                            f164650m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
