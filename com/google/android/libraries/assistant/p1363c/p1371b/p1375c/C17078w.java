package com.google.android.libraries.assistant.p1363c.p1371b.p1375c;

import com.google.android.libraries.mdi.download.C28716av;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.b.c.w */
/* compiled from: PG */
public final class C17078w extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C17078w f49713g;

    /* renamed from: i */
    private static volatile C63010eb f49714i;

    /* renamed from: a */
    public int f49715a;

    /* renamed from: b */
    public C62971cq f49716b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f49717c = emptyProtobufList();

    /* renamed from: d */
    public C28716av f49718d;

    /* renamed from: e */
    public int f49719e;

    /* renamed from: f */
    public boolean f49720f;

    /* renamed from: h */
    private byte f49721h = 2;

    static {
        C17078w wVar = new C17078w();
        f49713g = wVar;
        C62942bv.registerDefaultInstance(C17078w.class, wVar);
    }

    private C17078w() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f49721h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f49721h = b;
                return null;
            case 2:
                return newMessageInfo(f49713g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0002\u0001Л\u0002ဉ\u0000\u0003ဌ\u0001\u0004ဇ\u0002\u0005Л", new Object[]{"a", "b", C17036ac.class, "d", "e", C17076u.f49712a, C10662f.f35572a, C45240c.f118157a, C17036ac.class});
            case 3:
                return new C17078w();
            case 4:
                return new C17075t();
            case 5:
                return f49713g;
            case 6:
                C63010eb ebVar = f49714i;
                if (ebVar == null) {
                    synchronized (C17078w.class) {
                        ebVar = f49714i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49713g);
                            f49714i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
