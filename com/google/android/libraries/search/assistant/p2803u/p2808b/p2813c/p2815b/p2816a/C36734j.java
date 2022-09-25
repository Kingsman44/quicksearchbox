package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.C50362ug;
import com.google.p4184bj.p4193c.p4201f.C56002b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.j */
/* compiled from: PG */
public final class C36734j extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C62962ci f95714g = new C36732h();

    /* renamed from: j */
    public static final C36734j f95715j;

    /* renamed from: k */
    private static volatile C63010eb f95716k;

    /* renamed from: a */
    public int f95717a;

    /* renamed from: b */
    public C50362ug f95718b;

    /* renamed from: c */
    public boolean f95719c;

    /* renamed from: d */
    public boolean f95720d;

    /* renamed from: e */
    public boolean f95721e;

    /* renamed from: f */
    public C62961ch f95722f = emptyIntList();

    /* renamed from: h */
    public String f95723h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public boolean f95724i;

    static {
        C36734j jVar = new C36734j();
        f95715j = jVar;
        C62942bv.registerDefaultInstance(C36734j.class, jVar);
    }

    private C36734j() {
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
                return newMessageInfo(f95715j, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005\u001e\u0006ဈ\u0004\bဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C56002b.m87881b(), C19618h.f54585a, "i"});
            case 3:
                return new C36734j();
            case 4:
                return new C36733i();
            case 5:
                return f95715j;
            case 6:
                C63010eb ebVar = f95716k;
                if (ebVar == null) {
                    synchronized (C36734j.class) {
                        ebVar = f95716k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95715j);
                            f95716k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
