package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.bu */
/* compiled from: PG */
final class C33315bu extends C0673gh implements View.OnClickListener {

    /* renamed from: a */
    final ImageComponent f89306a;

    /* renamed from: b */
    final TextView f89307b;

    /* renamed from: c */
    final TextView f89308c;

    /* renamed from: d */
    final TextView f89309d;

    /* renamed from: e */
    final TextView f89310e;

    /* renamed from: f */
    final /* synthetic */ C33316bv f89311f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33315bu(C33316bv bvVar, View view) {
        super(view);
        this.f89311f = bvVar;
        this.f89306a = (ImageComponent) view.findViewById(R.id.fa_list_field_vertical_list_item_icon);
        this.f89307b = (TextView) view.findViewById(R.id.fa_list_field_vertical_list_item_title);
        this.f89308c = (TextView) view.findViewById(R.id.fa_list_field_vertical_list_item_description);
        this.f89309d = (TextView) view.findViewById(R.id.fa_list_field_vertical_list_item_sub_description);
        this.f89310e = (TextView) view.findViewById(R.id.fa_list_field_vertical_list_item_status);
        view.setOnClickListener(this);
    }

    public final void onClick(View view) {
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            ((C59052c) ((C59052c) ListField.f89122a.mo56226d()).mo56372aa(51088)).mo56386p("ListItem clicked but item has been removed from adapter");
            return;
        }
        C33316bv bvVar = this.f89311f;
        bvVar.f89313b.mo38711a((C51027dr) bvVar.f89312a.get(bindingAdapterPosition), bindingAdapterPosition);
    }
}
