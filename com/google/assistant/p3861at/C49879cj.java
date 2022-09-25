package com.google.assistant.p3861at;

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
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.at.cj */
/* compiled from: PG */
public final class C49879cj extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C49879cj f129628l;

    /* renamed from: m */
    private static volatile C63010eb f129629m;

    /* renamed from: a */
    public int f129630a;

    /* renamed from: b */
    public String f129631b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f129632c;

    /* renamed from: d */
    public String f129633d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f129634e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f129635f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f129636g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f129637h;

    /* renamed from: i */
    public int f129638i;

    /* renamed from: j */
    public C49891cv f129639j;

    /* renamed from: k */
    public C63042fg f129640k;

    static {
        C49879cj cjVar = new C49879cj();
        f129628l = cjVar;
        C62942bv.registerDefaultInstance(C49879cj.class, cjVar);
    }

    private C49879cj() {
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
                return newMessageInfo(f129628l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0007\u0003ဉ\b\u0005ဇ\u0006\u0006ဌ\u0001\u0007ဈ\u0002\bဈ\u0004\tဈ\u0005\nဉ\t\u000bဈ\u0003", new Object[]{"a", "b", "i", C49875cf.m85756b(), "j", C19618h.f54585a, C45240c.f118157a, C49878ci.m85758b(), "d", C10662f.f35572a, C30325g.f82003a, C19621k.f54601a, "e"});
            case 3:
                return new C49879cj();
            case 4:
                return new C49876cg();
            case 5:
                return f129628l;
            case 6:
                C63010eb ebVar = f129629m;
                if (ebVar == null) {
                    synchronized (C49879cj.class) {
                        ebVar = f129629m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129628l);
                            f129629m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
