package com.google.android.apps.gsa.opa.smartspace.p6455d;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.assistant.p3886c.C50706ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.d.p */
/* compiled from: PG */
public final class C83773p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C83773p f228327b;

    /* renamed from: c */
    public static final C62940bt f228328c;

    /* renamed from: f */
    private static volatile C63010eb f228329f;

    /* renamed from: a */
    public C123746bm f228330a;

    /* renamed from: d */
    private int f228331d;

    /* renamed from: e */
    private byte f228332e = 2;

    static {
        C83773p pVar = new C83773p();
        f228327b = pVar;
        C62942bv.registerDefaultInstance(C83773p.class, pVar);
        f228328c = C62942bv.newSingularGeneratedExtension(C50706ar.f131960a, pVar, pVar, (C62958ce) null, 298473137, C63066gd.MESSAGE, C83773p.class);
    }

    private C83773p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f228332e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f228332e = b;
                return null;
            case 2:
                return newMessageInfo(f228327b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C83773p();
            case 4:
                return new C83772o();
            case 5:
                return f228327b;
            case 6:
                C63010eb ebVar = f228329f;
                if (ebVar == null) {
                    synchronized (C83773p.class) {
                        ebVar = f228329f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228327b);
                            f228329f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
