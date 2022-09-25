package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d;

import android.content.Context;
import android.graphics.Rect;
import android.support.constraint.ConstraintLayout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.C110117c;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114752f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114874f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28293k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import org.p5633c.p5634a.C72210d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.d.q */
/* compiled from: PG */
public final class C110106q implements C110100k {

    /* renamed from: a */
    public final TextView f306791a;

    /* renamed from: b */
    public final TextView f306792b;

    /* renamed from: c */
    public final LinearLayout f306793c;

    /* renamed from: d */
    public final C110117c f306794d;

    /* renamed from: e */
    public float f306795e;

    /* renamed from: f */
    public final float f306796f;

    /* renamed from: g */
    private final Context f306797g;

    /* renamed from: h */
    private final ConstraintLayout f306798h;

    /* renamed from: i */
    private final C28293k f306799i;

    /* renamed from: j */
    private final C22871g f306800j;

    /* renamed from: k */
    private C114752f f306801k = C114752f.UNKNOWN;

    /* renamed from: l */
    private int f306802l;

    /* renamed from: m */
    private int f306803m;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0077, code lost:
        if (r10 != 4) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C110106q(android.view.LayoutInflater r7, android.support.p033v7.app.C0395p r8, com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d.C110093d r9, com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114868dk r10, com.google.android.libraries.gsa.p1876k.C22871g r11) {
        /*
            r6 = this;
            r6.<init>()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.f r0 = com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114752f.UNKNOWN
            r6.f306801k = r0
            android.content.Context r8 = r8.getApplicationContext()
            r6.f306797g = r8
            r0 = 2131624114(0x7f0e00b2, float:1.8875399E38)
            r1 = 0
            android.view.View r7 = r7.inflate(r0, r1)
            android.support.constraint.ConstraintLayout r7 = (android.support.constraint.ConstraintLayout) r7
            r6.f306798h = r7
            r0 = 2131436116(0x7f0b2254, float:1.8494093E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f306791a = r0
            r1 = 2131436117(0x7f0b2255, float:1.8494095E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r6.f306792b = r1
            r2 = 2131427783(0x7f0b01c7, float:1.8477192E38)
            android.view.View r2 = r7.findViewById(r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            com.google.android.apps.gsa.assistant.shared.l.e r3 = com.google.android.apps.gsa.assistant.shared.l.e.an
            r4 = 2131624111(0x7f0e00af, float:1.8875392E38)
            r5 = 83116(0x144ac, float:1.1647E-40)
            android.widget.ImageView r9 = r9.mo98370a(r3, r4, r5)
            r3 = 2131232925(0x7f08089d, float:1.8081973E38)
            r9.setImageResource(r3)
            r2.addView(r9)
            r2 = 2131427727(0x7f0b018f, float:1.8477078E38)
            android.view.View r2 = r7.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r6.f306793c = r2
            r10.mo101667a()
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.f r10 = r10.f318710a
            r6.f306801k = r10
            r6.f306800j = r11
            int r10 = r10.ordinal()
            r11 = 2131104048(0x7f061130, float:1.782058E38)
            r2 = 2131104047(0x7f06112f, float:1.7820577E38)
            if (r10 == 0) goto L_0x0099
            r3 = 1
            if (r10 == r3) goto L_0x008e
            r3 = 2
            if (r10 == r3) goto L_0x0083
            r3 = 3
            if (r10 == r3) goto L_0x007a
            r3 = 4
            if (r10 == r3) goto L_0x0099
            goto L_0x009d
        L_0x007a:
            r10 = 2131104043(0x7f06112b, float:1.782057E38)
            r6.f306802l = r10
            r10 = 2131104044(0x7f06112c, float:1.7820571E38)
            goto L_0x008b
        L_0x0083:
            r10 = 2131104041(0x7f061129, float:1.7820565E38)
            r6.f306802l = r10
            r10 = 2131104042(0x7f06112a, float:1.7820567E38)
        L_0x008b:
            r6.f306803m = r10
            goto L_0x009d
        L_0x008e:
            r10 = 2131104045(0x7f06112d, float:1.7820573E38)
            r6.f306802l = r10
            r10 = 2131104046(0x7f06112e, float:1.7820575E38)
            r6.f306803m = r10
            goto L_0x009d
        L_0x0099:
            r6.f306802l = r2
            r6.f306803m = r11
        L_0x009d:
            int r10 = r6.f306802l
            int r10 = androidx.core.content.C1878d.m5128a(r8, r10)
            r0.setTextColor(r10)
            int r10 = r6.f306802l
            int r10 = androidx.core.content.C1878d.m5128a(r8, r10)
            r1.setTextColor(r10)
            android.content.res.Resources r8 = r8.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            r6.f306796f = r8
            com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.c r8 = new com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.c
            r8.<init>()
            r6.f306794d = r8
            com.google.android.libraries.logging.j r8 = new com.google.android.libraries.logging.j
            r10 = 77882(0x1303a, float:1.09136E-40)
            r8.<init>(r10)
            r10 = 5
            r8.mo33795i(r10)
            com.google.android.libraries.logging.C28295m.m52919e(r7, r8)
            com.google.android.libraries.logging.j r7 = com.google.android.libraries.logging.C28295m.m52915a(r9)
            r9 = 0
            com.google.android.libraries.logging.k[] r9 = new com.google.android.libraries.logging.C28293k[r9]
            com.google.android.libraries.logging.k r7 = com.google.android.libraries.logging.C28293k.m52908e(r7, r9)
            com.google.common.b.gu r7 = com.google.common.p4522b.C58485gu.m89846n(r7)
            com.google.android.libraries.logging.k r7 = com.google.android.libraries.logging.C28293k.m52907d(r8, r7)
            r6.f306799i = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d.C110106q.<init>(android.view.LayoutInflater, android.support.v7.app.p, com.google.android.apps.gsa.staticplugins.opa.samson.charging.d.d, com.google.android.apps.gsa.staticplugins.opa.zerostate.j.dk, com.google.android.libraries.gsa.k.g):void");
    }

    /* renamed from: a */
    public final View mo98375a() {
        return this.f306798h;
    }

    /* renamed from: b */
    public final View mo98376b() {
        return this.f306798h.findViewById(R.id.notification_permission_prompt);
    }

    /* renamed from: c */
    public final LinearLayout mo98377c() {
        return (LinearLayout) this.f306798h.findViewById(R.id.notification_container);
    }

    /* renamed from: d */
    public final C28293k mo98378d() {
        return this.f306799i;
    }

    /* renamed from: e */
    public final void mo98379e(Boolean bool) {
    }

    /* renamed from: f */
    public final void mo98380f(long j) {
        String e = C114874f.m190405e(this.f306797g, new C72210d(j), false, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (e.length() < 5) {
            spannableStringBuilder.append('0');
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C1878d.m5128a(this.f306797g, this.f306803m)), 0, 1, 33);
            spannableStringBuilder.append(e.substring(0, 1));
            this.f306792b.setText(e.substring(2, 4));
        } else {
            spannableStringBuilder.append(e.substring(0, 2));
            this.f306792b.setText(e.substring(3, 5));
        }
        this.f306791a.setText(spannableStringBuilder);
        TextPaint paint = this.f306791a.getPaint();
        int lineHeight = this.f306791a.getLineHeight();
        Rect rect = new Rect();
        String obj = this.f306791a.getText().toString();
        paint.getTextBounds(obj, 0, obj.length(), rect);
        this.f306795e = ((float) (lineHeight - rect.height())) / 2.0f;
        C58976aa aaVar = C58975e.f156826a;
        this.f306800j.mo28212l("setNewBurnInPositionForSquareClock", new C110105p(this));
    }
}
