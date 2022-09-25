package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.co */
/* compiled from: PG */
public final class C50997co extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C50997co f132759h;

    /* renamed from: k */
    private static volatile C63010eb f132760k;

    /* renamed from: a */
    public int f132761a;

    /* renamed from: b */
    public String f132762b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f132763c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f132764d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f132765e;

    /* renamed from: f */
    public C51016dg f132766f;

    /* renamed from: g */
    public C51141hx f132767g;

    /* renamed from: i */
    private C51016dg f132768i;

    /* renamed from: j */
    private byte f132769j = 2;

    static {
        C50997co coVar = new C50997co();
        f132759h = coVar;
        C62942bv.registerDefaultInstance(C50997co.class, coVar);
    }

    private C50997co() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132769j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132769j = b;
                return null;
            case 2:
                return newMessageInfo(f132759h, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0003\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဌ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C50995cm.f132758a, C10662f.f35572a, "i", C30325g.f82003a});
            case 3:
                return new C50997co();
            case 4:
                return new C50994cl();
            case 5:
                return f132759h;
            case 6:
                C63010eb ebVar = f132760k;
                if (ebVar == null) {
                    synchronized (C50997co.class) {
                        ebVar = f132760k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132759h);
                            f132760k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
