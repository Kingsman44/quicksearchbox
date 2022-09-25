package com.google.research.p5181a;

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
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.research.a.i */
/* compiled from: PG */
public final class C66380i extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C66380i f180482l;

    /* renamed from: o */
    private static volatile C63010eb f180483o;

    /* renamed from: a */
    public int f180484a;

    /* renamed from: b */
    public String f180485b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f180486c;

    /* renamed from: d */
    public long f180487d;

    /* renamed from: e */
    public C66298ac f180488e;

    /* renamed from: f */
    public C66384m f180489f;

    /* renamed from: g */
    public String f180490g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f180491h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C62971cq f180492i = C62942bv.emptyProtobufList();

    /* renamed from: j */
    public C66393v f180493j;

    /* renamed from: k */
    public C66299b f180494k;

    /* renamed from: m */
    private C66296aa f180495m;

    /* renamed from: n */
    private C62995dn f180496n = C62995dn.f170057a;

    static {
        C66380i iVar = new C66380i();
        f180482l = iVar;
        C62942bv.registerDefaultInstance(C66380i.class, iVar);
    }

    private C66380i() {
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
                return newMessageInfo(f180482l, "\u0001\f\u0000\u0001\u0001\u000f\f\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဈ\u0006\bဈ\u0007\t\u001a\u000bဉ\t\fဉ\n\rဉ\u000b\u000f2", new Object[]{"a", "b", C45240c.f118157a, C66375f.f180467a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", "m", C19621k.f54601a, C48004n.f124238a, C66379h.f180481a});
            case 3:
                return new C66380i();
            case 4:
                return new C66350e();
            case 5:
                return f180482l;
            case 6:
                C63010eb ebVar = f180483o;
                if (ebVar == null) {
                    synchronized (C66380i.class) {
                        ebVar = f180483o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180482l);
                            f180483o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
