package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.mh */
/* compiled from: PG */
public final class C7851mh extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C7851mh f27519f;

    /* renamed from: h */
    private static volatile C63010eb f27520h;

    /* renamed from: a */
    public int f27521a;

    /* renamed from: b */
    public int f27522b;

    /* renamed from: c */
    public C62971cq f27523c = emptyProtobufList();

    /* renamed from: d */
    public String f27524d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f27525e;

    /* renamed from: g */
    private byte f27526g = 2;

    static {
        C7851mh mhVar = new C7851mh();
        f27519f = mhVar;
        C62942bv.registerDefaultInstance(C7851mh.class, mhVar);
    }

    private C7851mh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27526g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27526g = b;
                return null;
            case 2:
                return newMessageInfo(f27519f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဌ\u0000\u0002Л\u0003ဈ\u0001\u0004ဇ\u0002", new Object[]{"a", "b", C7847md.f27511a, C45240c.f118157a, C7850mg.class, "d", "e"});
            case 3:
                return new C7851mh();
            case 4:
                return new C7846mc();
            case 5:
                return f27519f;
            case 6:
                C63010eb ebVar = f27520h;
                if (ebVar == null) {
                    synchronized (C7851mh.class) {
                        ebVar = f27520h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27519f);
                            f27520h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
