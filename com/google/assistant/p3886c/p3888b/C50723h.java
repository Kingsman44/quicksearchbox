package com.google.assistant.p3886c.p3888b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.b.h */
/* compiled from: PG */
public final class C50723h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50723h f131999e;

    /* renamed from: f */
    private static volatile C63010eb f132000f;

    /* renamed from: a */
    public int f132001a;

    /* renamed from: b */
    public String f132002b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f132003c;

    /* renamed from: d */
    public C62971cq f132004d = emptyProtobufList();

    static {
        C50723h hVar = new C50723h();
        f131999e = hVar;
        C62942bv.registerDefaultInstance(C50723h.class, hVar);
    }

    private C50723h() {
    }

    /* renamed from: a */
    public final void mo53431a() {
        C62971cq cqVar = this.f132004d;
        if (!cqVar.mo58948c()) {
            this.f132004d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f131999e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C50722g.m85894b(), "d", C50720e.class});
            case 3:
                return new C50723h();
            case 4:
                return new C50716a();
            case 5:
                return f131999e;
            case 6:
                C63010eb ebVar = f132000f;
                if (ebVar == null) {
                    synchronized (C50723h.class) {
                        ebVar = f132000f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131999e);
                            f132000f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
