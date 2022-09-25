package com.google.common.p4552o;

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

/* renamed from: com.google.common.o.jx */
/* compiled from: PG */
public final class C60075jx extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C60075jx f162403o;

    /* renamed from: p */
    private static volatile C63010eb f162404p;

    /* renamed from: a */
    public int f162405a;

    /* renamed from: b */
    public int f162406b;

    /* renamed from: c */
    public int f162407c;

    /* renamed from: d */
    public int f162408d;

    /* renamed from: e */
    public int f162409e;

    /* renamed from: f */
    public int f162410f;

    /* renamed from: g */
    public int f162411g;

    /* renamed from: h */
    public int f162412h;

    /* renamed from: i */
    public int f162413i;

    /* renamed from: j */
    public int f162414j;

    /* renamed from: k */
    public String f162415k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public int f162416l;

    /* renamed from: m */
    public int f162417m;

    /* renamed from: n */
    public C60077jz f162418n;

    static {
        C60075jx jxVar = new C60075jx();
        f162403o = jxVar;
        C62942bv.registerDefaultInstance(C60075jx.class, jxVar);
    }

    private C60075jx() {
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
                return newMessageInfo(f162403o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b\nဈ\t\u000bဋ\n\fဋ\u000b\u000eဉ\r", new Object[]{"a", "b", C60074jw.f162402a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a});
            case 3:
                return new C60075jx();
            case 4:
                return new C60073jv();
            case 5:
                return f162403o;
            case 6:
                C63010eb ebVar = f162404p;
                if (ebVar == null) {
                    synchronized (C60075jx.class) {
                        ebVar = f162404p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162403o);
                            f162404p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
