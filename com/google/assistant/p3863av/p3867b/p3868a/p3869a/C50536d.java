package com.google.assistant.p3863av.p3867b.p3868a.p3869a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.b.a.a.d */
/* compiled from: PG */
public final class C50536d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50536d f131526e;

    /* renamed from: g */
    private static volatile C63010eb f131527g;

    /* renamed from: a */
    public int f131528a;

    /* renamed from: b */
    public C62971cq f131529b;

    /* renamed from: c */
    public String f131530c;

    /* renamed from: d */
    public String f131531d;

    /* renamed from: f */
    private byte f131532f = 2;

    static {
        C50536d dVar = new C50536d();
        f131526e = dVar;
        C62942bv.registerDefaultInstance(C50536d.class, dVar);
    }

    private C50536d() {
        emptyProtobufList();
        this.f131529b = emptyProtobufList();
        this.f131530c = BuildConfig.FLAVOR;
        this.f131531d = BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f131532f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f131532f = b;
                return null;
            case 2:
                return newMessageInfo(f131526e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u001b\u0003ဈ\u0000\u0004ဈ\u0001", new Object[]{"a", "b", C50534b.class, C45240c.f118157a, "d"});
            case 3:
                return new C50536d();
            case 4:
                return new C50535c();
            case 5:
                return f131526e;
            case 6:
                C63010eb ebVar = f131527g;
                if (ebVar == null) {
                    synchronized (C50536d.class) {
                        ebVar = f131527g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131526e);
                            f131527g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
