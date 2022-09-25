package com.google.android.libraries.web.contrib.p3358b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.AppCompatImageButton;
import android.support.p033v7.widget.C0678gm;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.libraries.web.contrib.b.c */
/* compiled from: PG */
public final class C43402c {

    /* renamed from: a */
    public final C28443m f113393a;

    /* renamed from: b */
    private final C47770dh f113394b;

    /* renamed from: c */
    private final C28310af f113395c;

    public C43402c(C28443m mVar, C47770dh dhVar, C28310af afVar) {
        this.f113393a = mVar;
        this.f113394b = dhVar;
        this.f113395c = afVar;
    }

    /* renamed from: a */
    public final AppCompatImageButton mo46501a(C43387a aVar, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) LayoutInflater.from(context).inflate(R.layout.webx_static_action_button, viewGroup, false);
        appCompatImageButton.setId(aVar.mo46487c());
        appCompatImageButton.setContentDescription(context.getString(aVar.mo46485a()));
        Drawable c = C0678gm.m2375e().mo3100c(context, aVar.mo46486b());
        c.getClass();
        appCompatImageButton.setImageDrawable(c);
        appCompatImageButton.setOnClickListener(new C47591co(this.f113394b, "Click action button", new C43401b(this, aVar, this.f113395c.f76997b.mo33800a(C28427h.m53115a(aVar.mo46488d())).mo33809b(appCompatImageButton))));
        return appCompatImageButton;
    }
}
