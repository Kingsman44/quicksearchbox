package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.p8517a;

import android.support.p031v4.media.C0282s;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.MediaDescriptionCompat;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a.f */
/* compiled from: PG */
final class C111616f extends C0282s {

    /* renamed from: d */
    final /* synthetic */ SettableFuture f310366d;

    /* renamed from: e */
    final /* synthetic */ C111622l f310367e;

    public C111616f(C111622l lVar, SettableFuture settableFuture) {
        this.f310367e = lVar;
        this.f310366d = settableFuture;
    }

    /* renamed from: a */
    public final void mo856a(String str, List list) {
        Optional optional;
        MediaDescriptionCompat mediaDescriptionCompat;
        CharSequence charSequence;
        String str2;
        C59071e eVar = C111622l.f310374a;
        C58976aa aaVar = C58975e.f156826a;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    optional = Optional.empty();
                    break;
                }
                MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) it.next();
                if (mediaItem != null && mediaItem.mo807b() && (mediaDescriptionCompat = mediaItem.f930b) != null && (charSequence = mediaDescriptionCompat.f933b) != null && charSequence.toString().equals("Listen Now") && (str2 = mediaItem.f930b.f932a) != null) {
                    optional = Optional.m71637of(str2);
                    break;
                }
            }
        } else {
            optional = Optional.empty();
        }
        if (optional.isEmpty()) {
            this.f310366d.mo57356n(C113408es.f314036b);
        } else {
            this.f310367e.f310376b.mo803g((String) optional.get(), new C111615e(this));
        }
        this.f310367e.f310376b.mo804h(str);
    }

    /* renamed from: b */
    public final void mo857b(String str) {
        C59104x b = C111622l.f310374a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PlayMusicMediaBrowser");
        ((C59052c) ((C59052c) b).mo56372aa(27244)).mo56389s("#onError(): parentId=%s", str);
        this.f310366d.mo57356n(C113408es.f314036b);
        this.f310367e.f310376b.mo804h(str);
    }
}
