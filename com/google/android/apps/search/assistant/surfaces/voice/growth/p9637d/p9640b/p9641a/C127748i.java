package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.a.i */
/* compiled from: PG */
public final class C127748i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f351655d = new C127744e();

    /* renamed from: e */
    public static final C127748i f351656e;

    /* renamed from: f */
    private static volatile C63010eb f351657f;

    /* renamed from: a */
    public String f351658a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f351659b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C62961ch f351660c = emptyIntList();

    static {
        C127748i iVar = new C127748i();
        f351656e = iVar;
        C62942bv.registerDefaultInstance(C127748i.class, iVar);
    }

    private C127748i() {
    }

    /* renamed from: a */
    public final void mo108210a() {
        C62971cq cqVar = this.f351659b;
        if (!cqVar.mo58948c()) {
            this.f351659b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo108211b() {
        C62961ch chVar = this.f351660c;
        if (!chVar.mo58948c()) {
            this.f351660c = C62942bv.mutableCopy(chVar);
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
                return newMessageInfo(f351656e, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0002\u0000\u0001Ȉ\u0003Ț\u0004,", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C127748i();
            case 4:
                return new C127745f();
            case 5:
                return f351656e;
            case 6:
                C63010eb ebVar = f351657f;
                if (ebVar == null) {
                    synchronized (C127748i.class) {
                        ebVar = f351657f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351656e);
                            f351657f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
