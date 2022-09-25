package com.google.p4152bb.p4153a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4653i.p4654a.C61683ax;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.ah */
/* compiled from: PG */
public final class C54950ah extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54950ah f144552a;

    /* renamed from: b */
    public static final C62940bt f144553b;

    /* renamed from: h */
    private static volatile C63010eb f144554h;

    /* renamed from: c */
    private int f144555c;

    /* renamed from: d */
    private C54946ad f144556d;

    /* renamed from: e */
    private C61683ax f144557e;

    /* renamed from: f */
    private C54958ap f144558f;

    /* renamed from: g */
    private byte f144559g = 2;

    static {
        C54950ah ahVar = new C54950ah();
        f144552a = ahVar;
        C62942bv.registerDefaultInstance(C54950ah.class, ahVar);
        f144553b = C62942bv.newSingularGeneratedExtension(C54946ad.f144531h, ahVar, ahVar, (C62958ce) null, 42139248, C63066gd.MESSAGE, C54950ah.class);
    }

    private C54950ah() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144559g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f144559g = b;
                return null;
            case 2:
                return newMessageInfo(f144552a, "\u0001\u0003\u0000\u0001\u0006\f\u0003\u0000\u0000\u0003\u0006ᐉ\u0005\bᐉ\b\fᐉ\n", new Object[]{C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C54950ah();
            case 4:
                return new C54949ag();
            case 5:
                return f144552a;
            case 6:
                C63010eb ebVar = f144554h;
                if (ebVar == null) {
                    synchronized (C54950ah.class) {
                        ebVar = f144554h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144552a);
                            f144554h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
