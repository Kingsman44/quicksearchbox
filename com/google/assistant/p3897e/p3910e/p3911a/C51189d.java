package com.google.assistant.p3897e.p3910e.p3911a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.p395al.p398b.p399a.p400a.C8423g;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.e.a.d */
/* compiled from: PG */
public final class C51189d extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C51189d f133247h;

    /* renamed from: j */
    private static volatile C63010eb f133248j;

    /* renamed from: a */
    public int f133249a;

    /* renamed from: b */
    public C8423g f133250b;

    /* renamed from: c */
    public C54188e f133251c;

    /* renamed from: d */
    public C63088z f133252d = C63088z.f170246b;

    /* renamed from: e */
    public String f133253e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C51715bm f133254f;

    /* renamed from: g */
    public C52081en f133255g;

    /* renamed from: i */
    private byte f133256i = 2;

    static {
        C51189d dVar = new C51189d();
        f133247h = dVar;
        C62942bv.registerDefaultInstance(C51189d.class, dVar);
    }

    private C51189d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133256i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133256i = b;
                return null;
            case 2:
                return newMessageInfo(f133247h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ည\u0002\u0004ဈ\u0003\u0005ᐉ\u0004\u0007ဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C51189d();
            case 4:
                return new C51188c();
            case 5:
                return f133247h;
            case 6:
                C63010eb ebVar = f133248j;
                if (ebVar == null) {
                    synchronized (C51189d.class) {
                        ebVar = f133248j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133247h);
                            f133248j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
