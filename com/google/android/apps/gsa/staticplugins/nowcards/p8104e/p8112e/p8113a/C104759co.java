package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.co */
/* compiled from: PG */
public final /* synthetic */ class C104759co implements C90315c {

    /* renamed from: a */
    public final /* synthetic */ C104769cy f291796a;

    public /* synthetic */ C104759co(C104769cy cyVar) {
        this.f291796a = cyVar;
    }

    /* renamed from: a */
    public final void mo83996a(Rect rect) {
        ViewGroup viewGroup = (ViewGroup) this.f291796a.f291808e.getParent();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        marginLayoutParams.rightMargin = rect.right;
        marginLayoutParams.leftMargin = rect.left;
        viewGroup.setLayoutParams(marginLayoutParams);
    }
}
