package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: androidx.mediarouter.app.s */
/* compiled from: PG */
final class C3782s implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ boolean f12199a;

    /* renamed from: b */
    final /* synthetic */ C3758ad f12200b;

    public C3782s(C3758ad adVar, boolean z) {
        this.f12200b = adVar;
        this.f12199a = z;
    }

    public final void onGlobalLayout() {
        int i;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        this.f12200b.f12129j.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        C3758ad adVar = this.f12200b;
        if (adVar.f12100Q) {
            adVar.f12101R = true;
            return;
        }
        boolean z = this.f12199a;
        int i2 = adVar.f12132m.getLayoutParams().height;
        C3758ad.m10898o(adVar.f12132m, -1);
        adVar.mo7972v(adVar.mo7973w());
        View decorView = adVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(adVar.getWindow().getAttributes().width, 1073741824), 0);
        C3758ad.m10898o(adVar.f12132m, i2);
        if (!(adVar.f12130k.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) adVar.f12130k.getDrawable()).getBitmap()) == null) {
            i = 0;
        } else {
            i = adVar.mo7959g(bitmap.getWidth(), bitmap.getHeight());
            adVar.f12130k.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int h = adVar.mo7960h(adVar.mo7973w());
        int size = adVar.f12137r.size();
        int size2 = adVar.mo7974y() ? adVar.f12145z * Collections.unmodifiableList(adVar.f12125f.f11878r).size() : 0;
        if (size > 0) {
            size2 += adVar.f12085B;
        }
        int min = Math.min(size2, adVar.f12084A);
        if (true != adVar.f12099P) {
            min = 0;
        }
        int max = Math.max(i, min) + h;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (adVar.f12128i.getMeasuredHeight() - adVar.f12129j.getMeasuredHeight());
        if (i <= 0 || max > height) {
            if (adVar.f12135p.getLayoutParams().height + adVar.f12132m.getMeasuredHeight() >= adVar.f12129j.getMeasuredHeight()) {
                adVar.f12130k.setVisibility(8);
            }
            max = min + h;
            i = 0;
        } else {
            adVar.f12130k.setVisibility(0);
            C3758ad.m10898o(adVar.f12130k, i);
        }
        if (!adVar.mo7973w() || max > height) {
            adVar.f12133n.setVisibility(8);
        } else {
            adVar.f12133n.setVisibility(0);
        }
        adVar.mo7972v(adVar.f12133n.getVisibility() == 0);
        int h2 = adVar.mo7960h(adVar.f12133n.getVisibility() == 0);
        int max2 = Math.max(i, min) + h2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        adVar.f12132m.clearAnimation();
        adVar.f12135p.clearAnimation();
        adVar.f12129j.clearAnimation();
        if (z) {
            adVar.mo7961i(adVar.f12132m, h2);
            adVar.mo7961i(adVar.f12135p, min);
            adVar.mo7961i(adVar.f12129j, height);
        } else {
            C3758ad.m10898o(adVar.f12132m, h2);
            C3758ad.m10898o(adVar.f12135p, min);
            C3758ad.m10898o(adVar.f12129j, height);
        }
        C3758ad.m10898o(adVar.f12127h, rect.height());
        List unmodifiableList = Collections.unmodifiableList(adVar.f12125f.f11878r);
        if (unmodifiableList.isEmpty()) {
            adVar.f12137r.clear();
            adVar.f12136q.notifyDataSetChanged();
        } else if (new HashSet(adVar.f12137r).equals(new HashSet(unmodifiableList))) {
            adVar.f12136q.notifyDataSetChanged();
        } else {
            if (z) {
                OverlayListView overlayListView = adVar.f12135p;
                C3757ac acVar = adVar.f12136q;
                hashMap = new HashMap();
                int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
                for (int i3 = 0; i3 < overlayListView.getChildCount(); i3++) {
                    Object item = acVar.getItem(firstVisiblePosition + i3);
                    View childAt = overlayListView.getChildAt(i3);
                    hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
                }
            } else {
                hashMap = null;
            }
            if (z) {
                Context context = adVar.f12126g;
                OverlayListView overlayListView2 = adVar.f12135p;
                C3757ac acVar2 = adVar.f12136q;
                hashMap2 = new HashMap();
                int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
                for (int i4 = 0; i4 < overlayListView2.getChildCount(); i4++) {
                    Object item2 = acVar2.getItem(firstVisiblePosition2 + i4);
                    View childAt2 = overlayListView2.getChildAt(i4);
                    Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                    childAt2.draw(new Canvas(createBitmap));
                    hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
                }
            } else {
                hashMap2 = null;
            }
            List list = adVar.f12137r;
            HashSet hashSet = new HashSet(unmodifiableList);
            hashSet.removeAll(list);
            adVar.f12138s = hashSet;
            HashSet hashSet2 = new HashSet(adVar.f12137r);
            hashSet2.removeAll(unmodifiableList);
            adVar.f12139t = hashSet2;
            adVar.f12137r.addAll(0, adVar.f12138s);
            adVar.f12137r.removeAll(adVar.f12139t);
            adVar.f12136q.notifyDataSetChanged();
            if (!z || !adVar.f12099P || adVar.f12138s.size() + adVar.f12139t.size() <= 0) {
                adVar.f12138s = null;
                adVar.f12139t = null;
                return;
            }
            adVar.f12135p.setEnabled(false);
            adVar.f12135p.requestLayout();
            adVar.f12100Q = true;
            adVar.f12135p.getViewTreeObserver().addOnGlobalLayoutListener(new C3784u(adVar, hashMap, hashMap2));
        }
    }
}
