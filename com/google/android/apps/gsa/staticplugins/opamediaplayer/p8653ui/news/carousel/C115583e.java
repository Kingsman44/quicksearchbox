package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news.carousel;

import android.content.Context;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.C2136w;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news.C115560ag;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115620ah;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.ThumbnailView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52573wt;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.carousel.e */
/* compiled from: PG */
public final class C115583e extends C0673gh {

    /* renamed from: a */
    public final C22871g f320645a;

    /* renamed from: b */
    public final C115620ah f320646b;

    /* renamed from: c */
    public final C58495hd f320647c;

    /* renamed from: d */
    public final TextView f320648d;

    /* renamed from: e */
    public final ThumbnailView f320649e;

    /* renamed from: f */
    public final ImageView f320650f;

    /* renamed from: g */
    public final View f320651g;

    /* renamed from: h */
    public final C115560ag f320652h;

    public C115583e(View view, Context context, C22871g gVar, C115620ah ahVar, C115560ag agVar) {
        super(view);
        this.f320645a = gVar;
        this.f320646b = ahVar;
        this.f320652h = agVar;
        this.f320649e = (ThumbnailView) view.findViewById(R.id.media_player_item_image);
        this.f320650f = (ImageView) view.findViewById(R.id.media_player_item_info_icon);
        TextView textView = (TextView) view.findViewById(R.id.media_player_item_tag);
        this.f320648d = textView;
        this.f320651g = view.findViewById(R.id.media_player_item_tag_container);
        C2136w.m5931g(textView, 1);
        this.f320647c = C58495hd.m89902p(C52573wt.HEADLINES, context.getResources().getString(R.string.omp_media_item_story_tag_headlines), C52573wt.LOCAL, context.getResources().getString(R.string.omp_media_item_story_tag_local), C52573wt.PERSONALIZED, context.getResources().getString(R.string.omp_media_item_story_tag_personalized));
    }
}
