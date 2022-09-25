package androidx.drawerlayout.widget;

import android.view.View;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2082cp;

/* renamed from: androidx.drawerlayout.widget.c */
/* compiled from: PG */
public final /* synthetic */ class C2174c implements C2010ad {

    /* renamed from: a */
    public static final /* synthetic */ C2174c f6186a = new C2174c();

    private /* synthetic */ C2174c() {
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        int i = DrawerLayout.f6147g;
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z = true;
        boolean z2 = cpVar.f5994b.mo5219d().f5822c > 0;
        drawerLayout.f6159e = cpVar;
        drawerLayout.f6160f = z2;
        if (z2 || drawerLayout.getBackground() != null) {
            z = false;
        }
        drawerLayout.setWillNotDraw(z);
        drawerLayout.requestLayout();
        return cpVar.f5994b.mo5231o();
    }
}
