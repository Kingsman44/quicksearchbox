package com.google.android.libraries.mdi.download;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4433bz.p4437b.C57909n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.libraries.mdi.download.al */
/* compiled from: PG */
public final class C28706al extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C28706al f77976q;

    /* renamed from: r */
    private static volatile C63010eb f77977r;

    /* renamed from: a */
    public int f77978a;

    /* renamed from: b */
    public String f77979b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f77980c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f77981d;

    /* renamed from: e */
    public int f77982e;

    /* renamed from: f */
    public String f77983f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C57909n f77984g;

    /* renamed from: h */
    public String f77985h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f77986i;

    /* renamed from: j */
    public C57909n f77987j;

    /* renamed from: k */
    public C62971cq f77988k = emptyProtobufList();

    /* renamed from: l */
    public int f77989l;

    /* renamed from: m */
    public int f77990m;

    /* renamed from: n */
    public String f77991n = BuildConfig.FLAVOR;

    /* renamed from: o */
    public String f77992o = BuildConfig.FLAVOR;

    /* renamed from: p */
    public C63070h f77993p;

    static {
        C28706al alVar = new C28706al();
        f77976q = alVar;
        C62942bv.registerDefaultInstance(C28706al.class, alVar);
    }

    private C28706al() {
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
                return newMessageInfo(f77976q, "\u0001\u000f\u0000\u0001\u0002\u0015\u000f\u0000\u0001\u0000\u0002ဈ\u0001\u0004င\u0002\u0005ဈ\u0004\u0007ဈ\u0000\u000bဉ\u0005\fဉ\b\r\u001b\u000eဈ\u0006\u000fဌ\u0003\u0010င\u0007\u0011ဌ\t\u0012ဌ\n\u0013ဈ\u000b\u0014ဈ\f\u0015ဉ\r", new Object[]{"a", C45240c.f118157a, "d", C10662f.f35572a, "b", C30325g.f82003a, "j", C19621k.f54601a, C28712ar.class, C19618h.f54585a, "e", C28704aj.f77975a, "i", "l", C28701ag.f77974a, "m", C28699ae.f77973a, C48004n.f124238a, C66412o.f180592a, "p"});
            case 3:
                return new C28706al();
            case 4:
                return new C28703ai();
            case 5:
                return f77976q;
            case 6:
                C63010eb ebVar = f77977r;
                if (ebVar == null) {
                    synchronized (C28706al.class) {
                        ebVar = f77977r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77976q);
                            f77977r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
