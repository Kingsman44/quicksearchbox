package com.google.android.libraries.componentview.components.elements.p1696a;

import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.elements.a.t */
/* compiled from: PG */
public final class C20395t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C20395t f57361c;

    /* renamed from: d */
    public static final C62940bt f57362d;

    /* renamed from: e */
    private static volatile C63010eb f57363e;

    /* renamed from: a */
    public int f57364a;

    /* renamed from: b */
    public C19916aq f57365b;

    static {
        C20395t tVar = new C20395t();
        f57361c = tVar;
        C62942bv.registerDefaultInstance(C20395t.class, tVar);
        f57362d = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, tVar, tVar, (C62958ce) null, 121680079, C63066gd.MESSAGE, C20395t.class);
    }

    private C20395t() {
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
                return newMessageInfo(f57361c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C20395t();
            case 4:
                return new C20394s();
            case 5:
                return f57361c;
            case 6:
                C63010eb ebVar = f57363e;
                if (ebVar == null) {
                    synchronized (C20395t.class) {
                        ebVar = f57363e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57361c);
                            f57363e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
