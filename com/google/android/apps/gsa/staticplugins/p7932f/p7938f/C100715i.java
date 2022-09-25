package com.google.android.apps.gsa.staticplugins.p7932f.p7938f;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6733g.C85472a;
import com.google.android.apps.gsa.search.core.p6519al.p6733g.C85476b;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7084c.C90220a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90332a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90334c;
import com.google.android.apps.gsa.shared.util.permissions.ProxyIntentStarter;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.ampactions.C11031d;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.acy;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.f.f.i */
/* compiled from: PG */
public final class C100715i extends C86734a implements C85476b {

    /* renamed from: a */
    public final C11031d f281596a;

    /* renamed from: b */
    public final ProxyIntentStarter f281597b;

    /* renamed from: c */
    private final C22871g f281598c;

    /* renamed from: f */
    private final Context f281599f;

    public C100715i(C11031d dVar, ProxyIntentStarter proxyIntentStarter, C22871g gVar, Context context) {
        super(C118575h.WORKER_AMP_ACTIONS, "ampactions");
        this.f281596a = dVar;
        this.f281597b = proxyIntentStarter;
        this.f281598c = gVar;
        this.f281599f = context;
    }

    /* renamed from: a */
    public final void mo78995a(List list) {
        this.f281598c.mo28212l("prerenderAmpActions", new C100711e(this, list));
    }

    /* renamed from: c */
    public final void mo78996c(acy acy, C85472a aVar) {
        String str = acy.f134863b;
        C90332a aVar2 = C90332a.TRANSPARENT;
        Intent a = C90334c.m146886a(aVar2.f252281i, C90220a.f252048a, C23245b.m43556a(acy));
        a.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 3);
        a.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.CUSTOM_TRANSITION", ActivityOptions.makeCustomAnimation(this.f281599f, R.anim.slide_in_bottom, 0).toBundle());
        this.f281598c.mo28212l("startController", new C100712f(this, a, aVar));
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        this.f281598c.mo28212l("reset", new C100713g(this));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
