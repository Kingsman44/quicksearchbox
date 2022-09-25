package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.p109f.p110a.C2248v;
import androidx.p109f.p110a.C2249w;
import androidx.p109f.p110a.C2250x;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6230g.C78899a;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.bi */
/* compiled from: PG */
final class C78063bi implements View.OnTouchListener {

    /* renamed from: a */
    public final C2249w f215024a = new C78062bh(this);

    /* renamed from: b */
    public C2248v f215025b;

    /* renamed from: c */
    public final C78029ab f215026c;

    /* renamed from: d */
    private final VelocityTracker f215027d = VelocityTracker.obtain();

    /* renamed from: e */
    private final Activity f215028e;

    /* renamed from: f */
    private float f215029f;

    /* renamed from: g */
    private float f215030g;

    public C78063bi(Activity activity, C78029ab abVar) {
        this.f215028e = activity;
        this.f215026c = abVar;
    }

    /* renamed from: a */
    public final float mo73041a() {
        return C78899a.m126775a(this.f215028e, this.f215026c.mo72988a());
    }

    /* renamed from: b */
    public final float mo73042b() {
        float abs = Math.abs(mo73041a());
        AnswerUiRenderer answerUiRenderer = this.f215026c.f214936a;
        return abs / C78899a.m126775a(answerUiRenderer.f214886b, (float) answerUiRenderer.f214892h.getHeight());
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            C2248v vVar = this.f215025b;
            if (vVar != null) {
                vVar.mo5583b();
            }
            this.f215027d.clear();
            this.f215029f = motionEvent.getRawY();
            this.f215030g = motionEvent.getRawY();
            return true;
        } else if (action == 1) {
            this.f215027d.computeCurrentVelocity(1000);
            float yVelocity = this.f215027d.getYVelocity();
            C2248v vVar2 = new C2248v(new C2250x(this.f215026c.mo72988a()));
            this.f215025b = vVar2;
            vVar2.f6314g = yVelocity;
            vVar2.mo5591i(2.0f);
            this.f215025b.mo5588g(new C78060bf(this));
            this.f215025b.mo5587f(new C78061bg(this));
            this.f215025b.mo5585d();
            return false;
        } else if (action != 2 || motionEvent.getRawY() - this.f215030g < 0.0f) {
            return false;
        } else {
            this.f215030g = motionEvent.getRawY();
            this.f215026c.mo72989b(motionEvent.getRawY() - this.f215029f, mo73042b());
            this.f215027d.addMovement(motionEvent);
            return true;
        }
    }
}
