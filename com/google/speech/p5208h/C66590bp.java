package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p5144u.C65892e;

/* renamed from: com.google.speech.h.bp */
/* compiled from: PG */
public final class C66590bp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66590bp f181133c;

    /* renamed from: d */
    public static final C62940bt f181134d;

    /* renamed from: g */
    private static volatile C63010eb f181135g;

    /* renamed from: a */
    public int f181136a;

    /* renamed from: b */
    public boolean f181137b;

    /* renamed from: e */
    private C65892e f181138e;

    /* renamed from: f */
    private byte f181139f = 2;

    static {
        C66590bp bpVar = new C66590bp();
        f181133c = bpVar;
        C62942bv.registerDefaultInstance(C66590bp.class, bpVar);
        f181134d = C62942bv.newSingularGeneratedExtension(C66603ca.f181183a, bpVar, bpVar, (C62958ce) null, 47099738, C63066gd.MESSAGE, C66590bp.class);
    }

    private C66590bp() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181139f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181139f = b;
                return null;
            case 2:
                return newMessageInfo(f181133c, "\u0001\u0002\u0000\u0001\t\u0016\u0002\u0000\u0000\u0000\tဇ\b\u0016ဉ\u0014", new Object[]{"a", "b", "e"});
            case 3:
                return new C66590bp();
            case 4:
                return new C66589bo();
            case 5:
                return f181133c;
            case 6:
                C63010eb ebVar = f181135g;
                if (ebVar == null) {
                    synchronized (C66590bp.class) {
                        ebVar = f181135g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181133c);
                            f181135g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
