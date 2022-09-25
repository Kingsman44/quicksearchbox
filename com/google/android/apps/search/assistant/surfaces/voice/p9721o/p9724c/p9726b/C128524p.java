package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9726b;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.p109f.p110a.C2248v;
import androidx.p109f.p110a.C2250x;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.c.b.p */
/* compiled from: PG */
public final class C128524p implements View.OnTouchListener {

    /* renamed from: a */
    public final C69615a f353426a;

    /* renamed from: b */
    public final C69615a f353427b;

    /* renamed from: c */
    public final C69615a f353428c;

    /* renamed from: d */
    private final C69615a f353429d;

    /* renamed from: e */
    private final C69615a f353430e;

    /* renamed from: f */
    private float f353431f;

    /* renamed from: g */
    private float f353432g;

    /* renamed from: h */
    private final VelocityTracker f353433h;

    /* renamed from: i */
    private int f353434i;

    public C128524p() {
        C128516h hVar = C128516h.f353419a;
        throw null;
    }

    /* renamed from: a */
    public static final boolean m209755a(View view) {
        return Math.abs(view.getTranslationX()) > 0.0f;
    }

    /* renamed from: b */
    public static final boolean m209756b(View view) {
        return Math.abs(view.getTranslationY()) > 0.0f;
    }

    /* renamed from: c */
    public static final float m209757c(float f) {
        float f2 = 1.0f - f;
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2;
    }

    /* renamed from: d */
    public static final float m209758d(View view) {
        return Math.abs(view.getTranslationX() / ((float) view.getWidth()));
    }

    /* renamed from: e */
    public static final float m209759e(View view) {
        return Math.abs(view.getTranslationY() / ((float) view.getHeight()));
    }

    /* renamed from: f */
    private static final float m209760f(View view) {
        return view.getResources().getDimension(R.dimen.assistant_guacamole_on_click_drag_threshold);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C69664n.m101061g(view, "view");
        C69664n.m101061g(motionEvent, "event");
        int action = motionEvent.getAction();
        int i = 1;
        if (action == 0) {
            this.f353431f = motionEvent.getRawX();
            this.f353432g = motionEvent.getRawY();
            this.f353433h.clear();
            this.f353429d.mo5672a();
            this.f353434i = 1;
            return false;
        } else if (action != 1) {
            if (action != 2) {
                return false;
            }
            float rawX = motionEvent.getRawX() - this.f353431f;
            float rawY = motionEvent.getRawY() - this.f353432g;
            int i2 = this.f353434i;
            if (i2 == 1) {
                if (Math.abs(rawX) > Math.abs(rawY)) {
                    i = 3;
                } else if (rawY < 0.0f) {
                    i = 2;
                }
                this.f353434i = i;
                i2 = i;
            }
            if (i2 == 3) {
                view.setAlpha(m209757c(m209758d(view)));
                C128525q.m209761a(view, rawX);
                this.f353433h.addMovement(motionEvent);
                return false;
            } else if (i2 != 2 || rawY > 0.0f) {
                return false;
            } else {
                view.setAlpha(m209757c(m209759e(view)));
                C128525q.m209762b(view, rawY);
                this.f353433h.addMovement(motionEvent);
                return false;
            }
        } else if (Math.abs(motionEvent.getRawX() - this.f353431f) >= m209760f(view) || Math.abs(motionEvent.getRawY() - this.f353432g) >= m209760f(view)) {
            this.f353433h.computeCurrentVelocity(1000);
            VelocityTracker velocityTracker = this.f353433h;
            C69664n.m101060f(velocityTracker, "velocityTracker");
            C128519k kVar = new C128519k(this, view);
            if (m209755a(view)) {
                C2248v vVar = new C2248v(new C2250x(view.getTranslationX()));
                vVar.f6314g = velocityTracker.getXVelocity();
                vVar.mo5591i(2.0f);
                vVar.mo5588g(new C128522n(view));
                vVar.mo5587f(kVar);
                vVar.mo5585d();
            }
            if (!m209756b(view)) {
                return false;
            }
            C2248v vVar2 = new C2248v(new C2250x(view.getTranslationY()));
            vVar2.f6314g = velocityTracker.getYVelocity();
            vVar2.mo5591i(2.0f);
            vVar2.mo5588g(new C128523o(view));
            vVar2.mo5587f(kVar);
            vVar2.mo5585d();
            return false;
        } else {
            this.f353427b.mo5672a();
            view.performClick();
            this.f353430e.mo5672a();
            return false;
        }
    }

    public C128524p(C69615a aVar, C69615a aVar2, C69615a aVar3, C69615a aVar4, C69615a aVar5) {
        this.f353426a = aVar;
        this.f353429d = aVar2;
        this.f353427b = aVar3;
        this.f353430e = aVar4;
        this.f353428c = aVar5;
        this.f353433h = VelocityTracker.obtain();
        this.f353434i = 1;
    }
}
