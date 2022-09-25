package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.d */
/* compiled from: PG */
final class C132242d extends C0673gh {

    /* renamed from: a */
    public final View f360938a;

    /* renamed from: b */
    public final ImageView f360939b;

    /* renamed from: c */
    public final TextView f360940c;

    /* renamed from: d */
    final /* synthetic */ C132276e f360941d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C132242d(C132276e eVar, View view) {
        super(view);
        this.f360941d = eVar;
        this.f360938a = view;
        this.f360939b = (ImageView) view.findViewById(R.id.assistant_custodio_child_selection_item_image);
        this.f360940c = (TextView) view.findViewById(R.id.assistant_custodio_child_selection_item_title);
    }
}
