package com.google.android.apps.gsa.search.shared.p6941ui;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.gsa.sidekick.main.p7227s.C91618g;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.search.shared.ui.h */
/* compiled from: PG */
public final class C88528h extends AlertDialog {

    /* renamed from: a */
    final EditText f239255a;

    /* renamed from: b */
    public final ListView f239256b;

    /* renamed from: c */
    public final C88530j f239257c;

    /* renamed from: d */
    private final TextView f239258d;

    /* renamed from: e */
    private final C91618g f239259e;

    public C88528h(Context context, C91618g gVar) {
        super(context);
        this.f239259e = gVar;
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.add_place_dialog_view, (ViewGroup) null);
        setView(inflate);
        EditText editText = (EditText) inflate.findViewById(R.id.filter);
        this.f239255a = editText;
        ListView listView = (ListView) inflate.findViewById(R.id.list);
        this.f239256b = listView;
        TextView textView = (TextView) inflate.findViewById(R.id.no_results_message);
        this.f239258d = textView;
        this.f239257c = new C88530j(gVar, editText, listView, textView);
        getWindow().setSoftInputMode(5);
    }

    public final void onAttachedToWindow() {
        View findViewById = findViewById(16908290);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C88527g(this));
        }
    }
}
