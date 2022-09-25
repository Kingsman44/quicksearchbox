package com.google.android.apps.gsa.staticplugins.opa.p8621x;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.C109205hl;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3505b.C44534d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.x.l */
/* compiled from: PG */
public final class C114524l {

    /* renamed from: a */
    String f317593a;

    /* renamed from: b */
    LinearLayout f317594b;

    /* renamed from: c */
    public final C86124t f317595c;

    /* renamed from: d */
    public ViewGroup f317596d;

    /* renamed from: e */
    public String f317597e;

    /* renamed from: f */
    public final Context f317598f;

    /* renamed from: g */
    public boolean f317599g = true;

    /* renamed from: h */
    public boolean f317600h;

    /* renamed from: i */
    public final List f317601i = new ArrayList();

    /* renamed from: j */
    final View.OnClickListener f317602j = new C89943l(new C114520h(this));

    /* renamed from: k */
    public C109205hl f317603k;

    /* renamed from: l */
    private final AnimatorSet f317604l;

    /* renamed from: m */
    private boolean f317605m;

    public C114524l(Context context, C86124t tVar, C104149a aVar) {
        ContextThemeWrapper contextThemeWrapper;
        if (aVar.mo93970a()) {
            contextThemeWrapper = new ContextThemeWrapper(C44534d.m78716c(context), 2132148956);
            if (C44534d.m78715b()) {
                contextThemeWrapper.getTheme().applyStyle(2132148957, true);
            }
        } else if (aVar.mo93971b()) {
            contextThemeWrapper = new ContextThemeWrapper(context, 2132149689);
            if (C44534d.m78715b()) {
                contextThemeWrapper.getTheme().applyStyle(2132149690, true);
            }
        } else {
            contextThemeWrapper = new ContextThemeWrapper(context, 2132148451);
        }
        this.f317598f = contextThemeWrapper;
        this.f317595c = tVar;
        this.f317604l = new AnimatorSet();
    }

