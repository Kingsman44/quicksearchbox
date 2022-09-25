package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.C1882h;
import androidx.core.p094f.C1888a;
import com.google.android.apps.search.assistant.platform.p8988a.C119500b;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.p9944o.C131101a;
import com.google.android.apps.search.assistant.verticals.ambient.p9946p.C131116a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131690b;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.account.p3606d.C46094l;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutorService;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.ad */
/* compiled from: PG */
public final class C131763ad implements C131690b {

    /* renamed from: a */
    public final Context f359934a;

    /* renamed from: b */
    public final C119500b f359935b;

    /* renamed from: c */
    public final C46128f f359936c;

    /* renamed from: d */
    public final C130895ag f359937d;

    /* renamed from: e */
    public final ExecutorService f359938e;

    /* renamed from: f */
    public final Optional f359939f;

    /* renamed from: g */
    public final C42876ab f359940g;

    /* renamed from: h */
    public final C46094l f359941h;

    /* renamed from: i */
    public final C131778ar f359942i;

    /* renamed from: j */
    public final C58974d f359943j;

    /* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.ad$a */
    /* compiled from: PG */
    public interface C131764a {
        /* renamed from: aN */
        C131101a mo110307aN();

        /* renamed from: aO */
        C131116a mo110308aO();

        /* renamed from: bh */
        C131790bc mo110309bh();
    }

    public C131763ad(Context context, C119500b bVar, C46128f fVar, C130895ag agVar, ExecutorService executorService, Optional optional, C42876ab abVar, C46094l lVar, C131778ar arVar, C130603a aVar) {
        this.f359934a = context;
        this.f359935b = bVar;
        this.f359936c = fVar;
        this.f359937d = agVar;
        this.f359938e = executorService;
        this.f359939f = optional;
        this.f359940g = abVar;
        this.f359941h = lVar;
        this.f359942i = arVar;
        this.f359943j = aVar.mo109740b(this);
    }

    /* renamed from: a */
    public final C60870cx mo110264a(Intent intent) {
        return C47633f.m84733g(C47633f.m84733g(this.f359935b.mo104411a(C131764a.class)).mo51515h(C131797i.f359989a, this.f359938e).mo51516i(new C131804p(intent), this.f359938e)).mo51516i(new C131813y(this, intent), this.f359938e);
    }

    /* renamed from: b */
    public final C60870cx mo110265b(boolean z) {
        return mo110304f(z);
    }

    /* renamed from: c */
    public final C60870cx mo110266c() {
        return C47633f.m84733g(this.f359940g.mo46042d()).mo51516i(new C131809u(this), this.f359938e);
    }

    /* renamed from: d */
    public final boolean mo110267d(String str) {
        return "com.google.android.search.assistant.ambient.CSL_UPDATE_EVENT".equals(str);
    }

    /* renamed from: e */
    public final C60870cx mo110303e(AccountId accountId) {
        return C47633f.m84733g(this.f359936c.mo50214a(accountId)).mo51515h(new C131805q(this), this.f359938e);
    }

    /* renamed from: f */
    public final C60870cx mo110304f(boolean z) {
        if (C1882h.m5137c(this.f359934a, "android.permission.ACCESS_FINE_LOCATION") == -1 || C1882h.m5137c(this.f359934a, "android.permission.ACCESS_COARSE_LOCATION") == -1) {
            return C60866ct.f164955a;
        }
        C60870cx cxVar = C60866ct.f164955a;
        if (z) {
            cxVar = this.f359940g.mo46039a(C131795g.f359987a, this.f359938e);
        }
        return C47633f.m84733g(cxVar).mo51516i(new C131796h(this), this.f359938e).mo51515h(C131797i.f359989a, this.f359938e).mo51516i(C131798j.f359990a, this.f359938e);
    }

    /* renamed from: g */
    public final C60870cx mo110305g(String str) {
        Optional h = mo110306h(str);
        if (h.isEmpty()) {
            ((C58970a) ((C58970a) this.f359943j.mo56224b()).mo56372aa(39355)).mo56386p("Pending intent is null");
            return C60866ct.f164955a;
        }
        C60870cx c = this.f359936c.mo50216c(str);
        return C47633f.m84733g(C47633f.m84733g(c).mo51516i(new C131760aa(this), this.f359938e)).mo51516i(new C131761ab(h), this.f359938e).mo51516i(new C131762ac(this, c), this.f359938e);
    }

    /* renamed from: h */
    public final Optional mo110306h(String str) {
        int i = true != C1888a.m5149c() ? 134217728 : 167772160;
        Context context = this.f359934a;
        return Optional.ofNullable(PendingIntent.getBroadcast(context, 0, C147798a.m240896b(new Intent(context, LocationUpdateReceiver_Receiver.class).setAction("com.google.android.search.assistant.ambient.CSL_UPDATE_EVENT").setData(Uri.parse(str)), i, 1), i));
    }
}
