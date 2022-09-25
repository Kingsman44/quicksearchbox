package com.google.android.apps.gsa.staticplugins.bubble.p7577d.p7580c;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.bubble.p7577d.p7579b.C96958a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.d.c.c */
/* compiled from: PG */
public final class C96963c extends C22939d {

    /* renamed from: a */
    public final C96958a f270991a;

    /* renamed from: b */
    private final Context f270992b;

    /* renamed from: c */
    private ImageView f270993c;

    /* renamed from: d */
    private AnimationDrawable f270994d;

    public C96963c(C22945j jVar, Context context, C96958a aVar) {
        super(jVar);
        this.f270992b = context;
        this.f270991a = aVar;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        View inflate = LayoutInflater.from(this.f270992b).inflate(R.layout.permission_layout, (ViewGroup) null);
        C28295m.m52919e(inflate, new C28292j(50583));
        View findViewById = inflate.findViewById(R.id.cancel_button);
        findViewById.setOnClickListener(new C89943l(new C96961a(this)));
        C28292j jVar = new C28292j(50585);
        jVar.mo33795i(5);
        C28295m.m52919e(findViewById, jVar);
        View findViewById2 = inflate.findViewById(R.id.open_setting_button);
        findViewById2.setOnClickListener(new C89943l(new C96962b(this)));
        C28292j jVar2 = new C28292j(50584);
        jVar2.mo33795i(5);
        C28295m.m52919e(findViewById2, jVar2);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.promo_permissions_image);
        this.f270993c = imageView;
        imageView.setBackgroundResource(R.drawable.promo_animation);
        AnimationDrawable animationDrawable = (AnimationDrawable) this.f270993c.getBackground();
        this.f270994d = animationDrawable;
        animationDrawable.setEnterFadeDuration(500);
        this.f270994d.setExitFadeDuration(500);
        this.f270994d.start();
        mo28295iC(inflate);
        C89949q.m146521e(C28285c.m52874a(inflate, 50478), false);
    }
}
