package com.google.android.apps.gsa.staticplugins.languagesettings;

import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.a */
/* compiled from: PG */
public final /* synthetic */ class C102647a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C102667l f286522a;

    /* renamed from: b */
    public final /* synthetic */ C102663h f286523b;

    /* renamed from: c */
    public final /* synthetic */ String f286524c;

    /* renamed from: d */
    public final /* synthetic */ String f286525d;

    public /* synthetic */ C102647a(C102667l lVar, C102663h hVar, String str, String str2) {
        this.f286522a = lVar;
        this.f286523b = hVar;
        this.f286524c = str;
        this.f286525d = str2;
    }

    public final void run() {
        C102667l lVar = this.f286522a;
        C102663h hVar = this.f286523b;
        String str = this.f286524c;
        String str2 = this.f286525d;
        lVar.mo93375f(2);
        RecyclerView recyclerView = (RecyclerView) lVar.f286576d.findViewById(R.id.discover_feed_language_preferences_layout);
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            C0673gh findContainingViewHolder = recyclerView.findContainingViewHolder(recyclerView.getChildAt(i));
            if ((findContainingViewHolder instanceof C102663h) && findContainingViewHolder != hVar) {
                ((C102663h) findContainingViewHolder).mo93369a(false);
            }
        }
        hVar.mo93369a(!str.isEmpty());
        lVar.f286581i = str2;
        lVar.mo93373d(str);
    }
}
