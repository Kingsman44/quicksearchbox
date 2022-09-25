package com.google.p4500cm.p4518d.p4519a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p395al.p396a.p397a.C8414d;
import com.google.p5277z.p5282c.C68032v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cm.d.a.b */
/* compiled from: PG */
public final class C58179b extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C58179b f155534j;

    /* renamed from: m */
    private static volatile C63010eb f155535m;

    /* renamed from: a */
    public int f155536a;

    /* renamed from: b */
    public C58181d f155537b;

    /* renamed from: c */
    public String f155538c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f155539d;

    /* renamed from: e */
    public boolean f155540e;

    /* renamed from: f */
    public C68032v f155541f;

    /* renamed from: g */
    public boolean f155542g;

    /* renamed from: h */
    public C62971cq f155543h = C62942bv.emptyProtobufList();

    /* renamed from: i */
    public boolean f155544i;

    /* renamed from: k */
    private C8414d f155545k;

    /* renamed from: l */
    private byte f155546l = 2;

    static {
        C58179b bVar = new C58179b();
        f155534j = bVar;
        C62942bv.registerDefaultInstance(C58179b.class, bVar);
    }

    private C58179b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f155546l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f155546l = b;
                return null;
            case 2:
                return newMessageInfo(f155534j, "\u0001\t\u0000\u0001\u0001\u000f\t\u0000\u0001\u0002\u0001ဉ\u0000\u0003ဈ\u0001\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\b\t\u001a\nᐉ\u0006\fဇ\u000b\u000fᐉ\r", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, C19618h.f54585a, C10662f.f35572a, "i", C19621k.f54601a});
            case 3:
                return new C58179b();
            case 4:
                return new C58178a();
            case 5:
                return f155534j;
            case 6:
                C63010eb ebVar = f155535m;
                if (ebVar == null) {
                    synchronized (C58179b.class) {
                        ebVar = f155535m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155534j);
                            f155535m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
