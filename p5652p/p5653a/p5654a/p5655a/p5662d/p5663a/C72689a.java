package p5652p.p5653a.p5654a.p5655a.p5662d.p5663a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/* renamed from: p.a.a.a.d.a.a */
/* compiled from: PG */
final class C72689a extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ C72691c f193294a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72689a(C72691c cVar, Context context, List list) {
        super(context, 17367049, list);
        this.f193294a = cVar;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        if (dropDownView != null && (dropDownView instanceof TextView)) {
            this.f193294a.mo64511i((TextView) dropDownView);
        }
        return dropDownView;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        view2.setPadding(0, view2.getPaddingTop(), view2.getPaddingRight(), 0);
        return view2;
    }
}
