package com.google.android.apps.search.googleapp.search.srp.p10433c;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.bumptech.glide.p287f.p289b.C5582f;
import com.google.android.apps.search.googleapp.p10257g.C135414ae;
import com.google.android.apps.search.googleapp.search.p10409e.C137415d;
import com.google.android.apps.search.googleapp.search.srp.C137722au;
import com.google.android.apps.search.googleapp.search.srp.C137878j;
import com.google.android.apps.search.googleapp.search.srp.C137886r;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.c.g */
/* compiled from: PG */
public final class C137741g implements C5592i {

    /* renamed from: a */
    final /* synthetic */ View f374694a;

    /* renamed from: b */
    final /* synthetic */ ImageView f374695b;

    /* renamed from: c */
    final /* synthetic */ C137737d f374696c;

    /* renamed from: d */
    final /* synthetic */ C135414ae f374697d;

    public C137741g(View view, ImageView imageView, C137737d dVar, C135414ae aeVar) {
        this.f374694a = view;
        this.f374695b = imageView;
        this.f374696c = dVar;
        this.f374697d = aeVar;
    }

    /* renamed from: a */
    public final boolean mo11905a(C5673ap apVar, Object obj, C5572n nVar, boolean z) {
        C69664n.m101061g(nVar, "target");
        C59052c cVar = (C59052c) ((C59052c) C137737d.f374672a.mo56226d()).mo56382g(apVar);
        cVar.mo56379ah(new C59094n(41039));
        cVar.mo56386p("Failed to load doodle image");
        return true;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11906b(Object obj, Object obj2, C5572n nVar, C5637a aVar, boolean z) {
        Drawable drawable = (Drawable) obj;
        C69664n.m101061g(nVar, "target");
        C69664n.m101061g(aVar, "dataSource");
        this.f374694a.setVisibility(8);
        this.f374695b.setVisibility(0);
        ImageView imageView = this.f374695b;
        C137737d dVar = this.f374696c;
        imageView.setOnClickListener(new C47591co(dVar.f374677f, "doodleClicked", new C137740f(dVar, this.f374697d)));
        C137878j jVar = this.f374696c.f374688q;
        if (jVar != null) {
            int i = this.f374697d.f368936h;
            C137886r rVar = jVar.f375137a;
            rVar.f375173w = i;
            int a = C137415d.m223276a(((C137722au) rVar.f375168r.mo47045a()).f374621b);
            if (a == 0 || a != 2) {
                rVar.f375158h.requireView().setBackgroundColor(i);
            }
        }
        nVar.mo11861c(drawable, (C5582f) null);
        return true;
    }
}
