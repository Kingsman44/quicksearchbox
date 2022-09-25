package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.r */
/* compiled from: PG */
public final class C56320r extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C56320r f150092n;

    /* renamed from: p */
    private static volatile C63010eb f150093p;

    /* renamed from: a */
    public int f150094a;

    /* renamed from: b */
    public int f150095b;

    /* renamed from: c */
    public String f150096c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f150097d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f150098e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public float f150099f;

    /* renamed from: g */
    public C56310h f150100g;

    /* renamed from: h */
    public C56318p f150101h;

    /* renamed from: i */
    public C62961ch f150102i = emptyIntList();

    /* renamed from: j */
    public int f150103j;

    /* renamed from: k */
    public C56308f f150104k;

    /* renamed from: l */
    public C56314l f150105l;

    /* renamed from: m */
    public C56316n f150106m;

    /* renamed from: o */
    private byte f150107o = 2;

    static {
        C56320r rVar = new C56320r();
        f150092n = rVar;
        C62942bv.registerDefaultInstance(C56320r.class, rVar);
    }

    private C56320r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150107o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150107o = b;
                return null;
            case 2:
                return newMessageInfo(f150092n, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ခ\u0004\u0006ဉ\u0006\u0007ဉ\u0007\bဌ\b\t\u001e\nဈ\u0003\fဉ\n\rᐉ\u000b\u000eဉ\f", new Object[]{"a", "b", C56311i.f150080a, C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "j", C56326x.m87971b(), "i", C56319q.f150091a, "e", C19621k.f54601a, "l", "m"});
            case 3:
                return new C56320r();
            case 4:
                return new C56300d();
            case 5:
                return f150092n;
            case 6:
                C63010eb ebVar = f150093p;
                if (ebVar == null) {
                    synchronized (C56320r.class) {
                        ebVar = f150093p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150092n);
                            f150093p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
