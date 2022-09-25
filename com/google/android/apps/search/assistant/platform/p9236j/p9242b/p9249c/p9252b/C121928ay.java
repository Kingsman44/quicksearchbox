package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.Window;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33562c;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33563d;
import com.google.android.libraries.search.assistant.invocation.p2641k.C33914a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.ay */
/* compiled from: PG */
public final class C121928ay extends Dialog {

    /* renamed from: a */
    public static final C59071e f338335a = C59071e.m91331h();

    /* renamed from: b */
    public final long f338336b;

    /* renamed from: c */
    public C33562c f338337c;

    /* renamed from: d */
    public C121955p f338338d;

    /* renamed from: e */
    private final Fragment f338339e;

    /* renamed from: f */
    private final C33563d f338340f;

    /* renamed from: g */
    private final Context f338341g;

    /* renamed from: a */
    public final Fragment mo105451a() {
        C121955p pVar = this.f338338d;
        if (pVar == null) {
            C69664n.m101065k("fragmentHost");
            pVar = null;
        }
        return pVar.mo51122q().f634a.mo670b(16908290);
    }

    /* renamed from: b */
    public final C121955p mo105452b() {
        Window window = getWindow();
        C69664n.m101058d(window);
        Context context = this.f338341g;
        C33562c cVar = this.f338337c;
        C69664n.m101061g(window, "window");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(cVar, "session");
        View decorView = window.getDecorView();
        C121955p pVar = new C121955p();
        pVar.mo51130t(window, decorView, context);
        pVar.f338431a = cVar;
        return pVar;
    }

    /* renamed from: c */
    public final void mo105453c(String str, C69626l lVar) {
        C59071e eVar = f338335a;
        C59052c cVar = (C59052c) eVar.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Window");
        cVar.mo56379ah(new C59094n(36069));
        cVar.mo56389s("%s", str);
        Fragment a = mo105451a();
        if (a == null) {
            C59052c cVar2 = (C59052c) eVar.mo56224b();
            cVar2.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Window");
            cVar2.mo56379ah(new C59094n(36070));
            cVar2.mo56389s("No fragment found, %s is not propagated", str);
            return;
        }
        lVar.mo5761a(a);
    }

