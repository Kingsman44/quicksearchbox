package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.cs */
/* compiled from: PG */
public final class C66174cs extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C66174cs f179947a;

    /* renamed from: b */
    public static final C62940bt f179948b;

    /* renamed from: d */
    private static volatile C63010eb f179949d;

    /* renamed from: c */
    private byte f179950c = 2;

    static {
        C66174cs csVar = new C66174cs();
        f179947a = csVar;
        C62942bv.registerDefaultInstance(C66174cs.class, csVar);
        f179948b = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, csVar, csVar, (C62958ce) null, 342268478, C63066gd.MESSAGE, C66174cs.class);
    }

    private C66174cs() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179950c);
            case 1:
                this.f179950c = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f179947a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66174cs();
            case 4:
                return new C66173cr();
            case 5:
                return f179947a;
            case 6:
                C63010eb ebVar = f179949d;
                if (ebVar == null) {
                    synchronized (C66174cs.class) {
                        ebVar = f179949d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179947a);
                            f179949d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
