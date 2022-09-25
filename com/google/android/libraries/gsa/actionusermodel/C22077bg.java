package com.google.android.libraries.gsa.actionusermodel;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p4986a.C64708r;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.bg */
/* compiled from: PG */
public final class C22077bg extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C22077bg f60849o;

    /* renamed from: q */
    private static volatile C63010eb f60850q;

    /* renamed from: a */
    public int f60851a;

    /* renamed from: b */
    public int f60852b;

    /* renamed from: c */
    public String f60853c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f60854d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f60855e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f60856f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C62971cq f60857g = C62942bv.emptyProtobufList();

    /* renamed from: h */
    public String f60858h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C63088z f60859i = C63088z.f170246b;

    /* renamed from: j */
    public boolean f60860j;

    /* renamed from: k */
    public C64708r f60861k;

    /* renamed from: l */
    public boolean f60862l;

    /* renamed from: m */
    public boolean f60863m;

    /* renamed from: n */
    public boolean f60864n;

    /* renamed from: p */
    private byte f60865p = 2;

    static {
        C22077bg bgVar = new C22077bg();
        f60849o = bgVar;
        C62942bv.registerDefaultInstance(C22077bg.class, bgVar);
    }

    private C22077bg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f60865p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f60865p = b;
                return null;
            case 2:
                return newMessageInfo(f60849o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006\u001a\u0007ဈ\u0005\bည\u0006\tဇ\u0007\nᐉ\b\u000bဇ\t\fဇ\n\rဇ\u000b", new Object[]{"a", "b", C55421x.m87687b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a});
            case 3:
                return new C22077bg();
            case 4:
                return new C22076bf();
            case 5:
                return f60849o;
            case 6:
                C63010eb ebVar = f60850q;
                if (ebVar == null) {
                    synchronized (C22077bg.class) {
                        ebVar = f60850q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f60849o);
                            f60850q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
