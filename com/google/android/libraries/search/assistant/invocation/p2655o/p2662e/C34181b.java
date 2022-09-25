package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34014ad;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.b */
/* compiled from: PG */
public final class C34181b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C34181b f90992h;

    /* renamed from: j */
    private static volatile C63010eb f90993j;

    /* renamed from: a */
    public int f90994a;

    /* renamed from: b */
    public int f90995b;

    /* renamed from: c */
    public int f90996c;

    /* renamed from: d */
    public String f90997d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C34014ad f90998e;

    /* renamed from: f */
    public long f90999f;

    /* renamed from: g */
    public String f91000g = BuildConfig.FLAVOR;

    /* renamed from: i */
    private byte f91001i = 2;

    static {
        C34181b bVar = new C34181b();
        f90992h = bVar;
        C62942bv.registerDefaultInstance(C34181b.class, bVar);
    }

    private C34181b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f91001i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f91001i = b;
                return null;
            case 2:
                return newMessageInfo(f90992h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဌ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", C34037b.m62691b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C34181b();
            case 4:
                return new C34154a();
            case 5:
                return f90992h;
            case 6:
                C63010eb ebVar = f90993j;
                if (ebVar == null) {
                    synchronized (C34181b.class) {
                        ebVar = f90993j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90992h);
                            f90993j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
