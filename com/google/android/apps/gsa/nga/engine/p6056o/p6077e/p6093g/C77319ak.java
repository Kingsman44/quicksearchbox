package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import android.content.Intent;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.au.al;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.understanding.teleport.C79326x;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.ak */
/* compiled from: PG */
public final class C77319ak {

    /* renamed from: a */
    private final al f213241a;

    public C77319ak(al alVar) {
        this.f213241a = alVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo72522a(String str, C80399l lVar, Set set, C74965n nVar, boolean z, C79326x xVar) {
        Intent intent;
        if (str.isEmpty()) {
            xVar.mo73900a("Abort - URL is empty");
            return false;
        } else if (C77321am.m124093a(str)) {
            xVar.mo73900a(String.format("Abort - URL [%s] is blocked.", new Object[]{str}));
            return false;
        } else {
            xVar.mo73900a("URL is specified");
            Optional o = nVar.mo71340o();
            boolean z2 = o.isPresent() && this.f213241a.a().c.contains(o.get());
            if (z2) {
                intent = new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(32768).putExtra("com.android.browser.application_id", (String) o.orElse(BuildConfig.FLAVOR));
            } else {
                intent = new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(32768);
            }
            intent.setIdentifier(nVar.mo71336k().f227136c);
            C81442m.m129557s(lVar, t.u(intent, 1, nVar.mo71336k(), false, false));
            if (z) {
                lVar.mo74319k(88530);
            }
            String concat = "Open-Url Android intent, url: ".concat(String.valueOf(intent.getDataString()));
            Collection.EL.stream(set).forEach(new C77318aj());
            xVar.mo73900a(true != z2 ? "Opening new tab." : "Using current browser tab.");
            xVar.mo73900a("Android Intent: ".concat(String.valueOf(intent.toUri(1))));
            xVar.mo73900a("Success - ".concat(concat));
            return true;
        }
    }
}
