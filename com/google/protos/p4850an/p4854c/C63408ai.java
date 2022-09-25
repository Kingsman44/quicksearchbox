package com.google.protos.p4850an.p4854c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4686e.p4690b.C62012b;
import com.google.p5277z.p5282c.C68000aj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.c.ai */
/* compiled from: PG */
public final class C63408ai extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C63408ai f171351e;

    /* renamed from: k */
    private static volatile C63010eb f171352k;

    /* renamed from: a */
    public int f171353a;

    /* renamed from: b */
    public C63402ac f171354b;

    /* renamed from: c */
    public C63404ae f171355c;

    /* renamed from: d */
    public String f171356d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private C63412am f171357f;

    /* renamed from: g */
    private C63406ag f171358g;

    /* renamed from: h */
    private C68000aj f171359h;

    /* renamed from: i */
    private C62012b f171360i;

    /* renamed from: j */
    private byte f171361j = 2;

    static {
        C63408ai aiVar = new C63408ai();
        f171351e = aiVar;
        C62942bv.registerDefaultInstance(C63408ai.class, aiVar);
    }

    private C63408ai() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171361j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171361j = b;
                return null;
            case 2:
                return newMessageInfo(f171351e, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0004\u0007ᐉ\u0003\u000bᐉ\u0007\fᐉ\t", new Object[]{"a", "b", C45240c.f118157a, C10662f.f35572a, "d", C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C63408ai();
            case 4:
                return new C63407ah();
            case 5:
                return f171351e;
            case 6:
                C63010eb ebVar = f171352k;
                if (ebVar == null) {
                    synchronized (C63408ai.class) {
                        ebVar = f171352k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171351e);
                            f171352k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
