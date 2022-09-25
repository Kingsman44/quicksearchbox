package com.google.android.apps.search.assistant.surfaces.common.p9419a.p9421b;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.common.a.b.b */
/* compiled from: PG */
public final class C125013b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C125013b f344923b;

    /* renamed from: d */
    private static volatile C63010eb f344924d;

    /* renamed from: a */
    public C119851cs f344925a;

    /* renamed from: c */
    private byte f344926c = 2;

    static {
        C125013b bVar = new C125013b();
        f344923b = bVar;
        C62942bv.registerDefaultInstance(C125013b.class, bVar);
    }

    private C125013b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f344926c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f344926c = b;
                return null;
            case 2:
                return newMessageInfo(f344923b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C125013b();
            case 4:
                return new C125012a();
            case 5:
                return f344923b;
            case 6:
                C63010eb ebVar = f344924d;
                if (ebVar == null) {
                    synchronized (C125013b.class) {
                        ebVar = f344924d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344923b);
                            f344924d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
