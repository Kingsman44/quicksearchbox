package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.chips;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.b */
/* compiled from: PG */
public final class C128601b implements C5592i {

    /* renamed from: a */
    final /* synthetic */ C128602c f353582a;

    /* renamed from: b */
    final /* synthetic */ boolean f353583b;

    /* renamed from: c */
    final /* synthetic */ boolean f353584c;

    public C128601b(C128602c cVar, boolean z, boolean z2) {
        this.f353582a = cVar;
        this.f353583b = z;
        this.f353584c = z2;
    }

    /* renamed from: a */
    public final boolean mo11905a(C5673ap apVar, Object obj, C5572n nVar, boolean z) {
        C59052c cVar = (C59052c) C128604e.f353590a.mo56226d();
        cVar.mo56379ah(new C59094n(37879));
        cVar.mo56389s("Error loading thumbnail image:", apVar);
        this.f353582a.f353585a.mo47694q((Drawable) null);
        this.f353582a.mo108548a(this.f353583b, false);
        return false;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11906b(Object obj, Object obj2, C5572n nVar, C5637a aVar, boolean z) {
        Drawable drawable = (Drawable) obj;
        if (this.f353584c) {
            ColorStateList valueOf = ColorStateList.valueOf(C19391a.m36980a(this.f353582a.itemView.getContext(), R.attr.colorPrimary));
            C69664n.m101060f(valueOf, "valueOf(AssistantColors.…rimary(itemView.context))");
            drawable.setTintList(valueOf);
        }
        this.f353582a.f353585a.mo47694q(drawable);
        return true;
    }
}
