package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.C50871b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.nm */
/* compiled from: PG */
public final class C51594nm extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51594nm f134474f;

    /* renamed from: g */
    private static volatile C63010eb f134475g;

    /* renamed from: a */
    public int f134476a;

    /* renamed from: b */
    public C62971cq f134477b = emptyProtobufList();

    /* renamed from: c */
    public boolean f134478c;

    /* renamed from: d */
    public C62971cq f134479d = emptyProtobufList();

    /* renamed from: e */
    public String f134480e = BuildConfig.FLAVOR;

    static {
        C51594nm nmVar = new C51594nm();
        f134474f = nmVar;
        C62942bv.registerDefaultInstance(C51594nm.class, nmVar);
    }

    private C51594nm() {
    }

    /* renamed from: a */
    public final void mo53651a() {
        C62971cq cqVar = this.f134477b;
        if (!cqVar.mo58948c()) {
            this.f134477b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f134474f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0000\u0001\u001b\u0002ဇ\u0000\u0004\u001b\u0005ဈ\u0002", new Object[]{"a", "b", C51592nk.class, C45240c.f118157a, "d", C50871b.class, "e"});
            case 3:
                return new C51594nm();
            case 4:
                return new C51593nl();
            case 5:
                return f134474f;
            case 6:
                C63010eb ebVar = f134475g;
                if (ebVar == null) {
                    synchronized (C51594nm.class) {
                        ebVar = f134475g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134474f);
                            f134475g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
