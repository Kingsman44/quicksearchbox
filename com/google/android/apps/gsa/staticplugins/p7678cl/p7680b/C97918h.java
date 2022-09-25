package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

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
import com.google.protos.p4757ac.p4758a.C63111j;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.h */
/* compiled from: PG */
public final class C97918h extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C97918h f273412m;

    /* renamed from: n */
    private static volatile C63010eb f273413n;

    /* renamed from: a */
    public int f273414a;

    /* renamed from: b */
    public int f273415b;

    /* renamed from: c */
    public String f273416c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f273417d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C63111j f273418e;

    /* renamed from: f */
    public String f273419f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f273420g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f273421h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f273422i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C97920j f273423j;

    /* renamed from: k */
    public boolean f273424k;

    /* renamed from: l */
    public String f273425l = BuildConfig.FLAVOR;

    static {
        C97918h hVar = new C97918h();
        f273412m = hVar;
        C62942bv.registerDefaultInstance(C97918h.class, hVar);
    }

    private C97918h() {
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
                return newMessageInfo(f273412m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0006\u0007ဉ\u0003\bဈ\u0004\tဈ\u0007\nဉ\b\u000bဈ\n\fဈ\u0005\rဇ\t", new Object[]{"a", "b", C97917g.m162193b(), C45240c.f118157a, "d", C19618h.f54585a, "e", C10662f.f35572a, "i", "j", "l", C30325g.f82003a, C19621k.f54601a});
            case 3:
                return new C97918h();
            case 4:
                return new C97915e();
            case 5:
                return f273412m;
            case 6:
                C63010eb ebVar = f273413n;
                if (ebVar == null) {
                    synchronized (C97918h.class) {
                        ebVar = f273413n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273412m);
                            f273413n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
