package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.RoundedCornerWebImageView;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114839ci;
import com.google.android.googlequicksearchbox.R;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.y */
/* compiled from: PG */
final class C114699y {

    /* renamed from: a */
    public final Context f318260a;

    /* renamed from: b */
    public final C114839ci f318261b;

    /* renamed from: c */
    public View f318262c;

    /* renamed from: d */
    public ViewGroup f318263d;

    /* renamed from: e */
    public boolean f318264e;

    /* renamed from: f */
    private final C68214a f318265f;

    /* renamed from: g */
    private final String f318266g;

    /* renamed from: h */
    private final String f318267h;

    /* renamed from: i */
    private final String f318268i;

    /* renamed from: j */
    private final List f318269j;

    public C114699y(Context context, C68214a aVar, C114839ci ciVar, String str, String str2, String str3, List list) {
        this.f318260a = context;
        this.f318265f = aVar;
        this.f318261b = ciVar;
        this.f318266g = str;
        this.f318267h = str2;
        this.f318269j = list;
        this.f318268i = str3;
        View inflate = LayoutInflater.from(context).inflate(R.layout.zero_state_expandable_component_view, (ViewGroup) null);
        this.f318262c = inflate;
        ViewGroup viewGroup = (ViewGroup) this.f318262c.findViewById(R.id.zero_state_expandable_component_expandable_part_container);
        this.f318263d = viewGroup;
        viewGroup.setVisibility(8);
        ImageView imageView = (ImageView) this.f318262c.findViewById(R.id.zero_state_expandable_component_arrow);
        imageView.setImageDrawable(context.getDrawable(R.drawable.quantum_ic_keyboard_arrow_down_grey600_48));
        ((ViewGroup) inflate.findViewById(R.id.zero_state_expandable_component_main_part_container)).setOnClickListener(new C114698x(this, imageView));
        RoundedCornerWebImageView roundedCornerWebImageView = (RoundedCornerWebImageView) this.f318262c.findViewById(R.id.zero_state_expandable_component_image);
        if (!str3.isEmpty()) {
            ((C91189au) aVar.mo27525b()).mo85421i(str3, roundedCornerWebImageView);
        } else {
            roundedCornerWebImageView.setImageDrawable(context.getDrawable(R.drawable.product_logo_contacts_color_144));
        }
        ((TextView) this.f318262c.findViewById(R.id.zero_state_expandable_component_title)).setText(str);
        ((TextView) this.f318262c.findViewById(R.id.zero_state_expandable_component_description)).setText(str2);
        ViewGroup viewGroup2 = (ViewGroup) this.f318262c.findViewById(R.id.zero_state_expandable_component_suggestion_chip_container);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            viewGroup2.addView(((C114632ap) it.next()).f318020a);
        }
        this.f318264e = false;
    }
}
