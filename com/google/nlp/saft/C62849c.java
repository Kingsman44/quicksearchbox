package com.google.nlp.saft;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.nlp.saft.c */
/* compiled from: PG */
public final class C62849c extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C62849c f169724a;

    /* renamed from: f */
    private static volatile C63010eb f169725f;

    /* renamed from: b */
    private int f169726b;

    /* renamed from: c */
    private C63771b f169727c;

    /* renamed from: d */
    private C62995dn f169728d = C62995dn.f170057a;

    /* renamed from: e */
    private byte f169729e = 2;

    static {
        C62849c cVar = new C62849c();
        f169724a = cVar;
        C62942bv.registerDefaultInstance(C62849c.class, cVar);
    }

    private C62849c() {
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        C63088z zVar = C63088z.f170246b;
        emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169729e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169729e = b;
                return null;
            case 2:
                return newMessageInfo(f169724a, "\u0001\u0002\u0000\u0001\u000e#\u0002\u0001\u0000\u0002\u000eᐉ\u0010#в", new Object[]{"b", C45240c.f118157a, "d", C62848b.f169723a});
            case 3:
                return new C62849c();
            case 4:
                return new C62847a();
            case 5:
                return f169724a;
            case 6:
                C63010eb ebVar = f169725f;
                if (ebVar == null) {
                    synchronized (C62849c.class) {
                        ebVar = f169725f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169724a);
                            f169725f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
