package com.google.assistant.p3781ad.p3789d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4948ba.C64376f;

/* renamed from: com.google.assistant.ad.d.u */
/* compiled from: PG */
public final class C48763u extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C48763u f126171i;

    /* renamed from: j */
    public static final C62940bt f126172j;

    /* renamed from: n */
    private static volatile C63010eb f126173n;

    /* renamed from: a */
    public int f126174a;

    /* renamed from: b */
    public int f126175b;

    /* renamed from: c */
    public C64376f f126176c;

    /* renamed from: d */
    public C62995dn f126177d = C62995dn.f170057a;

    /* renamed from: e */
    public C48755m f126178e;

    /* renamed from: f */
    public C48758p f126179f;

    /* renamed from: g */
    public C48752j f126180g;

    /* renamed from: h */
    public C48762t f126181h;

    /* renamed from: k */
    private C48766x f126182k;

    /* renamed from: l */
    private C48750h f126183l;

    /* renamed from: m */
    private byte f126184m = 2;

    static {
        C48763u uVar = new C48763u();
        f126171i = uVar;
        C62942bv.registerDefaultInstance(C48763u.class, uVar);
        f126172j = C62942bv.newSingularGeneratedExtension(C48576aj.f125494h, uVar, uVar, (C62958ce) null, 307131339, C63066gd.MESSAGE, C48763u.class);
    }

    private C48763u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126184m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126184m = b;
                return null;
            case 2:
                return newMessageInfo(f126171i, "\u0001\t\u0000\u0001\u0002\u000f\t\u0001\u0000\u0001\u0002င\u0001\u0005ᐉ\u0004\b2\tဉ\u0007\nဉ\t\fဉ\b\rဉ\n\u000eဉ\u000b\u000fဉ\f", new Object[]{"a", "b", C45240c.f118157a, "d", C48756n.f126157a, C19621k.f54601a, "e", "l", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C48763u();
            case 4:
                return new C48753k();
            case 5:
                return f126171i;
            case 6:
                C63010eb ebVar = f126173n;
                if (ebVar == null) {
                    synchronized (C48763u.class) {
                        ebVar = f126173n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126171i);
                            f126173n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
