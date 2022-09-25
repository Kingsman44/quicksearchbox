package com.google.android.libraries.lens.view.gallery.p2110c;

import android.content.ContentUris;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.load.p299c.p300a.C5876y;
import com.bumptech.glide.p287f.C5593j;
import com.bumptech.glide.p290g.C5601d;
import com.google.android.libraries.lens.view.gallery.data.C26398q;
import com.google.android.libraries.lens.view.gallery.data.C26404w;
import com.google.android.libraries.lens.view.p2179y.C28223a;
import com.google.apps.tiktok.media.C47449e;

/* renamed from: com.google.android.libraries.lens.view.gallery.c.d */
/* compiled from: PG */
public final class C26336d {

    /* renamed from: a */
    private final C47449e f71592a;

    /* renamed from: b */
    private final boolean f71593b;

    /* renamed from: c */
    private final C26398q f71594c;

    public C26336d(C26398q qVar, C47449e eVar, boolean z) {
        this.f71594c = qVar;
        this.f71592a = eVar;
        this.f71593b = z;
    }

    /* renamed from: a */
    public final C6007z mo31531a(C26404w wVar) {
        C6007z zVar = (C6007z) ((C6007z) ((C6007z) this.f71592a.mo51286a().mo11870h(ContentUris.withAppendedId(this.f71594c.f71821e, wVar.mo31586b())).mo11967T(new C5601d(wVar.mo31585a()))).mo11948A()).mo11949B(C28223a.f76834h);
        return this.f71593b ? zVar.mo11982o(new C5593j().mo11966S(C5876y.f17480d, true)) : zVar;
    }
}
