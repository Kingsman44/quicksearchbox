package com.google.assistant.p4008y.p4009a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4813ah.p4814a.p4815a.C63171d;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.assistant.y.a.ah */
/* compiled from: PG */
public final class C53548ah extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C53548ah f140519n;

    /* renamed from: q */
    private static volatile C63010eb f140520q;

    /* renamed from: a */
    public int f140521a;

    /* renamed from: b */
    public int f140522b;

    /* renamed from: c */
    public int f140523c;

    /* renamed from: d */
    public String f140524d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f140525e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f140526f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C53550aj f140527g;

    /* renamed from: h */
    public C62995dn f140528h = C62995dn.f170057a;

    /* renamed from: i */
    public boolean f140529i;

    /* renamed from: j */
    public C51715bm f140530j;

    /* renamed from: k */
    public boolean f140531k;

    /* renamed from: l */
    public C53544ad f140532l;

    /* renamed from: m */
    public String f140533m;

    /* renamed from: o */
    private C63171d f140534o;

    /* renamed from: p */
    private byte f140535p = 2;

    static {
        C53548ah ahVar = new C53548ah();
        f140519n = ahVar;
        C62942bv.registerDefaultInstance(C53548ah.class, ahVar);
    }

    private C53548ah() {
        emptyIntList();
        this.f140533m = BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140535p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140535p = b;
                return null;
            case 2:
                return newMessageInfo(f140519n, "\u0001\r\u0000\u0001\u0001\u0011\r\u0001\u0000\u0002\u0001ဌ\u0000\u0002ဌ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဉ\u0005\b2\nဇ\u0007\fᐉ\t\u000eဇ\n\u000fᐉ\u000b\u0010ဉ\f\u0011ဈ\r", new Object[]{"a", "b", C52431rm.m86629c(), C45240c.f118157a, C53547ag.f140518a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C53546af.f140517a, "i", "j", C19621k.f54601a, C66412o.f180592a, "l", "m"});
            case 3:
                return new C53548ah();
            case 4:
                return new C53545ae();
            case 5:
                return f140519n;
            case 6:
                C63010eb ebVar = f140520q;
                if (ebVar == null) {
                    synchronized (C53548ah.class) {
                        ebVar = f140520q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140519n);
                            f140520q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
