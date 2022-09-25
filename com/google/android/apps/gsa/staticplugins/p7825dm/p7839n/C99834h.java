package com.google.android.apps.gsa.staticplugins.p7825dm.p7839n;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6500ac.C84405i;
import com.google.android.apps.gsa.search.core.p6519al.p6688da.C85279a;
import com.google.android.apps.gsa.search.core.p6519al.p6688da.C85282b;
import com.google.android.apps.gsa.search.core.p6519al.p6688da.C85283c;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.n.h */
/* compiled from: PG */
public final /* synthetic */ class C99834h implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C99837k f279294a;

    /* renamed from: b */
    public final /* synthetic */ C99828b f279295b;

    /* renamed from: c */
    public final /* synthetic */ C85282b f279296c;

    public /* synthetic */ C99834h(C99837k kVar, C99828b bVar, C85282b bVar2) {
        this.f279294a = kVar;
        this.f279295b = bVar;
        this.f279296c = bVar2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C99837k kVar = this.f279294a;
        C99828b bVar = this.f279295b;
        C85282b bVar2 = this.f279296c;
        Uri uri = (Uri) obj;
        if (uri != null) {
            if (kVar.f279302c.mo65089a(Intent.createChooser(new Intent("android.intent.action.SEND").setType(bVar.mo91608a()).putExtra("android.intent.extra.STREAM", uri).setFlags(268435456).addFlags(1), ((C85279a) bVar2).f231045a))) {
                return C118826c.f331422a;
            }
            throw new C85283c();
        }
        throw new C84405i("The image has not been saved locally.");
    }
}
