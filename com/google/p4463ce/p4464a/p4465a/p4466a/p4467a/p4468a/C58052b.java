package com.google.p4463ce.p4464a.p4465a.p4466a.p4467a.p4468a;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Filter;
import android.widget.TextView;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.List;
import p5652p.p5653a.p5654a.p5655a.p5678l.p5679a.C72740f;

/* renamed from: com.google.ce.a.a.a.a.a.b */
/* compiled from: PG */
public final class C58052b extends ArrayAdapter {

    /* renamed from: a */
    public final AutoCompleteTextView f155190a;

    /* renamed from: b */
    public final C72740f f155191b;

    /* renamed from: c */
    private final List f155192c = C58485gu.m89845m();

    /* renamed from: d */
    private final C58051a f155193d;

    public C58052b(Context context, AutoCompleteTextView autoCompleteTextView, C72740f fVar) {
        super(context, 17367050);
        this.f155190a = autoCompleteTextView;
        this.f155191b = fVar;
        this.f155193d = new C58051a(this);
        new Handler(context.getMainLooper());
    }

    public final int getCount() {
        return ((C58724pq) this.f155192c).f156474d;
    }

    public final Filter getFilter() {
        return this.f155193d;
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return (String) this.f155192c.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        ((TextView) view2).setTextColor(this.f155190a.getTextColors());
        return view2;
    }
}
