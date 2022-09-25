package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.af */
/* compiled from: PG */
public final class C45626af extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C45626af f120002i;

    /* renamed from: j */
    private static volatile C63010eb f120003j;

    /* renamed from: a */
    public int f120004a;

    /* renamed from: b */
    public C45634an f120005b;

    /* renamed from: c */
    public String f120006c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f120007d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f120008e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f120009f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f120010g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f120011h = BuildConfig.FLAVOR;

    static {
        C45626af afVar = new C45626af();
        f120002i = afVar;
        C62942bv.registerDefaultInstance(C45626af.class, afVar);
    }

    private C45626af() {
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
                return newMessageInfo(f120002i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဈ\u0006\u0005ဈ\u0007\u0006ဈ\b\u0007ဈ\t\bဈ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C45626af();
            case 4:
                return new C45625ae();
            case 5:
                return f120002i;
            case 6:
                C63010eb ebVar = f120003j;
                if (ebVar == null) {
                    synchronized (C45626af.class) {
                        ebVar = f120003j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120002i);
                            f120003j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
