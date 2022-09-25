package com.google.android.apps.gsa.nga.engine.p6262y.p6269d.p6270a;

import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79885g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4841al.p4842a.p4845c.C63305d;
import com.google.protos.p4841al.p4842a.p4845c.C63309h;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.d.a.b */
/* compiled from: PG */
public final class C79924b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C79924b f219068c;

    /* renamed from: d */
    public static final C62940bt f219069d;

    /* renamed from: e */
    private static volatile C63010eb f219070e;

    /* renamed from: a */
    public int f219071a = 0;

    /* renamed from: b */
    public Object f219072b;

    static {
        C79924b bVar = new C79924b();
        f219068c = bVar;
        C62942bv.registerDefaultInstance(C79924b.class, bVar);
        f219069d = C62942bv.newSingularGeneratedExtension(C79885g.f218957h, bVar, bVar, (C62958ce) null, 281717907, C63066gd.MESSAGE, C79924b.class);
    }

    private C79924b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f219068c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C63305d.class, C63309h.class});
            case 3:
                return new C79924b();
            case 4:
                return new C79923a();
            case 5:
                return f219068c;
            case 6:
                C63010eb ebVar = f219070e;
                if (ebVar == null) {
                    synchronized (C79924b.class) {
                        ebVar = f219070e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219068c);
                            f219070e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
