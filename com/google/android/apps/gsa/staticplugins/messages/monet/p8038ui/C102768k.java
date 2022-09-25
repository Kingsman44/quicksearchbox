package com.google.android.apps.gsa.staticplugins.messages.monet.p8038ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8037c.C102753e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.ui.k */
/* compiled from: PG */
public final class C102768k extends C22939d {

    /* renamed from: a */
    public final Context f286878a;

    /* renamed from: b */
    private final C102753e f286879b;

    public C102768k(C22945j jVar, C102753e eVar, Context context) {
        super(jVar);
        this.f286879b = eVar;
        this.f286878a = context;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f286878a).inflate(R.layout.message_cards_container, (ViewGroup) null, false);
        mo28295iC(frameLayout);
        ((C102782y) this.f286879b).f286906a.mo28657c(new C102767j(this, (LinearLayout) frameLayout.findViewById(R.id.message_card_children)));
    }
}
