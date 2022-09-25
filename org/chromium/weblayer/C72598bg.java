package org.chromium.weblayer;

import android.net.Uri;
import com.google.android.libraries.web.contrib.googlesignin.C43585c;
import com.google.android.libraries.web.weblayer.p3468g.p3469a.C44294v;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47733j;
import com.google.apps.tiktok.tracing.contrib.p3714j.C47734k;
import org.chromium.p5643b.p5644a.C72305aa;
import org.chromium.p5643b.p5644a.C72343bl;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: org.chromium.weblayer.bg */
/* compiled from: PG */
public final class C72598bg extends C72305aa {

    /* renamed from: a */
    private final C72568ad f193139a;

    public C72598bg(C72568ad adVar) {
        this.f193139a = adVar;
    }

    /* renamed from: a */
    public final String mo63695a() {
        C72343bl.m106991a();
        C72568ad adVar = this.f193139a;
        if (C47831fm.m85027v()) {
            return ((C47734k) adVar).f123702a.mo47201a();
        }
        C47538ax c = ((C47734k) adVar).f123703b.f123704a.mo51613c("getGaiaId");
        try {
            String a = ((C47734k) adVar).f123702a.mo47201a();
            if (c == null) {
                return a;
            }
            c.close();
            return a;
        } catch (Throwable th) {
            C47733j.m84880a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo63696b(String str) {
        C72343bl.m106991a();
        C72568ad adVar = this.f193139a;
        Uri parse = Uri.parse(str);
        C47538ax c = ((C47734k) adVar).f123703b.f123704a.mo51613c("onGoogleAccountsRequest");
        try {
            C72568ad adVar2 = ((C47734k) adVar).f123702a;
            C69664n.m101066l(parse, Uri.EMPTY);
            C43585c cVar = ((C44294v) adVar2).f115190a.f113826b;
            if (cVar != null) {
                cVar.mo46641a();
            }
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47733j.m84880a(th, th);
        }
        throw th;
    }
}
