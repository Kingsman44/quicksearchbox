package com.google.android.libraries.componentview.components.agsa.p1684a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.base.p1687a.C19926b;
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

/* renamed from: com.google.android.libraries.componentview.components.agsa.a.b */
/* compiled from: PG */
public final class C19843b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19843b f55474e;

    /* renamed from: f */
    public static final C62940bt f55475f;

    /* renamed from: h */
    private static volatile C63010eb f55476h;

    /* renamed from: a */
    public int f55477a;

    /* renamed from: b */
    public C56425d f55478b;

    /* renamed from: c */
    public String f55479c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C19926b f55480d;

    /* renamed from: g */
    private byte f55481g = 2;

    static {
        C19843b bVar = new C19843b();
        f55474e = bVar;
        C62942bv.registerDefaultInstance(C19843b.class, bVar);
        f55475f = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bVar, bVar, (C62958ce) null, 132587287, C63066gd.MESSAGE, C19843b.class);
    }

    private C19843b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55481g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55481g = b;
                return null;
            case 2:
                return newMessageInfo(f55474e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C19843b();
            case 4:
                return new C19842a();
            case 5:
                return f55474e;
            case 6:
                C63010eb ebVar = f55476h;
                if (ebVar == null) {
                    synchronized (C19843b.class) {
                        ebVar = f55476h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55474e);
                            f55476h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
