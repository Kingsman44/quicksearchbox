package com.google.android.apps.gsa.search.core.state.p6875g;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.search.core.state.g.d */
/* compiled from: PG */
public final class C87069d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87069d f235258c;

    /* renamed from: d */
    public static final C62940bt f235259d;

    /* renamed from: e */
    private static volatile C63010eb f235260e;

    /* renamed from: a */
    public int f235261a;

    /* renamed from: b */
    public String f235262b = BuildConfig.FLAVOR;

    static {
        C87069d dVar = new C87069d();
        f235258c = dVar;
        C62942bv.registerDefaultInstance(C87069d.class, dVar);
        f235259d = C62942bv.newSingularGeneratedExtension(C88433bd.f239087e, dVar, dVar, (C62958ce) null, 146514374, C63066gd.MESSAGE, C87069d.class);
    }

    private C87069d() {
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
                return newMessageInfo(f235258c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87069d();
            case 4:
                return new C87068c();
            case 5:
                return f235258c;
            case 6:
                C63010eb ebVar = f235260e;
                if (ebVar == null) {
                    synchronized (C87069d.class) {
                        ebVar = f235260e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f235258c);
                            f235260e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
