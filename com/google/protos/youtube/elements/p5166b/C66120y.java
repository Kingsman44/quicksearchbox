package com.google.protos.youtube.elements.p5166b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.protos.youtube.elements.b.y */
/* compiled from: PG */
public final class C66120y extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C66120y f179806g;

    /* renamed from: i */
    private static volatile C63010eb f179807i;

    /* renamed from: a */
    public int f179808a;

    /* renamed from: b */
    public String f179809b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63042fg f179810c;

    /* renamed from: d */
    public int f179811d;

    /* renamed from: e */
    public String f179812e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C66068ab f179813f;

    /* renamed from: h */
    private C62995dn f179814h = C62995dn.f170057a;

    static {
        C66120y yVar = new C66120y();
        f179806g = yVar;
        C62942bv.registerDefaultInstance(C66120y.class, yVar);
    }

    private C66120y() {
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
                return newMessageInfo(f179806g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u00052\u0006ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C66121z.f179815a, "e", C19618h.f54585a, C66118w.f179805a, C10662f.f35572a});
            case 3:
                return new C66120y();
            case 4:
                return new C66119x();
            case 5:
                return f179806g;
            case 6:
                C63010eb ebVar = f179807i;
                if (ebVar == null) {
                    synchronized (C66120y.class) {
                        ebVar = f179807i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179806g);
                            f179807i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
