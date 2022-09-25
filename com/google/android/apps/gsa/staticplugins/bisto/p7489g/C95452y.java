package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import android.view.KeyEvent;
import androidx.annotation.C0826b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.p10712d.C142359ck;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.y */
/* compiled from: PG */
final class C95452y implements InvocationHandler {

    /* renamed from: a */
    public static final C59071e f267087a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.y");

    /* renamed from: b */
    public final C95397cu f267088b;

    /* renamed from: c */
    public final C95403d f267089c;

    /* renamed from: d */
    public C60870cx f267090d;

    /* renamed from: e */
    public C60870cx f267091e;

    /* renamed from: f */
    public boolean f267092f;

    /* renamed from: g */
    public boolean f267093g;

    /* renamed from: h */
    private final C22871g f267094h;

    /* renamed from: i */
    private boolean f267095i;

    public C95452y(C95397cu cuVar, C22871g gVar, C95403d dVar) {
        this.f267088b = cuVar;
        this.f267094h = gVar;
        this.f267089c = dVar;
    }

    /* renamed from: a */
    public final void mo89370a() {
        this.f267092f = false;
        this.f267093g = false;
        this.f267095i = false;
        C60870cx cxVar = this.f267091e;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f267091e = null;
        }
        C60870cx cxVar2 = this.f267090d;
        if (cxVar2 != null) {
            cxVar2.cancel(false);
            this.f267090d = null;
        }
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (objArr.length > 0) {
            boolean z = false;
            if ((objArr[0] instanceof KeyEvent) && C22872h.m42744d(C0826b.class)) {
                KeyEvent keyEvent = objArr[0];
                if (method.getName().equals("onVolumeKeyLongPress")) {
                    this.f267094h.mo28212l("onVolumeKeyLongPress", new C95448u(this, keyEvent));
                    return null;
                } else if (method.getName().equals("onMediaKey")) {
                    if (!C22872h.m42744d(C0826b.class)) {
                        return false;
                    }
                    if ((keyEvent.getKeyCode() == 79 || keyEvent.getKeyCode() == 85) && (keyEvent.getFlags() & 1073741824) != 1073741824) {
                        C59104x b = f267087a.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "WiredHeadsetConn");
                        ((C59052c) ((C59052c) b).mo56372aa(14922)).mo56389s("Received media event %s", keyEvent);
                        if (keyEvent.getAction() == 1) {
                            if (this.f267093g) {
                                if (!this.f267089c.mo89344a(C142359ck.COMPLETE_VOICE_INPUT)) {
                                    mo89370a();
                                } else if (this.f267092f) {
                                    mo89370a();
                                } else if (this.f267091e == null) {
                                    mo89370a();
                                    this.f267091e = this.f267094h.mo28208h("doubleTapTimeout", 400, new C95449v(this));
                                } else if (!this.f267095i) {
                                    mo89370a();
                                    this.f267095i = true;
                                    this.f267091e = this.f267094h.mo28208h("tripleTapTimeout", 400, new C95450w(this));
                                } else {
                                    mo89370a();
                                    this.f267089c.mo89344a(C142359ck.PREV_TRACK);
                                }
                            }
                        } else if (keyEvent.getAction() == 0) {
                            if (!this.f267093g) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    this.f267093g = true;
                                    if (!this.f267089c.mo89344a(C142359ck.WILL_PAUSE, C142359ck.PREPARE_VOICE_INPUT)) {
                                        mo89370a();
                                    } else {
                                        this.f267090d = this.f267094h.mo28208h("longPressTimeout", 200, new C95451x(this));
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }
        }
        return null;
    }
}
