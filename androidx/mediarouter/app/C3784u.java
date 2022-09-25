package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import androidx.mediarouter.p175a.C3685au;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.mediarouter.app.u */
/* compiled from: PG */
final class C3784u implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ Map f12204a;

    /* renamed from: b */
    final /* synthetic */ Map f12205b;

    /* renamed from: c */
    final /* synthetic */ C3758ad f12206c;

    public C3784u(C3758ad adVar, Map map, Map map2) {
        this.f12206c = adVar;
        this.f12204a = map;
        this.f12205b = map2;
    }

    public final void onGlobalLayout() {
        C3764aj ajVar;
        int i;
        C3685au auVar;
        this.f12206c.f12135p.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        C3758ad adVar = this.f12206c;
        Map map = this.f12204a;
        Map map2 = this.f12205b;
        Set set = adVar.f12138s;
        if (set != null && adVar.f12139t != null) {
            int size = set.size() - adVar.f12139t.size();
            C3785v vVar = new C3785v(adVar);
            int firstVisiblePosition = adVar.f12135p.getFirstVisiblePosition();
            int i2 = 0;
            boolean z = false;
            while (i2 < adVar.f12135p.getChildCount()) {
                View childAt = adVar.f12135p.getChildAt(i2);
                C3685au auVar2 = (C3685au) adVar.f12136q.getItem(firstVisiblePosition + i2);
                Rect rect = (Rect) map.get(auVar2);
                int top = childAt.getTop();
                if (rect != null) {
                    i = rect.top;
                } else {
                    i = (adVar.f12145z * size) + top;
                }
                AnimationSet animationSet = new AnimationSet(true);
                Set set2 = adVar.f12138s;
                if (set2 == null || !set2.contains(auVar2)) {
                    auVar = auVar2;
                } else {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    auVar = auVar2;
                    alphaAnimation.setDuration((long) adVar.f12103T);
                    animationSet.addAnimation(alphaAnimation);
                    i = top;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (i - top), 0.0f);
                translateAnimation.setDuration((long) adVar.f12102S);
                animationSet.addAnimation(translateAnimation);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                animationSet.setInterpolator(adVar.f12105V);
                if (!z) {
                    animationSet.setAnimationListener(vVar);
                }
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
                C3685au auVar3 = auVar;
                map.remove(auVar3);
                map2.remove(auVar3);
                i2++;
                z = true;
            }
            for (Map.Entry entry : map2.entrySet()) {
                C3685au auVar4 = (C3685au) entry.getKey();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
                Rect rect2 = (Rect) map.get(auVar4);
                if (adVar.f12139t.contains(auVar4)) {
                    ajVar = new C3764aj(bitmapDrawable, rect2);
                    ajVar.f12157h = 1.0f;
                    ajVar.f12158i = 0.0f;
                    ajVar.f12154e = (long) adVar.f12104U;
                    ajVar.f12153d = adVar.f12105V;
                } else {
                    int i3 = adVar.f12145z;
                    C3764aj ajVar2 = new C3764aj(bitmapDrawable, rect2);
                    ajVar2.f12156g = i3 * size;
                    ajVar2.f12154e = (long) adVar.f12102S;
                    ajVar2.f12153d = adVar.f12105V;
                    ajVar2.f12162m = new C3774k(adVar, auVar4);
                    adVar.f12140u.add(auVar4);
                    ajVar = ajVar2;
                }
                adVar.f12135p.f12076a.add(ajVar);
            }
        }
    }
}
