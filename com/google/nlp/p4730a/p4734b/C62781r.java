package com.google.nlp.p4730a.p4734b;

import com.google.nlp.p4730a.C62737aa;
import com.google.nlp.p4730a.C62739ac;
import com.google.nlp.p4730a.C62741ae;
import com.google.nlp.p4730a.C62743ag;
import com.google.nlp.p4730a.C62745ai;
import com.google.nlp.p4730a.C62747ak;
import com.google.nlp.p4730a.C62749am;
import com.google.nlp.p4730a.C62754ar;
import com.google.nlp.p4730a.C62793m;
import com.google.nlp.p4730a.C62795o;
import com.google.nlp.p4730a.C62803w;
import com.google.nlp.p4730a.C62805y;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.b.r */
/* compiled from: PG */
public final class C62781r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62781r f169534c;

    /* renamed from: e */
    private static volatile C63010eb f169535e;

    /* renamed from: a */
    public int f169536a = 0;

    /* renamed from: b */
    public Object f169537b;

    /* renamed from: d */
    private byte f169538d = 2;

    static {
        C62781r rVar = new C62781r();
        f169534c = rVar;
        C62942bv.registerDefaultInstance(C62781r.class, rVar);
    }

    private C62781r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169538d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169538d = b;
                return null;
            case 2:
                return newMessageInfo(f169534c, "\u0001\u0010\u0001\u0000\u00012\u0010\u0000\u0000\u0006\u0001ᐼ\u0000\u0002်\u0000\u0003ျ\u0000\u0004ဵ\u0000\u0005ဳ\u0000\u0006ᐼ\u0000\u0007ᐼ\u0000\bြ\u0000\tြ\u0000\nᐼ\u0000\u000bြ\u0000\fᐼ\u0000\rြ\u0000\u000eြ\u0000\u000fᐼ\u00002ြ\u0000", new Object[]{"b", "a", C62795o.class, C62741ae.class, C62749am.class, C62737aa.class, C62805y.class, C62747ak.class, C62754ar.class, C62743ag.class, C62739ac.class, C62745ai.class, C62793m.class, C62803w.class});
            case 3:
                return new C62781r();
            case 4:
                return new C62780q();
            case 5:
                return f169534c;
            case 6:
                C63010eb ebVar = f169535e;
                if (ebVar == null) {
                    synchronized (C62781r.class) {
                        ebVar = f169535e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169534c);
                            f169535e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
