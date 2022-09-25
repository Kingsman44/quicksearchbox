package com.google.android.libraries.componentview.components.p1689c.p1690a;

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

/* renamed from: com.google.android.libraries.componentview.components.c.a.ar */
/* compiled from: PG */
public final class C20121ar extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C20121ar f56395b;

    /* renamed from: c */
    public static final C62940bt f56396c;

    /* renamed from: e */
    private static volatile C63010eb f56397e;

    /* renamed from: a */
    public C62971cq f56398a = emptyProtobufList();

    /* renamed from: d */
    private byte f56399d = 2;

    static {
        C20121ar arVar = new C20121ar();
        f56395b = arVar;
        C62942bv.registerDefaultInstance(C20121ar.class, arVar);
        f56396c = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, arVar, arVar, (C62958ce) null, 177247746, C63066gd.MESSAGE, C20121ar.class);
    }

    private C20121ar() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f56399d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f56399d = b;
                return null;
            case 2:
                return newMessageInfo(f56395b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C56425d.class});
            case 3:
                return new C20121ar();
            case 4:
                return new C20120aq();
            case 5:
                return f56395b;
            case 6:
                C63010eb ebVar = f56397e;
                if (ebVar == null) {
                    synchronized (C20121ar.class) {
                        ebVar = f56397e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56395b);
                            f56397e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
