package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52395qd;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.C52541vo;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.az */
/* compiled from: PG */
public final class C50954az extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C50954az f132639n;

    /* renamed from: p */
    private static volatile C63010eb f132640p;

    /* renamed from: a */
    public int f132641a;

    /* renamed from: b */
    public int f132642b = 0;

    /* renamed from: c */
    public Object f132643c;

    /* renamed from: d */
    public C51012dc f132644d;

    /* renamed from: e */
    public String f132645e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C51016dg f132646f;

    /* renamed from: g */
    public C51012dc f132647g;

    /* renamed from: h */
    public C51016dg f132648h;

    /* renamed from: i */
    public int f132649i;

    /* renamed from: j */
    public int f132650j;

    /* renamed from: k */
    public int f132651k;

    /* renamed from: l */
    public String f132652l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public int f132653m;

    /* renamed from: o */
    private byte f132654o = 2;

    static {
        C50954az azVar = new C50954az();
        f132639n = azVar;
        C62942bv.registerDefaultInstance(C50954az.class, azVar);
    }

    private C50954az() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132654o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132654o = b;
                return null;
            case 2:
                return newMessageInfo(f132639n, "\u0001\u000f\u0001\u0001\u0001\u000f\u000f\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bᐉ\u0007\tᐉ\b\nဌ\n\u000bဌ\u000b\fဌ\f\rဈ\r\u000eင\u000e\u000fᐉ\t", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C52393qb.class, C52403ql.class, C52395qd.class, C52397qf.class, C52541vo.class, C10662f.f35572a, C30325g.f82003a, "i", C50951aw.m85989b(), "j", C50948at.f132629a, C19621k.f54601a, C50952ax.f132638a, "l", "m", C19618h.f54585a});
            case 3:
                return new C50954az();
            case 4:
                return new C50947as();
            case 5:
                return f132639n;
            case 6:
                C63010eb ebVar = f132640p;
                if (ebVar == null) {
                    synchronized (C50954az.class) {
                        ebVar = f132640p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132639n);
                            f132640p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
