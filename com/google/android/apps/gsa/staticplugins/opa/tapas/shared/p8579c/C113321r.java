package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.r */
/* compiled from: PG */
public final class C113321r extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C113321r f313832n;

    /* renamed from: o */
    private static volatile C63010eb f313833o;

    /* renamed from: a */
    public String f313834a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f313835b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f313836c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f313837d;

    /* renamed from: e */
    public String f313838e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f313839f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f313840g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f313841h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f313842i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f313843j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f313844k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public boolean f313845l;

    /* renamed from: m */
    public boolean f313846m;

    static {
        C113321r rVar = new C113321r();
        f313832n = rVar;
        C62942bv.registerDefaultInstance(C113321r.class, rVar);
    }

    private C113321r() {
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
                return newMessageInfo(f313832n, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\f\u0007\r\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new C113321r();
            case 4:
                return new C113319p();
            case 5:
                return f313832n;
            case 6:
                C63010eb ebVar = f313833o;
                if (ebVar == null) {
                    synchronized (C113321r.class) {
                        ebVar = f313833o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f313832n);
                            f313833o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
