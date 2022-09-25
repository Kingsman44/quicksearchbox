package com.google.android.libraries.componentview.components.p1682a.p1683a;

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

/* renamed from: com.google.android.libraries.componentview.components.a.a.ab */
/* compiled from: PG */
public final class C19756ab extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19756ab f55176e;

    /* renamed from: f */
    public static final C62940bt f55177f;

    /* renamed from: h */
    private static volatile C63010eb f55178h;

    /* renamed from: a */
    public int f55179a;

    /* renamed from: b */
    public C56425d f55180b;

    /* renamed from: c */
    public String f55181c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f55182d = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f55183g = 2;

    static {
        C19756ab abVar = new C19756ab();
        f55176e = abVar;
        C62942bv.registerDefaultInstance(C19756ab.class, abVar);
        f55177f = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, abVar, abVar, (C62958ce) null, 189946863, C63066gd.MESSAGE, C19756ab.class);
    }

    private C19756ab() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55183g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55183g = b;
                return null;
            case 2:
                return newMessageInfo(f55176e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C19756ab();
            case 4:
                return new C19755aa();
            case 5:
                return f55176e;
            case 6:
                C63010eb ebVar = f55178h;
                if (ebVar == null) {
                    synchronized (C19756ab.class) {
                        ebVar = f55178h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55176e);
                            f55178h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
