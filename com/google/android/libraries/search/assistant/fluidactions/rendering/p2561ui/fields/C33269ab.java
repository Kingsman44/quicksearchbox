package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.assistant.p3897e.p3921j.C52478tf;
import com.google.assistant.p3897e.p3921j.C52479tg;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52493tu;
import com.google.assistant.p3897e.p3921j.C52494tv;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ab */
/* compiled from: PG */
final class C33269ab extends C0673gh implements View.OnClickListener {

    /* renamed from: a */
    final RelativeLayout f89219a;

    /* renamed from: b */
    final ImageComponent f89220b;

    /* renamed from: c */
    final ImageComponent f89221c;

    /* renamed from: d */
    final TextView f89222d;

    /* renamed from: e */
    final TextView f89223e;

    /* renamed from: f */
    final /* synthetic */ C33270ac f89224f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33269ab(C33270ac acVar, View view) {
        super(view);
        this.f89224f = acVar;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.fa_contact_disambiguation_list_item_icon_container);
        relativeLayout.getClass();
        this.f89219a = relativeLayout;
        ImageComponent imageComponent = (ImageComponent) view.findViewById(R.id.fa_contact_disambiguation_list_item_icon);
        imageComponent.getClass();
        this.f89220b = imageComponent;
        ImageComponent imageComponent2 = (ImageComponent) view.findViewById(R.id.fa_contact_disambiguation_list_item_image);
        imageComponent2.getClass();
        this.f89221c = imageComponent2;
        TextView textView = (TextView) view.findViewById(R.id.fa_contact_disambiguation_list_item_title);
        textView.getClass();
        this.f89222d = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.fa_contact_disambiguation_list_item_description);
        textView2.getClass();
        this.f89223e = textView2;
        view.setOnClickListener(this);
    }

    public final void onClick(View view) {
        C33182g gVar;
        C51016dg dgVar;
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            ((C59052c) ((C59052c) C33272ae.f89230a.mo56226d()).mo56372aa(51033)).mo56386p("ListItem clicked but item has been removed from adapter");
            return;
        }
        C33272ae aeVar = this.f89224f.f89226b;
        C51941eu euVar = aeVar.f89231b;
        if (euVar == null || (gVar = aeVar.f89232c) == null || aeVar.f89234e == null) {
            ((C59052c) ((C59052c) C33272ae.f89230a.mo56226d()).mo56372aa(51032)).mo56386p("Failed to send selected contact due to invalid args");
            return;
        }
        C51953ff a = gVar.mo38576a();
        C52478tf tfVar = (C52478tf) C52479tg.f137757d.createBuilder();
        C52493tu tuVar = (C52493tu) C52494tv.f137809c.createBuilder();
        tuVar.copyOnWrite();
        C52494tv tvVar = (C52494tv) tuVar.instance;
        tvVar.f137811a |= 1;
        tvVar.f137812b = (long) bindingAdapterPosition;
        tfVar.copyOnWrite();
        C52479tg tgVar = (C52479tg) tfVar.instance;
        C52494tv tvVar2 = (C52494tv) tuVar.build();
        tvVar2.getClass();
        tgVar.f137761c = tvVar2;
        tgVar.f137759a |= 2;
        C52492tt a2 = C33272ae.m61871a(euVar, a, (C52479tg) tfVar.build());
        if (bindingAdapterPosition >= this.f89224f.f89225a.size() || ((C51027dr) this.f89224f.f89225a.get(bindingAdapterPosition)).f132857d != 4) {
            this.f89224f.f89226b.f89234e.mo38366c("FA ContactSelect", a2);
            return;
        }
        C33270ac acVar = this.f89224f;
        C32942a aVar = acVar.f89226b.f89234e;
        C51027dr drVar = (C51027dr) acVar.f89225a.get(bindingAdapterPosition);
        if (drVar.f132857d == 4) {
            dgVar = (C51016dg) drVar.f132858e;
        } else {
            dgVar = C51016dg.f132827g;
        }
        aVar.mo38364a("FA ContactSelect Interactive", a2, dgVar);
    }
}
