package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142330bi;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.bj */
/* compiled from: PG */
public final class C124644bj extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C124644bj f343868n;

    /* renamed from: o */
    private static volatile C63010eb f343869o;

    /* renamed from: a */
    public int f343870a;

    /* renamed from: b */
    public String f343871b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f343872c;

    /* renamed from: d */
    public boolean f343873d;

    /* renamed from: e */
    public String f343874e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f343875f;

    /* renamed from: g */
    public C142324bc f343876g;

    /* renamed from: h */
    public int f343877h;

    /* renamed from: i */
    public C124723u f343878i;

    /* renamed from: j */
    public C124609ab f343879j;

    /* renamed from: k */
    public String f343880k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public C142330bi f343881l;

    /* renamed from: m */
    public String f343882m = BuildConfig.FLAVOR;

    static {
        C124644bj bjVar = new C124644bj();
        f343868n = bjVar;
        C62942bv.registerDefaultInstance(C124644bj.class, bjVar);
    }

    private C124644bj() {
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
                return newMessageInfo(f343868n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0007ဉ\u0005\bဌ\u0006\tဉ\u0007\nဉ\b\u000bဈ\t\fဉ\n\rဈ\u000b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C124636bb.m204302b(), C30325g.f82003a, C19618h.f54585a, C124713k.m204377b(), "i", "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new C124644bj();
            case 4:
                return new C124643bi();
            case 5:
                return f343868n;
            case 6:
                C63010eb ebVar = f343869o;
                if (ebVar == null) {
                    synchronized (C124644bj.class) {
                        ebVar = f343869o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343868n);
                            f343869o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
