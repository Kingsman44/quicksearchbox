package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C52223ju;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.gq */
/* compiled from: PG */
public final /* synthetic */ class C108382gq implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C108387gv f301448a;

    /* renamed from: b */
    public final /* synthetic */ SelectionBadge f301449b;

    /* renamed from: c */
    public final /* synthetic */ C52223ju f301450c;

    /* renamed from: d */
    public final /* synthetic */ View f301451d;

    public /* synthetic */ C108382gq(C108387gv gvVar, SelectionBadge selectionBadge, C52223ju juVar, View view) {
        this.f301448a = gvVar;
        this.f301449b = selectionBadge;
        this.f301450c = juVar;
        this.f301451d = view;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C108387gv gvVar = this.f301448a;
        SelectionBadge selectionBadge = this.f301449b;
        C52223ju juVar = this.f301450c;
        View view = this.f301451d;
        if (z) {
            long a = gvVar.f301478g.mo79743a(C90014bt.f247643ky);
            if (((long) C58485gu.m89842j(gvVar.f301472N.f298206a).size()) >= a) {
                selectionBadge.setChecked(false);
                int i = (int) a;
                gvVar.f301475d.mo95800e(gvVar.f301473b.getResources().getQuantityString(R.plurals.opa_photo_selection_reaches_maximum_error_text, i, new Object[]{Integer.valueOf(i)}));
                return;
            }
            gvVar.f301470L.add(selectionBadge);
            selectionBadge.setText(Integer.toString(gvVar.f301470L.size()));
            gvVar.f301472N.mo95792a(juVar);
            gvVar.f301475d.mo95797b();
            ImageView imageView = (ImageView) view.findViewById(R.id.photo_thumbnail);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.SCALE_X, new float[]{0.81f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_Y, new float[]{0.81f});
            ofFloat.setDuration(150);
            ofFloat2.setDuration(150);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            animatorSet.start();
            int size = C58485gu.m89842j(gvVar.f301472N.f298206a).size();
            String string = gvVar.f301473b.getResources().getString(R.string.photos_accessibility_photo_selected);
            String quantityString = gvVar.f301473b.getResources().getQuantityString(R.plurals.photos_accessibility_selected_description, size, new Object[]{Integer.valueOf(size)});
            gvVar.mo96828b(string + " " + quantityString);
            return;
        }
        int indexOf = gvVar.f301470L.indexOf(selectionBadge);
        selectionBadge.setText(BuildConfig.FLAVOR);
        gvVar.f301470L.remove(indexOf);
        while (indexOf < gvVar.f301470L.size()) {
            int i2 = indexOf + 1;
            ((SelectionBadge) gvVar.f301470L.get(indexOf)).setText(Integer.toString(i2));
            indexOf = i2;
        }
        gvVar.f301472N.f298206a.remove(juVar);
        gvVar.f301475d.mo95797b();
        ImageView imageView2 = (ImageView) view.findViewById(R.id.photo_thumbnail);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView2, View.SCALE_X, new float[]{1.0f});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView2, View.SCALE_Y, new float[]{1.0f});
        ofFloat3.setDuration(150);
        ofFloat4.setDuration(150);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(new Animator[]{ofFloat3, ofFloat4});
        animatorSet2.start();
        int size2 = C58485gu.m89842j(gvVar.f301472N.f298206a).size();
        gvVar.mo96828b(gvVar.f301473b.getResources().getQuantityString(R.plurals.photos_accessibility_selected_description, size2, new Object[]{Integer.valueOf(size2)}));
        if (gvVar.f301472N.f298206a.isEmpty()) {
            gvVar.mo96829c();
        }
    }
}
