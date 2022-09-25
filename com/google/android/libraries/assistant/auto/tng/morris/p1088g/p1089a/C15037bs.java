package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14738h;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.bs */
/* compiled from: PG */
final class C15037bs extends C0673gh implements View.OnClickListener {

    /* renamed from: a */
    public final TextView f45096a;

    /* renamed from: b */
    public final TextView f45097b;

    /* renamed from: c */
    public final ImageView f45098c;

    /* renamed from: d */
    public C14292dv f45099d = null;

    /* renamed from: e */
    final /* synthetic */ C15038bt f45100e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15037bs(C15038bt btVar, View view) {
        super(view);
        this.f45100e = btVar;
        this.f45096a = (TextView) view.findViewById(R.id.media_browse_tree_playable_item_title);
        this.f45097b = (TextView) view.findViewById(R.id.media_browse_tree_playable_item_subtitle);
        this.f45098c = (ImageView) view.findViewById(R.id.media_browse_tree_playable_item_icon);
    }

    /* renamed from: a */
    public final void mo21909a(ImageView imageView) {
        imageView.setImageResource(R.drawable.music_icon);
        int dimensionPixelSize = this.f45100e.f45101a.getResources().getDimensionPixelSize(R.dimen.media_browse_tree_item_album_art_default_padding);
        imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        imageView.setBackgroundColor(C1878d.m5128a(this.f45100e.f45101a, R.color.album_art_default));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    public final void onClick(View view) {
        C14292dv dvVar = this.f45099d;
        if (dvVar != null) {
            this.f45100e.f45103c.mo21875g(C14738h.m31026d(dvVar));
        }
    }
}
