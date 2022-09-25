package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33257p;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52476td;
import com.google.assistant.p3897e.p3921j.C52477te;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52506ug;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ChipCarouselField */
/* compiled from: PG */
public final class ChipCarouselField extends LinearLayout implements C33177b, C33257p {

    /* renamed from: a */
    public static final C59071e f89040a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ChipCarouselField");

    /* renamed from: b */
    public C50954az f89041b = null;

    /* renamed from: c */
    public int f89042c = -1;

    /* renamed from: d */
    public C50954az f89043d = null;

    /* renamed from: e */
    public int f89044e = -1;

    /* renamed from: f */
    public C50954az f89045f = null;

    /* renamed from: g */
    public int f89046g = -1;

    /* renamed from: h */
    public C51941eu f89047h;

    /* renamed from: i */
    public C33182g f89048i;

    /* renamed from: j */
    public C32942a f89049j;

    /* renamed from: k */
    public Fragment f89050k;

    /* renamed from: l */
    private LinearLayout f89051l = null;

    /* renamed from: m */
    private TextView f89052m = null;

    public ChipCarouselField(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo38636a(String str, Optional optional) {
        if (this.f89047h == null || this.f89048i == null || this.f89049j == null || this.f89045f == null || this.f89046g < 0 || optional.isEmpty()) {
            ((C59052c) ((C59052c) f89040a.mo56226d()).mo56372aa(51025)).mo56386p("Failed to handle onRecurrenceSet due to invalid args");
            return;
        }
        C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
        String str2 = this.f89047h.f136279g;
        tpVar.copyOnWrite();
        C52490tr trVar = (C52490tr) tpVar.instance;
        str2.getClass();
        trVar.f137797a |= 1;
        trVar.f137800d = str2;
        String str3 = this.f89047h.f136280h;
        tpVar.copyOnWrite();
        C52490tr trVar2 = (C52490tr) tpVar.instance;
        str3.getClass();
        trVar2.f137797a |= 2;
        trVar2.f137801e = str3;
        tpVar.copyOnWrite();
        C52490tr trVar3 = (C52490tr) tpVar.instance;
        trVar3.f137797a |= 4;
        trVar3.f137802f = true;
        C52476td tdVar = (C52476td) C52477te.f137748h.createBuilder();
        int i = this.f89046g;
        tdVar.copyOnWrite();
        C52477te teVar = (C52477te) tdVar.instance;
        teVar.f137750a |= 1;
        teVar.f137753d = (long) i;
        tdVar.copyOnWrite();
        C52477te teVar2 = (C52477te) tdVar.instance;
        teVar2.f137750a |= 2;
        teVar2.f137754e = true;
        C52397qf qfVar = (C52397qf) optional.get();
        tdVar.copyOnWrite();
        C52477te teVar3 = (C52477te) tdVar.instance;
        qfVar.getClass();
        teVar3.f137752c = qfVar;
        teVar3.f137751b = 6;
        tdVar.copyOnWrite();
        C52477te teVar4 = (C52477te) tdVar.instance;
        str.getClass();
        teVar4.f137750a |= 64;
        teVar4.f137756g = str;
        tpVar.copyOnWrite();
        C52490tr trVar4 = (C52490tr) tpVar.instance;
        C52477te teVar5 = (C52477te) tdVar.build();
        teVar5.getClass();
        trVar4.f137799c = teVar5;
        trVar4.f137798b = 16;
        C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
        C51953ff a = this.f89048i.mo38576a();
        tsVar.copyOnWrite();
        C52492tt ttVar = (C52492tt) tsVar.instance;
        a.getClass();
        ttVar.f137806b = a;
        ttVar.f137805a |= 1;
        C52506ug ugVar = (C52506ug) C52507uh.f137838b.createBuilder();
        ugVar.mo53877a((C52490tr) tpVar.build());
        tsVar.copyOnWrite();
        C52492tt ttVar2 = (C52492tt) tsVar.instance;
        C52507uh uhVar = (C52507uh) ugVar.build();
        uhVar.getClass();
        ttVar2.f137807c = uhVar;
        ttVar2.f137805a |= 2;
        C52492tt ttVar3 = (C52492tt) tsVar.build();
        C32942a aVar = this.f89049j;
        C51016dg dgVar = this.f89045f.f132646f;
        if (dgVar == null) {
            dgVar = C51016dg.f132827g;
        }
        aVar.mo38364a("FA Chip RecurSet", ttVar3, dgVar);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo38561b(C33176f fVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo38562c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo38563d(boolean z) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0361 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0207  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38564e(com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e r17) {
        /*
            r16 = this;
            r0 = r16
            com.google.assistant.e.j.e.eu r1 = r0.f89047h
            if (r1 == 0) goto L_0x0382
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r2 = r0.f89048i
            if (r2 == 0) goto L_0x0382
            android.widget.LinearLayout r2 = r0.f89051l
            if (r2 == 0) goto L_0x0382
            android.widget.TextView r2 = r0.f89052m
            if (r2 != 0) goto L_0x0014
            goto L_0x0382
        L_0x0014:
            r2 = r17
            com.google.assistant.e.j.e.eu r2 = r2.f88747a
            if (r2 == 0) goto L_0x0027
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0027
            r0.f89047h = r2
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r1 = r0.f89048i
            r1.mo38581f(r2)
        L_0x0027:
            android.widget.LinearLayout r1 = r0.f89051l
            r1.removeAllViews()
            com.google.assistant.e.j.e.eu r1 = r0.f89047h
            int r2 = r1.f136277e
            r3 = 33
            if (r2 != r3) goto L_0x0039
            java.lang.Object r1 = r1.f136278f
            com.google.assistant.e.c.c.bd r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r1
            goto L_0x003b
        L_0x0039:
            com.google.assistant.e.c.c.bd r1 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
        L_0x003b:
            r2 = 0
            r3 = 0
        L_0x003d:
            com.google.protobuf.cq r4 = r1.f132660b
            int r4 = r4.size()
            r5 = 1
            r6 = 2
            if (r3 >= r4) goto L_0x0365
            com.google.protobuf.cq r4 = r1.f132660b
            java.lang.Object r4 = r4.get(r3)
            com.google.assistant.e.c.c.az r4 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r4
            int r7 = r4.f132649i
            com.google.assistant.e.c.c.aw r7 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r7)
            if (r7 != 0) goto L_0x0059
            com.google.assistant.e.c.c.aw r7 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x0059:
            com.google.assistant.e.c.c.aw r8 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIDDEN
            if (r7 != r8) goto L_0x005f
            goto L_0x0361
        L_0x005f:
            android.content.Context r7 = r16.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r8 = 2131624911(0x7f0e03cf, float:1.8877015E38)
            r9 = 0
            android.view.View r7 = r7.inflate(r8, r9)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ChipComponent r7 = (com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ChipComponent) r7
            int r8 = r4.f132641a
            r8 = r8 & r6
            r10 = 3
            r11 = 4
            if (r8 == 0) goto L_0x0079
            goto L_0x00e2
        L_0x0079:
            int r8 = r4.f132642b
            if (r8 != r10) goto L_0x0090
            java.lang.Object r8 = r4.f132643c
            com.google.assistant.e.j.qb r8 = (com.google.assistant.p3897e.p3921j.C52393qb) r8
            int r12 = r8.f137482b
            int r13 = r8.f137483c
            int r8 = r8.f137484d
            java.util.Locale r14 = java.util.Locale.getDefault()
            java.lang.String r8 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33233k.m61641g(r12, r13, r8, r14)
            goto L_0x00df
        L_0x0090:
            if (r8 != r11) goto L_0x00a3
            java.lang.Object r8 = r4.f132643c
            com.google.assistant.e.j.ql r8 = (com.google.assistant.p3897e.p3921j.C52403ql) r8
            int r12 = r8.f137515b
            int r8 = r8.f137516c
            java.util.Locale r13 = java.util.Locale.getDefault()
            java.lang.String r8 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33233k.m61640f(r12, r8, r13)
            goto L_0x00df
        L_0x00a3:
            r12 = 6
            if (r8 != r12) goto L_0x00cf
            java.lang.Object r8 = r4.f132643c
            com.google.assistant.e.j.qf r8 = (com.google.assistant.p3897e.p3921j.C52397qf) r8
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r8)
            j$.util.Optional r8 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33232j.m61630d(r8)
            boolean r12 = r8.isPresent()
            if (r12 == 0) goto L_0x00dd
            java.lang.Object r8 = r8.get()
            com.android.b.s r8 = (com.android.p256b.C5033s) r8
            java.lang.String r8 = r8.toString()
            android.content.Context r12 = r16.getContext()
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r8 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33232j.m61633g(r8, r12)
            goto L_0x00df
        L_0x00cf:
            com.google.common.f.e r8 = f89040a
            com.google.common.f.x r8 = r8.mo56226d()
            java.lang.String r12 = "Chip missing display text and chip value: %s."
            r13 = 51016(0xc748, float:7.1489E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r13)).mo56389s(r12, r4)
        L_0x00dd:
            java.lang.String r8 = ""
        L_0x00df:
            r7.mo38644b(r8)
        L_0x00e2:
            com.google.assistant.e.c.c.dc r8 = r4.f132644d
            if (r8 != 0) goto L_0x00e8
            com.google.assistant.e.c.c.dc r8 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x00e8:
            int r8 = r8.f132815a
            r8 = r8 & r6
            r12 = 8
            if (r8 == 0) goto L_0x010b
            com.google.assistant.e.c.c.dc r8 = r4.f132644d
            if (r8 != 0) goto L_0x00f5
            com.google.assistant.e.c.c.dc r8 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x00f5:
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ImageComponent r13 = r7.f88948f
            if (r13 == 0) goto L_0x011b
            android.widget.LinearLayout r14 = r7.f88947e
            if (r14 == 0) goto L_0x011b
            r13.setVisibility(r2)
            android.widget.LinearLayout r13 = r7.f88947e
            r13.setVisibility(r2)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ImageComponent r13 = r7.f88948f
            r13.mo38649b(r8, r9)
            goto L_0x011b
        L_0x010b:
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ImageComponent r8 = r7.f88948f
            r8.getClass()
            r8.setVisibility(r12)
            android.widget.LinearLayout r8 = r7.f88947e
            r8.getClass()
            r8.setVisibility(r12)
        L_0x011b:
            android.content.Context r8 = r7.getContext()
            r9 = 2130969124(0x7f040224, float:1.7546921E38)
            int r8 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r8, r9)
            int r9 = r4.f132649i
            com.google.assistant.e.c.c.aw r9 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r9)
            if (r9 != 0) goto L_0x0130
            com.google.assistant.e.c.c.aw r9 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x0130:
            int r9 = r9.ordinal()
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r9 == r5) goto L_0x0152
            if (r9 == r6) goto L_0x0146
            if (r9 == r11) goto L_0x013d
            goto L_0x015d
        L_0x013d:
            android.content.Context r9 = r7.getContext()
            float r13 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33234l.m61651i(r9)
            goto L_0x015d
        L_0x0146:
            android.content.Context r8 = r7.getContext()
            r9 = 2130969101(0x7f04020d, float:1.7546874E38)
            int r8 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r8, r9)
            goto L_0x015d
        L_0x0152:
            android.content.Context r8 = r7.getContext()
            r9 = 2130969119(0x7f04021f, float:1.754691E38)
            int r8 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r8, r9)
        L_0x015d:
            android.widget.TextView r9 = r7.f88949g
            r9.getClass()
            r9.setTextColor(r8)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ImageComponent r9 = r7.f88948f
            r9.getClass()
            r9.mo38650c(r8)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ImageComponent r9 = r7.f88951i
            r9.getClass()
            r9.mo38650c(r8)
            android.widget.TextView r8 = r7.f88949g
            r8.getClass()
            r8.setAlpha(r13)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ImageComponent r8 = r7.f88948f
            r8.getClass()
            r8.setAlpha(r13)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ImageComponent r8 = r7.f88951i
            r8.getClass()
            r8.setAlpha(r13)
            int r8 = r4.f132641a
            r8 = r8 & r6
            if (r8 == 0) goto L_0x0197
            java.lang.String r8 = r4.f132645e
            r7.mo38644b(r8)
        L_0x0197:
            com.google.assistant.e.c.c.dg r8 = r4.f132648h
            if (r8 != 0) goto L_0x019d
            com.google.assistant.e.c.c.dg r8 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x019d:
            com.google.assistant.e.c.c.dc r8 = r8.f132834f
            if (r8 != 0) goto L_0x01a3
            com.google.assistant.e.c.c.dc r8 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x01a3:
            int r8 = r8.f132815a
            r8 = r8 & r6
            if (r8 == 0) goto L_0x01b8
            com.google.assistant.e.c.c.dg r8 = r4.f132648h
            if (r8 != 0) goto L_0x01ae
            com.google.assistant.e.c.c.dg r8 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x01ae:
            com.google.assistant.e.c.c.dc r8 = r8.f132834f
            if (r8 != 0) goto L_0x01b4
            com.google.assistant.e.c.c.dc r8 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x01b4:
            r7.mo38643a(r8)
            goto L_0x01da
        L_0x01b8:
            com.google.assistant.e.c.c.dc r8 = r4.f132647g
            if (r8 != 0) goto L_0x01bf
            com.google.assistant.e.c.c.dc r9 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            goto L_0x01c0
        L_0x01bf:
            r9 = r8
        L_0x01c0:
            int r9 = r9.f132815a
            r9 = r9 & r6
            if (r9 == 0) goto L_0x01ca
            if (r8 != 0) goto L_0x01b4
            com.google.assistant.e.c.c.dc r8 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            goto L_0x01b4
        L_0x01ca:
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ImageComponent r8 = r7.f88951i
            r8.getClass()
            r8.setVisibility(r12)
            android.widget.LinearLayout r8 = r7.f88950h
            r8.getClass()
            r8.setVisibility(r12)
        L_0x01da:
            int r8 = r4.f132651k
            int r8 = com.google.assistant.p3897e.p3902c.p3907c.C50953ay.m85990a(r8)
            if (r8 != 0) goto L_0x01e3
            goto L_0x0215
        L_0x01e3:
            if (r8 != r10) goto L_0x0215
            android.widget.LinearLayout r8 = r7.f88945c
            if (r8 == 0) goto L_0x0215
            android.content.Context r8 = r7.getContext()
            android.content.Context r9 = r7.getContext()
            r10 = 2130969557(0x7f0403d5, float:1.75478E38)
            r12 = 2131231971(0x7f0804e3, float:1.8080038E38)
            int r9 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33234l.m61646d(r9, r10, r12)
            android.graphics.drawable.Drawable r8 = androidx.core.content.C1877c.m5125a(r8, r9)
            if (r8 == 0) goto L_0x0207
            android.widget.LinearLayout r9 = r7.f88945c
            r9.setBackgroundDrawable(r8)
            goto L_0x0215
        L_0x0207:
            com.google.common.f.e r8 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ChipComponent.f88943a
            com.google.common.f.x r8 = r8.mo56226d()
            java.lang.String r9 = "Unable to get Drawable for the oval chip background."
            r10 = 50977(0xc721, float:7.1434E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r10)).mo56386p(r9)
        L_0x0215:
            android.widget.TextView r8 = r7.f88949g
            r8.getClass()
            android.content.Context r9 = r7.getContext()
            android.content.res.Resources r9 = r9.getResources()
            int r10 = r4.f132641a
            r10 = r10 & r5
            r13 = 2131167657(0x7f0709a9, float:1.7949594E38)
            if (r5 == r10) goto L_0x022e
            r10 = 2131167655(0x7f0709a7, float:1.794959E38)
            goto L_0x0231
        L_0x022e:
            r10 = 2131167657(0x7f0709a9, float:1.7949594E38)
        L_0x0231:
            int r9 = r9.getDimensionPixelSize(r10)
            android.content.Context r10 = r7.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r14 = 2131167656(0x7f0709a8, float:1.7949592E38)
            int r10 = r10.getDimensionPixelSize(r14)
            android.content.Context r15 = r7.getContext()
            android.content.res.Resources r15 = r15.getResources()
            int r12 = r4.f132641a
            r12 = r12 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x0256
        L_0x0252:
            r12 = 2131167657(0x7f0709a9, float:1.7949594E38)
            goto L_0x0266
        L_0x0256:
            com.google.assistant.e.c.c.dg r12 = r4.f132648h
            if (r12 != 0) goto L_0x025c
            com.google.assistant.e.c.c.dg r12 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x025c:
            int r12 = r12.f132829a
            r12 = r12 & 32
            if (r12 == 0) goto L_0x0263
            goto L_0x0252
        L_0x0263:
            r12 = 2131167655(0x7f0709a7, float:1.794959E38)
        L_0x0266:
            int r12 = r15.getDimensionPixelSize(r12)
            android.content.Context r13 = r7.getContext()
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getDimensionPixelSize(r14)
            r8.setPadding(r9, r10, r12, r13)
            android.content.Context r8 = r7.getContext()
            r9 = 2130969175(0x7f040257, float:1.7547024E38)
            int r8 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r8, r9)
            android.content.Context r9 = r7.getContext()
            r10 = 2130969144(0x7f040238, float:1.7546962E38)
            int r9 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r9, r10)
            android.content.res.Resources r12 = r7.getResources()
            android.content.Context r13 = r7.getContext()
            android.content.res.Resources$Theme r13 = r13.getTheme()
            r14 = 17170445(0x106000d, float:2.461195E-38)
            int r12 = r12.getColor(r14, r13)
            android.content.Context r13 = r7.getContext()
            int r10 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r13, r10)
            int r13 = r4.f132649i
            com.google.assistant.e.c.c.aw r13 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r13)
            if (r13 != 0) goto L_0x02b4
            com.google.assistant.e.c.c.aw r13 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x02b4:
            int r13 = r13.ordinal()
            if (r13 == r5) goto L_0x02dc
            if (r13 == r6) goto L_0x02d0
            if (r13 == r11) goto L_0x02bf
            goto L_0x02e8
        L_0x02bf:
            android.content.res.Resources r8 = r7.getResources()
            android.content.Context r11 = r7.getContext()
            android.content.res.Resources$Theme r11 = r11.getTheme()
            int r8 = r8.getColor(r14, r11)
            goto L_0x02e8
        L_0x02d0:
            android.content.Context r6 = r7.getContext()
            r11 = 2130969082(0x7f0401fa, float:1.7546836E38)
            int r12 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r6, r11)
            goto L_0x02e7
        L_0x02dc:
            android.content.Context r6 = r7.getContext()
            r11 = 2130969163(0x7f04024b, float:1.7547E38)
            int r12 = com.google.android.libraries.assistant.p1614t.C19391a.m36980a(r6, r11)
        L_0x02e7:
            r6 = 0
        L_0x02e8:
            android.widget.LinearLayout r11 = r7.f88945c
            r11.getClass()
            android.graphics.drawable.Drawable r11 = r11.getBackground()
            android.graphics.drawable.StateListDrawable r11 = (android.graphics.drawable.StateListDrawable) r11
            android.graphics.drawable.Drawable$ConstantState r11 = r11.getConstantState()
            android.graphics.drawable.DrawableContainer$DrawableContainerState r11 = (android.graphics.drawable.DrawableContainer.DrawableContainerState) r11
            android.graphics.drawable.Drawable[] r11 = r11.getChildren()
            r13 = r11[r2]
            android.graphics.drawable.GradientDrawable r13 = (android.graphics.drawable.GradientDrawable) r13
            r5 = r11[r5]
            android.graphics.drawable.GradientDrawable r5 = (android.graphics.drawable.GradientDrawable) r5
            r13.setColor(r8)
            r13.setStroke(r6, r9)
            r5.setColor(r12)
            r5.setStroke(r6, r10)
            r7.f88944b = r3
            r7.setVisibility(r2)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.u r5 = new com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.u
            r5.<init>(r0, r7, r4)
            android.widget.LinearLayout r6 = r7.f88946d
            r6.getClass()
            r6.setOnClickListener(r5)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.v r5 = new com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.v
            r5.<init>(r0, r7, r4)
            android.widget.LinearLayout r4 = r7.f88950h
            r4.getClass()
            r4.setOnClickListener(r5)
            int r4 = android.view.View.generateViewId()
            r7.setId(r4)
            android.widget.LinearLayout r4 = r0.f89051l
            r4.addView(r7)
            com.google.protobuf.cq r4 = r1.f132660b
            int r4 = r4.size()
            int r4 = r4 + -1
            if (r3 == r4) goto L_0x0361
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            android.content.Context r5 = r16.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131167654(0x7f0709a6, float:1.7949588E38)
            int r5 = r5.getDimensionPixelSize(r6)
            r4.setMargins(r2, r2, r5, r2)
            r7.setLayoutParams(r4)
        L_0x0361:
            int r3 = r3 + 1
            goto L_0x003d
        L_0x0365:
            int r3 = r1.f132659a
            r3 = r3 & r5
            if (r3 == 0) goto L_0x0381
            int r3 = r1.f132662d
            int r3 = com.google.assistant.p3897e.p3902c.p3907c.C50958bc.m85994a(r3)
            if (r3 != 0) goto L_0x0373
            goto L_0x0381
        L_0x0373:
            if (r3 != r6) goto L_0x0381
            android.widget.TextView r3 = r0.f89052m
            r3.setVisibility(r2)
            android.widget.TextView r2 = r0.f89052m
            java.lang.String r1 = r1.f132661c
            r2.setText(r1)
        L_0x0381:
            return
        L_0x0382:
            com.google.common.f.e r1 = f89040a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Unable to update FormField UI due to invalid args"
            r3 = 51030(0xc756, float:7.1508E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields.ChipCarouselField.mo38564e(com.google.android.libraries.search.assistant.fluidactions.rendering.a.e):void");
    }

    /* renamed from: f */
    public final /* synthetic */ void mo38565f() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo38566g() {
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f89051l = (LinearLayout) findViewById(R.id.fa_chip_carousel_field_chip_container);
        this.f89052m = (TextView) findViewById(R.id.fa_chip_carousel_field_error_message);
    }

    public ChipCarouselField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChipCarouselField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ChipCarouselField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
