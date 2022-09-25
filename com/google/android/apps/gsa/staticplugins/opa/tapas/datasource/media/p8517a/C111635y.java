package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.p8517a;

import android.support.p031v4.media.C0282s;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.MediaDescriptionCompat;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a.y */
/* compiled from: PG */
final class C111635y extends C0282s {

    /* renamed from: d */
    final /* synthetic */ SettableFuture f310395d;

    /* renamed from: e */
    final /* synthetic */ C111636z f310396e;

    public C111635y(C111636z zVar, SettableFuture settableFuture) {
        this.f310396e = zVar;
        this.f310395d = settableFuture;
    }

    /* renamed from: a */
    public final void mo856a(String str, List list) {
        Optional optional;
        MediaDescriptionCompat mediaDescriptionCompat;
        CharSequence charSequence;
        String str2;
        C59071e eVar = C111636z.f310397a;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    optional = Optional.empty();
                    break;
                }
                MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) it.next();
                if (mediaItem != null && mediaItem.mo807b() && (mediaDescriptionCompat = mediaItem.f930b) != null && (charSequence = mediaDescriptionCompat.f933b) != null && charSequence.toString().equals("Recently Played") && (str2 = mediaItem.f930b.f932a) != null) {
                    optional = Optional.m71637of(str2);
                    break;
                }
            }
        } else {
            optional = Optional.empty();
        }
        if (optional.isEmpty()) {
            this.f310395d.mo57356n(C113408es.f314036b);
        } else {
            this.f310396e.f310400e.mo803g((String) optional.get(), new C111634x(this));
        }
        this.f310396e.f310400e.mo804h(str);
    }

    /* renamed from: b */
    public final void mo857b(String str) {
        ((C59052c) ((C59052c) C111636z.f310397a.mo56224b()).mo56372aa(27260)).mo56389s("#onError(): parentId=%s", str);
        this.f310395d.mo57356n(C113408es.f314036b);
        this.f310396e.f310400e.mo804h(str);
    }
}
