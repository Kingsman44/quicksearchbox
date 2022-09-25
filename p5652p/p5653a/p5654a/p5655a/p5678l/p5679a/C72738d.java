package p5652p.p5653a.p5654a.p5655a.p5678l.p5679a;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: p.a.a.a.l.a.d */
/* compiled from: PG */
public final /* synthetic */ class C72738d implements View.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ C72745k f193402a;

    public /* synthetic */ C72738d(C72745k kVar) {
        this.f193402a = kVar;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C72745k kVar = this.f193402a;
        if (i != 4 || keyEvent.getAction() != 1 || !kVar.f193409a.isFocused()) {
            return false;
        }
        kVar.f193409a.clearFocus();
        if (!kVar.f193409a.isFocused()) {
            return true;
        }
        return false;
    }
}
