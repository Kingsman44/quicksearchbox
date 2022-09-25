package com.google.speech.p5218j.p5220b.p5221a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.C67083kk;

/* renamed from: com.google.speech.j.b.a.aa */
/* compiled from: PG */
public final class C66788aa extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66788aa f181630b;

    /* renamed from: c */
    public static final C62940bt f181631c;

    /* renamed from: e */
    private static volatile C63010eb f181632e;

    /* renamed from: a */
    public C66821y f181633a;

    /* renamed from: d */
    private int f181634d;

    static {
        C66788aa aaVar = new C66788aa();
        f181630b = aaVar;
        C62942bv.registerDefaultInstance(C66788aa.class, aaVar);
        f181631c = C62942bv.newSingularGeneratedExtension(C67083kk.f182351g, aaVar, aaVar, (C62958ce) null, 263134131, C63066gd.MESSAGE, C66788aa.class);
    }

    private C66788aa() {
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
                return newMessageInfo(f181630b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C66788aa();
            case 4:
                return new C66822z();
            case 5:
                return f181630b;
            case 6:
                C63010eb ebVar = f181632e;
                if (ebVar == null) {
                    synchronized (C66788aa.class) {
                        ebVar = f181632e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181630b);
                            f181632e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
