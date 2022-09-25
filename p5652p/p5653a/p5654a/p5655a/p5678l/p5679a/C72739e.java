package p5652p.p5653a.p5654a.p5655a.p5678l.p5679a;

import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.libraries.componentview.components.base.C20081f;

/* renamed from: p.a.a.a.l.a.e */
/* compiled from: PG */
public final /* synthetic */ class C72739e implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ C72745k f193403a;

    public /* synthetic */ C72739e(C72745k kVar) {
        this.f193403a = kVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C72745k kVar = this.f193403a;
        if (i == 6) {
            C20081f.m37970b(kVar.f56306q, "focuslost", textView, new Object[0]);
        }
        return false;
    }
}
