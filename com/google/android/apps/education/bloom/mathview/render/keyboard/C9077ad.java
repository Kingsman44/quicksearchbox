package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Timer;
import org.chromium.net.PrivateKeyType;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.ad */
/* compiled from: PG */
public final class C9077ad implements View.OnTouchListener {

    /* renamed from: a */
    private final Timer f31316a;

    /* renamed from: b */
    private final HashMap f31317b;

    public C9077ad() {
        this((byte[]) null);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C9076ac acVar;
        C69664n.m101061g(view, "view");
        C69664n.m101061g(motionEvent, "event");
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        if (action == 0) {
            C9076ac acVar2 = new C9076ac(view);
            C9076ac acVar3 = (C9076ac) this.f31317b.put(view, acVar2);
            if (acVar3 != null) {
                acVar3.cancel();
            }
            this.f31316a.scheduleAtFixedRate(acVar2, (long) ViewConfiguration.getLongPressTimeout(), 50);
            return false;
        } else if ((action != 1 && action != 3) || (acVar = (C9076ac) this.f31317b.remove(view)) == null) {
            return false;
        } else {
            acVar.cancel();
            return false;
        }
    }

    public C9077ad(byte[] bArr) {
        this.f31316a = new Timer();
        this.f31317b = new HashMap();
    }
}
