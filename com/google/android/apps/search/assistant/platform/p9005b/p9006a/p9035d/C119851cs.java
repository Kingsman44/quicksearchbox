package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.cs */
/* compiled from: PG */
public final class C119851cs extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C119851cs f333803i;

    /* renamed from: k */
    private static volatile C63010eb f333804k;

    /* renamed from: a */
    public int f333805a;

    /* renamed from: b */
    public int f333806b = 0;

    /* renamed from: c */
    public Object f333807c;

    /* renamed from: d */
    public C34053bp f333808d;

    /* renamed from: e */
    public String f333809e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C119824bs f333810f;

    /* renamed from: g */
    public C32849cq f333811g;

    /* renamed from: h */
    public boolean f333812h;

    /* renamed from: j */
    private byte f333813j = 2;

    static {
        C119851cs csVar = new C119851cs();
        f333803i = csVar;
        C62942bv.registerDefaultInstance(C119851cs.class, csVar);
    }

    private C119851cs() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333813j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333813j = b;
                return null;
            case 2:
                return newMessageInfo(f333803i, "\u0000\u0007\u0001\u0001\u0002\b\u0007\u0000\u0000\u0002\u0002м\u0000\u0003<\u0000\u0004ᐉ\u0000\u0005ለ\u0001\u0006\t\u0007ဉ\u0002\bဇ\u0003", new Object[]{C45240c.f118157a, "b", "a", C119850cr.class, C119847co.class, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C119851cs();
            case 4:
                return new C119845cm();
            case 5:
                return f333803i;
            case 6:
                C63010eb ebVar = f333804k;
                if (ebVar == null) {
                    synchronized (C119851cs.class) {
                        ebVar = f333804k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333803i);
                            f333804k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
