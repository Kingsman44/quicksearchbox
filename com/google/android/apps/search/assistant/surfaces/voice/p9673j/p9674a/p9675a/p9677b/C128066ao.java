package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.ao */
/* compiled from: PG */
public final class C128066ao extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C128066ao f352380e;

    /* renamed from: g */
    private static volatile C63010eb f352381g;

    /* renamed from: a */
    public int f352382a;

    /* renamed from: b */
    public int f352383b = 0;

    /* renamed from: c */
    public Object f352384c;

    /* renamed from: d */
    public int f352385d;

    /* renamed from: f */
    private byte f352386f = 2;

    static {
        C128066ao aoVar = new C128066ao();
        f352380e = aoVar;
        C62942bv.registerDefaultInstance(C128066ao.class, aoVar);
    }

    private C128066ao() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f352386f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f352386f = b;
                return null;
            case 2:
                return newMessageInfo(f352380e, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ျ\u0000\u0002ြ\u0000\u0003ဌ\u0004\u0004ြ\u0000\u0005ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", C128064am.class, "d", e.b(), C51805du.class, C51992gr.class});
            case 3:
                return new C128066ao();
            case 4:
                return new C128065an();
            case 5:
                return f352380e;
            case 6:
                C63010eb ebVar = f352381g;
                if (ebVar == null) {
                    synchronized (C128066ao.class) {
                        ebVar = f352381g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352380e);
                            f352381g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
