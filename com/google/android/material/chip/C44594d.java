package com.google.android.material.chip;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.p098j.p099a.C1988h;
import androidx.core.p098j.p099a.C1991k;
import androidx.customview.p103b.C2144b;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.google.android.material.chip.d */
/* compiled from: PG */
final class C44594d extends C2144b {

    /* renamed from: a */
    final /* synthetic */ Chip f116121a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44594d(Chip chip, Chip chip2) {
        super(chip2);
        this.f116121a = chip;
    }

    /* access modifiers changed from: protected */
    public final int getVirtualViewAt(float f, float f2) {
        return (!this.f116121a.mo47666F() || !this.f116121a.mo47680j().contains(f, f2)) ? 0 : 1;
    }

    /* access modifiers changed from: protected */
    public final void getVisibleVirtualViews(List list) {
        list.add(0);
        if (this.f116121a.mo47666F()) {
            Chip chip = this.f116121a;
            if (chip.mo47668H() && chip.f116094e != null) {
                list.add(1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onPerformActionForVirtualView$ar$ds(int i, int i2) {
        if (i2 != 16) {
            return false;
        }
        if (i == 0) {
            return this.f116121a.performClick();
        }
        if (i == 1) {
            return this.f116121a.mo47669I();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onPopulateNodeForHost(C1991k kVar) {
        kVar.f5921a.setCheckable(this.f116121a.mo47667G());
        kVar.f5921a.setClickable(this.f116121a.isClickable());
        kVar.f5921a.setClassName(this.f116121a.getAccessibilityClassName());
        kVar.f5921a.setText(this.f116121a.getText());
    }

    /* access modifiers changed from: protected */
    public final void onPopulateNodeForVirtualView(int i, C1991k kVar) {
        CharSequence charSequence = BuildConfig.FLAVOR;
        if (i == 1) {
            Chip chip = this.f116121a;
            C44596f fVar = chip.f116093d;
            CharSequence charSequence2 = fVar != null ? fVar.f116166l : null;
            if (charSequence2 != null) {
                kVar.f5921a.setContentDescription(charSequence2);
            } else {
                CharSequence text = chip.getText();
                Context context = this.f116121a.getContext();
                Object[] objArr = new Object[1];
                if (true != TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                objArr[0] = charSequence;
                kVar.f5921a.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            }
            kVar.f5921a.setBoundsInParent(this.f116121a.mo47679i());
            kVar.mo5153b(C1988h.f5905c);
            kVar.f5921a.setEnabled(this.f116121a.isEnabled());
            return;
        }
        kVar.f5921a.setContentDescription(charSequence);
        kVar.f5921a.setBoundsInParent(Chip.f116091c);
    }

    /* access modifiers changed from: protected */
    public final void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.f116121a;
            chip.f116096g = z;
            chip.refreshDrawableState();
        }
    }
}
