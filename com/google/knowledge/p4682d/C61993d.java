package com.google.knowledge.p4682d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.knowledge.d.d */
/* compiled from: PG */
public final class C61993d extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C61993d f167536a;

    /* renamed from: b */
    public static final C62940bt f167537b;

    /* renamed from: d */
    private static volatile C63010eb f167538d;

    /* renamed from: c */
    private byte f167539c = 2;

    static {
        C61993d dVar = new C61993d();
        f167536a = dVar;
        C62942bv.registerDefaultInstance(C61993d.class, dVar);
        f167537b = C62942bv.newSingularGeneratedExtension(C63771b.f172510a, dVar, dVar, (C62958ce) null, 41401449, C63066gd.MESSAGE, C61993d.class);
    }

    private C61993d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167539c);
            case 1:
                this.f167539c = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167536a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C61993d();
            case 4:
                return new C61992c();
            case 5:
                return f167536a;
            case 6:
                C63010eb ebVar = f167538d;
                if (ebVar == null) {
                    synchronized (C61993d.class) {
                        ebVar = f167538d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167536a);
                            f167538d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
