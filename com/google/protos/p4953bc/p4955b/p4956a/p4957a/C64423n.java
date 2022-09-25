package com.google.protos.p4953bc.p4955b.p4956a.p4957a;

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
import com.google.protos.p4953bc.p4954a.C64399c;

/* renamed from: com.google.protos.bc.b.a.a.n */
/* compiled from: PG */
public final class C64423n extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C64423n f174740m;

    /* renamed from: o */
    private static volatile C63010eb f174741o;

    /* renamed from: a */
    public int f174742a;

    /* renamed from: b */
    public int f174743b = 0;

    /* renamed from: c */
    public Object f174744c;

    /* renamed from: d */
    public int f174745d = 0;

    /* renamed from: e */
    public Object f174746e;

    /* renamed from: f */
    public C64419j f174747f;

    /* renamed from: g */
    public C64419j f174748g;

    /* renamed from: h */
    public C64422m f174749h;

    /* renamed from: i */
    public C64422m f174750i;

    /* renamed from: j */
    public int f174751j;

    /* renamed from: k */
    public String f174752k;

    /* renamed from: l */
    public int f174753l;

    /* renamed from: n */
    private C64412c f174754n;

    static {
        C64423n nVar = new C64423n();
        f174740m = nVar;
        C62942bv.registerDefaultInstance(C64423n.class, nVar);
    }

    private C64423n() {
        emptyProtobufList();
        this.f174752k = BuildConfig.FLAVOR;
        emptyIntList();
        emptyProtobufList();
        emptyIntList();
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
                return newMessageInfo(f174740m, "\u0001\f\u0002\u0001\u0003 \f\u0000\u0000\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0006ဉ\u0004\u0007ြ\u0000\bြ\u0000\tဉ\u0007\nြ\u0001\u000bြ\u0001\u0013ဉ\u0016\u001aဌ\u000f\u001fဈ\u0012 ဌ\u0013", new Object[]{C45240c.f118157a, "b", "e", "d", "a", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C64422m.class, C64422m.class, "i", C64422m.class, C64422m.class, C48004n.f124238a, "j", C64431v.m96404b(), C19621k.f54601a, "l", C64399c.f174660a});
            case 3:
                return new C64423n();
            case 4:
                return new C64420k();
            case 5:
                return f174740m;
            case 6:
                C63010eb ebVar = f174741o;
                if (ebVar == null) {
                    synchronized (C64423n.class) {
                        ebVar = f174741o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174740m);
                            f174741o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
