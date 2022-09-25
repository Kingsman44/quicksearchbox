package android.support.p031v4.app;

import android.view.View;
import androidx.core.app.C1812bb;
import androidx.p060c.C0977g;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.cf */
/* compiled from: PG */
final class C0214cf {

    /* renamed from: a */
    static final C0222cn f826a = new C0220cl();

    /* renamed from: b */
    static final C0222cn f827b;

    /* renamed from: c */
    public static final /* synthetic */ int f828c = 0;

    static {
        C0222cn cnVar;
        try {
            cnVar = (C0222cn) Class.forName("androidx.u.v").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            cnVar = null;
        }
        f827b = cnVar;
    }

    /* renamed from: a */
    static void m502a(Fragment fragment, Fragment fragment2, boolean z, C0977g gVar, boolean z2) {
        C1812bb bbVar;
        if (z) {
            bbVar = fragment2.getEnterTransitionCallback();
        } else {
            bbVar = fragment.getEnterTransitionCallback();
        }
        if (bbVar != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i = gVar.f3122d;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add((String) gVar.mo3702e(i2));
                arrayList.add((View) gVar.mo3708h(i2));
            }
            if (z2) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: b */
    static void m503b(C0977g gVar, C0977g gVar2) {
        int i = gVar.f3122d;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            if (!gVar2.containsKey((String) gVar.mo3708h(i))) {
                gVar.mo3704f(i);
            }
        }
    }

    /* renamed from: c */
    static void m504c(ArrayList arrayList, int i) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((View) arrayList.get(size)).setVisibility(i);
            } else {
                return;
            }
        }
    }
}
