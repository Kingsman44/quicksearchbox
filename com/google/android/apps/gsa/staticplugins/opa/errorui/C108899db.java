package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b.C9684l;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7037e.C89720f;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a.C114540i;
import com.google.android.apps.gsa.staticplugins.opa.util.C113868cw;
import com.google.android.apps.gsa.staticplugins.opa.widget.impl.C114249b;
import com.google.android.apps.gsa.staticplugins.opa.widget.impl.C114250c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.db */
/* compiled from: PG */
public final class C108899db {

    /* renamed from: a */
    public static final C59071e f302769a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.errorui.db");

    /* renamed from: b */
    public final Context f302770b;

    /* renamed from: c */
    public final bm f302771c;

    /* renamed from: d */
    public final C114540i f302772d;

    /* renamed from: e */
    public final C22871g f302773e;

    /* renamed from: f */
    public final C86124t f302774f;

    /* renamed from: g */
    public final SharedPreferences f302775g;

    /* renamed from: h */
    public final C68214a f302776h;

    /* renamed from: i */
    public final C9684l f302777i;

    /* renamed from: j */
    public final C86054o f302778j;

    /* renamed from: k */
    private final C89720f f302779k;

    /* renamed from: l */
    private final C22871g f302780l;

    /* renamed from: m */
    private final C113868cw f302781m;

    /* renamed from: n */
    private final C114250c f302782n;

    public C108899db(Context context, C89720f fVar, bm bmVar, C114540i iVar, C22871g gVar, C22871g gVar2, C86124t tVar, C113868cw cwVar, SharedPreferences sharedPreferences, C114250c cVar, C68214a aVar, C9684l lVar, C86054o oVar) {
        this.f302770b = context;
        this.f302779k = fVar;
        this.f302771c = bmVar;
        this.f302772d = iVar;
        this.f302773e = gVar;
        this.f302780l = gVar2;
        this.f302774f = tVar;
        this.f302781m = cwVar;
        this.f302775g = sharedPreferences;
        this.f302782n = cVar;
        this.f302776h = aVar;
        this.f302777i = lVar;
        this.f302778j = oVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo97262a(String str) {
        if (!this.f302774f.mo79746e(C90037cp.f248544cS)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268468224);
            intent.setData(Uri.parse("googleapp://deeplink/?data=CksBDb3mGzBEAiAyc3MSiRPx_9Xw_GfLyz_7UUoZday26b6NzeGd7TgC1gIgY1CjbQhkZlWo5e4xwL-JsLq5INL3J4rlO3XMhONQbIASeQoGCK-itI8BEgIICBpMEkoIBBJG6oqo9ARACAEaJ2NvbS5nb29nbGUuYW5kcm9pZC5nb29nbGVxdWlja3NlYXJjaGJveDITaG9tZXNjcmVlbi5zaG9ydGN1dCIdChtodHRwOi8vYXNzaXN0YW50Lmdvb2dsZS5jb20"));
            intent.setPackage(this.f302770b.getPackageName());
            C90875ai.m148465b(C108892cv.f302762a, this.f302779k.mo83611a(str, BitmapFactory.decodeResource(this.f302770b.getResources(), R.drawable.product_logo_voice_search_round_color_144), intent), this.f302780l, "installAppShortcutFuture").mo85223a(C108893cw.f302763a);
        } else if (this.f302782n.f316805a.isRequestPinAppWidgetSupported() && !this.f302782n.mo101288a()) {
            C114250c cVar = this.f302782n;
            new C90873ag(cVar.f316807c.mo28201a("requestPinAppWidget", new C114249b(cVar)), this.f302773e, "pinEntryPointWidgetFuture", C108894cx.f302764a).mo85223a(C108895cy.f302765a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo97263b() {
        if ((this.f302774f.mo79746e(C90014bt.f247062a) || this.f302774f.mo79746e(C90037cp.f248610f)) && !this.f302774f.mo79746e(C90037cp.f248571ct) && ((long) this.f302775g.getInt("opa_add_shortcut_screen_seen_count", 0)) < this.f302774f.mo79743a(C90037cp.f248572cu) && !this.f302781m.mo100727a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo97264c() {
        boolean z;
        if (this.f302771c.r()) {
            z = this.f302774f.mo79746e(C90014bt.f247238dQ);
        } else {
            z = this.f302774f.mo79746e(C90014bt.f247324ex);
        }
        int i = this.f302775g.getInt("opa_email_optin_seen_count", 0);
        if (!z || ((long) i) >= this.f302774f.mo79743a(C90014bt.f247216cv) || this.f302775g.getInt("opa_email_opt_in_status", 0) != 0) {
            return mo97265d();
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo97265d() {
        if (!this.f302774f.mo79746e(C90053de.f248942I) || !this.f302771c.p() || this.f302775g.getInt("opa_wakeup_routine_opt_in_status", 0) != 0) {
            return false;
        }
        return true;
    }
}
