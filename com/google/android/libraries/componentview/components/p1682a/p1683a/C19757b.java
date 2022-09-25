package com.google.android.libraries.componentview.components.p1682a.p1683a;

import com.google.android.libraries.componentview.components.p1689c.p1690a.C20178x;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.a.a.b */
/* compiled from: PG */
public final class C19757b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C19757b f55184c;

    /* renamed from: d */
    public static final C62940bt f55185d;

    /* renamed from: e */
    private static volatile C63010eb f55186e;

    /* renamed from: a */
    public int f55187a;

    /* renamed from: b */
    public C20178x f55188b;

    static {
        C19757b bVar = new C19757b();
        f55184c = bVar;
        C62942bv.registerDefaultInstance(C19757b.class, bVar);
        f55185d = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bVar, bVar, (C62958ce) null, 192719585, C63066gd.MESSAGE, C19757b.class);
    }

    private C19757b() {
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
                return newMessageInfo(f55184c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C19757b();
            case 4:
                return new C19754a();
            case 5:
                return f55184c;
            case 6:
                C63010eb ebVar = f55186e;
                if (ebVar == null) {
                    synchronized (C19757b.class) {
                        ebVar = f55186e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55184c);
                            f55186e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
