package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.p636e.C11271a;
import com.google.android.libraries.assistant.assistantactions.p636e.C11278h;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11298f;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11316d;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11329q;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11332t;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52392qa;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52402qk;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.C52476td;
import com.google.assistant.p3897e.p3921j.C52477te;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4850an.p4853b.C63357a;
import com.google.protos.p4850an.p4853b.C63358b;
import com.google.protos.p4850an.p4853b.C63359c;
import com.google.protos.p4850an.p4853b.C63360d;
import com.google.protos.p4850an.p4853b.C63378v;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField */
/* compiled from: PG */
public class ChipCarouselField extends C11407n implements C11316d, C11332t, C11329q {

    /* renamed from: g */
    private static final C59071e f36939g = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ChipCarouselField");

    /* renamed from: a */
    public C50954az f36940a = null;

    /* renamed from: b */
    public int f36941b = -1;

    /* renamed from: c */
    public C50954az f36942c = null;

    /* renamed from: d */
    public int f36943d = -1;

    /* renamed from: e */
    public C50954az f36944e = null;

    /* renamed from: f */
    public int f36945f = -1;

    /* renamed from: h */
    private LinearLayout f36946h;

    /* renamed from: i */
    private TextView f36947i;

    public ChipCarouselField(Context context) {
        super(context);
    }

