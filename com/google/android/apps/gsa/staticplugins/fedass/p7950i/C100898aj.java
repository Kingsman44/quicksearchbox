package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100784o;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100788s;
import com.google.android.apps.gsa.staticplugins.fedass.p7941c.p7943b.C100818b;
import com.google.android.apps.gsa.staticplugins.fedass.p7947f.C100848a;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaterializerImpl;
import com.google.android.libraries.search.p2476a.C32160b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.aj */
/* compiled from: PG */
public final class C100898aj implements C100848a {

    /* renamed from: a */
    public static final C59071e f281907a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.i.aj");

    /* renamed from: b */
    public final C60887da f281908b;

    /* renamed from: c */
    public final C100818b f281909c;

    /* renamed from: d */
    public final C100788s f281910d;

    /* renamed from: e */
    public final C100784o f281911e;

    /* renamed from: f */
    public final AtomicReference f281912f = new AtomicReference();

    /* renamed from: g */
    public final C100925h f281913g;

    /* renamed from: h */
    private final C32160b f281914h;

    public C100898aj(C60887da daVar, C32160b bVar, C100818b bVar2, C100788s sVar, C100784o oVar, C100925h hVar) {
        this.f281908b = daVar;
        this.f281914h = bVar;
        this.f281909c = bVar2;
        this.f281910d = sVar;
        this.f281911e = oVar;
        this.f281913g = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo92066a(String str, byte[] bArr, byte[] bArr2) {
        return C47633f.m84733g(this.f281914h.mo37974b()).mo51516i(new C100894af(this, str, bArr, bArr2), this.f281908b);
    }

    /* renamed from: b */
    public final C60870cx mo92067b() {
        try {
            EkhoMaterializerImpl ekhoMaterializerImpl = (EkhoMaterializerImpl) this.f281912f.get();
            if (ekhoMaterializerImpl != null) {
                return C60856cj.m92900i(ekhoMaterializerImpl.mo24639a());
            }
            ((C59052c) ((C59052c) f281907a.mo56225c()).mo56372aa(19693)).mo56386p("Failed to get materializer");
            return C60856cj.m92899h(new AssertionError("Materializer was null."));
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f281907a.mo56225c()).mo56382g(e)).mo56372aa(19692)).mo56386p("Failed to advance to next");
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: c */
    public final C60870cx mo92068c(int i) {
        ((C59052c) ((C59052c) f281907a.mo56226d()).mo56372aa(19694)).mo56386p("Request API not supported");
        return C60866ct.f164955a;
    }

    public final void close() {
        EkhoMaterializerImpl ekhoMaterializerImpl = (EkhoMaterializerImpl) this.f281912f.get();
        if (ekhoMaterializerImpl != null) {
            ekhoMaterializerImpl.close();
        }
    }
}
