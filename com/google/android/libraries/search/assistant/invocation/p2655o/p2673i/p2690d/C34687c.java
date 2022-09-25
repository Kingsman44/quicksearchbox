package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2690d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34065ca;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34093db;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34697g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.d.c */
/* compiled from: PG */
public final class C34687c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C34687c f92099e;

    /* renamed from: f */
    public static final C62940bt f92100f;

    /* renamed from: h */
    private static volatile C63010eb f92101h;

    /* renamed from: a */
    public int f92102a;

    /* renamed from: b */
    public String f92103b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C34065ca f92104c;

    /* renamed from: d */
    public C34093db f92105d;

    /* renamed from: g */
    private byte f92106g = 2;

    static {
        C34687c cVar = new C34687c();
        f92099e = cVar;
        C62942bv.registerDefaultInstance(C34687c.class, cVar);
        f92100f = C62942bv.newSingularGeneratedExtension(C34697g.f92115a, cVar, cVar, (C62958ce) null, 1, C63066gd.MESSAGE, C34687c.class);
    }

    private C34687c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f92106g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f92106g = b;
                return null;
            case 2:
                return newMessageInfo(f92099e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C34687c();
            case 4:
                return new C34686b();
            case 5:
                return f92099e;
            case 6:
                C63010eb ebVar = f92101h;
                if (ebVar == null) {
                    synchronized (C34687c.class) {
                        ebVar = f92101h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f92099e);
                            f92101h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
