package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2688a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34047bj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.C66948fk;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.c.a.c */
/* compiled from: PG */
public final class C34670c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f92053c = new C34668a();

    /* renamed from: e */
    public static final C34670c f92054e;

    /* renamed from: f */
    public static final C62940bt f92055f;

    /* renamed from: h */
    private static volatile C63010eb f92056h;

    /* renamed from: a */
    public String f92057a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62961ch f92058b = emptyIntList();

    /* renamed from: d */
    public boolean f92059d;

    /* renamed from: g */
    private int f92060g;

    static {
        C34670c cVar = new C34670c();
        f92054e = cVar;
        C62942bv.registerDefaultInstance(C34670c.class, cVar);
        f92055f = C62942bv.newSingularGeneratedExtension(C34047bj.f90746a, cVar, cVar, (C62958ce) null, 2, C63066gd.MESSAGE, C34670c.class);
    }

    private C34670c() {
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
                return newMessageInfo(f92054e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{C30325g.f82003a, "b", C66948fk.m97390b(), "a", "d"});
            case 3:
                return new C34670c();
            case 4:
                return new C34669b();
            case 5:
                return f92054e;
            case 6:
                C63010eb ebVar = f92056h;
                if (ebVar == null) {
                    synchronized (C34670c.class) {
                        ebVar = f92056h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f92054e);
                            f92056h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
