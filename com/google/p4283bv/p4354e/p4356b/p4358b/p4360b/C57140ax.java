package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66208dv;

/* renamed from: com.google.bv.e.b.b.b.ax */
/* compiled from: PG */
public final class C57140ax extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57140ax f152520c;

    /* renamed from: d */
    public static final C62940bt f152521d;

    /* renamed from: g */
    private static volatile C63010eb f152522g;

    /* renamed from: a */
    public C57137au f152523a;

    /* renamed from: b */
    public int f152524b;

    /* renamed from: e */
    private int f152525e;

    /* renamed from: f */
    private byte f152526f = 2;

    static {
        C57140ax axVar = new C57140ax();
        f152520c = axVar;
        C62942bv.registerDefaultInstance(C57140ax.class, axVar);
        f152521d = C62942bv.newSingularGeneratedExtension(C66208dv.f180040a, axVar, axVar, (C62958ce) null, 427507433, C63066gd.MESSAGE, C57140ax.class);
    }

    private C57140ax() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152526f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152526f = b;
                return null;
            case 2:
                return newMessageInfo(f152520c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001", new Object[]{"e", "a", "b", C57139aw.m88265b()});
            case 3:
                return new C57140ax();
            case 4:
                return new C57135as();
            case 5:
                return f152520c;
            case 6:
                C63010eb ebVar = f152522g;
                if (ebVar == null) {
                    synchronized (C57140ax.class) {
                        ebVar = f152522g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152520c);
                            f152522g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
