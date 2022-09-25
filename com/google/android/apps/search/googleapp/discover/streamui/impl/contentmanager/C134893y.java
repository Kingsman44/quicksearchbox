package com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.y */
/* compiled from: PG */
public final class C134893y extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C134893y f367221f;

    /* renamed from: h */
    private static volatile C63010eb f367222h;

    /* renamed from: a */
    public int f367223a;

    /* renamed from: b */
    public C134891w f367224b;

    /* renamed from: c */
    public C134867aa f367225c;

    /* renamed from: d */
    public long f367226d;

    /* renamed from: e */
    public C57315dp f367227e;

    /* renamed from: g */
    private byte f367228g = 2;

    static {
        C134893y yVar = new C134893y();
        f367221f = yVar;
        C62942bv.registerDefaultInstance(C134893y.class, yVar);
    }

    private C134893y() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f367228g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f367228g = b;
                return null;
            case 2:
                return newMessageInfo(f367221f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0005ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C134893y();
            case 4:
                return new C134892x();
            case 5:
                return f367221f;
            case 6:
                C63010eb ebVar = f367222h;
                if (ebVar == null) {
                    synchronized (C134893y.class) {
                        ebVar = f367222h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f367221f);
                            f367222h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
