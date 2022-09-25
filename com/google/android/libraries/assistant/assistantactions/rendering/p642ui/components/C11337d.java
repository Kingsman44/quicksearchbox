package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components;

import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.LinearLayoutManager;
import com.bumptech.glide.p287f.p288a.C5561c;
import com.bumptech.glide.p287f.p289b.C5582f;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.components.d */
/* compiled from: PG */
final class C11337d extends C5561c {

    /* renamed from: a */
    final /* synthetic */ ImageToggleComponent f36878a;

    /* renamed from: b */
    private final C11336c f36879b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11337d(ImageToggleComponent imageToggleComponent, C11336c cVar) {
        super(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
        this.f36878a = imageToggleComponent;
        this.f36879b = cVar;
    }

    /* renamed from: a */
    public final void mo11859a(Drawable drawable) {
        C11336c cVar = this.f36879b;
        cVar.f36875a = drawable;
        cVar.f36876b = false;
        cVar.f36877c = true;
        this.f36878a.mo19790a();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo11861c(Object obj, C5582f fVar) {
        C11336c cVar = this.f36879b;
        cVar.f36875a = (Drawable) obj;
        cVar.f36876b = false;
        cVar.f36877c = false;
        this.f36878a.mo19790a();
    }

    /* renamed from: fB */
    public final void mo11992fB(Drawable drawable) {
        C11336c cVar = this.f36879b;
        cVar.f36875a = drawable;
        cVar.f36876b = true;
        cVar.f36877c = false;
        this.f36878a.mo19790a();
    }
}
