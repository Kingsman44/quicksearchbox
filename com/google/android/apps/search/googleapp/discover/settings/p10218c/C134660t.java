package com.google.android.apps.search.googleapp.discover.settings.p10218c;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.c.t */
/* compiled from: PG */
public final class C134660t extends C0673gh {

    /* renamed from: a */
    public final TextView f366700a;

    /* renamed from: b */
    public final TextView f366701b;

    /* renamed from: c */
    public final ImageView f366702c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134660t(View view) {
        super(view);
        C69664n.m101061g(view, "view");
        View findViewById = view.findViewById(R.id.googleapp_disco_lang_item_name);
        C69664n.m101060f(findViewById, "view.findViewById(R.id.g…app_disco_lang_item_name)");
        this.f366700a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.googleapp_disco_lang_item_subtitle);
        C69664n.m101060f(findViewById2, "view.findViewById(R.id.g…disco_lang_item_subtitle)");
        this.f366701b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.googleapp_disco_lang_item_checkmark);
        C69664n.m101060f(findViewById3, "view.findViewById(R.id.g…isco_lang_item_checkmark)");
        this.f366702c = (ImageView) findViewById3;
        C69664n.m101060f(view.findViewById(R.id.googleapp_disco_lang_item_layout), "view.findViewById(R.id.g…p_disco_lang_item_layout)");
    }
}
