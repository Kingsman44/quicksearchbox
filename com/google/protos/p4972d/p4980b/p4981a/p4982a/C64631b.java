package com.google.protos.p4972d.p4980b.p4981a.p4982a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C60321oe;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.protos.d.b.a.a.b */
/* compiled from: PG */
public final class C64631b extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C64631b f175197n;

    /* renamed from: q */
    private static volatile C63010eb f175198q;

    /* renamed from: a */
    public int f175199a;

    /* renamed from: b */
    public C65926d f175200b;

    /* renamed from: c */
    public int f175201c;

    /* renamed from: d */
    public String f175202d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f175203e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f175204f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f175205g;

    /* renamed from: h */
    public boolean f175206h;

    /* renamed from: i */
    public boolean f175207i;

    /* renamed from: j */
    public boolean f175208j;

    /* renamed from: k */
    public String f175209k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f175210l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public boolean f175211m = true;

    /* renamed from: o */
    private C60321oe f175212o;

    /* renamed from: p */
    private byte f175213p = 2;

    static {
        C64631b bVar = new C64631b();
        f175197n = bVar;
        C62942bv.registerDefaultInstance(C64631b.class, bVar);
    }

    private C64631b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175213p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175213p = b;
                return null;
            case 2:
                return newMessageInfo(f175197n, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0002\u0001ᐉ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ᐉ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဈ\n\fဈ\u000b\rဇ\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C66412o.f180592a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new C64631b();
            case 4:
                return new C64630a();
            case 5:
                return f175197n;
            case 6:
                C63010eb ebVar = f175198q;
                if (ebVar == null) {
                    synchronized (C64631b.class) {
                        ebVar = f175198q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175197n);
                            f175198q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
