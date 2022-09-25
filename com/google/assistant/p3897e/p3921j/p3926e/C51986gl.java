package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51133hp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.e.gl */
/* compiled from: PG */
public final class C51986gl extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51986gl f136421f;

    /* renamed from: h */
    private static volatile C63010eb f136422h;

    /* renamed from: a */
    public int f136423a;

    /* renamed from: b */
    public C62971cq f136424b = emptyProtobufList();

    /* renamed from: c */
    public int f136425c;

    /* renamed from: d */
    public C62971cq f136426d;

    /* renamed from: e */
    public C51983gi f136427e;

    /* renamed from: g */
    private byte f136428g = 2;

    static {
        C51986gl glVar = new C51986gl();
        f136421f = glVar;
        C62942bv.registerDefaultInstance(C51986gl.class, glVar);
    }

    private C51986gl() {
        C63088z zVar = C63088z.f170246b;
        this.f136426d = emptyProtobufList();
    }

    /* renamed from: b */
    public static C63010eb m86461b() {
        return f136421f.getParserForType();
    }

    /* renamed from: a */
    public final void mo53773a() {
        C62971cq cqVar = this.f136424b;
        if (!cqVar.mo58948c()) {
            this.f136424b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136428g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136428g = b;
                return null;
            case 2:
                return newMessageInfo(f136421f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0002\u0001Л\u0003ဌ\u0001\u0004Л\u0005ဉ\u0002", new Object[]{"a", "b", C51992gr.class, C45240c.f118157a, C51133hp.m86036b(), "d", C51985gk.class, "e"});
            case 3:
                return new C51986gl();
            case 4:
                return new C51981gg();
            case 5:
                return f136421f;
            case 6:
                C63010eb ebVar = f136422h;
                if (ebVar == null) {
                    synchronized (C51986gl.class) {
                        ebVar = f136422h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136421f);
                            f136422h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
