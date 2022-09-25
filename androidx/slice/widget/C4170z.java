package androidx.slice.widget;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;

/* renamed from: androidx.slice.widget.z */
/* compiled from: PG */
final class C4170z extends ImageView implements Checkable, View.OnClickListener {

    /* renamed from: a */
    private boolean f13488a;

    /* renamed from: b */
    private View.OnClickListener f13489b;

    public C4170z(Context context) {
        super(context);
        super.setOnClickListener(this);
    }

    public final boolean isChecked() {
        return this.f13488a;
    }

    public final void onClick(View view) {
        toggle();
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f13488a) {
            mergeDrawableStates(onCreateDrawableState, C4124ab.f13221a);
        }
        return onCreateDrawableState;
    }

    public final void setChecked(boolean z) {
        if (this.f13488a != z) {
            this.f13488a = z;
            refreshDrawableState();
            View.OnClickListener onClickListener = this.f13489b;
            if (onClickListener != null) {
                onClickListener.onClick(this);
            }
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f13489b = onClickListener;
    }

    public final void toggle() {
        setChecked(!this.f13488a);
    }
}
