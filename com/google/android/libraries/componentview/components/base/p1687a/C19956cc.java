package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
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

/* renamed from: com.google.android.libraries.componentview.components.base.a.cc */
/* compiled from: PG */
public final class C19956cc extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C19956cc f55860m;

    /* renamed from: n */
    public static final C62940bt f55861n;

    /* renamed from: p */
    private static volatile C63010eb f55862p;

    /* renamed from: a */
    public int f55863a;

    /* renamed from: b */
    public C19943bq f55864b;

    /* renamed from: c */
    public C19920au f55865c;

    /* renamed from: d */
    public float f55866d;

    /* renamed from: e */
    public float f55867e;

    /* renamed from: f */
    public float f55868f;

    /* renamed from: g */
    public float f55869g;

    /* renamed from: h */
    public float f55870h;

    /* renamed from: i */
    public float f55871i;

    /* renamed from: j */
    public float f55872j;

    /* renamed from: k */
    public float f55873k;

    /* renamed from: l */
    public float f55874l;

    /* renamed from: o */
    private byte f55875o = 2;

    static {
        C19956cc ccVar = new C19956cc();
        f55860m = ccVar;
        C62942bv.registerDefaultInstance(C19956cc.class, ccVar);
        f55861n = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, ccVar, ccVar, (C62958ce) null, 164128638, C63066gd.MESSAGE, C19956cc.class);
    }

    private C19956cc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55875o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55875o = b;
                return null;
            case 2:
                return newMessageInfo(f55860m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l"});
            case 3:
                return new C19956cc();
            case 4:
                return new C19955cb();
            case 5:
                return f55860m;
            case 6:
                C63010eb ebVar = f55862p;
                if (ebVar == null) {
                    synchronized (C19956cc.class) {
                        ebVar = f55862p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55860m);
                            f55862p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
