package com.google.assistant.p3858ar.p3859a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48656q;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4813ah.p4814a.p4815a.C63171d;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.assistant.ar.a.j */
/* compiled from: PG */
public final class C49720j extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C49720j f128316l;

    /* renamed from: o */
    private static volatile C63010eb f128317o;

    /* renamed from: a */
    public int f128318a;

    /* renamed from: b */
    public String f128319b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f128320c = "en";

    /* renamed from: d */
    public C62971cq f128321d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public boolean f128322e = true;

    /* renamed from: f */
    public boolean f128323f;

    /* renamed from: g */
    public C49712b f128324g;

    /* renamed from: h */
    public C49714d f128325h;

    /* renamed from: i */
    public C63771b f128326i;

    /* renamed from: j */
    public C62971cq f128327j = emptyProtobufList();

    /* renamed from: k */
    public C48656q f128328k;

    /* renamed from: m */
    private C63171d f128329m;

    /* renamed from: n */
    private byte f128330n = 2;

    static {
        C49720j jVar = new C49720j();
        f128316l = jVar;
        C62942bv.registerDefaultInstance(C49720j.class, jVar);
    }

    private C49720j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128330n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128330n = b;
                return null;
            case 2:
                return newMessageInfo(f128316l, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0002\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004\u001a\u0005ဇ\u0003\u0007ဇ\u0005\bဉ\u0006\tဉ\u0007\nᐉ\b\u000b\u001b\fဉ\t", new Object[]{"a", "b", C45240c.f118157a, "m", "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C49718h.class, C19621k.f54601a});
            case 3:
                return new C49720j();
            case 4:
                return new C49719i();
            case 5:
                return f128316l;
            case 6:
                C63010eb ebVar = f128317o;
                if (ebVar == null) {
                    synchronized (C49720j.class) {
                        ebVar = f128317o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128316l);
                            f128317o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
