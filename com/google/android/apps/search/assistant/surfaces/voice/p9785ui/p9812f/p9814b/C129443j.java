package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65559q;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.j */
/* compiled from: PG */
public final class C129443j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C129443j f355415c;

    /* renamed from: d */
    private static volatile C63010eb f355416d;

    /* renamed from: a */
    public int f355417a;

    /* renamed from: b */
    public C65559q f355418b;

    static {
        C129443j jVar = new C129443j();
        f355415c = jVar;
        C62942bv.registerDefaultInstance(C129443j.class, jVar);
    }

    private C129443j() {
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
                return newMessageInfo(f355415c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C129443j();
            case 4:
                return new C129442i();
            case 5:
                return f355415c;
            case 6:
                C63010eb ebVar = f355416d;
                if (ebVar == null) {
                    synchronized (C129443j.class) {
                        ebVar = f355416d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355415c);
                            f355416d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
