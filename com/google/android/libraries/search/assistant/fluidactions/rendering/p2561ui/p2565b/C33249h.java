package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields.ListField;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.b.h */
/* compiled from: PG */
final class C33249h extends C0673gh implements View.OnClickListener {

    /* renamed from: a */
    public TextView f88907a;

    /* renamed from: b */
    public ImageComponent f88908b;

    /* renamed from: c */
    final /* synthetic */ C33250i f88909c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33249h(C33250i iVar, View view) {
        super(view);
        this.f88909c = iVar;
        TextView textView = (TextView) view.findViewById(R.id.fa_list_item_picker_list_item_title);
        textView.getClass();
        this.f88907a = textView;
        ImageComponent imageComponent = (ImageComponent) view.findViewById(R.id.fa_list_item_picker_list_item_icon);
        imageComponent.getClass();
        this.f88908b = imageComponent;
        view.setOnClickListener(this);
    }

    public final void onClick(View view) {
        if (this.f88909c.f88911b.f88915c != null) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            C33250i iVar = this.f88909c;
            ((ListField) iVar.f88911b.f88915c).mo38711a((C51027dr) iVar.f88910a.get(bindingAdapterPosition), bindingAdapterPosition);
        }
        this.f88909c.f88911b.dismiss();
    }
}
