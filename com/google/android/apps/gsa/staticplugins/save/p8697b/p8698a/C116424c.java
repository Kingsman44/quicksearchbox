package com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57582az;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57626cp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.b.a.c */
/* compiled from: PG */
public final class C116424c extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C62962ci f322814g = new C116422a();

    /* renamed from: o */
    public static final C116424c f322815o;

    /* renamed from: p */
    private static volatile C63010eb f322816p;

    /* renamed from: a */
    public int f322817a = 0;

    /* renamed from: b */
    public Object f322818b;

    /* renamed from: c */
    public String f322819c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f322820d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f322821e;

    /* renamed from: f */
    public C62961ch f322822f = emptyIntList();

    /* renamed from: h */
    public boolean f322823h;

    /* renamed from: i */
    public boolean f322824i;

    /* renamed from: j */
    public String f322825j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public int f322826k;

    /* renamed from: l */
    public C57582az f322827l;

    /* renamed from: m */
    public C57626cp f322828m;

    /* renamed from: n */
    public String f322829n = BuildConfig.FLAVOR;

    static {
        C116424c cVar = new C116424c();
        f322815o = cVar;
        C62942bv.registerDefaultInstance(C116424c.class, cVar);
    }

    private C116424c() {
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
                return newMessageInfo(f322815o, "\u0000\r\u0001\u0000\u0001\u000e\r\u0000\u0001\u0000\u0001Ȼ\u0000\u0002?\u0000\u0003Ȉ\u0004Ȉ\u0006\f\u0007,\b\u0007\t\u0007\nȈ\u000b\f\f\t\r\t\u000eȈ", new Object[]{"b", "a", "d", C45240c.f118157a, "e", C10662f.f35572a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a});
            case 3:
                return new C116424c();
            case 4:
                return new C116423b();
            case 5:
                return f322815o;
            case 6:
                C63010eb ebVar = f322816p;
                if (ebVar == null) {
                    synchronized (C116424c.class) {
                        ebVar = f322816p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f322815o);
                            f322816p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
