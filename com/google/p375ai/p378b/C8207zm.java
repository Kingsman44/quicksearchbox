package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3820ak.C49215n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.ai.b.zm */
/* compiled from: PG */
public final class C8207zm extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C8207zm f28820n;

    /* renamed from: o */
    private static volatile C63010eb f28821o;

    /* renamed from: a */
    public int f28822a;

    /* renamed from: b */
    public int f28823b;

    /* renamed from: c */
    public String f28824c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f28825d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f28826e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f28827f;

    /* renamed from: g */
    public C8206zl f28828g;

    /* renamed from: h */
    public C8200zf f28829h;

    /* renamed from: i */
    public C8195za f28830i;

    /* renamed from: j */
    public C63042fg f28831j;

    /* renamed from: k */
    public C8190yw f28832k;

    /* renamed from: l */
    public C8188yu f28833l;

    /* renamed from: m */
    public C49215n f28834m;

    static {
        C8207zm zmVar = new C8207zm();
        f28820n = zmVar;
        C62942bv.registerDefaultInstance(C8207zm.class, zmVar);
    }

    private C8207zm() {
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
                return newMessageInfo(f28820n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\t\nဉ\n\u000bဉ\b\fဉ\u000b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C19621k.f54601a, "l", "j", "m"});
            case 3:
                return new C8207zm();
            case 4:
                return new C8198zd();
            case 5:
                return f28820n;
            case 6:
                C63010eb ebVar = f28821o;
                if (ebVar == null) {
                    synchronized (C8207zm.class) {
                        ebVar = f28821o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28820n);
                            f28821o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
