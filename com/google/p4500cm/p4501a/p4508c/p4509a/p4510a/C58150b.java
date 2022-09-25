package com.google.p4500cm.p4501a.p4508c.p4509a.p4510a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.cm.a.c.a.a.b */
/* compiled from: PG */
public final class C58150b extends C62937bq implements C62938br {

    /* renamed from: k */
    public static final C58150b f155459k;

    /* renamed from: m */
    private static volatile C63010eb f155460m;

    /* renamed from: a */
    public int f155461a;

    /* renamed from: b */
    public long f155462b;

    /* renamed from: c */
    public long f155463c;

    /* renamed from: d */
    public int f155464d;

    /* renamed from: e */
    public long f155465e;

    /* renamed from: f */
    public C63088z f155466f;

    /* renamed from: g */
    public long f155467g;

    /* renamed from: h */
    public C63088z f155468h;

    /* renamed from: i */
    public boolean f155469i;

    /* renamed from: j */
    public String f155470j;

    /* renamed from: l */
    private byte f155471l = 2;

    static {
        C58150b bVar = new C58150b();
        f155459k = bVar;
        C62942bv.registerDefaultInstance(C58150b.class, bVar);
    }

    private C58150b() {
        emptyProtobufList();
        C63088z zVar = C63088z.f170246b;
        C63088z zVar2 = C63088z.f170246b;
        this.f155466f = zVar2;
        this.f155467g = 180000;
        this.f155468h = zVar2;
        emptyIntList();
        emptyIntList();
        this.f155470j = BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f155471l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f155471l = b;
                return null;
            case 2:
                return newMessageInfo(f155459k, "\u0001\t\u0000\u0001\u0001\u001c\t\u0000\u0000\u0000\u0001ဂ\u0000\u0006ည\n\u000bင\u0004\fဂ\u0006\u000fတ\u0010\u0011ဂ\u0001\u0012ည\u0012\u0019ဇ\u0017\u001cဈ\u0018", new Object[]{"a", "b", C10662f.f35572a, "d", "e", C30325g.f82003a, C45240c.f118157a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C58150b();
            case 4:
                return new C58149a();
            case 5:
                return f155459k;
            case 6:
                C63010eb ebVar = f155460m;
                if (ebVar == null) {
                    synchronized (C58150b.class) {
                        ebVar = f155460m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155459k);
                            f155460m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
