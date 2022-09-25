package androidx.p198v.p199a.p200a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* renamed from: androidx.v.a.a.e */
/* compiled from: PG */
final class C4246e extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C4250i f13691a;

    public C4246e(C4250i iVar) {
        this.f13691a = iVar;
    }

    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList = new ArrayList(this.f13691a.f13698a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C4244c) arrayList.get(i)).mo8946b(this.f13691a);
        }
    }

    public final void onAnimationStart(Animator animator) {
        ArrayList arrayList = new ArrayList(this.f13691a.f13698a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C4244c) arrayList.get(i)).mo8947c(this.f13691a);
        }
    }
}
