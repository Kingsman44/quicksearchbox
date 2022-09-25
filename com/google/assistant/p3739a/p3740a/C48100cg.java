package com.google.assistant.p3739a.p3740a;

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

/* renamed from: com.google.assistant.a.a.cg */
/* compiled from: PG */
public final class C48100cg extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C48100cg f124490j;

    /* renamed from: k */
    private static volatile C63010eb f124491k;

    /* renamed from: a */
    public int f124492a;

    /* renamed from: b */
    public int f124493b;

    /* renamed from: c */
    public int f124494c;

    /* renamed from: d */
    public String f124495d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f124496e;

    /* renamed from: f */
    public C48111h f124497f;

    /* renamed from: g */
    public long f124498g;

    /* renamed from: h */
    public String f124499h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f124500i;

    static {
        C48100cg cgVar = new C48100cg();
        f124490j = cgVar;
        C62942bv.registerDefaultInstance(C48100cg.class, cgVar);
    }

    private C48100cg() {
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
                return newMessageInfo(f124490j, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0002\f\u0003Ȉ\u0004\u0007\u0005\t\u0006\u0002\u0007Ȉ\bင\u0000", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C48100cg();
            case 4:
                return new C48099cf();
            case 5:
                return f124490j;
            case 6:
                C63010eb ebVar = f124491k;
                if (ebVar == null) {
                    synchronized (C48100cg.class) {
                        ebVar = f124491k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124490j);
                            f124491k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
