package com.google.p375ai.p378b;

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

/* renamed from: com.google.ai.b.cd */
/* compiled from: PG */
public final class C7577cd extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C7577cd f26179i;

    /* renamed from: j */
    private static volatile C63010eb f26180j;

    /* renamed from: a */
    public int f26181a;

    /* renamed from: b */
    public int f26182b = 1;

    /* renamed from: c */
    public String f26183c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f26184d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f26185e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f26186f;

    /* renamed from: g */
    public boolean f26187g;

    /* renamed from: h */
    public boolean f26188h;

    static {
        C7577cd cdVar = new C7577cd();
        f26179i = cdVar;
        C62942bv.registerDefaultInstance(C7577cd.class, cdVar);
    }

    private C7577cd() {
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
                return newMessageInfo(f26179i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", C7575cb.f26178a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C7577cd();
            case 4:
                return new C7574ca();
            case 5:
                return f26179i;
            case 6:
                C63010eb ebVar = f26180j;
                if (ebVar == null) {
                    synchronized (C7577cd.class) {
                        ebVar = f26180j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26179i);
                            f26180j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
