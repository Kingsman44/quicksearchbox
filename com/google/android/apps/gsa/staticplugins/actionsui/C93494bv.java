package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.bv */
/* compiled from: PG */
public final class C93494bv extends C93507m implements C93495bw {

    /* renamed from: e */
    private WebImageView f260949e;

    /* renamed from: f */
    private TextView f260950f;

    /* renamed from: g */
    private TextView f260951g;

    /* renamed from: h */
    private TextView f260952h;

    public C93494bv(Context context) {
        super(context, "SoundSearchResultCard");
        C89941l.m146512c(this, 9734);
    }

    /* renamed from: x */
    private final void m153975x(String str, String str2, String str3) {
        this.f260950f.setText(str);
        m154032u(this.f260951g, str2);
        m154032u(this.f260952h, str3);
        setContentDescription(getContext().getResources().getString(R.string.action_sound_search_result_content_description, new Object[]{str, str2, str3}));
    }

    /* renamed from: a */
    public final ViewGroup.LayoutParams mo87803a() {
        return this.f260949e.getLayoutParams();
    }

    /* renamed from: q */
    public final void mo87794q() {
    }

    /* renamed from: t */
    public final View mo87752t(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C93498d i = mo87828i(layoutInflater, viewGroup, R.layout.sound_search_result);
        this.f260949e = (WebImageView) i.findViewById(R.id.sound_search_result_image);
        this.f260950f = (TextView) i.findViewById(R.id.sound_search_result_song);
        this.f260951g = (TextView) i.findViewById(R.id.sound_search_result_album);
        TextView textView = (TextView) i.findViewById(R.id.sound_search_result_artist);
        this.f260952h = textView;
        this.f260949e.getClass();
        this.f260950f.getClass();
        this.f260951g.getClass();
        textView.getClass();
        C89941l.m146512c(i, 9735);
        return i;
    }

    /* renamed from: v */
    public final void mo87804v(String str, String str2, String str3, CharSequence charSequence, Drawable drawable, Bitmap bitmap) {
        m153975x(str, str2, str3);
        C93498d dVar = this.f260978d;
        if (dVar != null) {
            dVar.mo87709k(drawable);
        }
        String string = getContext().getString(R.string.open_app_template, new Object[]{charSequence});
        C93498d dVar2 = this.f260978d;
        if (dVar2 != null) {
            dVar2.mo87702e(string);
        }
        mo87834o(7362);
        if (bitmap != null) {
            this.f260949e.setImageBitmap(bitmap);
            this.f260949e.setVisibility(0);
        }
    }

    /* renamed from: w */
    public final void mo87805w(String str, String str2, String str3, Uri uri) {
        m153975x(str, str2, str3);
        mo87831l(R.drawable.ic_playstore);
        mo87833n(R.string.action_sound_search_get_song);
        mo87834o(7356);
        if (uri != null) {
            WebImageView webImageView = this.f260949e;
            C88507a aVar = this.f239232a;
            aVar.getClass();
            webImageView.mo76737h(uri, ((C93496bx) aVar).mo82040ap());
            this.f260949e.setVisibility(0);
        }
    }
}
