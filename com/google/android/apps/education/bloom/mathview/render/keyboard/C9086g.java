package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.g */
/* compiled from: PG */
final class C9086g extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ ImageView f31338a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9086g(ImageView imageView) {
        super(1);
        this.f31338a = imageView;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        ((Number) obj).intValue();
        float dimension = this.f31338a.getContext().getResources().getDimension(R.dimen.key_max_text_size);
        Context context = this.f31338a.getContext();
        C69664n.m101060f(context, "view.context");
        C9084e eVar = new C9084e(dimension, context);
        eVar.mo17404f((Typeface) C9088i.f31343e.mo42046c(C9088i.f31340b[0]));
        return eVar;
    }
}
