package com.google.assistant.p3863av.p3870c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.c.b */
/* compiled from: PG */
public final class C50558b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50558b f131583a;

    /* renamed from: c */
    private static volatile C63010eb f131584c;

    /* renamed from: b */
    private byte f131585b = 2;

    static {
        C50558b bVar = new C50558b();
        f131583a = bVar;
        C62942bv.registerDefaultInstance(C50558b.class, bVar);
    }

    private C50558b() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f131585b);
            case 1:
                this.f131585b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f131583a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C50558b();
            case 4:
                return new C50557a();
            case 5:
                return f131583a;
            case 6:
                C63010eb ebVar = f131584c;
                if (ebVar == null) {
                    synchronized (C50558b.class) {
                        ebVar = f131584c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131583a);
                            f131584c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
