package com.google.android.apps.gsa.staticplugins.p7377ah.p7380c;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.p7148ui.header.CorpusBarSelector;
import com.google.android.apps.gsa.shared.search.corpus.Corpus;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.ah.c.i */
/* compiled from: PG */
final class C93863i extends ArrayAdapter {

    /* renamed from: a */
    public final Consumer f262142a;

    /* renamed from: b */
    public final Context f262143b;

    /* renamed from: c */
    public Corpus f262144c;

    /* renamed from: d */
    private final View.AccessibilityDelegate f262145d = new C93861g(this);

    /* renamed from: e */
    private final View.AccessibilityDelegate f262146e = new C93862h(this);

    /* renamed from: f */
    private final LayoutInflater f262147f;

    public C93863i(Context context, Consumer consumer) {
        super(context, 0);
        this.f262143b = context;
        this.f262147f = LayoutInflater.from(context);
        this.f262142a = consumer;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Corpus corpus = (Corpus) getItem(i);
        if (view == null) {
            view = this.f262147f.inflate(R.layout.corpora_dialog_item, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.label);
        textView.setText(CorpusBarSelector.m148067a(this.f262143b, corpus));
        Corpus corpus2 = this.f262144c;
        if (!(corpus2 == null && i == 0) && (corpus2 == null || !corpus2.equals(corpus))) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setTypeface((Typeface) null, 0);
            textView.setTextColor(this.f262143b.getResources().getColor(R.color.agsa_color_on_background));
            textView.setPadding(this.f262143b.getResources().getDimensionPixelOffset(R.dimen.corpus_bar_accessible_label_padding_start), 0, 0, 0);
            textView.setAccessibilityDelegate(this.f262146e);
            textView.setOnClickListener(new C93860f(this, corpus));
            textView.setTag(corpus);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(this.f262143b.getDrawable(R.drawable.quantum_gm_ic_check_vd_theme_24), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding((int) C91115n.m148870b(8.0f, this.f262143b));
            textView.setPadding(0, 0, 0, 0);
            textView.setTypeface((Typeface) null, 1);
            textView.setTextColor(this.f262143b.getResources().getColor(R.color.agsa_color_primary));
            textView.setAccessibilityDelegate(this.f262145d);
            textView.setOnClickListener(new C93859e(this, corpus));
            textView.setTag(corpus);
        }
        return view;
    }
}
