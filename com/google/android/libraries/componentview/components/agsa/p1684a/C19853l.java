package com.google.android.libraries.componentview.components.agsa.p1684a;

import com.evernote.android.state.BuildConfig;
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

/* renamed from: com.google.android.libraries.componentview.components.agsa.a.l */
/* compiled from: PG */
public final class C19853l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C19853l f55523d;

    /* renamed from: e */
    public static final C62940bt f55524e;

    /* renamed from: g */
    private static volatile C63010eb f55525g;

    /* renamed from: a */
    public int f55526a;

    /* renamed from: b */
    public C56425d f55527b;

    /* renamed from: c */
    public String f55528c = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f55529f = 2;

    static {
        C19853l lVar = new C19853l();
        f55523d = lVar;
        C62942bv.registerDefaultInstance(C19853l.class, lVar);
        f55524e = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, lVar, lVar, (C62958ce) null, 139441626, C63066gd.MESSAGE, C19853l.class);
    }

    private C19853l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55529f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55529f = b;
                return null;
            case 2:
                return newMessageInfo(f55523d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C19853l();
            case 4:
                return new C19852k();
            case 5:
                return f55523d;
            case 6:
                C63010eb ebVar = f55525g;
                if (ebVar == null) {
                    synchronized (C19853l.class) {
                        ebVar = f55525g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55523d);
                            f55525g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
