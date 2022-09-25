package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8247b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106734a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106740b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.b.b */
/* compiled from: PG */
public final class C106742b implements C106740b {

    /* renamed from: a */
    public final ViewGroup f297466a;

    /* renamed from: b */
    public final C92125t f297467b;

    public C106742b(C92125t tVar, Context context, ViewGroup viewGroup, C83564a aVar) {
        this.f297467b = tVar;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.aa_generic_tile, viewGroup, false);
        this.f297466a = viewGroup2;
        C28292j jVar = new C28292j(108844);
        jVar.mo33795i(5);
        C28295m.m52919e(viewGroup2, jVar);
        aVar.mo76901b(this);
        viewGroup2.setOnClickListener(new C106741a(this, context));
        ((TextView) LayoutInflater.from(context).inflate(R.layout.aa_generic_deeplink_content, viewGroup2, true).findViewById(R.id.aa_generic_tile_desc)).setText(R.string.do_not_disturb_desc);
        mo95636c(C90772bp.m148281H(context));
    }

    /* renamed from: a */
    public final List mo95632a() {
        return C58485gu.m89846n(C106734a.MINI);
    }

    /* renamed from: b */
    public final C60870cx mo95633b() {
        return C60856cj.m92900i(Optional.m71637of(this.f297466a));
    }

    /* renamed from: c */
    public final void mo95636c(boolean z) {
        TextView textView = (TextView) this.f297466a.findViewById(R.id.aa_generic_tile_title);
        ImageView imageView = (ImageView) this.f297466a.findViewById(R.id.aa_icon);
        int color = this.f297466a.getResources().getColor(R.color.aa_dnd_active);
        int color2 = this.f297466a.getResources().getColor(R.color.aa_dnd_desc);
        if (z) {
            textView.setText(R.string.dnd_title_on);
            textView.setTextColor(color);
            imageView.setImageResource(R.drawable.dnd_icon_blue);
        } else {
            textView.setText(R.string.dnd_title_off);
            textView.setTextColor(color2);
            imageView.setImageResource(R.drawable.dnd_icon_gray);
        }
        imageView.setVisibility(0);
    }
}
