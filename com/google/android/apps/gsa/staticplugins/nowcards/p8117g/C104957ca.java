package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.now.shared.p6421ui.C83421j;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7187ui.C91104c;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91857e;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91940p;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91941q;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105069f;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105073j;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105075l;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105078o;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView;
import com.google.android.apps.p489g.p494d.C9188bx;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58838bb;
import com.google.p375ai.p378b.C8072um;
import com.google.p375ai.p378b.C8074uo;
import com.google.p375ai.p378b.C8075up;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.ca */
/* compiled from: PG */
public final class C104957ca {

    /* renamed from: a */
    public final C91940p f292443a;

    /* renamed from: b */
    public C9188bx f292444b;

    /* renamed from: c */
    public C8075up f292445c;

    /* renamed from: d */
    public C9277u f292446d;

    /* renamed from: e */
    public MetadataLineView f292447e;

    /* renamed from: f */
    public MetadataLineView f292448f;

    /* renamed from: g */
    public View f292449g;

    /* renamed from: h */
    public View f292450h;

    /* renamed from: i */
    public View f292451i;

    /* renamed from: j */
    public View f292452j;

    /* renamed from: k */
    public int f292453k;

    /* renamed from: l */
    public int f292454l;

    /* renamed from: m */
    public C8074uo f292455m;

    /* renamed from: n */
    public ImageView f292456n;

    /* renamed from: o */
    public boolean f292457o;

    /* renamed from: p */
    private final C105069f f292458p;

    /* renamed from: q */
    private final C91857e f292459q;

    /* renamed from: r */
    private final C83421j f292460r;

    /* renamed from: s */
    private final int f292461s;

    public C104957ca(C91940p pVar, C105069f fVar, int i, C91857e eVar, C83421j jVar) {
        this.f292443a = pVar;
        this.f292458p = fVar;
        this.f292461s = i;
        this.f292459q = eVar;
        this.f292460r = jVar;
    }

