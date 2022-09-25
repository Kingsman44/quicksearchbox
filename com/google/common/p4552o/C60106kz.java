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
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.common.o.kz */
/* compiled from: PG */
public final class C60106kz extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C60106kz f162531p;

    /* renamed from: q */
    private static volatile C63010eb f162532q;

    /* renamed from: a */
    public int f162533a;

    /* renamed from: b */
    public int f162534b;

    /* renamed from: c */
    public boolean f162535c;

    /* renamed from: d */
    public String f162536d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f162537e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f162538f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public String f162539g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f162540h;

    /* renamed from: i */
    public int f162541i;

    /* renamed from: j */
    public boolean f162542j;

    /* renamed from: k */
    public int f162543k;

    /* renamed from: l */
    public int f162544l;

    /* renamed from: m */
    public int f162545m;

    /* renamed from: n */
    public int f162546n;

    /* renamed from: o */
    public C62971cq f162547o = emptyProtobufList();

    static {
        C60106kz kzVar = new C60106kz();
        f162531p = kzVar;
        C62942bv.registerDefaultInstance(C60106kz.class, kzVar);
    }

    private C60106kz() {
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
                return newMessageInfo(f162531p, "\u0001\u000e\u0000\u0001\u0002\u0013\u000e\u0000\u0002\u0000\u0002င\u0001\u0004ဇ\u0003\u0006ဈ\u0005\u0007ဈ\u0006\b\u001a\tဈ\u0007\u000bင\t\rဌ\u000b\u000eဇ\f\u000fင\r\u0010င\u000e\u0011င\u000f\u0012င\u0010\u0013\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C60105ky.m92529b(), "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, C60102kv.class});
            case 3:
                return new C60106kz();
            case 4:
                return new C60103kw();
            case 5:
                return f162531p;
            case 6:
                C63010eb ebVar = f162532q;
                if (ebVar == null) {
                    synchronized (C60106kz.class) {
                        ebVar = f162532q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162531p);
                            f162532q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
