package com.google.android.libraries.home.p1948c.p1949a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.home.coreui.devicetile.C23655aa;
import com.google.android.libraries.home.coreui.devicetile.C23656ab;
import com.google.android.libraries.home.coreui.devicetile.C23657ac;
import com.google.android.libraries.home.coreui.devicetile.C23674at;
import com.google.android.libraries.home.coreui.devicetile.C23675au;
import com.google.android.libraries.home.coreui.devicetile.C23681b;
import com.google.android.libraries.home.coreui.devicetile.C23752n;
import com.google.android.libraries.home.p1940a.p1943c.C23404ag;
import kotlinx.coroutines.C71414ao;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.c.a.g */
/* compiled from: PG */
public final class C23625g {

    /* renamed from: a */
    public C23404ag f64634a;

    /* renamed from: b */
    public final ViewGroup f64635b;

    /* renamed from: c */
    final /* synthetic */ C23626h f64636c;

    /* renamed from: d */
    private final C23656ab f64637d;

    public C23625g(C23626h hVar, ViewGroup viewGroup, C23404ag agVar) {
        C69664n.m101061g(agVar, "device");
        this.f64636c = hVar;
        this.f64634a = agVar;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.controls_base_item_alternate, viewGroup, false);
        C69664n.m101059e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        this.f64635b = viewGroup2;
        C23675au auVar = hVar.f64641c;
        C23655aa aaVar = hVar.f64640b;
        C23657ac acVar = new C23657ac(viewGroup2);
        viewGroup2.getClass();
        C71414ao aoVar = (C71414ao) auVar.f64776a.mo17428b();
        aoVar.getClass();
        C23752n nVar = (C23752n) auVar.f64777b.mo17428b();
        nVar.getClass();
        C23681b bVar = (C23681b) auVar.f64778c.mo17428b();
        bVar.getClass();
        Optional optional = (Optional) auVar.f64779d.mo17428b();
        optional.getClass();
        this.f64637d = new C23674at(viewGroup2, aaVar, aoVar, nVar, bVar, optional, acVar);
        mo28941a(this.f64634a);
    }

    /* JADX WARNING: type inference failed for: r4v12, types: [android.view.ViewParent, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v9, types: [android.view.ViewParent, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28941a(com.google.android.libraries.home.p1940a.p1943c.C23404ag r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "device"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r2)
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "googlehome"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            java.lang.String r3 = "controller"
            android.net.Uri$Builder r2 = r2.authority(r3)
            java.lang.String r3 = "ha"
            android.net.Uri$Builder r2 = r2.path(r3)
            com.google.android.libraries.home.a.c.as r3 = r1.f63965a
            java.lang.String r3 = r3.f63989a
            java.lang.String r4 = "device_id"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r4, r3)
            android.net.Uri r2 = r2.build()
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.VIEW"
            r3.<init>(r4, r2)
            com.google.android.libraries.home.c.a.h r2 = r0.f64636c
            android.content.Context r2 = r2.f64639a
            r4 = 201326592(0xc000000, float:9.8607613E-32)
            r5 = 0
            android.app.PendingIntent r8 = com.google.android.libraries.p11029ao.p11030a.C147798a.m240895a(r2, r5, r3, r4)
            p5462h.p5473f.p5475b.C69664n.m101058d(r8)
            com.google.android.libraries.home.coreui.devicetile.model.Control r2 = new com.google.android.libraries.home.coreui.devicetile.model.Control
            com.google.android.libraries.home.a.c.as r3 = r1.f63965a
            java.lang.String r7 = r3.f63989a
            com.google.android.libraries.home.a.c.av r3 = r3.f63991c
            com.google.android.libraries.home.coreui.devicetile.model.v r9 = com.google.android.libraries.home.coreui.devicetile.model.C23743r.m44228a(r3)
            com.google.android.libraries.home.a.c.as r3 = r1.f63965a
            java.lang.String r10 = r3.f63990b
            java.lang.String r11 = ""
            com.google.android.libraries.home.coreui.devicetile.model.Control$NoZone r12 = com.google.android.libraries.home.coreui.devicetile.model.Control.NoZone.f64901a
            com.google.android.libraries.home.coreui.devicetile.model.k r13 = com.google.android.libraries.home.coreui.devicetile.model.C23736k.UNKNOWN
            com.google.android.libraries.home.coreui.devicetile.a.f r14 = com.google.android.libraries.home.coreui.devicetile.p1954a.C23644f.f64662a
            java.lang.String r15 = ""
            com.google.android.libraries.home.coreui.devicetile.model.i r16 = com.google.android.libraries.home.coreui.devicetile.model.C23734i.f64914a
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r3 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r3)
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r3)
            com.google.android.libraries.home.a.c.eu r4 = com.google.android.libraries.home.p1940a.p1943c.C23574eu.DEVICE_STATUS
            java.lang.Class<com.google.android.libraries.home.a.c.au> r6 = com.google.android.libraries.home.p1940a.p1943c.C23418au.class
            j$.util.Optional r4 = r1.mo28854a(r4, r6)
            java.lang.Object r4 = com.google.android.libraries.home.p1955d.p1956a.C23765a.m44264a(r4)
            com.google.android.libraries.home.a.c.er r4 = (com.google.android.libraries.home.p1940a.p1943c.C23571er) r4
            com.google.android.libraries.home.a.c.au r4 = (com.google.android.libraries.home.p1940a.p1943c.C23418au) r4
            r6 = 1
            if (r4 == 0) goto L_0x0089
            com.google.android.libraries.home.a.c.al r4 = r4.f64003d
            if (r4 == 0) goto L_0x0089
            boolean r7 = r4.f64495d
            if (r7 != r6) goto L_0x0089
            com.google.android.libraries.home.a.c.ak r4 = r4.f63977b
            goto L_0x008b
        L_0x0089:
            com.google.android.libraries.home.a.c.ak r4 = com.google.android.libraries.home.p1940a.p1943c.C23408ak.NONE
        L_0x008b:
            com.google.android.libraries.home.a.c.ak r7 = com.google.android.libraries.home.p1940a.p1943c.C23408ak.NONE
            r8 = 0
            if (r4 == r7) goto L_0x009c
            com.google.android.libraries.home.coreui.devicetile.model.k r4 = com.google.android.libraries.home.coreui.devicetile.model.C23736k.ERROR
            com.google.android.libraries.home.coreui.devicetile.a.e r7 = com.google.android.libraries.home.coreui.devicetile.p1954a.C23643e.f64661a
            r9 = 260607(0x3f9ff, float:3.65188E-40)
            com.google.android.libraries.home.coreui.devicetile.model.Control r2 = com.google.android.libraries.home.coreui.devicetile.model.Control.m44219a(r2, r4, r7, r8, r9)
            goto L_0x0102
        L_0x009c:
            java.util.Collection r4 = r18.mo28855b()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0102
            com.google.android.libraries.home.a.c.as r4 = r1.f63965a
            com.google.common.b.ij r4 = r4.f63993e
            java.lang.String r7 = "traits"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r7)
            java.util.Set r4 = p5462h.p5463a.C69540x.m100846ab(r4)
            com.google.android.libraries.home.a.c.eu r7 = com.google.android.libraries.home.p1940a.p1943c.C23574eu.BRIGHTNESS
            boolean r7 = r4.contains(r7)
            if (r7 == 0) goto L_0x00c6
            com.google.android.libraries.home.a.c.eu r7 = com.google.android.libraries.home.p1940a.p1943c.C23574eu.ON_OFF
            boolean r7 = r4.contains(r7)
            if (r7 == 0) goto L_0x00c6
            com.google.android.libraries.home.c.a.b r4 = com.google.android.libraries.home.p1948c.p1949a.C23620b.f64632a
            goto L_0x00e9
        L_0x00c6:
            com.google.android.libraries.home.a.c.eu r7 = com.google.android.libraries.home.p1940a.p1943c.C23574eu.BRIGHTNESS
            boolean r7 = r4.contains(r7)
            if (r7 == 0) goto L_0x00d1
            com.google.android.libraries.home.c.a.a r4 = com.google.android.libraries.home.p1948c.p1949a.C23619a.f64631a
            goto L_0x00e9
        L_0x00d1:
            com.google.android.libraries.home.a.c.eu r7 = com.google.android.libraries.home.p1940a.p1943c.C23574eu.ON_OFF
            boolean r7 = r4.contains(r7)
            if (r7 == 0) goto L_0x00dc
            com.google.android.libraries.home.c.a.m r4 = com.google.android.libraries.home.p1948c.p1949a.C23631m.f64651a
            goto L_0x00e9
        L_0x00dc:
            com.google.android.libraries.home.a.c.eu r7 = com.google.android.libraries.home.p1940a.p1943c.C23574eu.TEMPERATURE_SETTING
            boolean r4 = r4.contains(r7)
            if (r4 == 0) goto L_0x00e7
            com.google.android.libraries.home.c.a.n r4 = com.google.android.libraries.home.p1948c.p1949a.C23632n.f64652a
            goto L_0x00e9
        L_0x00e7:
            com.google.android.libraries.home.c.a.j r4 = com.google.android.libraries.home.p1948c.p1949a.C23628j.f64650a
        L_0x00e9:
            com.google.android.libraries.home.coreui.devicetile.model.k r7 = com.google.android.libraries.home.coreui.devicetile.model.C23736k.OK
            com.google.android.libraries.home.c.a.h r9 = r0.f64636c
            android.content.Context r9 = r9.f64639a
            java.lang.CharSequence r9 = r4.mo28940b(r9, r1)
            com.google.android.libraries.home.c.a.h r10 = r0.f64636c
            android.content.Context r10 = r10.f64639a
            com.google.android.libraries.home.coreui.devicetile.a.d r4 = r4.mo28939a(r10, r1)
            r10 = 258559(0x3f1ff, float:3.62318E-40)
            com.google.android.libraries.home.coreui.devicetile.model.Control r2 = com.google.android.libraries.home.coreui.devicetile.model.Control.m44219a(r2, r7, r4, r9, r10)
        L_0x0102:
            com.google.android.libraries.home.coreui.devicetile.ab r4 = r0.f64637d
            com.google.android.libraries.home.coreui.devicetile.at r4 = (com.google.android.libraries.home.coreui.devicetile.C23674at) r4
            boolean r7 = r4.f64737A
            if (r7 == 0) goto L_0x010c
            goto L_0x0384
        L_0x010c:
            com.google.android.libraries.home.coreui.devicetile.model.Control r7 = r4.f64760k
            if (r7 == 0) goto L_0x0120
            com.google.android.libraries.home.coreui.devicetile.model.Control r7 = r4.mo29001a()
            java.lang.String r7 = r7.f64883a
            java.lang.String r9 = r2.f64883a
            boolean r7 = p5462h.p5473f.p5475b.C69664n.m101066l(r7, r9)
            r4.f64739C = r7
            r4.f64738B = r7
        L_0x0120:
            com.google.android.libraries.home.coreui.devicetile.z r7 = r4.f64746J
            com.google.android.libraries.home.coreui.devicetile.model.j r9 = r2.f64891i
            com.google.android.libraries.home.coreui.devicetile.model.j r10 = r7.f65132b
            boolean r10 = p5462h.p5473f.p5475b.C69664n.m101066l(r10, r9)
            if (r10 != 0) goto L_0x01ba
            r7.f65132b = r9
            com.google.android.libraries.home.coreui.devicetile.ax r9 = r7.f65133c
            if (r9 == 0) goto L_0x0149
            com.google.android.libraries.home.coreui.devicetile.bc r10 = r9.f64782b
            if (r10 == 0) goto L_0x0149
            androidx.constraintlayout.widget.ConstraintLayout r11 = r9.f64781a
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            int r12 = r10.f64786a
            r11.width = r12
            int r10 = r10.f64787b
            r11.height = r10
            androidx.constraintlayout.widget.ConstraintLayout r9 = r9.f64781a
            r9.requestLayout()
        L_0x0149:
            com.google.android.libraries.home.coreui.devicetile.ax r9 = new com.google.android.libraries.home.coreui.devicetile.ax
            android.view.View r10 = r7.f65131a
            r9.<init>(r10)
            androidx.constraintlayout.widget.ConstraintLayout r10 = r9.f64781a
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            com.google.android.libraries.home.coreui.devicetile.bc r11 = new com.google.android.libraries.home.coreui.devicetile.bc
            int r12 = r10.width
            int r10 = r10.height
            r11.<init>(r12, r10)
            r9.f64782b = r11
            androidx.constraintlayout.widget.ConstraintLayout r10 = r9.f64781a
            android.content.Context r10 = r10.getContext()
            java.lang.String r11 = "parent.context"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r3)
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r11 = r10.getTheme()
            r12 = 2130969276(0x7f0402bc, float:1.754723E38)
            r11.resolveAttribute(r12, r3, r6)
            android.content.res.Resources r10 = r10.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r3 = r3.getDimension(r10)
            androidx.constraintlayout.widget.ConstraintLayout r10 = r9.f64781a
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources r10 = r10.getResources()
            android.content.res.Configuration r10 = r10.getConfiguration()
            float r10 = r10.fontScale
            r11 = 1065353216(0x3f800000, float:1.0)
            float r10 = java.lang.Math.max(r10, r11)
            float r3 = r3 * r10
            int r3 = (int) r3
            androidx.constraintlayout.widget.ConstraintLayout r10 = r9.f64781a
            int r10 = r10.getHeight()
            if (r3 == r10) goto L_0x01b8
            androidx.constraintlayout.widget.ConstraintLayout r10 = r9.f64781a
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            r10.height = r3
            androidx.constraintlayout.widget.ConstraintLayout r3 = r9.f64781a
            r3.requestLayout()
        L_0x01b8:
            r7.f65133c = r9
        L_0x01ba:
            r4.f64760k = r2
            android.widget.TextView r3 = r4.f64766q
            java.lang.CharSequence r7 = r2.f64886d
            r3.setText(r7)
            android.widget.TextView r3 = r4.f64766q
            android.content.Context r7 = r4.f64764o
            r9 = 2130969287(0x7f0402c7, float:1.7547252E38)
            int r7 = com.google.android.libraries.home.coreui.p1953c.C23636a.m44118a(r7, r9)
            r3.setTextColor(r7)
            android.widget.TextView r3 = r4.f64767r
            android.content.Context r7 = r4.f64764o
            r9 = 2130969288(0x7f0402c8, float:1.7547254E38)
            int r7 = com.google.android.libraries.home.coreui.p1953c.C23636a.m44118a(r7, r9)
            r3.setTextColor(r7)
            android.widget.TextView r3 = r4.f64767r
            java.lang.CharSequence r7 = r2.f64887e
            r3.setText(r7)
            android.widget.TextView r3 = r4.f64766q
            java.lang.CharSequence r7 = r2.f64886d
            boolean r7 = p5462h.p5483m.C69764m.m101229h(r7)
            r9 = 8
            if (r6 == r7) goto L_0x01f4
            r7 = 0
            goto L_0x01f6
        L_0x01f4:
            r7 = 8
        L_0x01f6:
            r3.setVisibility(r7)
            android.content.Context r3 = r4.f64764o
            android.content.res.Resources r3 = r3.getResources()
            r7 = 2131034123(0x7f05000b, float:1.7678755E38)
            boolean r3 = r3.getBoolean(r7)
            if (r3 == 0) goto L_0x021c
            java.lang.CharSequence r2 = r2.f64887e
            boolean r2 = p5462h.p5483m.C69764m.m101229h(r2)
            if (r2 == 0) goto L_0x021c
            android.widget.TextView r2 = r4.f64766q
            r3 = 2
            r2.setMaxLines(r3)
            android.widget.TextView r2 = r4.f64767r
            r2.setVisibility(r9)
            goto L_0x0239
        L_0x021c:
            android.widget.TextView r2 = r4.f64766q
            r2.setMaxLines(r6)
            android.widget.TextView r2 = r4.f64767r
            java.lang.CharSequence r3 = r2.getText()
            java.lang.String r7 = "subtitle.text"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r7)
            boolean r3 = p5462h.p5483m.C69764m.m101229h(r3)
            if (r6 == r3) goto L_0x0234
            r3 = 0
            goto L_0x0236
        L_0x0234:
            r3 = 8
        L_0x0236:
            r2.setVisibility(r3)
        L_0x0239:
            android.widget.ImageView r2 = r4.f64772w
            java.lang.String r3 = "null cannot be cast to non-null type android.view.View"
            if (r2 != 0) goto L_0x0240
            goto L_0x0271
        L_0x0240:
            r4.mo29001a()
            android.widget.ImageView r2 = r4.f64772w
            r2.setVisibility(r9)
            android.widget.ImageView r2 = r4.f64772w
            r2.setOnClickListener(r8)
            android.widget.ImageView r2 = r4.f64772w
            android.view.ViewParent r2 = r2.getParent()
            p5462h.p5473f.p5475b.C69664n.m101059e(r2, r3)
            android.view.View r2 = (android.view.View) r2
            android.view.TouchDelegate r7 = r2.getTouchDelegate()
            if (r7 != 0) goto L_0x0269
            android.widget.ImageView r7 = r4.f64772w
            int r10 = r4.f64747K
            android.view.TouchDelegate r7 = com.google.android.libraries.home.coreui.devicetile.C23674at.m44154m(r7, r10, r10)
            r2.setTouchDelegate(r7)
        L_0x0269:
            android.widget.ImageView r2 = r4.f64772w
            r4.mo29001a()
            r2.setImageIcon(r8)
        L_0x0271:
            r4.mo29001a()
            android.view.View r2 = r4.f64773x
            boolean r7 = r2 instanceof android.widget.Button
            if (r7 == 0) goto L_0x02b5
            android.widget.Button r2 = (android.widget.Button) r2
            r2.setText(r8)
            boolean r7 = r2 instanceof com.google.android.libraries.home.coreui.p1950a.C23634a
            if (r7 != 0) goto L_0x02b2
            boolean r7 = r2 instanceof com.google.android.material.button.MaterialButton
            if (r7 == 0) goto L_0x028e
            r7 = r2
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r7.mo28945lq(r8)
            goto L_0x0298
        L_0x028e:
            boolean r7 = r2 instanceof com.google.android.material.chip.Chip
            if (r7 == 0) goto L_0x0298
            r7 = r2
            com.google.android.material.chip.Chip r7 = (com.google.android.material.chip.Chip) r7
            r7.mo47694q(r8)
        L_0x0298:
            android.content.Context r7 = r2.getContext()
            java.lang.String r10 = "context"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r10)
            r10 = 16843868(0x101045c, float:2.3696686E-38)
            int r7 = com.google.android.libraries.home.coreui.p1953c.C23636a.m44118a(r7, r10)
            r2.setBackgroundColor(r7)
            r2.setEnabled(r5)
            r2.setVisibility(r9)
            goto L_0x02b5
        L_0x02b2:
            com.google.android.libraries.home.coreui.a.a r2 = (com.google.android.libraries.home.coreui.p1950a.C23634a) r2
            throw r8
        L_0x02b5:
            android.view.View r2 = r4.f64773x
            if (r2 == 0) goto L_0x02c5
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x02c5
            com.google.android.libraries.home.coreui.devicetile.as r2 = new com.google.android.libraries.home.coreui.devicetile.as
            r2.<init>(r4)
            goto L_0x02c6
        L_0x02c5:
            r2 = r8
        L_0x02c6:
            android.view.View r7 = r4.f64773x
            if (r7 == 0) goto L_0x02cd
            r7.setOnClickListener(r2)
        L_0x02cd:
            androidx.constraintlayout.widget.ConstraintLayout r2 = r4.f64761l
            r2.setClickable(r6)
            androidx.constraintlayout.widget.ConstraintLayout r2 = r4.f64761l
            com.google.android.libraries.home.coreui.devicetile.ak r6 = new com.google.android.libraries.home.coreui.devicetile.ak
            r6.<init>(r4)
            r2.setOnLongClickListener(r6)
            android.content.Context r2 = r4.f64764o
            android.content.res.Resources r2 = r2.getResources()
            r6 = 2131034179(0x7f050043, float:1.7678868E38)
            boolean r2 = r2.getBoolean(r6)
            if (r2 == 0) goto L_0x02f5
            androidx.constraintlayout.widget.ConstraintLayout r2 = r4.f64761l
            com.google.android.libraries.home.coreui.devicetile.al r6 = new com.google.android.libraries.home.coreui.devicetile.al
            r6.<init>(r4)
            r2.setOnFocusChangeListener(r6)
        L_0x02f5:
            com.google.android.libraries.home.coreui.devicetile.model.Control r2 = r4.mo29001a()
            com.google.android.libraries.home.coreui.devicetile.a.d r2 = r2.f64889g
            boolean r2 = r2.mo28977c()
            r4.f64775z = r2
            com.google.android.libraries.home.coreui.devicetile.a r2 = r4.f64742F
            com.google.android.libraries.home.coreui.devicetile.b r6 = r4.f64757h
            com.google.android.libraries.home.coreui.devicetile.model.Control r7 = r4.mo29001a()
            com.google.android.libraries.home.coreui.devicetile.model.k r7 = r7.f64888f
            com.google.android.libraries.home.coreui.devicetile.model.Control r9 = r4.mo29001a()
            com.google.android.libraries.home.coreui.devicetile.a.d r9 = r9.f64889g
            com.google.android.libraries.home.coreui.devicetile.model.v r10 = r4.mo29022g()
            com.google.android.libraries.home.coreui.devicetile.a r6 = r6.mo29027a(r2, r7, r9, r10)
            r4.mo29026k(r2, r6, r5)
            com.google.android.libraries.home.coreui.devicetile.a r2 = r4.f64742F
            boolean r2 = r2 instanceof com.google.android.libraries.home.coreui.devicetile.C23707bz
            if (r2 != 0) goto L_0x0330
            androidx.constraintlayout.widget.ConstraintLayout r2 = r4.f64761l
            android.content.Context r5 = r4.f64764o
            r6 = 2130772014(0x7f01002e, float:1.7147134E38)
            android.animation.StateListAnimator r5 = android.animation.AnimatorInflater.loadStateListAnimator(r5, r6)
            r2.setStateListAnimator(r5)
        L_0x0330:
            r4.mo29024i()
            r4.mo29023h()
            com.google.android.libraries.home.coreui.devicetile.cd r2 = new com.google.android.libraries.home.coreui.devicetile.cd
            android.view.ViewGroup r5 = r4.f64754e
            r2.<init>(r5)
            android.widget.ImageButton r5 = r4.f64771v
            if (r5 == 0) goto L_0x035e
            androidx.constraintlayout.widget.ConstraintLayout r6 = r4.f64761l
            int r5 = com.google.android.libraries.home.coreui.devicetile.C23674at.m44153l(r5, r6)
            android.widget.ImageButton r6 = r4.f64771v
            int r7 = r4.f64747K
            android.view.TouchDelegate r5 = com.google.android.libraries.home.coreui.devicetile.C23674at.m44154m(r6, r5, r7)
            r2.mo29060a(r5)
            android.widget.ImageButton r5 = r4.f64771v
            android.view.ViewParent r5 = r5.getParent()
            p5462h.p5473f.p5475b.C69664n.m101059e(r5, r3)
            r8 = r5
            android.view.View r8 = (android.view.View) r8
        L_0x035e:
            android.widget.ImageButton r5 = r4.f64770u
            if (r5 == 0) goto L_0x037f
            androidx.constraintlayout.widget.ConstraintLayout r6 = r4.f64761l
            int r5 = com.google.android.libraries.home.coreui.devicetile.C23674at.m44153l(r5, r6)
            android.widget.ImageButton r6 = r4.f64770u
            int r7 = r4.f64747K
            android.view.TouchDelegate r5 = com.google.android.libraries.home.coreui.devicetile.C23674at.m44154m(r6, r5, r7)
            r2.mo29060a(r5)
            android.widget.ImageButton r4 = r4.f64770u
            android.view.ViewParent r4 = r4.getParent()
            p5462h.p5473f.p5475b.C69664n.m101059e(r4, r3)
            r8 = r4
            android.view.View r8 = (android.view.View) r8
        L_0x037f:
            if (r8 == 0) goto L_0x0384
            r8.setTouchDelegate(r2)
        L_0x0384:
            r0.f64634a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.home.p1948c.p1949a.C23625g.mo28941a(com.google.android.libraries.home.a.c.ag):void");
    }
}
