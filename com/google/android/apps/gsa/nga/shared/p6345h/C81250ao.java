package com.google.android.apps.gsa.nga.shared.p6345h;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.ao */
/* compiled from: PG */
public final class C81250ao extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C81250ao f222431i;

    /* renamed from: j */
    private static volatile C63010eb f222432j;

    /* renamed from: a */
    public int f222433a;

    /* renamed from: b */
    public String f222434b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f222435c = C63088z.f170246b;

    /* renamed from: d */
    public boolean f222436d;

    /* renamed from: e */
    public C62971cq f222437e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public String f222438f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f222439g;

    /* renamed from: h */
    public int f222440h;

    static {
        C81250ao aoVar = new C81250ao();
        f222431i = aoVar;
        C62942bv.registerDefaultInstance(C81250ao.class, aoVar);
    }

    private C81250ao() {
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
                return newMessageInfo(f222431i, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0000\u0002ဈ\u0000\u0003ည\u0001\u0004ဇ\u0002\u0005\u001a\u0006ဈ\u0003\u0007ဇ\u0004\bဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C81249an.m129217b()});
            case 3:
                return new C81250ao();
            case 4:
                return new C81247al();
            case 5:
                return f222431i;
            case 6:
                C63010eb ebVar = f222432j;
                if (ebVar == null) {
                    synchronized (C81250ao.class) {
                        ebVar = f222432j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222431i);
                            f222432j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
