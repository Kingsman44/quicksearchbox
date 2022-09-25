package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.SpinnerComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C51033dx;
import com.google.assistant.p3897e.p3902c.p3907c.C51034dy;
import com.google.assistant.p3897e.p3921j.C52537vk;
import com.google.assistant.p3897e.p3921j.C52541vo;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ca */
/* compiled from: PG */
public final class C33322ca extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ LocationSelectionField f89319a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33322ca(LocationSelectionField locationSelectionField, Context context) {
        super(context, R.layout.fa_location_selection_field_list_item);
        this.f89319a = locationSelectionField;
    }

    /* renamed from: a */
    private final View m61918a(C51034dy dyVar, boolean z) {
        SpinnerComponent spinnerComponent;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.fa_location_selection_field_current_list_item, (ViewGroup) null);
        if (!(inflate instanceof LinearLayout)) {
            ((C59052c) ((C59052c) LocationSelectionField.f89135a.mo56225c()).mo56372aa(51105)).mo56386p("getSelectedView: convertView is not an instance of LinearLayout");
            return inflate;
        }
        TextView textView = (TextView) inflate.findViewById(R.id.fa_location_selection_field_current_list_item_name);
        TextView textView2 = (TextView) inflate.findViewById(R.id.fa_location_selection_field_current_list_item_url);
        if (!(textView == null || textView2 == null)) {
            C52541vo voVar = dyVar.f132883d;
            if (voVar == null) {
                voVar = C52541vo.f137908f;
            }
            C52537vk vkVar = voVar.f137912c;
            if (vkVar == null) {
                vkVar = C52537vk.f137903c;
            }
            textView.setText(vkVar.f137906b);
            C52541vo voVar2 = dyVar.f132883d;
            if (voVar2 == null) {
                voVar2 = C52541vo.f137908f;
            }
            textView2.setText(voVar2.f137911b);
            LocationSelectionField locationSelectionField = this.f89319a;
            C51941eu euVar = locationSelectionField.f89142h;
            if (!(euVar == null || (spinnerComponent = locationSelectionField.f89136b) == null || !z)) {
                boolean z2 = false;
                if ((euVar.f136273a & 64) != 0 && euVar.f136282j) {
                    z2 = true;
                }
                spinnerComponent.mo38668c(textView, z2, locationSelectionField.f89141g);
                LocationSelectionField locationSelectionField2 = this.f89319a;
                locationSelectionField2.f89136b.mo38668c(textView2, z2, locationSelectionField2.f89141g);
            }
        }
        return inflate;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        C51034dy dyVar = (C51034dy) getItem(i);
        dyVar.getClass();
        int a = C51033dx.m86018a(dyVar.f132885f);
        if (a != 0 && a == 2) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.fa_drop_down_list_item, (ViewGroup) null);
            if (!(inflate instanceof TextView)) {
                ((C59052c) ((C59052c) LocationSelectionField.f89135a.mo56225c()).mo56372aa(51104)).mo56386p("getLocationPickerView: locationPickerView is not an instance of TextView");
            } else {
                TextView textView = (TextView) inflate;
                textView.setText(dyVar.f132881b);
                if (i == this.f89319a.f89140f) {
                    textView.setTextColor(C19391a.m36980a(getContext(), R.attr.colorPrimary));
                }
            }
            return inflate;
        }
        View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.fa_location_selection_field_list_item, (ViewGroup) null);
        if (!(inflate2 instanceof ConstraintLayout)) {
            ((C59052c) ((C59052c) LocationSelectionField.f89135a.mo56225c()).mo56372aa(51102)).mo56386p("getHomeWorkView: convertView is not an instance of ConstraintLayout");
        } else {
            TextView textView2 = (TextView) inflate2.findViewById(R.id.fa_location_selection_field_list_item_name);
            TextView textView3 = (TextView) inflate2.findViewById(R.id.fa_location_selection_field_list_item_url);
            if (!(textView2 == null || textView3 == null)) {
                C52541vo voVar = dyVar.f132883d;
                if (voVar == null) {
                    voVar = C52541vo.f137908f;
                }
                C52537vk vkVar = voVar.f137912c;
                if (vkVar == null) {
                    vkVar = C52537vk.f137903c;
                }
                textView2.setText(vkVar.f137906b);
                C52541vo voVar2 = dyVar.f132883d;
                if (voVar2 == null) {
                    voVar2 = C52541vo.f137908f;
                }
                textView3.setText(voVar2.f137911b);
                if (i == this.f89319a.f89140f) {
                    textView2.setTextColor(C19391a.m36980a(getContext(), R.attr.colorPrimary));
                    textView3.setTextColor(C19391a.m36980a(getContext(), R.attr.colorPrimary));
                }
            }
        }
        return inflate2;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        SpinnerComponent spinnerComponent;
        int a;
        C51034dy dyVar = (C51034dy) getItem(i);
        dyVar.getClass();
        C51034dy dyVar2 = this.f89319a.f89139e;
        boolean z = false;
        if ((dyVar2.f132880a & 4) != 0 && (a = C51033dx.m86018a(dyVar.f132885f)) != 0 && a == 2) {
            return m61918a(dyVar2, false);
        }
        if ((dyVar.f132880a & 4) != 0) {
            return m61918a(dyVar, true);
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.fa_drop_down_list_current_item, (ViewGroup) null);
        if (!(inflate instanceof TextView)) {
            ((C59052c) ((C59052c) LocationSelectionField.f89135a.mo56225c()).mo56372aa(51103)).mo56386p("getInitialView: initialView is not an instance of TextView");
        } else {
            ((TextView) inflate).setText(dyVar.f132886g);
            LocationSelectionField locationSelectionField = this.f89319a;
            C51941eu euVar = locationSelectionField.f89142h;
            if (!(euVar == null || (spinnerComponent = locationSelectionField.f89136b) == null)) {
                if ((euVar.f136273a & 64) != 0 && euVar.f136282j) {
                    z = true;
                }
                spinnerComponent.mo38668c(inflate, z, locationSelectionField.f89141g);
            }
        }
        return inflate;
    }
}
