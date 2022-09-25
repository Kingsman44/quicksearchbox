package com.google.android.libraries.componentview.components.p1682a.p1683a;

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

/* renamed from: com.google.android.libraries.componentview.components.a.a.x */
/* compiled from: PG */
public final class C19779x extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C19779x f55266f;

    /* renamed from: g */
    public static final C62940bt f55267g;

    /* renamed from: i */
    private static volatile C63010eb f55268i;

    /* renamed from: a */
    public int f55269a;

    /* renamed from: b */
    public C56425d f55270b;

    /* renamed from: c */
    public boolean f55271c;

    /* renamed from: d */
    public boolean f55272d;

    /* renamed from: e */
    public boolean f55273e;

    /* renamed from: h */
    private byte f55274h = 2;

    static {
        C19779x xVar = new C19779x();
        f55266f = xVar;
        C62942bv.registerDefaultInstance(C19779x.class, xVar);
        f55267g = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, xVar, xVar, (C62958ce) null, 148445488, C63066gd.MESSAGE, C19779x.class);
    }

    private C19779x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55274h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55274h = b;
                return null;
            case 2:
                return newMessageInfo(f55266f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဇ\u0001\u0005ဇ\u0002\u0006ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C19779x();
            case 4:
                return new C19778w();
            case 5:
                return f55266f;
            case 6:
                C63010eb ebVar = f55268i;
                if (ebVar == null) {
                    synchronized (C19779x.class) {
                        ebVar = f55268i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55266f);
                            f55268i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
