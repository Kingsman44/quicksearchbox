package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.p8517a;

import android.support.p031v4.media.C0282s;
import android.support.p031v4.media.MediaBrowserCompat;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a.u */
/* compiled from: PG */
final class C111631u extends C0282s {

    /* renamed from: d */
    final /* synthetic */ C111636z f310391d;

    public C111631u(C111636z zVar) {
        this.f310391d = zVar;
    }

    /* renamed from: a */
    public final void mo856a(String str, List list) {
        C59071e eVar = C111636z.f310397a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = ((MediaBrowserCompat.MediaItem) it.next()).f930b.f932a;
            if (str2 != null) {
                this.f310391d.f310400e.mo803g(str2, new C111630t(this));
            }
        }
        this.f310391d.f310400e.mo804h(str);
    }

    /* renamed from: b */
    public final void mo857b(String str) {
        ((C59052c) ((C59052c) C111636z.f310397a.mo56224b()).mo56372aa(27256)).mo56389s("#onError(): parentId=%s", str);
        this.f310391d.f310400e.mo804h(str);
    }
}
