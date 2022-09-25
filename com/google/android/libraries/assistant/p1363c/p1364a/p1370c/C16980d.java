package com.google.android.libraries.assistant.p1363c.p1364a.p1370c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.a.c.d */
/* compiled from: PG */
public final class C16980d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C16980d f49601e;

    /* renamed from: g */
    private static volatile C63010eb f49602g;

    /* renamed from: a */
    public String f49603a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C16982f f49604b;

    /* renamed from: c */
    public C62971cq f49605c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62971cq f49606d = C62942bv.emptyProtobufList();

    /* renamed from: f */
    private byte f49607f = 2;

    static {
        C16980d dVar = new C16980d();
        f49601e = dVar;
        C62942bv.registerDefaultInstance(C16980d.class, dVar);
    }

    private C16980d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f49607f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f49607f = b;
                return null;
            case 2:
                return newMessageInfo(f49601e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0001\u0001Ȉ\u0002Љ\u0003Ț\u0004Ț", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C16980d();
            case 4:
                return new C16979c();
            case 5:
                return f49601e;
            case 6:
                C63010eb ebVar = f49602g;
                if (ebVar == null) {
                    synchronized (C16980d.class) {
                        ebVar = f49602g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49601e);
                            f49602g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
