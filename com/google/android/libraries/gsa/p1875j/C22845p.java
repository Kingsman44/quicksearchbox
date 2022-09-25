package com.google.android.libraries.gsa.p1875j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.j.p */
/* compiled from: PG */
public final class C22845p extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C22845p f62890o;

    /* renamed from: p */
    private static volatile C63010eb f62891p;

    /* renamed from: a */
    public int f62892a;

    /* renamed from: b */
    public long f62893b;

    /* renamed from: c */
    public int f62894c;

    /* renamed from: d */
    public long f62895d;

    /* renamed from: e */
    public String f62896e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C22844o f62897f;

    /* renamed from: g */
    public C22842m f62898g;

    /* renamed from: h */
    public long f62899h;

    /* renamed from: i */
    public int f62900i;

    /* renamed from: j */
    public C22838i f62901j;

    /* renamed from: k */
    public int f62902k;

    /* renamed from: l */
    public long f62903l;

    /* renamed from: m */
    public C22836g f62904m;

    /* renamed from: n */
    public boolean f62905n;

    static {
        C22845p pVar = new C22845p();
        f62890o = pVar;
        C62942bv.registerDefaultInstance(C22845p.class, pVar);
    }

    private C22845p() {
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
                return newMessageInfo(f62890o, "\u0001\r\u0000\u0001\u0001\u0013\r\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဌ\u0001\u0004ဃ\u0002\u0005ဈ\u0003\u0007ဉ\u0005\bဉ\u0006\tဂ\u0007\nင\b\rဉ\t\u0010ဌ\n\u0011ဃ\u000b\u0012ဉ\f\u0013ဇ\r", new Object[]{"a", "b", C45240c.f118157a, C22839j.f62878a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, C22833d.f62863a, "l", "m", C48004n.f124238a});
            case 3:
                return new C22845p();
            case 4:
                return new C22832c();
            case 5:
                return f62890o;
            case 6:
                C63010eb ebVar = f62891p;
                if (ebVar == null) {
                    synchronized (C22845p.class) {
                        ebVar = f62891p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f62890o);
                            f62891p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
