package com.google.android.libraries.mdi.download;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.android.libraries.mdi.download.cr */
/* compiled from: PG */
public final class C28803cr extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C28803cr f78265n;

    /* renamed from: o */
    private static volatile C63010eb f78266o;

    /* renamed from: a */
    public int f78267a;

    /* renamed from: b */
    public int f78268b;

    /* renamed from: c */
    public String f78269c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f78270d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f78271e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f78272f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C28802cq f78273g;

    /* renamed from: h */
    public long f78274h;

    /* renamed from: i */
    public String f78275i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public int f78276j;

    /* renamed from: k */
    public long f78277k;

    /* renamed from: l */
    public C63070h f78278l;

    /* renamed from: m */
    public String f78279m = BuildConfig.FLAVOR;

    static {
        C28803cr crVar = new C28803cr();
        f78265n = crVar;
        C62942bv.registerDefaultInstance(C28803cr.class, crVar);
    }

    private C28803cr() {
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
                return newMessageInfo(f78265n, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001ဈ\u0003\u0002င\t\u0003ဉ\u000b\u0004ဈ\u0005\u0005ဉ\u0006\u0006ဂ\u0007\u0007ဈ\b\bဌ\u0000\tဈ\u0001\fဈ\u000e\rဈ\u0004\u000eဂ\n", new Object[]{"a", "d", "j", "l", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "b", C28799cn.f78259a, C45240c.f118157a, "m", "e", C19621k.f54601a});
            case 3:
                return new C28803cr();
            case 4:
                return new C28798cm();
            case 5:
                return f78265n;
            case 6:
                C63010eb ebVar = f78266o;
                if (ebVar == null) {
                    synchronized (C28803cr.class) {
                        ebVar = f78266o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f78265n);
                            f78266o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
