package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.assistant.p3897e.p3902c.p3907c.C51033dx;
import com.google.assistant.p3897e.p3902c.p3907c.C51034dy;
import com.google.assistant.p3897e.p3921j.C52537vk;
import com.google.assistant.p3897e.p3921j.C52541vo;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bn */
/* compiled from: PG */
public final class C11381bn extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ LocationSelectionField f37116a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11381bn(LocationSelectionField locationSelectionField, Context context) {
        super(context, R.layout.list_item_view_loc);
        this.f37116a = locationSelectionField;
    }

    /* renamed from: a */
    private final View m27092a(C51034dy dyVar, int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.current_list_item_view_loc, (ViewGroup) null);
        if (!(inflate instanceof LinearLayout)) {
            ((C59052c) ((C59052c) LocationSelectionField.f37010a.mo56225c()).mo56372aa(43273)).mo56386p("getSelectedView: convertview is not an instance of LinearLayout");
            return inflate;
        }
        TextView textView = (TextView) inflate.findViewById(R.id.current_list_item_loc_name);
        C52541vo voVar = dyVar.f132883d;
        if (voVar == null) {
            voVar = C52541vo.f137908f;
        }
        C52537vk vkVar = voVar.f137912c;
        if (vkVar == null) {
            vkVar = C52537vk.f137903c;
        }
        textView.setText(vkVar.f137906b);
        TextView textView2 = (TextView) inflate.findViewById(R.id.current_list_item_loc_url);
        C52541vo voVar2 = dyVar.f132883d;
        if (voVar2 == null) {
            voVar2 = C52541vo.f137908f;
        }
        textView2.setText(voVar2.f137911b);
        LocationSelectionField locationSelectionField = this.f37116a;
        C11295c cVar = locationSelectionField.f37153l;
        if (cVar != null && i == 1) {
            locationSelectionField.f37011b.mo19803c(textView, cVar.mo19717a(), this.f37116a.f37151j);
            LocationSelectionField locationSelectionField2 = this.f37116a;
            locationSelectionField2.f37011b.mo19803c(textView2, locationSelectionField2.f37153l.mo19717a(), this.f37116a.f37151j);
        }
        return inflate;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        C51034dy dyVar = (C51034dy) getItem(i);
        dyVar.getClass();
        int a = C51033dx.m86018a(dyVar.f132885f);
        if (a != 0 && a == 2) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.list_item_view, (ViewGroup) null);
            if (!(inflate instanceof TextView)) {
                ((C59052c) ((C59052c) LocationSelectionField.f37010a.mo56225c()).mo56372aa(43272)).mo56386p("getLocationPickerView: locationPickerView is not an instance of TextView");
            } else {
                TextView textView = (TextView) inflate;
                textView.setText(dyVar.f132881b);
                LocationSelectionField locationSelectionField = this.f37116a;
                if (i == locationSelectionField.f37015f) {
                    textView.setTextColor(C11307e.m26908a(locationSelectionField.f37159r, R.attr.fluid_actions_list_item_highlight_color));
                }
            }
            return inflate;
        }
        View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.list_item_view_loc, (ViewGroup) null);
        if (!(inflate2 instanceof ConstraintLayout)) {
            ((C59052c) ((C59052c) LocationSelectionField.f37010a.mo56225c()).mo56372aa(43270)).mo56386p("getHomeWorkView: convertview is not an instance of ConstraintLayout");
        } else {
            TextView textView2 = (TextView) inflate2.findViewById(R.id.list_item_loc_name);
            C52541vo voVar = dyVar.f132883d;
            if (voVar == null) {
                voVar = C52541vo.f137908f;
            }
            C52537vk vkVar = voVar.f137912c;
            if (vkVar == null) {
                vkVar = C52537vk.f137903c;
            }
            textView2.setText(vkVar.f137906b);
            TextView textView3 = (TextView) inflate2.findViewById(R.id.list_item_loc_url);
            C52541vo voVar2 = dyVar.f132883d;
            if (voVar2 == null) {
                voVar2 = C52541vo.f137908f;
            }
            textView3.setText(voVar2.f137911b);
            LocationSelectionField locationSelectionField2 = this.f37116a;
            if (i == locationSelectionField2.f37015f) {
                textView2.setTextColor(C11307e.m26908a(locationSelectionField2.f37159r, R.attr.fluid_actions_list_item_highlight_color));
                textView3.setTextColor(C11307e.m26908a(this.f37116a.f37159r, R.attr.fluid_actions_list_item_highlight_color));
            }
        }
        return inflate2;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int a;
        C51034dy dyVar = (C51034dy) getItem(i);
        dyVar.getClass();
        C51034dy dyVar2 = this.f37116a.f37014e;
        if ((dyVar2.f132880a & 4) != 0 && (a = C51033dx.m86018a(dyVar.f132885f)) != 0 && a == 2) {
            return m27092a(dyVar2, 2);
        }
        if ((dyVar.f132880a & 4) != 0) {
            return m27092a(dyVar, 1);
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.current_list_item_view, (ViewGroup) null);
        if (!(inflate instanceof TextView)) {
            ((C59052c) ((C59052c) LocationSelectionField.f37010a.mo56225c()).mo56372aa(43271)).mo56386p("getInitialView: initialView is not an instance of TextView");
        } else {
            ((TextView) inflate).setText(dyVar.f132886g);
            LocationSelectionField locationSelectionField = this.f37116a;
            C11295c cVar = locationSelectionField.f37153l;
            if (cVar != null) {
                locationSelectionField.f37011b.mo19803c(inflate, cVar.mo19717a(), this.f37116a.f37151j);
            }
        }
        return inflate;
    }
}
