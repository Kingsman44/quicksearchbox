package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.fk */
/* compiled from: PG */
public final class C82922fk extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C82922fk f226218e;

    /* renamed from: g */
    private static volatile C63010eb f226219g;

    /* renamed from: a */
    public int f226220a;

    /* renamed from: b */
    public C19088t f226221b;

    /* renamed from: c */
    public C80513b f226222c;

    /* renamed from: d */
    public int f226223d;

    /* renamed from: f */
    private byte f226224f = 2;

    static {
        C82922fk fkVar = new C82922fk();
        f226218e = fkVar;
        C62942bv.registerDefaultInstance(C82922fk.class, fkVar);
    }

    private C82922fk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f226224f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f226224f = b;
                return null;
            case 2:
                return newMessageInfo(f226218e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C82835ce.m132410b()});
            case 3:
                return new C82922fk();
            case 4:
                return new C82921fj();
            case 5:
                return f226218e;
            case 6:
                C63010eb ebVar = f226219g;
                if (ebVar == null) {
                    synchronized (C82922fk.class) {
                        ebVar = f226219g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226218e);
                            f226219g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
