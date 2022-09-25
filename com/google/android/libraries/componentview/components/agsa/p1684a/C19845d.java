package com.google.android.libraries.componentview.components.agsa.p1684a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.agsa.a.d */
/* compiled from: PG */
public final class C19845d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19845d f55482e;

    /* renamed from: f */
    public static final C62940bt f55483f;

    /* renamed from: h */
    private static volatile C63010eb f55484h;

    /* renamed from: a */
    public int f55485a;

    /* renamed from: b */
    public C56425d f55486b;

    /* renamed from: c */
    public C62971cq f55487c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public String f55488d = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f55489g = 2;

    static {
        C19845d dVar = new C19845d();
        f55482e = dVar;
        C62942bv.registerDefaultInstance(C19845d.class, dVar);
        f55483f = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, dVar, dVar, (C62958ce) null, 131225201, C63066gd.MESSAGE, C19845d.class);
    }

    private C19845d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55489g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55489g = b;
                return null;
            case 2:
                return newMessageInfo(f55482e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001a\u0003ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C19845d();
            case 4:
                return new C19844c();
            case 5:
                return f55482e;
            case 6:
                C63010eb ebVar = f55484h;
                if (ebVar == null) {
                    synchronized (C19845d.class) {
                        ebVar = f55484h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55482e);
                            f55484h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
