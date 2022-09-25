package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components;

import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.LinearLayoutManager;
import com.bumptech.glide.p287f.p288a.C5561c;
import com.bumptech.glide.p287f.p289b.C5582f;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.c */
/* compiled from: PG */
final class C33262c extends C5561c {

    /* renamed from: a */
    final /* synthetic */ ImageToggleComponent f88980a;

    /* renamed from: b */
    private final C33261b f88981b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33262c(ImageToggleComponent imageToggleComponent, C33261b bVar) {
        super(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
        this.f88980a = imageToggleComponent;
        this.f88981b = bVar;
    }

    /* renamed from: a */
    public final void mo11859a(Drawable drawable) {
        C33261b bVar = this.f88981b;
        bVar.f88977a = drawable;
        bVar.f88978b = false;
        bVar.f88979c = true;
        this.f88980a.mo38652a();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo11861c(Object obj, C5582f fVar) {
        C33261b bVar = this.f88981b;
        bVar.f88977a = (Drawable) obj;
        bVar.f88978b = false;
        bVar.f88979c = false;
        this.f88980a.mo38652a();
    }

    /* renamed from: fB */
    public final void mo11992fB(Drawable drawable) {
        C33261b bVar = this.f88981b;
        bVar.f88977a = drawable;
        bVar.f88978b = true;
        bVar.f88979c = false;
        this.f88980a.mo38652a();
    }
}
