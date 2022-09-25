package androidx.slice.widget;

import android.support.p033v7.widget.C0673gh;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: androidx.slice.widget.ad */
/* compiled from: PG */
public final class C4126ad extends C0673gh implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: a */
    public final C4129ag f13234a;

    /* renamed from: b */
    final /* synthetic */ C4128af f13235b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4126ad(C4128af afVar, View view) {
        super(view);
        this.f13235b = afVar;
        this.f13234a = view instanceof C4129ag ? (C4129ag) view : null;
    }

    public final void onClick(View view) {
        SliceView sliceView = this.f13235b.f13245g;
        if (sliceView != null) {
            sliceView.f13206m = (int[]) view.getTag();
            this.f13235b.f13245g.performClick();
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C4154j jVar;
        C4145aw awVar = this.f13235b.f13246h;
        if (awVar != null) {
            SliceView sliceView = awVar.f13328a;
            if (sliceView != null && sliceView.f13203j == null && ((jVar = sliceView.f13195b) == null || jVar.mo8744c(sliceView.getContext()) == null)) {
                awVar.f13329b.setPressed(false);
            } else {
                awVar.f13329b.getLocationOnScreen(awVar.f13330c);
                awVar.f13329b.getBackground().setHotspot((float) ((int) (motionEvent.getRawX() - ((float) awVar.f13330c[0]))), (float) ((int) (motionEvent.getRawY() - ((float) awVar.f13330c[1]))));
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    awVar.f13329b.setPressed(true);
                } else if (actionMasked == 3 || actionMasked == 1 || actionMasked == 2) {
                    awVar.f13329b.setPressed(false);
                }
            }
        }
        return false;
    }
}
