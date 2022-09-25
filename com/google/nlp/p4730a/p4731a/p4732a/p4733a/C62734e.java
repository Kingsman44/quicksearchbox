package com.google.nlp.p4730a.p4731a.p4732a.p4733a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.a.a.a.e */
/* compiled from: PG */
public final class C62734e extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C62734e f169440g;

    /* renamed from: h */
    private static volatile C63010eb f169441h;

    /* renamed from: a */
    public int f169442a;

    /* renamed from: b */
    public String f169443b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f169444c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f169445d = emptyProtobufList();

    /* renamed from: e */
    public int f169446e;

    /* renamed from: f */
    public boolean f169447f;

    static {
        C62734e eVar = new C62734e();
        f169440g = eVar;
        C62942bv.registerDefaultInstance(C62734e.class, eVar);
    }

    private C62734e() {
    }

    /* renamed from: a */
    public final void mo58630a() {
        C62971cq cqVar = this.f169445d;
        if (!cqVar.mo58948c()) {
            this.f169445d = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f169440g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဌ\u0002\u0006ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C62736g.class, "e", C62733d.m94944b(), C10662f.f35572a});
            case 3:
                return new C62734e();
            case 4:
                return new C62731b();
            case 5:
                return f169440g;
            case 6:
                C63010eb ebVar = f169441h;
                if (ebVar == null) {
                    synchronized (C62734e.class) {
                        ebVar = f169441h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169440g);
                            f169441h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
