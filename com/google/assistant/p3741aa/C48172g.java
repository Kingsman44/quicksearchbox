package com.google.assistant.p3741aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3745ab.p3754f.C48324b;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aa.g */
/* compiled from: PG */
public final class C48172g extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48172g f124643f;

    /* renamed from: g */
    private static volatile C63010eb f124644g;

    /* renamed from: a */
    public int f124645a;

    /* renamed from: b */
    public String f124646b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f124647c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f124648d = emptyProtobufList();

    /* renamed from: e */
    public long f124649e;

    static {
        C48172g gVar = new C48172g();
        f124643f = gVar;
        C62942bv.registerDefaultInstance(C48172g.class, gVar);
    }

    private C48172g() {
    }

    /* renamed from: a */
    public final void mo53145a() {
        C62971cq cqVar = this.f124647c;
        if (!cqVar.mo58948c()) {
            this.f124647c = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f124643f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a, C52083ep.class, "d", C48324b.class, "e"});
            case 3:
                return new C48172g();
            case 4:
                return new C48171f();
            case 5:
                return f124643f;
            case 6:
                C63010eb ebVar = f124644g;
                if (ebVar == null) {
                    synchronized (C48172g.class) {
                        ebVar = f124644g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124643f);
                            f124644g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
