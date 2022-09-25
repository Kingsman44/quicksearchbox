package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.dv */
/* compiled from: PG */
public final class C14292dv extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C14292dv f43233q;

    /* renamed from: s */
    private static volatile C63010eb f43234s;

    /* renamed from: a */
    public int f43235a = 0;

    /* renamed from: b */
    public Object f43236b;

    /* renamed from: c */
    public int f43237c = 0;

    /* renamed from: d */
    public Object f43238d;

    /* renamed from: e */
    public C14216b f43239e;

    /* renamed from: f */
    public String f43240f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f43241g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f43242h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f43243i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C51805du f43244j;

    /* renamed from: k */
    public String f43245k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f43246l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public int f43247m;

    /* renamed from: n */
    public C63204j f43248n;

    /* renamed from: o */
    public String f43249o = BuildConfig.FLAVOR;

    /* renamed from: p */
    public int f43250p;

    /* renamed from: r */
    private byte f43251r = 2;

    static {
        C14292dv dvVar = new C14292dv();
        f43233q = dvVar;
        C62942bv.registerDefaultInstance(C14292dv.class, dvVar);
    }

    private C14292dv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43251r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43251r = b;
                return null;
            case 2:
                return newMessageInfo(f43233q, "\u0000\u0010\u0002\u0000\u0001\u0011\u0010\u0000\u0000\u0001\u0001\t\u0002Ȉ\u0003Ȉ\u0004Ȼ\u0000\u0005=\u0000\u0006Ȉ\u0007\t\tȈ\n\u0004\u000bЉ\fȈ\r\f\u000eȻ\u0001\u000f<\u0001\u0010Ȉ\u0011Ȉ", new Object[]{"b", "a", "d", C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, "i", "j", "l", "m", C48004n.f124238a, C66412o.f180592a, "p", C14361gj.class, C19618h.f54585a, C19621k.f54601a});
            case 3:
                return new C14292dv();
            case 4:
                return new C14290dt();
            case 5:
                return f43233q;
            case 6:
                C63010eb ebVar = f43234s;
                if (ebVar == null) {
                    synchronized (C14292dv.class) {
                        ebVar = f43234s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43233q);
                            f43234s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