    /* renamed from: e */
    private static boolean m26995e(C50954az azVar) {
        if ((azVar.f132641a & 128) != 0) {
            C51016dg dgVar = azVar.f132646f;
            if (dgVar == null) {
                dgVar = C51016dg.f132827g;
            }
            if ((dgVar.f132829a & 8) != 0) {
                C51016dg dgVar2 = azVar.f132646f;
                if (dgVar2 == null) {
                    dgVar2 = C51016dg.f132827g;
                }
                C51805du duVar = dgVar2.f132833e;
                if (duVar == null) {
                    duVar = C51805du.f135924e;
                }
                if (!duVar.f135927b.equals("asst_input.INTENT_UPDATE")) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private static String m26996f(int i, int i2, Locale locale) {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        Calendar instance = Calendar.getInstance(timeZone);
        instance.set(0, 0, 0, i, i2);
        DateFormat timeInstance = DateFormat.getTimeInstance(3, locale);
        timeInstance.setTimeZone(timeZone);
        return timeInstance.format(instance.getTime());
    }

    /* renamed from: r */
    private static String m26997r(int i, int i2, int i3, Locale locale) {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        Calendar instance = Calendar.getInstance(timeZone);
        instance.set(1, i);
        instance.set(2, i2 - 1);
        instance.set(5, i3);
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        dateInstance.setTimeZone(timeZone);
        return dateInstance.format(instance.getTime());
    }

    /* renamed from: a */
    public final void mo19751a(int i, int i2, int i3) {
        if (this.f37153l != null && this.f37154m != null && this.f36940a != null && this.f36941b >= 0) {
            C52392qa qaVar = (C52392qa) C52393qb.f137479e.createBuilder();
            qaVar.copyOnWrite();
            C52393qb qbVar = (C52393qb) qaVar.instance;
            qbVar.f137481a |= 1;
            qbVar.f137482b = i;
            qaVar.copyOnWrite();
            C52393qb qbVar2 = (C52393qb) qaVar.instance;
            qbVar2.f137481a |= 2;
            qbVar2.f137483c = i2;
            qaVar.copyOnWrite();
            C52393qb qbVar3 = (C52393qb) qaVar.instance;
            qbVar3.f137481a |= 4;
            qbVar3.f137484d = i3;
            C52393qb qbVar4 = (C52393qb) qaVar.build();
            String r = m26997r(i, i2, i3, Locale.getDefault());
            C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
            String str = this.f37153l.f36729a.f136279g;
            tpVar.copyOnWrite();
            C52490tr trVar = (C52490tr) tpVar.instance;
            str.getClass();
            trVar.f137797a |= 1;
            trVar.f137800d = str;
            String str2 = this.f37153l.f36729a.f136280h;
            tpVar.copyOnWrite();
            C52490tr trVar2 = (C52490tr) tpVar.instance;
            str2.getClass();
            trVar2.f137797a |= 2;
            trVar2.f137801e = str2;
            tpVar.copyOnWrite();
            C52490tr trVar3 = (C52490tr) tpVar.instance;
            trVar3.f137797a |= 4;
            trVar3.f137802f = true;
            C52476td tdVar = (C52476td) C52477te.f137748h.createBuilder();
            int i4 = this.f36941b;
            tdVar.copyOnWrite();
            C52477te teVar = (C52477te) tdVar.instance;
            teVar.f137750a |= 1;
            teVar.f137753d = (long) i4;
            tdVar.copyOnWrite();
            C52477te teVar2 = (C52477te) tdVar.instance;
            teVar2.f137750a |= 2;
            teVar2.f137754e = true;
            tdVar.copyOnWrite();
            C52477te teVar3 = (C52477te) tdVar.instance;
            qbVar4.getClass();
            teVar3.f137752c = qbVar4;
            teVar3.f137751b = 4;
            tdVar.copyOnWrite();
            C52477te teVar4 = (C52477te) tdVar.instance;
            r.getClass();
            teVar4.f137750a |= 64;
            teVar4.f137756g = r;
            tpVar.copyOnWrite();
            C52490tr trVar4 = (C52490tr) tpVar.instance;
            C52477te teVar5 = (C52477te) tdVar.build();
            teVar5.getClass();
            trVar4.f137799c = teVar5;
            trVar4.f137798b = 16;
            C11295c cVar = this.f37153l;
            cVar.f36730b = (C52490tr) tpVar.build();
            C11298f a = this.f37154m.mo19691a(cVar);
            C50954az azVar = this.f36940a;
            if (azVar == null || (azVar.f132641a & 128) == 0) {
                mo19941h(a);
            } else if (m26995e(azVar)) {
                C50954az azVar2 = this.f36940a;
                azVar2.getClass();
                C51016dg dgVar = azVar2.f132646f;
                if (dgVar == null) {
                    dgVar = C51016dg.f132827g;
                }
                C51805du duVar = dgVar.f132833e;
                if (duVar == null) {
                    duVar = C51805du.f135924e;
                }
                C63359c cVar2 = (C63359c) C63360d.f171230f.createBuilder();
                C63357a aVar = (C63357a) C63358b.f171216l.createBuilder();
                int i5 = qbVar4.f137482b;
                aVar.copyOnWrite();
                C63358b bVar = (C63358b) aVar.instance;
                bVar.f171218a |= 1;
                bVar.f171219b = i5;
                int a2 = C63378v.m96231a(qbVar4.f137483c);
                aVar.copyOnWrite();
                C63358b bVar2 = (C63358b) aVar.instance;
                int i6 = a2 - 1;
                if (a2 != 0) {
                    bVar2.f171220c = i6;
                    bVar2.f171218a |= 2;
                    int i7 = qbVar4.f137484d;
                    aVar.copyOnWrite();
                    C63358b bVar3 = (C63358b) aVar.instance;
                    bVar3.f171218a |= 4;
                    bVar3.f171221d = i7;
                    cVar2.mo59207b((C63358b) aVar.build());
                    cVar2.copyOnWrite();
                    C63360d dVar = (C63360d) cVar2.instance;
                    dVar.f171236e = 1;
                    dVar.f171232a |= 64;
                    mo19943j(C11278h.m26771a(duVar, C11271a.m26757a((C63360d) cVar2.build())));
                    return;
                }
                throw null;
            } else {
                C51016dg dgVar2 = this.f36940a.f132646f;
                if (dgVar2 == null) {
                    dgVar2 = C51016dg.f132827g;
                }
                mo19942i(dgVar2, a);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01bc, code lost:
        if (r8 == 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0196, code lost:
        if (r8 == 0) goto L_0x0198;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0318 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x019d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19809b() {
        /*
            r16 = this;
            r0 = r16
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r1 = r0.f37153l
            if (r1 == 0) goto L_0x0338
            com.google.android.libraries.assistant.assistantactions.rendering.c.d r1 = r0.f37154m
            if (r1 != 0) goto L_0x000c
            goto L_0x0338
        L_0x000c:
            android.widget.LinearLayout r1 = r0.f36946h
            r1.removeAllViews()
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r1 = r0.f37153l
            com.google.assistant.e.j.e.eu r1 = r1.f36729a
            int r2 = r1.f136277e
            r3 = 33
            if (r2 != r3) goto L_0x0020
            java.lang.Object r1 = r1.f136278f
            com.google.assistant.e.c.c.bd r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r1
            goto L_0x0022
        L_0x0020:
            com.google.assistant.e.c.c.bd r1 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
        L_0x0022:
            r2 = 0
            r3 = 0
        L_0x0024:
            com.google.protobuf.cq r4 = r1.f132660b
            int r4 = r4.size()
            r5 = 2
            r6 = 1
            if (r3 >= r4) goto L_0x031c
            com.google.protobuf.cq r4 = r1.f132660b
            java.lang.Object r4 = r4.get(r3)
            com.google.assistant.e.c.c.az r4 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r4
            int r7 = r4.f132649i
            com.google.assistant.e.c.c.aw r7 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r7)
            if (r7 != 0) goto L_0x0040
            com.google.assistant.e.c.c.aw r7 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x0040:
            com.google.assistant.e.c.c.aw r8 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIDDEN
            if (r7 != r8) goto L_0x0046
            goto L_0x0318
        L_0x0046:
            android.content.Context r7 = r0.f37159r
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r8 = 2131624573(0x7f0e027d, float:1.887633E38)
            r9 = 0
            android.view.View r7 = r7.inflate(r8, r9)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ChipComponent r7 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ChipComponent) r7
            int r8 = r4.f132641a
            r8 = r8 & r5
            r9 = 3
            r10 = 4
            if (r8 == 0) goto L_0x005e
            goto L_0x00c5
        L_0x005e:
            int r8 = r4.f132642b
            if (r8 != r9) goto L_0x0075
            java.lang.Object r8 = r4.f132643c
            com.google.assistant.e.j.qb r8 = (com.google.assistant.p3897e.p3921j.C52393qb) r8
            int r11 = r8.f137482b
            int r12 = r8.f137483c
            int r8 = r8.f137484d
            java.util.Locale r13 = java.util.Locale.getDefault()
            java.lang.String r8 = m26997r(r11, r12, r8, r13)
            goto L_0x00c2
        L_0x0075:
            if (r8 != r10) goto L_0x0088
            java.lang.Object r8 = r4.f132643c
            com.google.assistant.e.j.ql r8 = (com.google.assistant.p3897e.p3921j.C52403ql) r8
            int r11 = r8.f137515b
            int r8 = r8.f137516c
            java.util.Locale r12 = java.util.Locale.getDefault()
            java.lang.String r8 = m26996f(r11, r8, r12)
            goto L_0x00c2
        L_0x0088:
            r11 = 6
            if (r8 != r11) goto L_0x00b2
            java.lang.Object r8 = r4.f132643c
            com.google.assistant.e.j.qf r8 = (com.google.assistant.p3897e.p3921j.C52397qf) r8
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r8)
            com.google.common.base.ax r8 = com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11306d.m26904d(r8)
            boolean r11 = r8.mo56113h()
            if (r11 == 0) goto L_0x00c0
            java.lang.Object r8 = r8.mo56107c()
            com.android.b.s r8 = (com.android.p256b.C5033s) r8
            java.lang.String r8 = r8.toString()
            android.content.Context r11 = r0.f37159r
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r8 = com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11306d.m26907g(r8, r11)
            goto L_0x00c2
        L_0x00b2:
            com.google.common.f.e r8 = f36939g
            com.google.common.f.x r8 = r8.mo56226d()
            java.lang.String r11 = "Chip missing display text and chip value: %s."
            r12 = 43221(0xa8d5, float:6.0566E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r12)).mo56389s(r11, r4)
        L_0x00c0:
            java.lang.String r8 = ""
        L_0x00c2:
            r7.mo19774b(r8)
        L_0x00c5:
            com.google.assistant.e.c.c.dc r8 = r4.f132644d
            if (r8 != 0) goto L_0x00cb
            com.google.assistant.e.c.c.dc r8 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x00cb:
            int r8 = r8.f132815a
            r8 = r8 & r5
            r11 = 8
            if (r8 == 0) goto L_0x00f9
            com.google.assistant.e.c.c.dc r8 = r4.f132644d
            if (r8 != 0) goto L_0x00d9
            com.google.assistant.e.c.c.dc r12 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            goto L_0x00da
        L_0x00d9:
            r12 = r8
        L_0x00da:
            java.lang.String r12 = r12.f132817c
            if (r8 != 0) goto L_0x00e0
            com.google.assistant.e.c.c.dc r8 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x00e0:
            int r8 = r8.f132816b
            int r8 = com.google.assistant.p3897e.p3902c.p3907c.C51014de.m86008a(r8)
            if (r8 != 0) goto L_0x00e9
            r8 = 1
        L_0x00e9:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r13 = r7.f36830e
            r13.setVisibility(r2)
            android.widget.LinearLayout r13 = r7.f36829d
            r13.setVisibility(r2)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r13 = r7.f36830e
            r13.mo19788d(r12, r8)
            goto L_0x0103
        L_0x00f9:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r8 = r7.f36830e
            r8.setVisibility(r11)
            android.widget.LinearLayout r8 = r7.f36829d
            r8.setVisibility(r11)
        L_0x0103:
            r8 = 2130969870(0x7f04050e, float:1.7548434E38)
            int r8 = r7.mo19773a(r8)
            int r12 = r4.f132649i
            com.google.assistant.e.c.c.aw r12 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r12)
            if (r12 != 0) goto L_0x0114
            com.google.assistant.e.c.c.aw r12 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x0114:
            int r12 = r12.ordinal()
            if (r12 == r6) goto L_0x0121
            if (r12 == r5) goto L_0x011d
            goto L_0x0128
        L_0x011d:
            r8 = 2130969872(0x7f040510, float:1.7548438E38)
            goto L_0x0124
        L_0x0121:
            r8 = 2130969873(0x7f040511, float:1.754844E38)
        L_0x0124:
            int r8 = r7.mo19773a(r8)
        L_0x0128:
            android.widget.TextView r12 = r7.f36831f
            r12.setTextColor(r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r12 = r7.f36830e
            android.widget.ImageView r12 = r12.f36859f
            r12.setColorFilter(r8)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r12 = r7.f36833h
            android.widget.ImageView r12 = r12.f36859f
            r12.setColorFilter(r8)
            int r8 = r4.f132649i
            com.google.assistant.e.c.c.aw r8 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r8)
            if (r8 != 0) goto L_0x0145
            com.google.assistant.e.c.c.aw r8 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x0145:
            com.google.assistant.e.c.c.aw r12 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DISABLED
            if (r8 != r12) goto L_0x015b
            android.widget.TextView r8 = r7.f36831f
            r12 = 1052938076(0x3ec28f5c, float:0.38)
            r8.setAlpha(r12)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r8 = r7.f36830e
            r8.setAlpha(r12)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r8 = r7.f36833h
            r8.setAlpha(r12)
        L_0x015b:
            int r8 = r4.f132641a
            r8 = r8 & r5
            if (r8 == 0) goto L_0x0165
            java.lang.String r8 = r4.f132645e
            r7.mo19774b(r8)
        L_0x0165:
            com.google.assistant.e.c.c.dg r8 = r4.f132648h
            if (r8 != 0) goto L_0x016b
            com.google.assistant.e.c.c.dg r8 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x016b:
            com.google.assistant.e.c.c.dc r8 = r8.f132834f
            if (r8 != 0) goto L_0x0171
            com.google.assistant.e.c.c.dc r8 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0171:
            int r8 = r8.f132815a
            r8 = r8 & r5
            if (r8 == 0) goto L_0x019d
            com.google.assistant.e.c.c.dg r8 = r4.f132648h
            if (r8 != 0) goto L_0x017d
            com.google.assistant.e.c.c.dg r11 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
            goto L_0x017e
        L_0x017d:
            r11 = r8
        L_0x017e:
            com.google.assistant.e.c.c.dc r11 = r11.f132834f
            if (r11 != 0) goto L_0x0184
            com.google.assistant.e.c.c.dc r11 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0184:
            java.lang.String r11 = r11.f132817c
            if (r8 != 0) goto L_0x018a
            com.google.assistant.e.c.c.dg r8 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x018a:
            com.google.assistant.e.c.c.dc r8 = r8.f132834f
            if (r8 != 0) goto L_0x0190
            com.google.assistant.e.c.c.dc r8 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0190:
            int r8 = r8.f132816b
            int r8 = com.google.assistant.p3897e.p3902c.p3907c.C51014de.m86008a(r8)
            if (r8 != 0) goto L_0x0199
        L_0x0198:
            r8 = 1
        L_0x0199:
            r7.mo19775c(r11, r8)
            goto L_0x01c9
        L_0x019d:
            com.google.assistant.e.c.c.dc r8 = r4.f132647g
            if (r8 != 0) goto L_0x01a4
            com.google.assistant.e.c.c.dc r12 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            goto L_0x01a5
        L_0x01a4:
            r12 = r8
        L_0x01a5:
            int r12 = r12.f132815a
            r12 = r12 & r5
            if (r12 == 0) goto L_0x01bf
            if (r8 != 0) goto L_0x01af
            com.google.assistant.e.c.c.dc r11 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            goto L_0x01b0
        L_0x01af:
            r11 = r8
        L_0x01b0:
            java.lang.String r11 = r11.f132817c
            if (r8 != 0) goto L_0x01b6
            com.google.assistant.e.c.c.dc r8 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x01b6:
            int r8 = r8.f132816b
            int r8 = com.google.assistant.p3897e.p3902c.p3907c.C51014de.m86008a(r8)
            if (r8 != 0) goto L_0x0199
            goto L_0x0198
        L_0x01bf:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r8 = r7.f36833h
            r8.setVisibility(r11)
            android.widget.LinearLayout r8 = r7.f36832g
            r8.setVisibility(r11)
        L_0x01c9:
            int r8 = r4.f132651k
            int r8 = com.google.assistant.p3897e.p3902c.p3907c.C50953ay.m85990a(r8)
            if (r8 != 0) goto L_0x01d2
            goto L_0x01dc
        L_0x01d2:
            if (r8 != r9) goto L_0x01dc
            android.widget.LinearLayout r8 = r7.f36827b
            r9 = 2131231642(0x7f08039a, float:1.807937E38)
            r8.setBackgroundResource(r9)
        L_0x01dc:
            android.widget.TextView r8 = r7.f36831f
            android.content.Context r9 = r7.getContext()
            android.content.res.Resources r9 = r9.getResources()
            int r11 = r4.f132641a
            r11 = r11 & r6
            r13 = 2131166818(0x7f070662, float:1.7947892E38)
            if (r6 == r11) goto L_0x01f2
            r11 = 2131166812(0x7f07065c, float:1.794788E38)
            goto L_0x01f5
        L_0x01f2:
            r11 = 2131166818(0x7f070662, float:1.7947892E38)
        L_0x01f5:
            int r9 = r9.getDimensionPixelSize(r11)
            android.content.Context r11 = r7.getContext()
            android.content.res.Resources r11 = r11.getResources()
            r14 = 2131166814(0x7f07065e, float:1.7947884E38)
            int r11 = r11.getDimensionPixelSize(r14)
            android.content.Context r15 = r7.getContext()
            android.content.res.Resources r15 = r15.getResources()
            int r12 = r4.f132641a
            r12 = r12 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x021a
        L_0x0216:
            r12 = 2131166818(0x7f070662, float:1.7947892E38)
            goto L_0x022a
        L_0x021a:
            com.google.assistant.e.c.c.dg r12 = r4.f132648h
            if (r12 != 0) goto L_0x0220
            com.google.assistant.e.c.c.dg r12 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x0220:
            int r12 = r12.f132829a
            r12 = r12 & 32
            if (r12 == 0) goto L_0x0227
            goto L_0x0216
        L_0x0227:
            r12 = 2131166812(0x7f07065c, float:1.794788E38)
        L_0x022a:
            int r12 = r15.getDimensionPixelSize(r12)
            android.content.Context r13 = r7.getContext()
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getDimensionPixelSize(r14)
            r8.setPadding(r9, r11, r12, r13)
            r8 = 2130969867(0x7f04050b, float:1.7548428E38)
            int r8 = r7.mo19773a(r8)
            r9 = 2130969864(0x7f040508, float:1.7548422E38)
            int r11 = r7.mo19773a(r9)
            android.content.res.Resources r12 = r7.getResources()
            android.content.Context r13 = r7.getContext()
            android.content.res.Resources$Theme r13 = r13.getTheme()
            r14 = 17170445(0x106000d, float:2.461195E-38)
            int r12 = r12.getColor(r14, r13)
            int r9 = r7.mo19773a(r9)
            int r13 = r4.f132649i
            com.google.assistant.e.c.c.aw r13 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r13)
            if (r13 != 0) goto L_0x026c
            com.google.assistant.e.c.c.aw r13 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x026c:
            int r13 = r13.ordinal()
            if (r13 == r6) goto L_0x028c
            if (r13 == r5) goto L_0x0288
            if (r13 == r10) goto L_0x0277
            goto L_0x0294
        L_0x0277:
            android.content.res.Resources r8 = r7.getResources()
            android.content.Context r13 = r7.getContext()
            android.content.res.Resources$Theme r13 = r13.getTheme()
            int r8 = r8.getColor(r14, r13)
            goto L_0x0294
        L_0x0288:
            r5 = 2130969862(0x7f040506, float:1.7548418E38)
            goto L_0x028f
        L_0x028c:
            r5 = 2130969863(0x7f040507, float:1.754842E38)
        L_0x028f:
            int r12 = r7.mo19773a(r5)
            r5 = 0
        L_0x0294:
            android.widget.LinearLayout r13 = r7.f36827b
            android.graphics.drawable.Drawable r13 = r13.getBackground()
            android.graphics.drawable.StateListDrawable r13 = (android.graphics.drawable.StateListDrawable) r13
            android.graphics.drawable.Drawable$ConstantState r13 = r13.getConstantState()
            android.graphics.drawable.DrawableContainer$DrawableContainerState r13 = (android.graphics.drawable.DrawableContainer.DrawableContainerState) r13
            android.graphics.drawable.Drawable[] r13 = r13.getChildren()
            r14 = r13[r2]
            android.graphics.drawable.GradientDrawable r14 = (android.graphics.drawable.GradientDrawable) r14
            r6 = r13[r6]
            android.graphics.drawable.GradientDrawable r6 = (android.graphics.drawable.GradientDrawable) r6
            r14.setColor(r8)
            r14.setStroke(r5, r11)
            r6.setColor(r12)
            r6.setStroke(r5, r9)
            r7.f36826a = r3
            r7.setVisibility(r2)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.t r5 = new com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.t
            r5.<init>(r0, r7, r4)
            android.widget.LinearLayout r6 = r7.f36828c
            r6.setOnClickListener(r5)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.u r5 = new com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.u
            r5.<init>(r0, r7, r4)
            android.widget.LinearLayout r6 = r7.f36832g
            r6.setOnClickListener(r5)
            int r5 = r4.f132641a
            r5 = r5 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L_0x02ee
            android.widget.LinearLayout r5 = r7.f36828c
            com.google.android.libraries.logging.j r6 = new com.google.android.libraries.logging.j
            int r8 = r4.f132653m
            r6.<init>(r8)
            r8 = 5
            r6.mo33795i(r8)
            r6.mo33795i(r10)
            com.google.android.libraries.logging.C28295m.m52919e(r5, r6)
            int r4 = r4.f132653m
        L_0x02ee:
            android.widget.LinearLayout r4 = r0.f36946h
            r4.addView(r7)
            com.google.protobuf.cq r4 = r1.f132660b
            int r4 = r4.size()
            int r4 = r4 + -1
            if (r3 == r4) goto L_0x0318
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            android.content.Context r5 = r16.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131166789(0x7f070645, float:1.7947833E38)
            int r5 = r5.getDimensionPixelSize(r6)
            r4.setMargins(r2, r2, r5, r2)
            r7.setLayoutParams(r4)
        L_0x0318:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x031c:
            int r3 = r1.f132659a
            r3 = r3 & r6
            if (r3 == 0) goto L_0x0338
            int r3 = r1.f132662d
            int r3 = com.google.assistant.p3897e.p3902c.p3907c.C50958bc.m85994a(r3)
            if (r3 != 0) goto L_0x032a
            goto L_0x0338
        L_0x032a:
            if (r3 != r5) goto L_0x0338
            android.widget.TextView r3 = r0.f36947i
            r3.setVisibility(r2)
            android.widget.TextView r2 = r0.f36947i
            java.lang.String r1 = r1.f132661c
            r2.setText(r1)
        L_0x0338:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ChipCarouselField.mo19809b():void");
    }

    /* renamed from: c */
    public final void mo19762c(C58833ax axVar, String str, C58833ax axVar2) {
        if (this.f37153l != null && this.f37154m != null && this.f36944e != null && this.f36945f >= 0 && axVar2.mo56113h()) {
            C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
            String str2 = this.f37153l.f36729a.f136279g;
            tpVar.copyOnWrite();
            C52490tr trVar = (C52490tr) tpVar.instance;
            str2.getClass();
            trVar.f137797a |= 1;
            trVar.f137800d = str2;
            String str3 = this.f37153l.f36729a.f136280h;
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
            int i = this.f36945f;
            tdVar.copyOnWrite();
            C52477te teVar = (C52477te) tdVar.instance;
            teVar.f137750a |= 1;
            teVar.f137753d = (long) i;
            tdVar.copyOnWrite();
            C52477te teVar2 = (C52477te) tdVar.instance;
            teVar2.f137750a |= 2;
            teVar2.f137754e = true;
            C52397qf qfVar = (C52397qf) axVar2.mo56107c();
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
            C11295c cVar = this.f37153l;
            cVar.f36730b = (C52490tr) tpVar.build();
            C11298f a = this.f37154m.mo19691a(cVar);
            C50954az azVar = this.f36944e;
            if (azVar == null || (azVar.f132641a & 128) == 0) {
                mo19941h(a);
            } else if (m26995e(azVar)) {
                C50954az azVar2 = this.f36944e;
                azVar2.getClass();
                C51016dg dgVar = azVar2.f132646f;
                if (dgVar == null) {
                    dgVar = C51016dg.f132827g;
                }
                C51805du duVar = dgVar.f132833e;
                if (duVar == null) {
                    duVar = C51805du.f135924e;
                }
                mo19943j(C11278h.m26771a(duVar, C11271a.m26758b((C52397qf) axVar2.mo56107c())));
            } else {
                C50954az azVar3 = this.f36944e;
                azVar3.getClass();
                C51016dg dgVar2 = azVar3.f132646f;
                if (dgVar2 == null) {
                    dgVar2 = C51016dg.f132827g;
                }
                mo19942i(dgVar2, a);
            }
        }
    }

    /* renamed from: d */
    public final void mo19764d(int i, int i2) {
        if (this.f37153l != null && this.f37154m != null && this.f36942c != null && this.f36943d >= 0) {
            C52402qk qkVar = (C52402qk) C52403ql.f137512f.createBuilder();
            qkVar.copyOnWrite();
            C52403ql qlVar = (C52403ql) qkVar.instance;
            qlVar.f137514a |= 1;
            qlVar.f137515b = i;
            qkVar.copyOnWrite();
            C52403ql qlVar2 = (C52403ql) qkVar.instance;
            qlVar2.f137514a |= 2;
            qlVar2.f137516c = i2;
            C52403ql qlVar3 = (C52403ql) qkVar.build();
            String f = m26996f(i, i2, Locale.getDefault());
            C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
            String str = this.f37153l.f36729a.f136279g;
            tpVar.copyOnWrite();
            C52490tr trVar = (C52490tr) tpVar.instance;
            str.getClass();
            trVar.f137797a |= 1;
            trVar.f137800d = str;
            String str2 = this.f37153l.f36729a.f136280h;
            tpVar.copyOnWrite();
            C52490tr trVar2 = (C52490tr) tpVar.instance;
            str2.getClass();
            trVar2.f137797a |= 2;
            trVar2.f137801e = str2;
            tpVar.copyOnWrite();
            C52490tr trVar3 = (C52490tr) tpVar.instance;
            trVar3.f137797a |= 4;
            trVar3.f137802f = true;
            C52476td tdVar = (C52476td) C52477te.f137748h.createBuilder();
            int i3 = this.f36943d;
            tdVar.copyOnWrite();
            C52477te teVar = (C52477te) tdVar.instance;
            teVar.f137750a |= 1;
            teVar.f137753d = (long) i3;
            tdVar.copyOnWrite();
            C52477te teVar2 = (C52477te) tdVar.instance;
            teVar2.f137750a |= 2;
            teVar2.f137754e = true;
            tdVar.copyOnWrite();
            C52477te teVar3 = (C52477te) tdVar.instance;
            qlVar3.getClass();
            teVar3.f137752c = qlVar3;
            teVar3.f137751b = 5;
            tdVar.copyOnWrite();
            C52477te teVar4 = (C52477te) tdVar.instance;
            f.getClass();
            teVar4.f137750a |= 64;
            teVar4.f137756g = f;
            tpVar.copyOnWrite();
            C52490tr trVar4 = (C52490tr) tpVar.instance;
            C52477te teVar5 = (C52477te) tdVar.build();
            teVar5.getClass();
            trVar4.f137799c = teVar5;
            trVar4.f137798b = 16;
            C11295c cVar = this.f37153l;
            cVar.f36730b = (C52490tr) tpVar.build();
            C11298f a = this.f37154m.mo19691a(cVar);
            C50954az azVar = this.f36942c;
            if (azVar == null || (azVar.f132641a & 128) == 0) {
                mo19941h(a);
            } else if (m26995e(azVar)) {
                C50954az azVar2 = this.f36942c;
                azVar2.getClass();
                C51016dg dgVar = azVar2.f132646f;
                if (dgVar == null) {
                    dgVar = C51016dg.f132827g;
                }
                C51805du duVar = dgVar.f132833e;
                if (duVar == null) {
                    duVar = C51805du.f135924e;
                }
                mo19943j(C11278h.m26774d(duVar, qlVar3));
            } else {
                C50954az azVar3 = this.f36942c;
                azVar3.getClass();
                C51016dg dgVar2 = azVar3.f132646f;
                if (dgVar2 == null) {
                    dgVar2 = C51016dg.f132827g;
                }
                mo19942i(dgVar2, a);
            }
        }
    }

    /* renamed from: m */
    public final void mo19821m(C11295c cVar) {
        this.f37153l = cVar;
        mo19809b();
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36946h = (LinearLayout) findViewById(R.id.chip_container);
        this.f36947i = (TextView) findViewById(R.id.chip_carousel_error_message);
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
