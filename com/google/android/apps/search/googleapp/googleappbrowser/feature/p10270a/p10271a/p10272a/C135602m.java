package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.p10271a.p10272a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.LinearLayoutManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.bumptech.glide.p287f.p288a.C5561c;
import com.bumptech.glide.p287f.p289b.C5582f;
import com.google.android.libraries.lens.sdk.avs.C24898o;
import com.google.android.libraries.lens.sdk.avs.data.C24871f;
import com.google.android.libraries.lens.sdk.avs.data.C24875j;
import com.google.android.libraries.lens.sdk.avs.data.C24876k;
import com.google.android.libraries.lens.sdk.avs.data.C24887v;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.a.a.a.m */
/* compiled from: PG */
public final class C135602m extends C5561c {

    /* renamed from: a */
    final /* synthetic */ ImageView f369359a;

    /* renamed from: b */
    final /* synthetic */ NestedScrollView f369360b;

    /* renamed from: d */
    final /* synthetic */ TextView f369361d;

    /* renamed from: e */
    final /* synthetic */ boolean f369362e;

    /* renamed from: f */
    final /* synthetic */ RelativeLayout f369363f;

    /* renamed from: g */
    final /* synthetic */ String f369364g;

    /* renamed from: h */
    final /* synthetic */ C135603n f369365h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135602m(C135603n nVar, ImageView imageView, NestedScrollView nestedScrollView, TextView textView, boolean z, RelativeLayout relativeLayout, String str) {
        super(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
        this.f369365h = nVar;
        this.f369359a = imageView;
        this.f369360b = nestedScrollView;
        this.f369361d = textView;
        this.f369362e = z;
        this.f369363f = relativeLayout;
        this.f369364g = str;
    }

    /* renamed from: a */
    public final void mo11859a(Drawable drawable) {
        ((C59052c) ((C59052c) C135603n.f369366a.mo56226d()).mo56372aa(40597)).mo56386p("Failed to load image");
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo11861c(Object obj, C5582f fVar) {
        mo112407i((Bitmap) obj);
    }

    /* renamed from: fB */
    public final void mo11992fB(Drawable drawable) {
    }

    /* renamed from: i */
    public final void mo112407i(Bitmap bitmap) {
        C135603n nVar = this.f369365h;
        nVar.f369372g = bitmap;
        C135604o oVar = nVar.f369375j;
        oVar.getClass();
        oVar.f369380a = bitmap;
        this.f369359a.setImageBitmap(bitmap);
        C135603n nVar2 = this.f369365h;
        NestedScrollView nestedScrollView = this.f369360b;
        nVar2.f369373h = new C135601l(nestedScrollView, this.f369361d, bitmap);
        nestedScrollView.getViewTreeObserver().addOnGlobalLayoutListener(this.f369365h.f369373h);
        if (this.f369362e) {
            this.f369365h.mo112409b(this.f369359a, this.f369363f);
        } else if (this.f369365h.f369374i.isPresent()) {
            C135603n nVar3 = this.f369365h;
            C24898o oVar2 = nVar3.f369369d;
            oVar2.getClass();
            Bitmap bitmap2 = nVar3.f369372g;
            String str = this.f369364g;
            C24876k kVar = new C24876k();
            kVar.mo30091e((String) nVar3.f369374i.get());
            C24875j jVar = new C24875j();
            C24871f fVar = new C24871f();
            fVar.mo30077c(bitmap2);
            jVar.mo30086b(fVar);
            C24887v vVar = new C24887v();
            vVar.f67973a.putString("current_webpage_url", str);
            jVar.f67958a.putBundle("web_context", vVar.f67973a);
            kVar.mo30090d(jVar);
            oVar2.mo30126c(kVar);
        } else {
            ((C59052c) ((C59052c) C135603n.f369366a.mo56226d()).mo56372aa(40598)).mo56386p("No sessionId available for query. Is the Lens session connected and started?");
        }
    }
}
