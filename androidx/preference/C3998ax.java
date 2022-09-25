package androidx.preference;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0673gh;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: androidx.preference.ax */
/* compiled from: PG */
public final class C3998ax extends C0673gh {

    /* renamed from: a */
    public final Drawable f12844a;

    /* renamed from: b */
    public ColorStateList f12845b;

    /* renamed from: c */
    public boolean f12846c;

    /* renamed from: d */
    public boolean f12847d;

    /* renamed from: e */
    private final SparseArray f12848e;

    public C3998ax(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f12848e = sparseArray;
        TextView textView = (TextView) view.findViewById(16908310);
        sparseArray.put(16908310, textView);
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.f12844a = view.getBackground();
        if (textView != null) {
            this.f12845b = textView.getTextColors();
        }
    }

    /* renamed from: a */
    public final View mo8435a(int i) {
        View view = (View) this.f12848e.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.itemView.findViewById(i);
        if (findViewById != null) {
            this.f12848e.put(i, findViewById);
        }
        return findViewById;
    }
}
