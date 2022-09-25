package com.google.android.apps.search.podcasts.widgets.p10620b;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.apps.search.podcasts.widgets.b.d */
/* compiled from: PG */
final class C141198d extends C0673gh {

    /* renamed from: a */
    public final ImageView f383345a;

    /* renamed from: b */
    public final TextView f383346b = ((TextView) this.itemView.findViewById(R.id.podcasts_item_text));

    /* renamed from: c */
    public final C47770dh f383347c;

    /* renamed from: d */
    public final C28443m f383348d;

    /* renamed from: e */
    public final C28310af f383349e;

    /* renamed from: f */
    public final C28306ab f383350f;

    public C141198d(C47770dh dhVar, C28443m mVar, C28310af afVar, C28306ab abVar, View view, boolean z) {
        super(view);
        this.f383347c = dhVar;
        this.f383348d = mVar;
        this.f383349e = afVar;
        this.f383350f = abVar;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.podcasts_item_icon);
        this.f383345a = imageView;
        imageView.setVisibility(true != z ? 8 : 0);
    }
}
