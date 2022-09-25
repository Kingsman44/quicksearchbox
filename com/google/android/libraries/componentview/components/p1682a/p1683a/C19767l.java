package com.google.android.libraries.componentview.components.p1682a.p1683a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.a.a.l */
/* compiled from: PG */
public final class C19767l extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C19767l f55218j;

    /* renamed from: k */
    public static final C62940bt f55219k;

    /* renamed from: m */
    private static volatile C63010eb f55220m;

    /* renamed from: a */
    public int f55221a;

    /* renamed from: b */
    public String f55222b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f55223c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f55224d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f55225e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f55226f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f55227g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f55228h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C56425d f55229i;

    /* renamed from: l */
    private byte f55230l = 2;

    static {
        C19767l lVar = new C19767l();
        f55218j = lVar;
        C62942bv.registerDefaultInstance(C19767l.class, lVar);
        f55219k = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, lVar, lVar, (C62958ce) null, 184007459, C63066gd.MESSAGE, C19767l.class);
    }

    private C19767l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55230l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55230l = b;
                return null;
            case 2:
                return newMessageInfo(f55218j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0005\u0006ဈ\u0006\bᐉ\u0007\tဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, C19618h.f54585a, "i", C10662f.f35572a});
            case 3:
                return new C19767l();
            case 4:
                return new C19766k();
            case 5:
                return f55218j;
            case 6:
                C63010eb ebVar = f55220m;
                if (ebVar == null) {
                    synchronized (C19767l.class) {
                        ebVar = f55220m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55218j);
                            f55220m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
