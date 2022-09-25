package com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.p8352a;

import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui.C108185z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.ui.a.c */
/* compiled from: PG */
public final class C108157c implements View.OnTouchListener {

    /* renamed from: a */
    private final C108155a f300810a;

    /* renamed from: b */
    private final float f300811b;

    /* renamed from: c */
    private float f300812c;

    /* renamed from: d */
    private float f300813d;

    /* renamed from: e */
    private int f300814e;

    /* renamed from: f */
    private int f300815f;

    /* renamed from: g */
    private boolean f300816g;

    /* renamed from: h */
    private boolean f300817h = false;

    /* renamed from: i */
    private final int f300818i;

    public C108157c(C108155a aVar, float f, int i) {
        this.f300810a = aVar;
        this.f300811b = f;
        this.f300818i = i;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f300817h = true;
            C108185z zVar = (C108185z) this.f300810a;
            Pair create = Pair.create(Integer.valueOf(zVar.f300868e.x), Integer.valueOf(zVar.f300868e.y));
            this.f300814e = ((Integer) create.first).intValue();
            this.f300815f = ((Integer) create.second).intValue();
            this.f300812c = motionEvent.getRawX();
            this.f300813d = motionEvent.getRawY();
            this.f300816g = true;
            this.f300810a.mo96495o();
            return true;
        } else if (action != 1) {
            if (action != 2 || !this.f300817h) {
                return false;
            }
            double hypot = Math.hypot((double) (motionEvent.getRawX() - this.f300812c), (double) (motionEvent.getRawY() - this.f300813d));
            float f = this.f300811b;
            if (hypot > ((double) f)) {
                this.f300816g = false;
            }
            if (this.f300818i == 1 || !this.f300816g || hypot <= ((double) (f / 4.0f)) || Math.abs(motionEvent.getRawX() - this.f300812c) <= Math.abs(motionEvent.getRawY() - this.f300813d) || ((this.f300818i != 2 || motionEvent.getRawX() >= this.f300812c) && (this.f300818i != 3 || motionEvent.getRawX() <= this.f300812c))) {
                if (!this.f300816g) {
                    this.f300810a.mo96493m(this.f300814e + ((int) (motionEvent.getRawX() - this.f300812c)), this.f300815f + ((int) (motionEvent.getRawY() - this.f300813d)));
                }
                return true;
            }
            ((C108185z) this.f300810a).mo96530l(false);
            this.f300817h = false;
            return true;
        } else if (!this.f300817h) {
            return false;
        } else {
            this.f300817h = false;
            this.f300810a.mo96494n(this.f300816g);
            view.performClick();
            return true;
        }
    }
}
