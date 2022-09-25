package com.google.assistant.p3825an.p3830c.p3831a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.ak */
/* compiled from: PG */
public final class C49265ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49265ak f127342c;

    /* renamed from: d */
    private static volatile C63010eb f127343d;

    /* renamed from: a */
    public String f127344a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f127345b = emptyProtobufList();

    static {
        C49265ak akVar = new C49265ak();
        f127342c = akVar;
        C62942bv.registerDefaultInstance(C49265ak.class, akVar);
    }

    private C49265ak() {
    }

    /* renamed from: a */
    public final void mo53225a() {
        C62971cq cqVar = this.f127345b;
        if (!cqVar.mo58948c()) {
            this.f127345b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f127342c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"a", "b", C49320cl.class});
            case 3:
                return new C49265ak();
            case 4:
                return new C49264aj();
            case 5:
                return f127342c;
            case 6:
                C63010eb ebVar = f127343d;
                if (ebVar == null) {
                    synchronized (C49265ak.class) {
                        ebVar = f127343d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127342c);
                            f127343d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
