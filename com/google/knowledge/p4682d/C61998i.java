package com.google.knowledge.p4682d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4664b.p4665a.C61771f;
import com.google.p4481ch.p4485b.C58095j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.d.i */
/* compiled from: PG */
public final class C61998i extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C61998i f167543a;

    /* renamed from: g */
    private static volatile C63010eb f167544g;

    /* renamed from: b */
    private int f167545b;

    /* renamed from: c */
    private C61993d f167546c;

    /* renamed from: d */
    private C58095j f167547d;

    /* renamed from: e */
    private C61771f f167548e;

    /* renamed from: f */
    private byte f167549f = 2;

    static {
        C61998i iVar = new C61998i();
        f167543a = iVar;
        C62942bv.registerDefaultInstance(C61998i.class, iVar);
    }

    private C61998i() {
        emptyProtobufList();
        emptyProtobufList();
        emptyLongList();
        emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167549f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f167549f = b;
                return null;
            case 2:
                return newMessageInfo(f167543a, "\u0001\u0003\u0000\u0001\u0001\n\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐉ\u0002\nᐉ\u000b", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C61998i();
            case 4:
                return new C61997h();
            case 5:
                return f167543a;
            case 6:
                C63010eb ebVar = f167544g;
                if (ebVar == null) {
                    synchronized (C61998i.class) {
                        ebVar = f167544g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167543a);
                            f167544g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
