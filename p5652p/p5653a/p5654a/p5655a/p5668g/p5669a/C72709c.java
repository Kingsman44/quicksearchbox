package p5652p.p5653a.p5654a.p5655a.p5668g.p5669a;

import android.view.View;
import android.widget.PopupWindow;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.componentview.components.base.C20081f;
import com.google.p4463ce.p4464a.p4470b.p4471a.C58054a;

/* renamed from: p.a.a.a.g.a.c */
/* compiled from: PG */
public final /* synthetic */ class C72709c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C72710d f193335a;

    /* renamed from: b */
    public final /* synthetic */ View f193336b;

    public /* synthetic */ C72709c(C72710d dVar, View view) {
        this.f193335a = dVar;
        this.f193336b = view;
    }

    public final void onClick(View view) {
        C72710d dVar = this.f193335a;
        View view2 = this.f193336b;
        PopupWindow popupWindow = dVar.f193338a;
        if (popupWindow != null && popupWindow.getContentView() != null) {
            View contentView = dVar.f193338a.getContentView();
            C58054a a = C20081f.m37969a(view2);
            if (!(a == null || contentView == null)) {
                contentView.setTag(R.id.cml_callback_registry_tag, a);
            }
            dVar.f193338a.showAsDropDown(view, 0, 0, 8388661);
        }
    }
}
