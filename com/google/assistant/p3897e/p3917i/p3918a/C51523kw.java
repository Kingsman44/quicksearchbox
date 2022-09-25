package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.kw */
/* compiled from: PG */
public final class C51523kw extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C51523kw f134258i;

    /* renamed from: k */
    private static volatile C63010eb f134259k;

    /* renamed from: a */
    public int f134260a;

    /* renamed from: b */
    public C52428rj f134261b;

    /* renamed from: c */
    public C51527l f134262c;

    /* renamed from: d */
    public C51594nm f134263d;

    /* renamed from: e */
    public C51450id f134264e;

    /* renamed from: f */
    public String f134265f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f134266g;

    /* renamed from: h */
    public C51261bd f134267h;

    /* renamed from: j */
    private byte f134268j = 2;

    static {
        C51523kw kwVar = new C51523kw();
        f134258i = kwVar;
        C62942bv.registerDefaultInstance(C51523kw.class, kwVar);
    }

    private C51523kw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134268j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134268j = b;
                return null;
            case 2:
                return newMessageInfo(f134258i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\bဉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C51523kw();
            case 4:
                return new C51522kv();
            case 5:
                return f134258i;
            case 6:
                C63010eb ebVar = f134259k;
                if (ebVar == null) {
                    synchronized (C51523kw.class) {
                        ebVar = f134259k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134258i);
                            f134259k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
