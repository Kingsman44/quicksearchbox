package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.j.df */
/* compiled from: PG */
public final class C66889df extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66889df f181847b;

    /* renamed from: c */
    public static final C62940bt f181848c;

    /* renamed from: e */
    private static volatile C63010eb f181849e;

    /* renamed from: a */
    public int f181850a;

    /* renamed from: d */
    private int f181851d;

    static {
        C66889df dfVar = new C66889df();
        f181847b = dfVar;
        C62942bv.registerDefaultInstance(C66889df.class, dfVar);
        f181848c = C62942bv.newSingularGeneratedExtension(C67083kk.f182351g, dfVar, dfVar, (C62958ce) null, 278780588, C63066gd.MESSAGE, C66889df.class);
    }

    private C66889df() {
        emptyProtobufList();
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
                return newMessageInfo(f181847b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", C66887dd.f181846a});
            case 3:
                return new C66889df();
            case 4:
                return new C66886dc();
            case 5:
                return f181847b;
            case 6:
                C63010eb ebVar = f181849e;
                if (ebVar == null) {
                    synchronized (C66889df.class) {
                        ebVar = f181849e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181847b);
                            f181849e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
