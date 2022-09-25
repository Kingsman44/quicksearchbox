package com.google.android.apps.search.podcasts.p10585m.p10586a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.m.a.b */
/* compiled from: PG */
public final class C140641b extends C62942bv implements C140642c {

    /* renamed from: o */
    public static final C140641b f381972o;

    /* renamed from: p */
    private static volatile C63010eb f381973p;

    /* renamed from: a */
    public C140646b f381974a;

    /* renamed from: b */
    public String f381975b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f381976c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f381977d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f381978e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f381979f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public long f381980g;

    /* renamed from: h */
    public long f381981h;

    /* renamed from: i */
    public String f381982i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public boolean f381983j;

    /* renamed from: k */
    public C140644e f381984k;

    /* renamed from: l */
    public boolean f381985l;

    /* renamed from: m */
    public int f381986m;

    /* renamed from: n */
    public C97914d f381987n;

    static {
        C140641b bVar = new C140641b();
        f381972o = bVar;
        C62942bv.registerDefaultInstance(C140641b.class, bVar);
    }

    private C140641b() {
    }

    /* renamed from: a */
    public final C140646b mo115811a() {
        C140646b bVar = this.f381974a;
        return bVar == null ? C140646b.f381993r : bVar;
    }

    /* renamed from: b */
    public final String mo115812b() {
        return this.f381975b;
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
                return newMessageInfo(f381972o, "\u0000\u000e\u0000\u0000\u0002\u0011\u000e\u0000\u0000\u0000\u0002\t\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\t\b\u0007\t\u0002\nȈ\u000b\u0002\fȈ\r\u0007\u0010\f\u0011\t", new Object[]{"a", C45240c.f118157a, "d", "e", C10662f.f35572a, C19621k.f54601a, "l", C30325g.f82003a, "b", C19618h.f54585a, "i", "j", "m", C48004n.f124238a});
            case 3:
                return new C140641b();
            case 4:
                return new C140640a();
            case 5:
                return f381972o;
            case 6:
                C63010eb ebVar = f381973p;
                if (ebVar == null) {
                    synchronized (C140641b.class) {
                        ebVar = f381973p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f381972o);
                            f381973p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
