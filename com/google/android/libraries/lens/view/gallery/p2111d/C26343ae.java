package com.google.android.libraries.lens.view.gallery.p2111d;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.gallery.d.ae */
/* compiled from: PG */
final class C26343ae extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ C26345ag f71612a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26343ae(C26345ag agVar, Context context, List list) {
        super(context, R.layout.lens_gallery_folder_dropdown_item, R.id.lens_gallery_folder_dropdown_item_text, list);
        this.f71612a = agVar;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        TextView textView = (TextView) dropDownView.findViewById(R.id.lens_gallery_folder_dropdown_item_text);
        if (i == this.f71612a.f71620b.getSelectedItemPosition()) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.quantum_gm_ic_expand_less_white_18, 0);
        } else {
            textView.setCompoundDrawablesRelative((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        return dropDownView;
    }
}
