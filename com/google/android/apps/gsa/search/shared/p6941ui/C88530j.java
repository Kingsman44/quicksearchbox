package com.google.android.apps.gsa.search.shared.p6941ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.gsa.sidekick.main.p7227s.C91618g;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.search.shared.ui.j */
/* compiled from: PG */
public final class C88530j implements TextWatcher, View.OnFocusChangeListener {

    /* renamed from: a */
    public final EditText f239262a;

    /* renamed from: b */
    public final ListView f239263b;

    /* renamed from: c */
    public final TextView f239264c;

    /* renamed from: d */
    public boolean f239265d;

    /* renamed from: e */
    public final C91618g f239266e;

    public C88530j(C91618g gVar, EditText editText, ListView listView, TextView textView) {
        this.f239266e = gVar;
        this.f239262a = editText;
        this.f239263b = listView;
        this.f239264c = textView;
        editText.addTextChangedListener(this);
    }

    /* renamed from: a */
    public final void mo82163a(boolean z) {
        boolean z2 = this.f239263b.getEmptyView() != null;
        this.f239264c.setText(true != this.f239266e.f255540e ? R.string.edit_reminder_no_matching_places_found : R.string.cant_load_suggestions);
        if (z && !z2) {
            this.f239263b.setEmptyView(this.f239264c);
        } else if (!z && z2) {
            this.f239264c.setVisibility(8);
            this.f239263b.setEmptyView((View) null);
        }
    }

    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        if (TextUtils.isEmpty(obj)) {
            mo82163a(false);
        }
        this.f239266e.mo86001a(obj);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onFocusChange(View view, boolean z) {
        if (this.f239265d && view.equals(this.f239262a) && z) {
            this.f239262a.selectAll();
            this.f239265d = false;
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
