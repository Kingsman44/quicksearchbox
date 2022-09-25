package com.google.android.libraries.web.p3353c;

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

/* renamed from: com.google.android.libraries.web.c.u */
/* compiled from: PG */
public final class C43376u extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C43376u f113326k;

    /* renamed from: m */
    private static volatile C63010eb f113327m;

    /* renamed from: a */
    public int f113328a;

    /* renamed from: b */
    public String f113329b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f113330c;

    /* renamed from: d */
    public C43363h f113331d;

    /* renamed from: e */
    public int f113332e;

    /* renamed from: f */
    public int f113333f;

    /* renamed from: g */
    public String f113334g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C43367l f113335h;

    /* renamed from: i */
    public C43323b f113336i;

    /* renamed from: j */
    public int f113337j;

    /* renamed from: l */
    private byte f113338l = 2;

    static {
        C43376u uVar = new C43376u();
        f113326k = uVar;
        C62942bv.registerDefaultInstance(C43376u.class, uVar);
    }

    private C43376u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f113338l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f113338l = b;
                return null;
            case 2:
                return newMessageInfo(f113326k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0002\u0001ဈ\u0000\u0003ဌ\u0001\u0004ဉ\u0002\u0005ဋ\u0004\u0006ဈ\u0005\bဌ\u0003\tᐉ\u0006\nᐉ\u0007\fဌ\b", new Object[]{"a", "b", C45240c.f118157a, C43369n.m76520b(), "d", C10662f.f35572a, C30325g.f82003a, "e", C43366k.m76518b(), C19618h.f54585a, "i", "j", C43374s.m76524b()});
            case 3:
                return new C43376u();
            case 4:
                return new C43375t();
            case 5:
                return f113326k;
            case 6:
                C63010eb ebVar = f113327m;
                if (ebVar == null) {
                    synchronized (C43376u.class) {
                        ebVar = f113327m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f113326k);
                            f113327m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
