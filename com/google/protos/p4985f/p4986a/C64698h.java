package com.google.protos.p4985f.p4986a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3912f.C51207b;
import com.google.assistant.p3897e.p3912f.C51222q;
import com.google.assistant.p3897e.p3921j.adg;
import com.google.assistant.p3897e.p3921j.adi;
import com.google.assistant.p3897e.p3921j.adk;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.protos.f.a.h */
/* compiled from: PG */
public final class C64698h extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C64698h f175368o;

    /* renamed from: p */
    private static volatile C63010eb f175369p;

    /* renamed from: a */
    public int f175370a;

    /* renamed from: b */
    public int f175371b = 0;

    /* renamed from: c */
    public Object f175372c;

    /* renamed from: d */
    public int f175373d;

    /* renamed from: e */
    public String f175374e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f175375f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C51222q f175376g;

    /* renamed from: h */
    public C51207b f175377h;

    /* renamed from: i */
    public boolean f175378i;

    /* renamed from: j */
    public C62971cq f175379j = emptyProtobufList();

    /* renamed from: k */
    public int f175380k = 1;

    /* renamed from: l */
    public int f175381l;

    /* renamed from: m */
    public int f175382m;

    /* renamed from: n */
    public C62971cq f175383n = emptyProtobufList();

    static {
        C64698h hVar = new C64698h();
        f175368o = hVar;
        C62942bv.registerDefaultInstance(C64698h.class, hVar);
    }

    private C64698h() {
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
                return newMessageInfo(f175368o, "\u0001\r\u0001\u0001\u0001\u0011\r\u0000\u0002\u0000\u0001ဌ\u0000\u0006ဇ\b\u0007ဉ\u0007\bျ\u0000\tျ\u0000\nဈ\u0003\u000bဈ\u0004\f\u001b\rဌ\t\u000eဌ\n\u000fဌ\u000b\u0010ဉ\u0005\u0011\u001b", new Object[]{C45240c.f118157a, "b", "a", "d", C64697g.f175367a, "i", C19618h.f54585a, "e", C10662f.f35572a, "j", C64669aw.class, C19621k.f54601a, adk.f134888a, "l", adg.f134886a, "m", adi.f134887a, C30325g.f82003a, C48004n.f124238a, C63070h.class});
            case 3:
                return new C64698h();
            case 4:
                return new C64696f();
            case 5:
                return f175368o;
            case 6:
                C63010eb ebVar = f175369p;
                if (ebVar == null) {
                    synchronized (C64698h.class) {
                        ebVar = f175369p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175368o);
                            f175369p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
