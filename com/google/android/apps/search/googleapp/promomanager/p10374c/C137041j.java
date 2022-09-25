package com.google.android.apps.search.googleapp.promomanager.p10374c;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.c.j */
/* compiled from: PG */
public final class C137041j extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C137041j f372939g;

    /* renamed from: i */
    private static volatile C63010eb f372940i;

    /* renamed from: a */
    public int f372941a;

    /* renamed from: b */
    public C62961ch f372942b;

    /* renamed from: c */
    public C62995dn f372943c = C62995dn.f170057a;

    /* renamed from: d */
    public C62995dn f372944d;

    /* renamed from: e */
    public C137048q f372945e;

    /* renamed from: f */
    public C63042fg f372946f;

    /* renamed from: h */
    private C62995dn f372947h;

    static {
        C137041j jVar = new C137041j();
        f372939g = jVar;
        C62942bv.registerDefaultInstance(C137041j.class, jVar);
    }

    private C137041j() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f372944d = dnVar;
        this.f372947h = dnVar;
        this.f372942b = emptyIntList();
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
                return newMessageInfo(f372939g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0003\u0001\u0000\u0001\u0016\u00022\u00032\u0004ဉ\u0000\u00052\u0006ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a, C137039h.f372937a, "d", C137040i.f372938a, "e", C19618h.f54585a, C137038g.f372936a, C10662f.f35572a});
            case 3:
                return new C137041j();
            case 4:
                return new C137037f();
            case 5:
                return f372939g;
            case 6:
                C63010eb ebVar = f372940i;
                if (ebVar == null) {
                    synchronized (C137041j.class) {
                        ebVar = f372940i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372939g);
                            f372940i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
