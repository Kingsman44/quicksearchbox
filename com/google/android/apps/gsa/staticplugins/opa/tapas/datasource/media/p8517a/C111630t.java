package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.p8517a;

import android.support.p031v4.media.C0282s;
import android.support.p031v4.media.MediaBrowserCompat;
import com.google.common.p4526f.C59071e;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a.t */
/* compiled from: PG */
final class C111630t extends C0282s {

    /* renamed from: d */
    final /* synthetic */ C111631u f310390d;

    public C111630t(C111631u uVar) {
        this.f310390d = uVar;
    }

    /* renamed from: a */
    public final void mo856a(String str, List list) {
        C59071e eVar = C111636z.f310397a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) it.next();
            if (mediaItem.mo808c()) {
                String lowerCase = mediaItem.f930b.toString().toLowerCase(Locale.getDefault());
                synchronized (this.f310390d.f310391d) {
                    if (!this.f310390d.f310391d.f310399b.containsKey(lowerCase)) {
                        this.f310390d.f310391d.f310399b.put(lowerCase, mediaItem);
                    }
                }
            }
        }
        this.f310390d.f310391d.f310400e.mo804h(str);
    }

    /* renamed from: b */
    public final void mo857b(String str) {
        C59071e eVar = C111636z.f310397a;
        this.f310390d.f310391d.f310400e.mo804h(str);
    }
}
