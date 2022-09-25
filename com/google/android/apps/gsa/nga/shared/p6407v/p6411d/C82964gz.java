package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b.C80478c;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.gz */
/* compiled from: PG */
public final class C82964gz extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C82964gz f226343j;

    /* renamed from: k */
    private static volatile C63010eb f226344k;

    /* renamed from: a */
    public int f226345a;

    /* renamed from: b */
    public int f226346b;

    /* renamed from: c */
    public String f226347c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C82961gw f226348d;

    /* renamed from: e */
    public int f226349e;

    /* renamed from: f */
    public long f226350f;

    /* renamed from: g */
    public long f226351g;

    /* renamed from: h */
    public boolean f226352h;

    /* renamed from: i */
    public int f226353i;

    static {
        C82964gz gzVar = new C82964gz();
        f226343j = gzVar;
        C62942bv.registerDefaultInstance(C82964gz.class, gzVar);
    }

    private C82964gz() {
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
                return newMessageInfo(f226343j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဌ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဇ\u0007\tဌ\b", new Object[]{"a", "b", C82962gx.f226342a, C45240c.f118157a, "d", "e", C80478c.m128174b(), C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C82956gr.f226327a});
            case 3:
                return new C82964gz();
            case 4:
                return new C82955gq();
            case 5:
                return f226343j;
            case 6:
                C63010eb ebVar = f226344k;
                if (ebVar == null) {
                    synchronized (C82964gz.class) {
                        ebVar = f226344k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226343j);
                            f226344k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
