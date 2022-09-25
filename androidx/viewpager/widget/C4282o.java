package androidx.viewpager.widget;

import android.view.View;
import java.util.Comparator;

/* renamed from: androidx.viewpager.widget.o */
/* compiled from: PG */
final class C4282o implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C4275h hVar = (C4275h) ((View) obj).getLayoutParams();
        C4275h hVar2 = (C4275h) ((View) obj2).getLayoutParams();
        boolean z = hVar.f13853a;
        if (z != hVar2.f13853a) {
            return !z ? -1 : 1;
        }
        return hVar.f13857e - hVar2.f13857e;
    }
}
