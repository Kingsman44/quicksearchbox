package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.cf */
/* compiled from: PG */
public final /* synthetic */ class C104750cf implements C90315c {

    /* renamed from: a */
    public final /* synthetic */ C104754cj f291754a;

    public /* synthetic */ C104750cf(C104754cj cjVar) {
        this.f291754a = cjVar;
    }

    /* renamed from: a */
    public final void mo83996a(Rect rect) {
        ViewGroup viewGroup = (ViewGroup) this.f291754a.f291757c.getParent();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        marginLayoutParams.rightMargin = rect.right;
        marginLayoutParams.leftMargin = rect.left;
        viewGroup.setLayoutParams(marginLayoutParams);
    }
}
