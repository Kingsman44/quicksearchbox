package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.rt */
/* compiled from: PG */
public final class C52438rt extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C52438rt f137645h;

    /* renamed from: i */
    private static volatile C63010eb f137646i;

    /* renamed from: a */
    public int f137647a;

    /* renamed from: b */
    public String f137648b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f137649c;

    /* renamed from: d */
    public int f137650d;

    /* renamed from: e */
    public int f137651e;

    /* renamed from: f */
    public C63088z f137652f = C63088z.f170246b;

    /* renamed from: g */
    public String f137653g = BuildConfig.FLAVOR;

    static {
        C52438rt rtVar = new C52438rt();
        f137645h = rtVar;
        C62942bv.registerDefaultInstance(C52438rt.class, rtVar);
    }

    private C52438rt() {
    }

    /* renamed from: a */
    public final boolean mo53870a() {
        return (this.f137647a & 1) != 0;
    }

    /* renamed from: b */
    public final boolean mo53871b() {
        return (this.f137647a & 4) != 0;
    }

    /* renamed from: c */
    public final C55912b mo53872c() {
        C55912b a = C55912b.m87801a(this.f137649c);
        return a == null ? C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN : a;
    }

    /* renamed from: d */
    public final boolean mo53873d() {
        return (this.f137647a & 32) != 0;
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
                return newMessageInfo(f137645h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0002\u0003ည\u0005\u0004ဈ\u0006\u0005ဌ\u0003\u0007ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, C55912b.m87802b(), C10662f.f35572a, C30325g.f82003a, "d", C52436rr.f137644a, "e", C52434rp.m86631b()});
            case 3:
                return new C52438rt();
            case 4:
                return new C52435rq();
            case 5:
                return f137645h;
            case 6:
                C63010eb ebVar = f137646i;
                if (ebVar == null) {
                    synchronized (C52438rt.class) {
                        ebVar = f137646i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137645h);
                            f137646i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e */
    public final boolean mo53874e() {
        return (this.f137647a & 64) != 0;
    }
}
