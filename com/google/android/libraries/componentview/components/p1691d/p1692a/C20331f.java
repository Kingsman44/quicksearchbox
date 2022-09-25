package com.google.android.libraries.componentview.components.p1691d.p1692a;

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

/* renamed from: com.google.android.libraries.componentview.components.d.a.f */
/* compiled from: PG */
public final class C20331f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C20331f f57135c;

    /* renamed from: d */
    public static final C62940bt f57136d;

    /* renamed from: f */
    private static volatile C63010eb f57137f;

    /* renamed from: a */
    public C62971cq f57138a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f57139b = emptyProtobufList();

    /* renamed from: e */
    private byte f57140e = 2;

    static {
        C20331f fVar = new C20331f();
        f57135c = fVar;
        C62942bv.registerDefaultInstance(C20331f.class, fVar);
        f57136d = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, fVar, fVar, (C62958ce) null, 126116266, C63066gd.MESSAGE, C20331f.class);
    }

    private C20331f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f57140e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f57140e = b;
                return null;
            case 2:
                return newMessageInfo(f57135c, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0002\u0002\u0002Л\u0003Л", new Object[]{"a", C56425d.class, "b", C56425d.class});
            case 3:
                return new C20331f();
            case 4:
                return new C20330e();
            case 5:
                return f57135c;
            case 6:
                C63010eb ebVar = f57137f;
                if (ebVar == null) {
                    synchronized (C20331f.class) {
                        ebVar = f57137f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57135c);
                            f57137f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
