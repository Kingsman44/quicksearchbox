package androidx.navigation;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69734n;

/* renamed from: androidx.navigation.cd */
/* compiled from: PG */
public final class C3863cd {
    /* renamed from: a */
    public static final C3807af m11146a(View view) {
        C69664n.m101061g(view, "view");
        C3807af c = m11148c(view);
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    /* renamed from: b */
    public static final void m11147b(View view, C3807af afVar) {
        C69664n.m101061g(view, "view");
        view.setTag(R.id.nav_controller_view_tag, afVar);
    }

    /* renamed from: c */
    public static final C3807af m11148c(View view) {
        return (C3807af) C69734n.m101137e(C69734n.m101144l(C69734n.m101178d(view, C3861cb.f12422a), C3862cc.f12423a));
    }
}
