package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.jj */
/* compiled from: PG */
public final class C60061jj extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C60061jj f162338j;

    /* renamed from: k */
    private static volatile C63010eb f162339k;

    /* renamed from: a */
    public int f162340a;

    /* renamed from: b */
    public boolean f162341b;

    /* renamed from: c */
    public int f162342c;

    /* renamed from: d */
    public boolean f162343d;

    /* renamed from: e */
    public int f162344e;

    /* renamed from: f */
    public String f162345f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f162346g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f162347h;

    /* renamed from: i */
    public int f162348i;

    static {
        C60061jj jjVar = new C60061jj();
        f162338j = jjVar;
        C62942bv.registerDefaultInstance(C60061jj.class, jjVar);
    }

    private C60061jj() {
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
                return newMessageInfo(f162338j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0007ဈ\u0006\bဈ\u0007\tင\b\nင\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C60061jj();
            case 4:
                return new C60060ji();
            case 5:
                return f162338j;
            case 6:
                C63010eb ebVar = f162339k;
                if (ebVar == null) {
                    synchronized (C60061jj.class) {
                        ebVar = f162339k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162338j);
                            f162339k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
