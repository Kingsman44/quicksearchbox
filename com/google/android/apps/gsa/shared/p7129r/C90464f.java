package com.google.android.apps.gsa.shared.p7129r;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.gsa.shared.util.p7182r.C91086a;
import com.google.android.googlequicksearchbox.R;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.shared.r.f */
/* compiled from: PG */
public final class C90464f {

    /* renamed from: a */
    public final Context f252717a;

    /* renamed from: b */
    public final C68214a f252718b;

    /* renamed from: c */
    private final C90460b f252719c;

    public C90464f(Context context, C68214a aVar, C90460b bVar) {
        this.f252717a = context;
        this.f252718b = aVar;
        this.f252719c = bVar;
    }

    /* renamed from: a */
    public final void mo84208a(Menu menu, String str, Account account, Uri uri, boolean z, boolean z2) {
        if (C91086a.m148806a(this.f252717a.getApplicationContext())) {
            MenuItem add = menu.add(R.string.help_and_feedback);
            add.setIcon(true != z2 ? R.drawable.ic_help_and_feedback : R.drawable.quantum_ic_help_outline_grey600_24);
            if (menu.size() == 1) {
                add.setShowAsAction(2);
            }
            C90461c cVar = new C90461c();
            cVar.f252691c = account;
            cVar.f252692d = uri;
            cVar.f252698j = z;
            cVar.f252689a = null;
            cVar.f252707s = 0;
            cVar.f252697i = null;
            cVar.f252690b = str;
            add.setOnMenuItemClickListener(new C90463e(this, cVar));
        }
    }

    /* renamed from: b */
    public final void mo84209b(C90461c cVar, int i) {
        C90462d dVar = (C90462d) this.f252718b.mo27525b();
        this.f252719c.mo84197a(cVar);
        if (i != 0) {
            dVar.mo84204a(this.f252717a, cVar);
        } else {
            dVar.mo84206c(this.f252717a, cVar);
        }
    }
}
