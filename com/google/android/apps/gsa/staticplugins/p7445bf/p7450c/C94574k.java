package com.google.android.apps.gsa.staticplugins.p7445bf.p7450c;

import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.c.k */
/* compiled from: PG */
final class C94574k extends C0673gh {

    /* renamed from: a */
    public final ImageView f264535a;

    /* renamed from: b */
    public final TextView f264536b;

    /* renamed from: c */
    public final View f264537c;

    /* renamed from: d */
    public final View f264538d;

    /* renamed from: e */
    public final View f264539e;

    /* renamed from: f */
    final /* synthetic */ C94575l f264540f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94574k(C94575l lVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater.inflate(R.layout.voice_selection_voice, viewGroup, false));
        this.f264540f = lVar;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.voice_selection_voice_selected);
        imageView.getClass();
        this.f264535a = imageView;
        TextView textView = (TextView) this.itemView.findViewById(R.id.voice_selection_voice_name);
        textView.getClass();
        this.f264536b = textView;
        View findViewById = this.itemView.findViewById(R.id.voice_selection_voice_play);
        findViewById.getClass();
        this.f264537c = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.voice_selection_voice_play_image);
        findViewById2.getClass();
        this.f264539e = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.voice_selection_voice_play_spinner);
        findViewById3.getClass();
        this.f264538d = findViewById3;
    }
}
