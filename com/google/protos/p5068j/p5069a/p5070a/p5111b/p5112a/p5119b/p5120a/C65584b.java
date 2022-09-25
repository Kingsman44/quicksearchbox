package com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5119b.p5120a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57177h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.b.a.b.a.b */
/* compiled from: PG */
public final class C65584b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65584b f178257d;

    /* renamed from: f */
    private static volatile C63010eb f178258f;

    /* renamed from: a */
    public int f178259a;

    /* renamed from: b */
    public C57177h f178260b;

    /* renamed from: c */
    public String f178261c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private byte f178262e = 2;

    static {
        C65584b bVar = new C65584b();
        f178257d = bVar;
        C62942bv.registerDefaultInstance(C65584b.class, bVar);
    }

    private C65584b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178262e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178262e = b;
                return null;
            case 2:
                return newMessageInfo(f178257d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65584b();
            case 4:
                return new C65583a();
            case 5:
                return f178257d;
            case 6:
                C63010eb ebVar = f178258f;
                if (ebVar == null) {
                    synchronized (C65584b.class) {
                        ebVar = f178258f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178257d);
                            f178258f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
