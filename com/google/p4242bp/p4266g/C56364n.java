package com.google.p4242bp.p4266g;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45632al;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.C63389bg;
import com.google.protos.p4985f.p5048z.p5051b.p5052a.C65402d;

/* renamed from: com.google.bp.g.n */
/* compiled from: PG */
public final class C56364n extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C56364n f150310j;

    /* renamed from: m */
    private static volatile C63010eb f150311m;

    /* renamed from: a */
    public int f150312a;

    /* renamed from: b */
    public int f150313b = 1;

    /* renamed from: c */
    public C45632al f150314c;

    /* renamed from: d */
    public String f150315d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f150316e;

    /* renamed from: f */
    public C65402d f150317f;

    /* renamed from: g */
    public String f150318g;

    /* renamed from: h */
    public String f150319h;

    /* renamed from: i */
    public C56354d f150320i;

    /* renamed from: k */
    private C63389bg f150321k;

    /* renamed from: l */
    private byte f150322l = 2;

    static {
        C56364n nVar = new C56364n();
        f150310j = nVar;
        C62942bv.registerDefaultInstance(C56364n.class, nVar);
    }

    private C56364n() {
        emptyProtobufList();
        this.f150318g = BuildConfig.FLAVOR;
        this.f150319h = BuildConfig.FLAVOR;
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150322l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150322l = b;
                return null;
            case 2:
                return newMessageInfo(f150310j, "\u0001\t\u0000\u0001\u0001\"\t\u0000\u0000\u0002\u0001ဌ\u0000\u0004ဈ\u0013\u000bဈ\u0005\u000eᐉ\u0004\u0014ᐉ\f\u0017ဌ\u000e\u001cဈ\u0012\u001dဉ\u0017\"ဉ\u000f", new Object[]{"a", "b", C56362l.f150309a, C19618h.f54585a, "d", C45240c.f118157a, C19621k.f54601a, "e", C56360j.f150308a, C30325g.f82003a, "i", C10662f.f35572a});
            case 3:
                return new C56364n();
            case 4:
                return new C56359i();
            case 5:
                return f150310j;
            case 6:
                C63010eb ebVar = f150311m;
                if (ebVar == null) {
                    synchronized (C56364n.class) {
                        ebVar = f150311m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150310j);
                            f150311m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
