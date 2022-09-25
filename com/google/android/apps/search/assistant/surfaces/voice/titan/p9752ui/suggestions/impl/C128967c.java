package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.suggestions.impl;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.suggestions.impl.c */
/* compiled from: PG */
public final class C128967c implements C5592i {

    /* renamed from: a */
    final /* synthetic */ C128968d f354364a;

    /* renamed from: b */
    final /* synthetic */ boolean f354365b;

    public C128967c(C128968d dVar, boolean z) {
        this.f354364a = dVar;
        this.f354365b = z;
    }

    /* renamed from: a */
    public final boolean mo11905a(C5673ap apVar, Object obj, C5572n nVar, boolean z) {
        C59052c cVar = (C59052c) C128970f.f354372a.mo56226d();
        cVar.mo56379ah(new C59094n(38070));
        cVar.mo56389s("Error loading thumbnail image:", apVar);
        this.f354364a.f354368c.mo47694q((Drawable) null);
        this.f354364a.f354368c.mo47719t(false);
        this.f354364a.mo108779a(this.f354365b, false);
        return false;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11906b(Object obj, Object obj2, C5572n nVar, C5637a aVar, boolean z) {
        this.f354364a.f354368c.mo47694q((Drawable) obj);
        this.f354364a.f354368c.mo47719t(true);
        return true;
    }
}
