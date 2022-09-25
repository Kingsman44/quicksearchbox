package com.google.android.apps.gsa.staticplugins.nowcards.p8123ui;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104335bj;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ui.s */
/* compiled from: PG */
public final class C105082s implements View.OnTouchListener {

    /* renamed from: a */
    private final C105081r f292817a;

    /* renamed from: b */
    private final View[] f292818b;

    public C105082s(C105081r rVar, View... viewArr) {
        this.f292817a = rVar;
        this.f292818b = viewArr;
    }

    /* renamed from: a */
    public static void m174321a(View view) {
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).setInterpolator(C91107f.m148859b(0.2f, 0.0f, 0.2f, 1.0f)).start();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View[] viewArr = this.f292818b;
        for (int i = 0; i < 2; i++) {
            View view2 = viewArr[i];
            if (view2 != null) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    view2.animate().scaleX(0.9f).scaleY(0.9f).setDuration(50).setInterpolator(C91107f.m148859b(0.4f, 0.0f, 0.2f, 1.0f)).start();
                } else if (action == 1) {
                    C104335bj bjVar = (C104335bj) this.f292817a;
                    if (!bjVar.mo94091b() || bjVar.f290270f != 2) {
                        view2.animate().scaleX(1.4f).scaleY(1.4f).setDuration(100).setInterpolator(C91107f.m148859b(0.4f, 0.0f, 0.8f, 1.0f)).withEndAction(new C105079p(view2)).start();
                    } else {
                        view2.animate().scaleX(0.9f).scaleY(0.9f).setDuration(100).setInterpolator(C91107f.m148859b(0.4f, 0.0f, 0.8f, 1.0f)).withEndAction(new C105080q(view2)).start();
                    }
                } else if (action == 3) {
                    m174321a(view2);
                }
            }
        }
        if (motionEvent.getAction() == 1) {
            view.performHapticFeedback(0);
        }
        return false;
    }
}