    public final void onBackPressed() {
        mo105453c("onBackPressed", C121926aw.f338333a);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C58976aa aaVar = C58975e.f156826a;
        C121955p b = mo105452b();
        this.f338338d = b;
        if (b == null) {
            C69664n.m101065k("fragmentHost");
            b = null;
        }
        b.mo19987jP(bundle);
    }

    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        C69664n.m101060f(onSaveInstanceState, "super.onSaveInstanceState()");
        C58976aa aaVar = C58975e.f156826a;
        C121955p pVar = this.f338338d;
        if (pVar == null) {
            C69664n.m101065k("fragmentHost");
            pVar = null;
        }
        pVar.mo51132v(onSaveInstanceState);
        return onSaveInstanceState;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        C58976aa aaVar = C58975e.f156826a;
        C121955p pVar = this.f338338d;
        if (pVar == null) {
            C69664n.m101065k("fragmentHost");
            pVar = null;
        }
        pVar.mo51128g();
        C121955p pVar2 = this.f338338d;
        if (pVar2 == null) {
            C69664n.m101065k("fragmentHost");
            pVar2 = null;
        }
        pVar2.mo51127f();
        C59052c cVar = (C59052c) f338335a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Window");
        String c = C33914a.m62568c(this.f338339e);
        cVar.mo56379ah(new C59094n(36074));
        cVar.mo56389s("adding fragment: %s", c);
        C121955p pVar3 = this.f338338d;
        if (pVar3 == null) {
            C69664n.m101065k("fragmentHost");
            pVar3 = null;
        }
        C0154a aVar = new C0154a(pVar3.mo51122q());
        aVar.mo511h(16908290, this.f338339e, (String) null, 1);
        aVar.mo509f();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C59052c cVar = (C59052c) f338335a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Window");
        cVar.mo56380ai(C58979ad.FULL);
        cVar.mo56379ah(new C59094n(36075));
        cVar.mo56386p("onStop WINDOW");
        C121955p pVar = this.f338338d;
        C121955p pVar2 = null;
        if (pVar == null) {
            C69664n.m101065k("fragmentHost");
            pVar = null;
        }
        pVar.mo51126e();
        C121955p pVar3 = this.f338338d;
        if (pVar3 == null) {
            C69664n.m101065k("fragmentHost");
            pVar3 = null;
        }
        pVar3.mo22016h();
        C121955p pVar4 = this.f338338d;
        if (pVar4 == null) {
            C69664n.m101065k("fragmentHost");
        } else {
            pVar2 = pVar4;
        }
        pVar2.mo51129jQ();
        super.onStop();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C121928ay(long r6, android.support.p031v4.app.Fragment r8, com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33563d r9, com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33562c r10, android.content.Context r11) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 >= r2) goto L_0x000c
            goto L_0x0051
        L_0x000c:
            java.lang.Class<android.hardware.display.DisplayManager> r1 = android.hardware.display.DisplayManager.class
            java.lang.Object r1 = r11.getSystemService(r1)     // Catch:{ RuntimeException -> 0x002b }
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1     // Catch:{ RuntimeException -> 0x002b }
            r2 = 0
            android.view.Display r1 = r1.getDisplay(r2)     // Catch:{ RuntimeException -> 0x002b }
            android.content.Context r1 = r11.createDisplayContext(r1)     // Catch:{ RuntimeException -> 0x002b }
            r2 = 2031(0x7ef, float:2.846E-42)
            r3 = 0
            android.content.Context r1 = r1.createWindowContext(r2, r3)     // Catch:{ RuntimeException -> 0x002b }
            java.lang.String r2 = "context\n          .creat…ions= */ null\n          )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)     // Catch:{ RuntimeException -> 0x002b }
            r11 = r1
            goto L_0x0051
        L_0x002b:
            r1 = move-exception
            com.google.common.f.e r2 = f338335a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "INV.AssistLayer.Window"
            r2.mo56378ag(r3, r4)
            com.google.common.f.x r1 = r2.mo56382g(r1)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 36067(0x8ce3, float:5.054E-41)
            r2.<init>(r3)
            r1.mo56379ah(r2)
            java.lang.String r2 = "Exception in createWindowContext"
            r1.mo56386p(r2)
        L_0x0051:
            r1 = 2132148307(0x7f160053, float:1.9938588E38)
            r5.<init>(r11, r1)
            r5.f338336b = r6
            r5.f338339e = r8
            r5.f338340f = r9
            r5.f338337c = r10
            android.view.Window r6 = r5.getWindow()
            p5462h.p5473f.p5475b.C69664n.m101058d(r6)
            android.content.Context r6 = r6.getContext()
            java.lang.String r7 = "androidWindow.context"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            java.lang.Integer r7 = r9.f89746b
            int r7 = r7.intValue()
            androidx.a.a.b r8 = new androidx.a.a.b
            r8.<init>((android.content.Context) r6, (int) r7)
            android.content.Context r6 = com.google.android.material.p3505b.C44534d.m78716c(r8)
            java.lang.String r7 = "wrapContextIfAvailable(themedContext)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            r5.f338341g = r6
            android.view.Window r7 = r5.getWindow()
            p5462h.p5473f.p5475b.C69664n.m101058d(r7)
            java.lang.String r8 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r8)
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r0)
            int[] r8 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121929az.f338342a
            android.content.res.TypedArray r8 = r6.obtainStyledAttributes(r8)
            java.lang.String r9 = "obtainStyledAttributes(R.styleable.AppCompatTheme)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            r9 = 117(0x75, float:1.64E-43)
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            if (r9 == 0) goto L_0x00b1
            android.support.v7.app.v r6 = android.support.p033v7.app.C0401v.m1328z(r6, r7)
            r6.mo1179h()
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121928ay.<init>(long, android.support.v4.app.Fragment, com.google.android.libraries.search.assistant.invocation.c.a.d, com.google.android.libraries.search.assistant.invocation.c.a.c, android.content.Context):void");
    }
}
