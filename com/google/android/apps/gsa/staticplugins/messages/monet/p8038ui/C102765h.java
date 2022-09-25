package com.google.android.apps.gsa.staticplugins.messages.monet.p8038ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8037c.C102749a;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8037c.C102752d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.ui.h */
/* compiled from: PG */
public final class C102765h extends C22939d {

    /* renamed from: a */
    public final C102749a f286872a;

    /* renamed from: b */
    public TextView f286873b;

    /* renamed from: c */
    private final C102752d f286874c;

    /* renamed from: d */
    private final Context f286875d;

    public C102765h(C22945j jVar, C102752d dVar, C102749a aVar, Context context) {
        super(jVar);
        this.f286874c = dVar;
        this.f286872a = aVar;
        this.f286875d = context;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        View inflate = LayoutInflater.from(this.f286875d).inflate(R.layout.message_card_button, (ViewGroup) null, false);
        mo28295iC(inflate);
        this.f286873b = (TextView) inflate.findViewById(R.id.message_card_button_text);
        ((C102781x) this.f286874c).f286903b.mo28726b(new C102762e(this));
        ((C102781x) this.f286874c).f286902a.mo28726b(new C102763f(this));
        this.f286873b.setOnClickListener(new C102764g(this));
    }
}
