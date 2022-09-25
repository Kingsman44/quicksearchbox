package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57097l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.ar */
/* compiled from: PG */
public final class C64196ar extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64196ar f173571b;

    /* renamed from: c */
    public static final C62940bt f173572c;

    /* renamed from: e */
    private static volatile C63010eb f173573e;

    /* renamed from: a */
    public C57097l f173574a;

    /* renamed from: d */
    private int f173575d;

    static {
        C64196ar arVar = new C64196ar();
        f173571b = arVar;
        C62942bv.registerDefaultInstance(C64196ar.class, arVar);
        f173572c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, arVar, arVar, (C62958ce) null, 268492865, C63066gd.MESSAGE, C64196ar.class);
    }

    private C64196ar() {
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
                return newMessageInfo(f173571b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64196ar();
            case 4:
                return new C64195aq();
            case 5:
                return f173571b;
            case 6:
                C63010eb ebVar = f173573e;
                if (ebVar == null) {
                    synchronized (C64196ar.class) {
                        ebVar = f173573e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173571b);
                            f173573e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
