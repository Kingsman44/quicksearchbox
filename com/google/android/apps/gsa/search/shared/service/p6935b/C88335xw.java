package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60456qs;
import com.google.p4184bj.C56034j;
import com.google.p4184bj.C56036l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.xw */
/* compiled from: PG */
public final class C88335xw extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C88335xw f238889j;

    /* renamed from: l */
    private static volatile C63010eb f238890l;

    /* renamed from: a */
    public int f238891a;

    /* renamed from: b */
    public String f238892b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C60456qs f238893c;

    /* renamed from: d */
    public String f238894d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f238895e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C60321oe f238896f;

    /* renamed from: g */
    public C56036l f238897g;

    /* renamed from: h */
    public C56034j f238898h;

    /* renamed from: i */
    public long f238899i;

    /* renamed from: k */
    private byte f238900k = 2;

    static {
        C88335xw xwVar = new C88335xw();
        f238889j = xwVar;
        C62942bv.registerDefaultInstance(C88335xw.class, xwVar);
    }

    private C88335xw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238900k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238900k = b;
                return null;
            case 2:
                return newMessageInfo(f238889j, "\u0001\b\u0000\u0001\u0002\t\b\u0000\u0000\u0003\u0002ဈ\u0000\u0003ᐉ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bဉ\u0006\tဃ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C88335xw();
            case 4:
                return new C88334xv();
            case 5:
                return f238889j;
            case 6:
                C63010eb ebVar = f238890l;
                if (ebVar == null) {
                    synchronized (C88335xw.class) {
                        ebVar = f238890l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238889j);
                            f238890l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