    /* renamed from: e */
    private final void m189861e() {
        AnimatorSet animatorSet = this.f317604l;
        TextView textView = (TextView) this.f317594b.findViewById(R.id.txt_header);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat.setDuration(200);
        ofFloat.addListener(new C114522j(this, textView));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((TextView) this.f317594b.findViewById(R.id.txt_header), View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(200);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((TextView) this.f317594b.findViewById(R.id.txt_header), View.ALPHA, new float[]{1.0f, 1.0f});
        ofFloat3.setDuration(this.f317595c.mo79743a(C90029ch.f248198L));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f317594b, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat4.setDuration(200);
        ofFloat4.addListener(new C114523k(this));
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
        this.f317604l.start();
    }

    /* renamed from: a */
    public final void mo101383a() {
        this.f317604l.cancel();
        ViewGroup viewGroup = this.f317596d;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        LinearLayout linearLayout = this.f317594b;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        C109205hl hlVar = this.f317603k;
        if (hlVar != null && this.f317594b != null) {
            if (((C86124t) hlVar.f304060a.f304283f.mo27525b()).mo79746e(C90029ch.f248221aH)) {
                hlVar.f304060a.f304281d.mo98073e();
            }
            this.f317594b = null;
        }
    }

    /* renamed from: b */
    public final void mo101384b(int i, ImageView imageView) {
        int a = C1878d.m5128a(this.f317598f, R.color.feedback_survey_rating_not_selected);
        ((ImageView) this.f317594b.findViewById(R.id.btn_rating_1)).setColorFilter(a);
        ((ImageView) this.f317594b.findViewById(R.id.btn_rating_2)).setColorFilter(a);
        ((ImageView) this.f317594b.findViewById(R.id.btn_rating_3)).setColorFilter(a);
        ((ImageView) this.f317594b.findViewById(R.id.btn_rating_4)).setColorFilter(a);
        ((ImageView) this.f317594b.findViewById(R.id.btn_rating_5)).setColorFilter(a);
        this.f317593a = String.valueOf(i);
        imageView.setColorFilter(C1878d.m5128a(this.f317598f, R.color.feedback_survey_rating_selected));
        C109205hl hlVar = this.f317603k;
        if (hlVar != null) {
            hlVar.mo97660a(this.f317593a);
            if (!this.f317595c.mo79746e(C90029ch.f248221aH)) {
                this.f317603k = null;
            }
        }
        m189861e();
    }

    /* renamed from: c */
    public final void mo101385c(RadioButton radioButton, String str) {
        if (!this.f317605m) {
            this.f317605m = true;
            if (!this.f317600h) {
                radioButton.setTextColor(C1878d.m5128a(this.f317598f, R.color.feedback_survey_rating_selected));
            }
            C109205hl hlVar = this.f317603k;
            if (hlVar != null) {
                hlVar.mo97660a(this.f317593a);
                if (!this.f317595c.mo79746e(C90029ch.f248221aH)) {
                    this.f317603k = null;
                }
            }
            m189861e();
            this.f317593a = str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101386d(com.google.assistant.p3897e.p3921j.C52150hb r17, android.view.View r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r1.f136845a
            r2 = r2 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x036f
            boolean r2 = r0.f317599g
            if (r2 != 0) goto L_0x0010
            goto L_0x036f
        L_0x0010:
            com.google.assistant.e.j.ha r1 = r1.f136848d
            if (r1 != 0) goto L_0x0016
            com.google.assistant.e.j.ha r1 = com.google.assistant.p3897e.p3921j.C52149ha.f136834h
        L_0x0016:
            int r2 = r1.f136836a
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L_0x036f
            com.google.protobuf.cq r2 = r1.f136841f
            r4 = 0
            r0.f317605m = r4
            r16.mo101383a()
            boolean r5 = r2.isEmpty()
            r7 = 2131430163(0x7f0b0b13, float:1.848202E38)
            r8 = 58396(0xe41c, float:8.183E-41)
            r9 = 58395(0xe41b, float:8.1829E-41)
            r10 = 58394(0xe41a, float:8.1827E-41)
            r11 = 2131431002(0x7f0b0e5a, float:1.848372E38)
            r12 = 58393(0xe419, float:8.1826E-41)
            r13 = 2131431001(0x7f0b0e59, float:1.8483719E38)
            r14 = 58392(0xe418, float:8.1825E-41)
            r15 = 2131436764(0x7f0b24dc, float:1.8495408E38)
            r3 = 0
            r4 = 2131429383(0x7f0b0807, float:1.8480437E38)
            r6 = 5
            if (r5 == 0) goto L_0x01c8
            android.content.Context r2 = r0.f317598f
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r5 = 2131624994(0x7f0e0422, float:1.8877183E38)
            android.view.View r2 = r2.inflate(r5, r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r0.f317594b = r2
            com.google.android.libraries.logging.j r3 = new com.google.android.libraries.logging.j
            r3.<init>(r14)
            r3.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r3)
            android.widget.LinearLayout r2 = r0.f317594b
            android.view.View r2 = r2.findViewById(r13)
            com.google.android.libraries.logging.j r3 = new com.google.android.libraries.logging.j
            r3.<init>(r12)
            r3.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r3)
            android.widget.LinearLayout r2 = r0.f317594b
            android.view.View r2 = r2.findViewById(r11)
            com.google.android.libraries.logging.j r3 = new com.google.android.libraries.logging.j
            r3.<init>(r10)
            r3.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r3)
            android.widget.LinearLayout r2 = r0.f317594b
            android.view.View r2 = r2.findViewById(r15)
            com.google.android.libraries.logging.j r3 = new com.google.android.libraries.logging.j
            r3.<init>(r9)
            r3.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r3)
            android.widget.LinearLayout r2 = r0.f317594b
            android.view.View r2 = r2.findViewById(r4)
            com.google.android.libraries.logging.j r3 = new com.google.android.libraries.logging.j
            r3.<init>(r8)
            r3.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r3)
            android.widget.LinearLayout r2 = r0.f317594b
            r3 = 2131431005(0x7f0b0e5d, float:1.8483727E38)
            android.view.View r2 = r2.findViewById(r3)
            com.google.android.libraries.logging.j r3 = new com.google.android.libraries.logging.j
            r5 = 58398(0xe41e, float:8.1833E-41)
            r3.<init>(r5)
            r3.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r3)
            android.widget.LinearLayout r2 = r0.f317594b
            android.view.View r2 = r2.findViewById(r7)
            com.google.android.libraries.logging.j r3 = new com.google.android.libraries.logging.j
            r5 = 58399(0xe41f, float:8.1834E-41)
            r3.<init>(r5)
            r3.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r3)
            android.widget.LinearLayout r2 = r0.f317594b
            r3 = 2131430164(0x7f0b0b14, float:1.8482021E38)
            android.view.View r2 = r2.findViewById(r3)
            com.google.android.libraries.logging.j r3 = new com.google.android.libraries.logging.j
            r5 = 58400(0xe420, float:8.1836E-41)
            r3.<init>(r5)
            r3.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r3)
            android.widget.LinearLayout r2 = r0.f317594b
            r3 = 2131431003(0x7f0b0e5b, float:1.8483723E38)
            android.view.View r2 = r2.findViewById(r3)
            com.google.android.libraries.logging.j r3 = new com.google.android.libraries.logging.j
            r5 = 58397(0xe41d, float:8.1832E-41)
            r3.<init>(r5)
            r3.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r3)
            android.widget.LinearLayout r2 = r0.f317594b
            r3 = 2131429384(0x7f0b0808, float:1.848044E38)
            android.view.View r2 = r2.findViewById(r3)
            com.google.android.libraries.logging.j r5 = new com.google.android.libraries.logging.j
            r8 = 58402(0xe422, float:8.1839E-41)
            r5.<init>(r8)
            r5.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r5)
            android.widget.LinearLayout r2 = r0.f317594b
            r5 = 2131429385(0x7f0b0809, float:1.8480441E38)
            android.view.View r2 = r2.findViewById(r5)
            com.google.android.libraries.logging.j r8 = new com.google.android.libraries.logging.j
            r9 = 58403(0xe423, float:8.184E-41)
            r8.<init>(r9)
            r8.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r8)
            android.widget.LinearLayout r2 = r0.f317594b
            r8 = 2131429386(0x7f0b080a, float:1.8480443E38)
            android.view.View r2 = r2.findViewById(r8)
            com.google.android.libraries.logging.j r9 = new com.google.android.libraries.logging.j
            r10 = 58404(0xe424, float:8.1841E-41)
            r9.<init>(r10)
            r9.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r9)
            android.widget.LinearLayout r2 = r0.f317594b
            r9 = 2131429387(0x7f0b080b, float:1.8480445E38)
            android.view.View r2 = r2.findViewById(r9)
            com.google.android.libraries.logging.j r10 = new com.google.android.libraries.logging.j
            r11 = 58405(0xe425, float:8.1843E-41)
            r10.<init>(r11)
            r10.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r10)
            android.widget.LinearLayout r2 = r0.f317594b
            r10 = 2131429388(0x7f0b080c, float:1.8480447E38)
            android.view.View r2 = r2.findViewById(r10)
            com.google.android.libraries.logging.j r11 = new com.google.android.libraries.logging.j
            r12 = 58406(0xe426, float:8.1844E-41)
            r11.<init>(r12)
            r11.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r11)
            android.widget.LinearLayout r2 = r0.f317594b
            android.view.View r2 = r2.findViewById(r4)
            android.view.View$OnClickListener r4 = r0.f317602j
            r2.setOnClickListener(r4)
            android.widget.LinearLayout r2 = r0.f317594b
            android.view.View r2 = r2.findViewById(r3)
            android.view.View$OnClickListener r3 = r0.f317602j
            r2.setOnClickListener(r3)
            android.widget.LinearLayout r2 = r0.f317594b
            android.view.View r2 = r2.findViewById(r5)
            android.view.View$OnClickListener r3 = r0.f317602j
            r2.setOnClickListener(r3)
            android.widget.LinearLayout r2 = r0.f317594b
            android.view.View r2 = r2.findViewById(r8)
            android.view.View$OnClickListener r3 = r0.f317602j
            r2.setOnClickListener(r3)
            android.widget.LinearLayout r2 = r0.f317594b
            android.view.View r2 = r2.findViewById(r9)
            android.view.View$OnClickListener r3 = r0.f317602j
            r2.setOnClickListener(r3)
            android.widget.LinearLayout r2 = r0.f317594b
            android.view.View r2 = r2.findViewById(r10)
            android.view.View$OnClickListener r3 = r0.f317602j
            r2.setOnClickListener(r3)
            android.widget.LinearLayout r2 = r0.f317594b
            r3 = 125274(0x1e95a, float:1.75546E-40)
            com.google.common.o.oe r2 = com.google.android.libraries.logging.C28285c.m52874a(r2, r3)
            r3 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146521e(r2, r3)
            r5 = 0
            goto L_0x0288
        L_0x01c8:
            com.google.android.apps.gsa.search.core.i.t r5 = r0.f317595c
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90027cf.f248170a
            boolean r5 = r5.mo79746e(r7)
            if (r5 == 0) goto L_0x02be
            android.content.Context r5 = r0.f317598f
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r7 = 2131624995(0x7f0e0423, float:1.8877185E38)
            android.view.View r5 = r5.inflate(r7, r3)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0.f317594b = r5
            com.google.android.libraries.logging.j r7 = new com.google.android.libraries.logging.j
            r7.<init>(r14)
            r7.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r5, r7)
            android.widget.LinearLayout r5 = r0.f317594b
            android.view.View r5 = r5.findViewById(r13)
            com.google.android.libraries.logging.j r7 = new com.google.android.libraries.logging.j
            r7.<init>(r12)
            r7.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r5, r7)
            android.widget.LinearLayout r5 = r0.f317594b
            android.view.View r5 = r5.findViewById(r11)
            com.google.android.libraries.logging.j r7 = new com.google.android.libraries.logging.j
            r7.<init>(r10)
            r7.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r5, r7)
            android.widget.LinearLayout r5 = r0.f317594b
            android.view.View r5 = r5.findViewById(r15)
            com.google.android.libraries.logging.j r7 = new com.google.android.libraries.logging.j
            r7.<init>(r9)
            r7.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r5, r7)
            android.widget.LinearLayout r5 = r0.f317594b
            android.view.View r5 = r5.findViewById(r4)
            com.google.android.libraries.logging.j r7 = new com.google.android.libraries.logging.j
            r7.<init>(r8)
            r7.mo33795i(r6)
            com.google.android.libraries.logging.C28295m.m52919e(r5, r7)
            android.widget.LinearLayout r5 = r0.f317594b
            android.view.View r4 = r5.findViewById(r4)
            android.view.View$OnClickListener r5 = r0.f317602j
            r4.setOnClickListener(r5)
            android.widget.LinearLayout r4 = r0.f317594b
            r5 = 2131431000(0x7f0b0e58, float:1.8483717E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            java.util.Iterator r2 = r2.iterator()
        L_0x024c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0284
            java.lang.Object r5 = r2.next()
            com.google.assistant.e.j.gy r5 = (com.google.assistant.p3897e.p3921j.C52146gy) r5
            android.content.Context r6 = r0.f317598f
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r7 = 2131624996(0x7f0e0424, float:1.8877187E38)
            android.view.View r6 = r6.inflate(r7, r3)
            r7 = 2131430999(0x7f0b0e57, float:1.8483715E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.RadioButton r7 = (android.widget.RadioButton) r7
            com.google.android.apps.gsa.staticplugins.opa.x.c r8 = new com.google.android.apps.gsa.staticplugins.opa.x.c
            r8.<init>(r0, r7, r5, r4)
            r7.setOnClickListener(r8)
            java.lang.String r5 = r5.f136828a
            r7.setText(r5)
            java.util.List r5 = r0.f317601i
            r5.add(r7)
            r4.addView(r6)
            goto L_0x024c
        L_0x0284:
            r5 = 0
            r4.setVisibility(r5)
        L_0x0288:
            android.widget.LinearLayout r2 = r0.f317594b
            r2.setVisibility(r5)
            com.google.android.apps.gsa.staticplugins.opa.hl r2 = r0.f317603k
            if (r2 == 0) goto L_0x0294
            r2.mo97661b()
        L_0x0294:
            android.widget.LinearLayout r2 = r0.f317594b
            r3 = 2131434023(0x7f0b1a27, float:1.8489848E38)
            r4 = r18
            android.view.View r3 = r4.findViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0.f317596d = r3
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)
            android.view.ViewGroup r4 = r0.f317596d
            if (r4 == 0) goto L_0x02b7
            r4.addView(r2, r3)
            android.view.ViewGroup r2 = r0.f317596d
            r3 = 0
            r2.setVisibility(r3)
        L_0x02b7:
            com.google.android.apps.gsa.staticplugins.opa.hl r2 = r0.f317603k
            if (r2 == 0) goto L_0x02be
            r2.mo97661b()
        L_0x02be:
            android.content.Context r2 = r0.f317598f
            r3 = 2132090157(0x7f151d2d, float:1.9820646E38)
            java.lang.String r2 = r2.getString(r3)
            r0.f317593a = r2
            android.content.Context r2 = r0.f317598f
            r3 = 2132082837(0x7f150095, float:1.98058E38)
            java.lang.String r2 = r2.getString(r3)
            r0.f317597e = r2
            int r2 = r1.f136836a
            r2 = r2 & 2
            if (r2 == 0) goto L_0x02de
            java.lang.String r2 = r1.f136838c
            r0.f317597e = r2
        L_0x02de:
            android.widget.LinearLayout r2 = r0.f317594b
            android.view.View r2 = r2.findViewById(r15)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r3 = r1.f136837b
            r2.setText(r3)
            android.widget.LinearLayout r2 = r0.f317594b
            r3 = 2131436765(0x7f0b24dd, float:1.849541E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r3 = r1.f136837b
            r2.setText(r3)
            com.google.protobuf.cq r2 = r1.f136841f
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0323
            android.widget.LinearLayout r2 = r0.f317594b
            r3 = 2131430163(0x7f0b0b13, float:1.848202E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r3 = r1.f136840e
            r2.setText(r3)
            android.widget.LinearLayout r2 = r0.f317594b
            r3 = 2131430164(0x7f0b0b14, float:1.8482021E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r3 = r1.f136839d
            r2.setText(r3)
        L_0x0323:
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f317595c
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90029ch.f248222aI
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x0357
            int r2 = r1.f136836a
            r2 = r2 & 32
            if (r2 == 0) goto L_0x0357
            android.widget.LinearLayout r2 = r0.f317594b
            r3 = 2131436833(0x7f0b2521, float:1.8495548E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r1 = r1.f136842g
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            r2.setText(r1)
            r1 = 0
            r2.setVisibility(r1)
            android.widget.LinearLayout r2 = r0.f317594b
            r3 = 2131436834(0x7f0b2522, float:1.849555E38)
            android.view.View r2 = r2.findViewById(r3)
            r2.setVisibility(r1)
        L_0x0357:
            android.widget.LinearLayout r1 = r0.f317594b
            com.google.android.libraries.logging.j r2 = new com.google.android.libraries.logging.j
            r3 = 50602(0xc5aa, float:7.0909E-41)
            r2.<init>(r3)
            r3 = 1
            r2.mo33794h(r3)
            com.google.android.libraries.logging.C28295m.m52919e(r1, r2)
            com.google.android.apps.gsa.staticplugins.opa.hl r1 = r0.f317603k
            if (r1 == 0) goto L_0x036f
            r1.mo97661b()
        L_0x036f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8621x.C114524l.mo101386d(com.google.assistant.e.j.hb, android.view.View):void");
    }
}
