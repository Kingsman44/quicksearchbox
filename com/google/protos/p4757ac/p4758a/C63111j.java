package com.google.protos.p4757ac.p4758a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4538j.p4539a.C59308f;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.protos.ac.a.j */
/* compiled from: PG */
public final class C63111j extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C63111j f170348p;

    /* renamed from: q */
    private static volatile C63010eb f170349q;

    /* renamed from: a */
    public int f170350a;

    /* renamed from: b */
    public String f170351b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f170352c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f170353d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f170354e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public long f170355f;

    /* renamed from: g */
    public String f170356g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f170357h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public long f170358i;

    /* renamed from: j */
    public C63113l f170359j;

    /* renamed from: k */
    public C63113l f170360k;

    /* renamed from: l */
    public int f170361l;

    /* renamed from: m */
    public C59308f f170362m;

    /* renamed from: n */
    public String f170363n;

    /* renamed from: o */
    public C63105d f170364o;

    static {
        C63111j jVar = new C63111j();
        f170348p = jVar;
        C62942bv.registerDefaultInstance(C63111j.class, jVar);
    }

    private C63111j() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.f170363n = BuildConfig.FLAVOR;
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
                return newMessageInfo(f170348p, "\u0001\u000e\u0000\u0001\u0001\u001c\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဂ\u0004\u0007ဂ\u0007\bဉ\b\tဌ\n\u000bဈ\u0005\u0010ဈ\u0006\u0011ဉ\u0011\u0014ဉ\t\u001aဈ\u0015\u001bဈ\u0003\u001cဉ\u0016", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, "i", "j", "l", C63102a.f170332a, C30325g.f82003a, C19618h.f54585a, "m", C19621k.f54601a, C48004n.f124238a, "e", C66412o.f180592a});
            case 3:
                return new C63111j();
            case 4:
                return new C63110i();
            case 5:
                return f170348p;
            case 6:
                C63010eb ebVar = f170349q;
                if (ebVar == null) {
                    synchronized (C63111j.class) {
                        ebVar = f170349q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170348p);
                            f170349q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