    /* renamed from: g */
    protected static final void m174002g(View view, Drawable drawable) {
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        int paddingStart = view.getPaddingStart();
        int paddingEnd = view.getPaddingEnd();
        view.setBackground(drawable);
        view.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    /* renamed from: h */
    private static C91941q m174003h(int i, int i2) {
        C91941q qVar = new C91941q(i, i2);
        qVar.mo86641a(15);
        return qVar;
    }

    /* JADX WARNING: type inference failed for: r2v16, types: [com.google.protobuf.bn] */
    /* JADX WARNING: type inference failed for: r2v22, types: [com.google.protobuf.bn] */
    /* JADX WARNING: type inference failed for: r5v10, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m174004i(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            com.google.android.apps.g.d.bx r0 = r11.f292444b
            if (r0 == 0) goto L_0x0014
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r1 = r11.f292447e
            com.google.android.apps.gsa.staticplugins.nowcards.ui.f r2 = r11.f292458p
            com.google.protobuf.cq r0 = r0.f31717b
            com.google.android.apps.gsa.now.shared.ui.j r3 = r11.f292460r
            r1.mo94502d(r2, r0, r3)
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r0 = r11.f292447e
            m174005j(r0)
        L_0x0014:
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r0 = r11.f292448f
            com.google.android.apps.gsa.staticplugins.nowcards.ui.f r1 = r11.f292458p
            com.google.android.apps.g.d.bx r2 = r11.f292444b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0058
            com.google.protobuf.cq r2 = r2.f31717b
            java.util.Iterator r2 = r2.iterator()
            r5 = r3
            r6 = r5
        L_0x0026:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x005a
            java.lang.Object r7 = r2.next()
            com.google.ai.b.lb r7 = (com.google.p375ai.p378b.C7818lb) r7
            com.google.protobuf.cq r8 = r7.f27419b
            java.util.Iterator r8 = r8.iterator()
        L_0x0038:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0055
            java.lang.Object r9 = r8.next()
            com.google.ai.b.kv r9 = (com.google.p375ai.p378b.C7811kv) r9
            int r10 = r9.f27308b
            if (r10 != r4) goto L_0x0038
            com.google.protobuf.bn r5 = r7.toBuilder()
            r6 = r5
            com.google.ai.b.kw r6 = (com.google.p375ai.p378b.C7812kw) r6
            com.google.protobuf.bn r5 = r9.toBuilder()
            com.google.ai.b.ks r5 = (com.google.p375ai.p378b.C7808ks) r5
        L_0x0055:
            if (r6 == 0) goto L_0x0026
            goto L_0x005a
        L_0x0058:
            r5 = r3
            r6 = r5
        L_0x005a:
            if (r6 == 0) goto L_0x005e
            if (r5 != 0) goto L_0x0094
        L_0x005e:
            com.google.ai.b.lb r2 = com.google.p375ai.p378b.C7818lb.f27416n
            com.google.protobuf.bn r2 = r2.createBuilder()
            r6 = r2
            com.google.ai.b.kw r6 = (com.google.p375ai.p378b.C7812kw) r6
            com.google.ai.b.la r2 = com.google.p375ai.p378b.C7817la.LOTIC_SMALL_TITLE
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.ai.b.lb r5 = (com.google.p375ai.p378b.C7818lb) r5
            int r2 = r2.f27415aP
            r5.f27420c = r2
            int r2 = r5.f27418a
            r2 = r2 | r4
            r5.f27418a = r2
            com.google.ai.b.kv r2 = com.google.p375ai.p378b.C7811kv.f27305h
            com.google.protobuf.bn r2 = r2.createBuilder()
            r5 = r2
            com.google.ai.b.ks r5 = (com.google.p375ai.p378b.C7808ks) r5
            com.google.ai.b.ku r2 = com.google.p375ai.p378b.C7810ku.STRING
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.ai.b.kv r7 = (com.google.p375ai.p378b.C7811kv) r7
            int r2 = r2.f27304f
            r7.f27310d = r2
            int r2 = r7.f27307a
            r2 = r2 | r4
            r7.f27307a = r2
        L_0x0094:
            r6.copyOnWrite()
            com.google.protobuf.bv r2 = r6.instance
            com.google.ai.b.lb r2 = (com.google.p375ai.p378b.C7818lb) r2
            com.google.ai.b.lb r7 = com.google.p375ai.p378b.C7818lb.f27416n
            r2.f27425h = r3
            int r3 = r2.f27418a
            r3 = r3 & -33
            r2.f27418a = r3
            com.google.ai.b.ll r2 = com.google.p375ai.p378b.C7828ll.f27455e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.ai.b.lk r2 = (com.google.p375ai.p378b.C7827lk) r2
            com.google.ai.b.xj r3 = com.google.p375ai.p378b.C8150xj.f28657d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.ai.b.xe r3 = (com.google.p375ai.p378b.C8145xe) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.ai.b.xj r7 = (com.google.p375ai.p378b.C8150xj) r7
            r12.getClass()
            int r8 = r7.f28659a
            r8 = r8 | r4
            r7.f28659a = r8
            r7.f28660b = r12
            r2.copyOnWrite()
            com.google.protobuf.bv r12 = r2.instance
            com.google.ai.b.ll r12 = (com.google.p375ai.p378b.C7828ll) r12
            com.google.protobuf.bv r3 = r3.build()
            com.google.ai.b.xj r3 = (com.google.p375ai.p378b.C8150xj) r3
            r3.getClass()
            r12.f27458b = r3
            int r3 = r12.f27457a
            r3 = r3 | r4
            r12.f27457a = r3
            r5.copyOnWrite()
            com.google.protobuf.bv r12 = r5.instance
            com.google.ai.b.kv r12 = (com.google.p375ai.p378b.C7811kv) r12
            com.google.protobuf.bv r2 = r2.build()
            com.google.ai.b.ll r2 = (com.google.p375ai.p378b.C7828ll) r2
            com.google.ai.b.kv r3 = com.google.p375ai.p378b.C7811kv.f27305h
            r2.getClass()
            r12.f27309c = r2
            r12.f27308b = r4
            r6.copyOnWrite()
            com.google.protobuf.bv r12 = r6.instance
            com.google.ai.b.lb r12 = (com.google.p375ai.p378b.C7818lb) r12
            com.google.protobuf.cq r2 = com.google.p375ai.p378b.C7818lb.emptyProtobufList()
            r12.f27419b = r2
            r6.copyOnWrite()
            com.google.protobuf.bv r12 = r6.instance
            com.google.ai.b.lb r12 = (com.google.p375ai.p378b.C7818lb) r12
            com.google.protobuf.bv r2 = r5.build()
            com.google.ai.b.kv r2 = (com.google.p375ai.p378b.C7811kv) r2
            r2.getClass()
            r12.mo16973a()
            com.google.protobuf.cq r12 = r12.f27419b
            r12.add(r2)
            r6.copyOnWrite()
            com.google.protobuf.bv r12 = r6.instance
            com.google.ai.b.lb r12 = (com.google.p375ai.p378b.C7818lb) r12
            int r2 = r12.f27418a
            r2 = r2 | 2
            r12.f27418a = r2
            r12.f27421d = r4
            if (r13 == 0) goto L_0x0157
            com.google.ai.b.xj r12 = com.google.p375ai.p378b.C8150xj.f28657d
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.ai.b.xe r12 = (com.google.p375ai.p378b.C8145xe) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r2 = r12.instance
            com.google.ai.b.xj r2 = (com.google.p375ai.p378b.C8150xj) r2
            int r3 = r2.f28659a
            r3 = r3 | r4
            r2.f28659a = r3
            r2.f28660b = r13
            r6.copyOnWrite()
            com.google.protobuf.bv r13 = r6.instance
            com.google.ai.b.lb r13 = (com.google.p375ai.p378b.C7818lb) r13
            com.google.protobuf.bv r12 = r12.build()
            com.google.ai.b.xj r12 = (com.google.p375ai.p378b.C8150xj) r12
            r12.getClass()
            r13.f27425h = r12
            int r12 = r13.f27418a
            r12 = r12 | 32
            r13.f27418a = r12
        L_0x0157:
            com.google.protobuf.bv r12 = r6.build()
            com.google.ai.b.lb r12 = (com.google.p375ai.p378b.C7818lb) r12
            com.google.common.b.gu r12 = com.google.common.p4522b.C58485gu.m89846n(r12)
            com.google.android.apps.gsa.now.shared.ui.j r13 = r11.f292460r
            r0.mo94502d(r1, r12, r13)
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r12 = r11.f292448f
            m174005j(r12)
            r11.mo94419c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104957ca.m174004i(java.lang.String, java.lang.String):void");
    }

    /* renamed from: j */
    private static void m174005j(MetadataLineView metadataLineView) {
        for (int i = 0; i < metadataLineView.getChildCount(); i++) {
            ((TextView) metadataLineView.getChildAt(i)).setTextColor(-1);
        }
    }

    /* renamed from: a */
    public final int mo94417a() {
        View findViewById = this.f292451i.findViewById(R.id.header_container);
        View view = this.f292451i;
        int top = findViewById.getTop();
        View view2 = (View) findViewById.getParent();
        while (view2 != null && view2 != view) {
            top += view2.getTop();
            view2 = (View) view2.getParent();
        }
        return top;
    }

    /* renamed from: b */
    public final View mo94418b(View view, int i, int i2) {
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        viewStub.setLayoutResource(i2);
        viewStub.setLayoutInflater(this.f292443a.f256406b);
        return viewStub.inflate();
    }

    /* renamed from: c */
    public final void mo94419c() {
        if (this.f292451i.findViewById(R.id.header_container) != null) {
            int a = mo94417a();
            if (this.f292451i.findViewById(R.id.header_container).getHeight() == 0 || a == 0) {
                this.f292451i.getViewTreeObserver().addOnPreDrawListener(new C104955bz(this));
                return;
            }
            C91115n.m148874f(this.f292447e, 0, a);
            this.f292450h.findViewById(R.id.label_offset).setLayoutParams(new FrameLayout.LayoutParams(-2, a));
            View findViewById = this.f292451i.findViewById(R.id.text_decoration);
            if (findViewById != null && this.f292446d == C9277u.METADATA_CARD_SMALL_CAROUSEL_MONOTONE) {
                findViewById.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo94420d(boolean z, C8074uo uoVar) {
        this.f292455m = uoVar;
        C8072um umVar = (C8072um) this.f292445c.toBuilder();
        umVar.copyOnWrite();
        C8075up upVar = (C8075up) umVar.instance;
        upVar.f28427h = uoVar.f28417d;
        upVar.f28420a |= 64;
        C8075up upVar2 = (C8075up) umVar.build();
        this.f292445c = upVar2;
        C91857e eVar = this.f292459q;
        if (eVar != null) {
            eVar.mo86359a("EVENT_TOGGLE_STATE_ACTION_CLICK", "ToggleStateActionP", C23245b.m43556a(upVar2));
        }
        mo94422f(z, true);
    }

    /* renamed from: e */
    public final void mo94421e(boolean z) {
        int i = true != z ? 4 : 0;
        if (this.f292457o) {
            this.f292449g.setVisibility(i);
            this.f292450h.setVisibility(i);
            this.f292451i.setClickable(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo94422f(boolean z, boolean z2) {
        String str;
        String str2;
        int i;
        int i2;
        C58838bb.m90869d(this.f292457o, "maybePopulateView() must be called before the view can be setup.");
        this.f292449g.setFocusableInTouchMode(false);
        this.f292449g.setFocusable(false);
        this.f292449g.setClickable(false);
        Resources resources = this.f292443a.f256405a.getResources();
        View findViewById = this.f292451i.findViewById(R.id.header_container);
        this.f292451i.setClickable(true);
        if (this.f292455m == null) {
            C8074uo a = C8074uo.m22931a(this.f292445c.f28427h);
            if (a == null) {
                a = C8074uo.NEUTRAL;
            }
            this.f292455m = a;
        }
        if (this.f292455m == C8074uo.NEUTRAL) {
            str = this.f292445c.f28425f;
            if (z2) {
                View view = this.f292450h;
                C105078o.m174320b(view, new C105075l(view, this.f292453k, this.f292454l, this.f292451i));
            } else {
                this.f292450h.setVisibility(8);
            }
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            this.f292449g.setVisibility(0);
            View findViewById2 = this.f292451i.findViewById(R.id.text_decoration);
            if (findViewById2 != null && this.f292446d == C9277u.METADATA_CARD_SMALL_CAROUSEL_MONOTONE) {
                findViewById2.setVisibility(0);
            }
        } else {
            this.f292450h.setVisibility(4);
            float f = 0.7f;
            if (this.f292455m == C8074uo.CHECKED) {
                this.f292456n.setImageResource(R.drawable.quantum_ic_done_black_48);
                i = resources.getColor(R.color.toggle_checked_text);
                C8075up upVar = this.f292445c;
                if ((upVar.f28420a & 128) != 0) {
                    str2 = upVar.f28428i;
                } else {
                    str2 = upVar.f28424e;
                }
                this.f292450h.setContentDescription(str2);
                m174004i(this.f292445c.f28424e, str2);
                C9188bx bxVar = this.f292444b;
                if (bxVar == null || (bxVar.f31716a & C89885b.HTTP_VALUE) == 0) {
                    i2 = resources.getColor(R.color.toggle_checked_bg);
                } else {
                    i2 = bxVar.f31738w;
                    f = ((float) Color.alpha(i2)) / 255.0f;
                }
                m174002g(this.f292452j, m174003h(i2, this.f292461s));
                this.f292452j.setAlpha(f);
                if (findViewById != null) {
                    findViewById.setVisibility(4);
                }
                if (z2) {
                    View view2 = this.f292450h;
                    C105078o.m174320b(view2, new C105073j(view2, this.f292453k, this.f292454l));
                    this.f292452j.animate().setStartDelay(100).alpha(f).setDuration(100).setListener(new C104954by(this)).start();
                } else {
                    this.f292450h.setVisibility(0);
                    this.f292452j.setAlpha(f);
                }
                this.f292451i.setClickable(false);
            } else {
                this.f292456n.setImageResource(R.drawable.quantum_ic_not_interested_black_48);
                i = resources.getColor(R.color.toggle_unchecked_text);
                m174004i(this.f292445c.f28425f, (String) null);
                str2 = this.f292445c.f28425f;
                m174002g(this.f292452j, m174003h(resources.getColor(R.color.toggle_unchecked_bg), this.f292461s));
                this.f292452j.setAlpha(0.7f);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
                if (z2) {
                    C91104c.m148854c(this.f292450h);
                } else {
                    this.f292450h.setVisibility(0);
                }
            }
            str = str2;
            this.f292449g.setVisibility(4);
            this.f292456n.getDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
        if (z) {
            this.f292447e.announceForAccessibility(str);
        }
    }
}
