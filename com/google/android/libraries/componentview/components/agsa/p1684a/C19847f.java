package com.google.android.libraries.componentview.components.agsa.p1684a;

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

/* renamed from: com.google.android.libraries.componentview.components.agsa.a.f */
/* compiled from: PG */
public final class C19847f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C19847f f55490d;

    /* renamed from: e */
    public static final C62940bt f55491e;

    /* renamed from: g */
    private static volatile C63010eb f55492g;

    /* renamed from: a */
    public int f55493a;

    /* renamed from: b */
    public C56425d f55494b;

    /* renamed from: c */
    public int f55495c;

    /* renamed from: f */
    private byte f55496f = 2;

    static {
        C19847f fVar = new C19847f();
        f55490d = fVar;
        C62942bv.registerDefaultInstance(C19847f.class, fVar);
        f55491e = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, fVar, fVar, (C62958ce) null, 131225200, C63066gd.MESSAGE, C19847f.class);
    }

    private C19847f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55496f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55496f = b;
                return null;
            case 2:
                return newMessageInfo(f55490d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C19847f();
            case 4:
                return new C19846e();
            case 5:
                return f55490d;
            case 6:
                C63010eb ebVar = f55492g;
                if (ebVar == null) {
                    synchronized (C19847f.class) {
                        ebVar = f55492g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55490d);
                            f55492g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
