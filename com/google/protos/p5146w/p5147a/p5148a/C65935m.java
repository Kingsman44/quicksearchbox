package com.google.protos.p5146w.p5147a.p5148a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.w.a.a.m */
/* compiled from: PG */
public final class C65935m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65935m f179323c;

    /* renamed from: d */
    public static final C62940bt f179324d;

    /* renamed from: i */
    private static volatile C63010eb f179325i;

    /* renamed from: a */
    public int f179326a;

    /* renamed from: b */
    public String f179327b = BuildConfig.FLAVOR;

    /* renamed from: e */
    private String f179328e = BuildConfig.FLAVOR;

    /* renamed from: f */
    private String f179329f = BuildConfig.FLAVOR;

    /* renamed from: g */
    private String f179330g = BuildConfig.FLAVOR;

    /* renamed from: h */
    private String f179331h = BuildConfig.FLAVOR;

    static {
        C65935m mVar = new C65935m();
        f179323c = mVar;
        C62942bv.registerDefaultInstance(C65935m.class, mVar);
        f179324d = C62942bv.newSingularGeneratedExtension(C65930h.f179300i, mVar, mVar, (C62958ce) null, 2002, C63066gd.MESSAGE, C65935m.class);
    }

    private C65935m() {
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
                return newMessageInfo(f179323c, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "e", "b", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C65935m();
            case 4:
                return new C65934l();
            case 5:
                return f179323c;
            case 6:
                C63010eb ebVar = f179325i;
                if (ebVar == null) {
                    synchronized (C65935m.class) {
                        ebVar = f179325i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179323c);
                            f179325i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
