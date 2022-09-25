package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.c.a.af */
/* compiled from: PG */
public final class C20109af extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C20109af f56357c;

    /* renamed from: d */
    public static final C62940bt f56358d;

    /* renamed from: e */
    private static volatile C63010eb f56359e;

    /* renamed from: a */
    public int f56360a;

    /* renamed from: b */
    public C20111ah f56361b;

    static {
        C20109af afVar = new C20109af();
        f56357c = afVar;
        C62942bv.registerDefaultInstance(C20109af.class, afVar);
        f56358d = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, afVar, afVar, (C62958ce) null, 119407472, C63066gd.MESSAGE, C20109af.class);
    }

    private C20109af() {
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
                return newMessageInfo(f56357c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C20109af();
            case 4:
                return new C20108ae();
            case 5:
                return f56357c;
            case 6:
                C63010eb ebVar = f56359e;
                if (ebVar == null) {
                    synchronized (C20109af.class) {
                        ebVar = f56359e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56357c);
                            f56359e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
