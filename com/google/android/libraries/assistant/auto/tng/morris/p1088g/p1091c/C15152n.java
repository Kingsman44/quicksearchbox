package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c;

import android.content.Context;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.p1092a.C15132b;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.p1092a.C15133c;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.p1092a.C15134d;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.p1092a.C15138h;
import com.google.android.libraries.p10982ad.C147446j;
import com.google.android.libraries.p10982ad.C147454r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.c.n */
/* compiled from: PG */
public final class C15152n {

    /* renamed from: a */
    public static final C59071e f45456a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.c.n");

    /* renamed from: b */
    public static final C147454r f45457b = new C147454r(300.0f, 0.6f);

    /* renamed from: c */
    public static final C147454r f45458c = new C147454r(3000.0f, 0.4f);

    /* renamed from: i */
    private static final C147454r f45459i = new C147454r(300.0f, 0.7f);

    /* renamed from: d */
    public final WindowManager f45460d;

    /* renamed from: e */
    public final C15132b f45461e;

    /* renamed from: f */
    public int f45462f = 0;

    /* renamed from: g */
    public View f45463g;

    /* renamed from: h */
    public int f45464h = 1;

    /* renamed from: j */
    private final DisplayManager f45465j;

    public C15152n(Context context) {
        C15132b bVar = new C15132b();
        C147454r rVar = f45458c;
        bVar.f45416b.f397996b = rVar;
        bVar.f45417c.f397996b = rVar;
        this.f45461e = bVar;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                context = context.createDisplayContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0)).createWindowContext(2038, (Bundle) null);
            } catch (RuntimeException e) {
                C59104x c = f45456a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.BubbleMoveAnim");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(45983)).mo56386p("Exception in createWindowContext");
            }
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f45460d = windowManager;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayManager.getClass();
        this.f45465j = displayManager;
    }

    /* renamed from: c */
    public final C15134d mo22024c(C15134d dVar) {
        float a = dVar.mo21997a();
        float b = dVar.mo21998b();
        C15132b bVar = this.f45461e;
        C147446j jVar = bVar.f45416b;
        float f = jVar.f397998d;
        float f2 = jVar.f397999e;
        if (a > (f + f2) / 2.0f) {
            f = f2;
        }
        C147446j jVar2 = bVar.f45417c;
        return new C15133c(f, Math.min(jVar2.f397999e, Math.max(b, jVar2.f397998d)));
    }

    /* renamed from: d */
    public final void mo22025d(int i, int i2) {
        C15133c cVar = (C15133c) C15138h.m31707a(this.f45465j);
        C15133c cVar2 = new C15133c(((C15133c) C15138h.m31707a(this.f45465j)).f45420a + ((float) mo22023b()), new C15133c(cVar.f45420a / 2.0f, cVar.f45421b / 2.0f).f45421b);
        C15132b bVar = this.f45461e;
        bVar.f45416b.mo124186l(cVar2.f45420a);
        bVar.f45417c.mo124186l(cVar2.f45421b);
        mo22026e(f45459i, new C15133c((float) i, (float) i2));
    }

    /* renamed from: e */
    public final void mo22026e(C147454r rVar, C15134d dVar) {
        C15132b bVar = this.f45461e;
        bVar.f45418d = C15132b.m31701b(bVar.f45416b.mo124176b(), bVar.f45417c.mo124176b(), bVar.f45418d);
        if (!dVar.equals(bVar.f45418d)) {
            C15132b bVar2 = this.f45461e;
            C15133c cVar = (C15133c) dVar;
            bVar2.f45416b.mo124185k(rVar).mo124174a(cVar.f45420a);
            bVar2.f45417c.mo124185k(rVar).mo124174a(cVar.f45421b);
        }
    }

    /* renamed from: f */
    public final void mo22027f() {
        C15134d a = C15138h.m31707a(this.f45465j);
        View view = this.f45463g;
        view.getClass();
        C15133c cVar = (C15133c) a;
        View view2 = this.f45463g;
        view2.getClass();
        int width = ((int) cVar.f45420a) - (view2.getWidth() / 2);
        int i = this.f45462f;
        View view3 = this.f45463g;
        view3.getClass();
        int height = i + (view3.getHeight() / 2);
        float f = cVar.f45421b;
        View view4 = this.f45463g;
        view4.getClass();
        int height2 = view4.getHeight();
        C15132b bVar = this.f45461e;
        RectF rectF = new RectF((float) (view.getWidth() / 2), (float) height, (float) width, f - (((float) height2) / 2.0f));
        bVar.f45416b.mo124187m(rectF.left, rectF.right);
        bVar.f45417c.mo124187m(rectF.top, rectF.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo22022a() {
        View view = this.f45463g;
        view.getClass();
        return view.getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo22023b() {
        View view = this.f45463g;
        view.getClass();
        return view.getWidth();
    }
}
