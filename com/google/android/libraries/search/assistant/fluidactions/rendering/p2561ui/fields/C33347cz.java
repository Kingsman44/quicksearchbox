package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33230h;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3902c.p3907c.C51118ha;
import com.google.assistant.p3897e.p3902c.p3907c.C51119hb;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.cz */
/* compiled from: PG */
final class C33347cz extends C0673gh implements View.OnClickListener {

    /* renamed from: a */
    TextView f89387a;

    /* renamed from: b */
    TextView f89388b;

    /* renamed from: c */
    final /* synthetic */ C33349da f89389c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33347cz(C33349da daVar, View view) {
        super(view);
        this.f89389c = daVar;
        TextView textView = (TextView) view.findViewById(R.id.fa_receipt_card_list_view_item_title);
        textView.getClass();
        this.f89387a = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.fa_receipt_card_list_view_item_description);
        textView2.getClass();
        this.f89388b = textView2;
        view.setOnClickListener(this);
    }

    public final void onClick(View view) {
        C51098gh ghVar;
        int bindingAdapterPosition = getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            ((C59052c) ((C59052c) ReceiptCardListField.f89165a.mo56226d()).mo56372aa(51134)).mo56386p("ListItem clicked but item has been removed from adapter");
            return;
        }
        C51119hb hbVar = (C51119hb) this.f89389c.f89391a.get(bindingAdapterPosition);
        if (this.f89389c.f89392b.f89168d != null) {
            C51118ha haVar = hbVar.f133064e;
            if (haVar == null) {
                haVar = C51118ha.f133049g;
            }
            if (haVar.f133052b == 4) {
                Context context = this.f89389c.f89392b.getContext();
                Fragment fragment = this.f89389c.f89392b.f89169e;
                C51118ha haVar2 = hbVar.f133064e;
                if (haVar2 == null) {
                    haVar2 = C51118ha.f133049g;
                }
                if (haVar2.f133052b == 4) {
                    ghVar = (C51098gh) haVar2.f133053c;
                } else {
                    ghVar = C51098gh.f133009e;
                }
                C33230h.m61622d(context, fragment, ghVar);
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) ReceiptCardListField.f89165a.mo56226d()).mo56372aa(51133)).mo56386p("Failed to handle OnClick due to invalid args");
    }
}
