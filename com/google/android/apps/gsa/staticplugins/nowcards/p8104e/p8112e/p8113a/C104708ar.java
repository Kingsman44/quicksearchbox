package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.util.p7159c.C90892az;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.ar */
/* compiled from: PG */
final class C104708ar implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C104712av f291589a;

    public C104708ar(C104712av avVar) {
        this.f291589a = avVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (C91115n.m148876h(view)) {
            FrameLayout frameLayout = this.f291589a.f291627n;
            frameLayout.getClass();
            View findViewById = frameLayout.findViewById(R.id.breaker_icon);
            findViewById.setContentDescription(findViewById.getContext().getString(R.string.scroll_left));
        }
        this.f291589a.f291617d.mo85151p(new C90892az("Scroll carousel", new C104707aq(this)));
        view.removeOnLayoutChangeListener(this.f291589a.f291632s);
    }
}
