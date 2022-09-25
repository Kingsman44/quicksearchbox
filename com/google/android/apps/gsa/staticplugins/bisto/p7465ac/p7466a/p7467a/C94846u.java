package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import android.util.Base64;
import com.google.android.libraries.assistant.accessory.gmutls.C11018a;
import com.google.android.libraries.assistant.accessory.gmutls.C11021d;
import com.google.android.libraries.assistant.accessory.p617a.C10992c;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import javax.net.ssl.SSLEngineResult;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.u */
/* compiled from: PG */
public final class C94846u implements C11021d {

    /* renamed from: a */
    public static final C59071e f265236a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.u");

    /* renamed from: b */
    public volatile C94838m f265237b;

    /* renamed from: c */
    public final C94828c f265238c;

    /* renamed from: d */
    private final C58495hd f265239d;

    /* renamed from: e */
    private volatile C94849x f265240e = new C94844s();

    /* renamed from: f */
    private final C94821ai f265241f;

    public C94846u(C94828c cVar) {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(1, new C94844s());
        gzVar.mo55429h(2, new C94845t());
        gzVar.mo55429h(3, new C94843r());
        this.f265239d = gzVar.mo55427f(false);
        this.f265238c = cVar;
        this.f265241f = cVar.f265165f;
    }

    /* renamed from: a */
    public final void mo88677a() {
        C59104x b = f265236a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsCryptoHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17504)).mo56386p("close");
        C94828c cVar = this.f265238c;
        cVar.f265166g.mo19484i(new C11018a(608));
        cVar.f265172m = new C10992c(608);
        cVar.f265168i = null;
        cVar.f265169j = null;
        cVar.f265170k = null;
        mo88678b(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo88678b(int i) {
        C59071e eVar = f265236a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsCryptoHandler");
        ((C59052c) ((C59052c) b).mo56372aa(17505)).mo56387q("exit state: %d", this.f265240e.mo88676a());
        C94849x xVar = (C94849x) this.f265239d.get(Integer.valueOf(i));
        xVar.getClass();
        this.f265240e = xVar;
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "GacsCryptoHandler");
        ((C59052c) ((C59052c) b2).mo56372aa(17506)).mo56387q("enter state: %d", this.f265240e.mo88676a());
    }

    /* renamed from: c */
    public final void mo19472c(int i) {
        if (i == 11) {
            mo88678b(1);
            C94841p pVar = C94841p.GATT_CONNECTED;
            return;
        }
        C59104x d = f265236a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GacsCryptoHandler");
        ((C59052c) ((C59052c) d).mo56372aa(17509)).mo56387q("Received unsuccessful gmutls state update: %s", i);
        if (i == 7) {
            mo88679e(C94848w.m156477a(new C11018a(this.f265238c.f265167h).mo19468d()));
            C94841p pVar2 = C94841p.GATT_CONNECTED;
            mo88677a();
            mo88677a();
        }
    }

    /* renamed from: d */
    public final void mo19473d(SSLEngineResult sSLEngineResult, C11018a aVar) {
        if (!SSLEngineResult.Status.CLOSED.equals(sSLEngineResult.getStatus())) {
            mo88679e(C94848w.m156478b(aVar.mo19468d()));
        }
    }

    /* renamed from: e */
    public final void mo88679e(byte[] bArr) {
        C58976aa aaVar = C58975e.f156826a;
        Base64.encodeToString(bArr, 0);
        this.f265241f.mo88635d(new C94826an(this.f265238c, "dd1d1206-568f-4b2d-a48c-969d8ad1f457", bArr, 2));
    }

    /* renamed from: f */
    public final void mo19474f() {
        C58976aa aaVar = C58975e.f156826a;
    }
}
