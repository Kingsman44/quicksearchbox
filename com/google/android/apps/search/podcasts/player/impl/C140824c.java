package com.google.android.apps.search.podcasts.player.impl;

import android.graphics.Bitmap;
import android.support.p031v4.media.C0329x;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0320v;
import androidx.media3.common.C2646bh;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.p10890h.p10891a.p10892a.C146549d;
import com.google.android.p10890h.p10891a.p10892a.C146551f;
import com.google.android.p10890h.p10891a.p10892a.C146552g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.c */
/* compiled from: PG */
public final class C140824c implements C146552g {

    /* renamed from: a */
    final /* synthetic */ C140806an f382447a;

    /* renamed from: b */
    private final C146552g f382448b;

    public C140824c(C140806an anVar, C0320v vVar) {
        C69664n.m101061g(vVar, "mediaContentCompat");
        this.f382447a = anVar;
        this.f382448b = new C146549d(vVar);
    }

    /* renamed from: a */
    public final MediaMetadataCompat mo115931a(C2646bh bhVar) {
        Bitmap a;
        MediaMetadataCompat a2 = this.f382448b.mo115931a(bhVar);
        C69664n.m101060f(a2, "defaultMediaMetadataProvider.getMetadata(player)");
        if (!this.f382447a.f382381s) {
            return a2;
        }
        C0329x xVar = new C0329x(a2);
        C140806an anVar = this.f382447a;
        C140641b bVar = anVar.f382388z;
        String str = null;
        if (bVar != null) {
            C140646b bVar2 = bVar.f381974a;
            if (bVar2 == null) {
                bVar2 = C140646b.f381993r;
            }
            if (bVar2 != null) {
                str = bVar2.f381999e;
            }
        }
        C140822bc bcVar = anVar.f382387y;
        if (!(bcVar == null || (a = bcVar.mo115928a(str)) == null)) {
            xVar.mo1091b("android.media.metadata.ART", a);
        }
        return xVar.mo1090a();
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo115932b(MediaMetadataCompat mediaMetadataCompat, MediaMetadataCompat mediaMetadataCompat2) {
        return C146551f.m238629a(mediaMetadataCompat, mediaMetadataCompat2);
    }
}
