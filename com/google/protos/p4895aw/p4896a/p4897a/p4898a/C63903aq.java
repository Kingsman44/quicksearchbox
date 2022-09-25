package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.aw.a.a.a.aq */
/* compiled from: PG */
public final class C63903aq extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C63903aq f172792h;

    /* renamed from: i */
    public static final C62940bt f172793i;

    /* renamed from: l */
    private static volatile C63010eb f172794l;

    /* renamed from: a */
    public C63961y f172795a;

    /* renamed from: b */
    public C63961y f172796b;

    /* renamed from: c */
    public String f172797c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63961y f172798d;

    /* renamed from: e */
    public C63961y f172799e;

    /* renamed from: f */
    public C63961y f172800f;

    /* renamed from: g */
    public C63944h f172801g;

    /* renamed from: j */
    private int f172802j;

    /* renamed from: k */
    private byte f172803k = 2;

    static {
        C63903aq aqVar = new C63903aq();
        f172792h = aqVar;
        C62942bv.registerDefaultInstance(C63903aq.class, aqVar);
        f172793i = C62942bv.newSingularGeneratedExtension(C63959w.f172981b, aqVar, aqVar, (C62958ce) null, 1001, C63066gd.MESSAGE, C63903aq.class);
    }

    private C63903aq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172803k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172803k = b;
                return null;
            case 2:
                return newMessageInfo(f172792h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ᐉ\u0006", new Object[]{"j", "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C63903aq();
            case 4:
                return new C63902ap();
            case 5:
                return f172792h;
            case 6:
                C63010eb ebVar = f172794l;
                if (ebVar == null) {
                    synchronized (C63903aq.class) {
                        ebVar = f172794l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172792h);
                            f172794l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
