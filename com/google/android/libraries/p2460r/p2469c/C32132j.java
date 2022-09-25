package com.google.android.libraries.p2460r.p2469c;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.TextView;
import com.google.android.libraries.p2460r.p2464b.p2468d.C32056a;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57499g;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57501i;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.libraries.r.c.j */
/* compiled from: PG */
final class C32132j extends C32121bi {

    /* renamed from: a */
    public final Set f86291a = new HashSet();

    public C32132j(Context context, C32127e eVar) {
        super(context, eVar);
    }

    /* renamed from: r */
    private final void m59854r(SpannableStringBuilder spannableStringBuilder, int i) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        colorDrawable.setBounds(0, 0, (int) C32056a.m59733a((float) i, this.f86298b), 1);
        ImageSpan imageSpan = new ImageSpan(colorDrawable);
        spannableStringBuilder.append(" ");
        spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
    }

    /* renamed from: s */
    private static final void m59855s(C57501i iVar, SpannableStringBuilder spannableStringBuilder, TextView textView, C32148z zVar, int i, int i2, boolean z) {
        if ((iVar.f153595a & 1) != 0) {
            C57499g gVar = iVar.f153596b;
            if (gVar == null) {
                gVar = C57499g.f153590a;
            }
            spannableStringBuilder.setSpan(new C32128f(gVar, zVar.f86338e, zVar.f86340g), i, i2, 33);
            if (!z) {
                textView.setOnTouchListener(new C32129g(spannableStringBuilder));
            }
        }
    }

    /* renamed from: t */
    private static final int m59856t(int i) {
        if (i < 0) {
            return -1;
        }
        return i;
    }

    /* renamed from: a */
    public final void mo37854a() {
        for (C32130h hVar : this.f86291a) {
            hVar.f86285a = true;
        }
        this.f86291a.clear();
        super.mo37854a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo37933b(Drawable drawable, C32094ay ayVar, TextView textView) {
        int lineHeight = textView.getLineHeight();
        int t = m59856t(ayVar.mo37872c(this.f86298b));
        int t2 = m59856t(ayVar.mo37873d(this.f86298b));
        if (t < 0 || t2 < 0) {
            if (t2 >= 0) {
                t = (int) (((float) drawable.getIntrinsicHeight()) * (((float) t2) / ((float) drawable.getIntrinsicWidth())));
            } else {
                if (t >= 0) {
                    lineHeight = t;
                }
                t2 = (int) (((float) drawable.getIntrinsicWidth()) * (((float) lineHeight) / ((float) drawable.getIntrinsicHeight())));
                t = lineHeight;
            }
        }
        drawable.setBounds(0, 0, t2, t);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01dd  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37863c(com.google.android.libraries.p2460r.p2469c.C32148z r22, com.google.p4283bv.p4354e.p4367c.p4368a.C57397bv r23) {
        /*
            r21 = this;
            r6 = r21
            r14 = r22
            r0 = r23
            int r1 = r0.f153319a
            int r2 = com.google.p4283bv.p4354e.p4367c.p4368a.C57396bu.m88343b(r1)
            int r3 = r2 + -1
            if (r2 == 0) goto L_0x0427
            r13 = 5
            r12 = 4
            r11 = 0
            r10 = 1
            if (r3 == 0) goto L_0x00aa
            if (r3 != r10) goto L_0x0088
            if (r1 != r12) goto L_0x001f
            java.lang.Object r1 = r0.f153320b
            com.google.bv.e.c.a.o r1 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57507o) r1
            goto L_0x0021
        L_0x001f:
            com.google.bv.e.c.a.o r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57507o.f153611c
        L_0x0021:
            java.lang.String r2 = r1.f153613a
            com.google.bv.e.c.a.ak r2 = r14.mo37962d(r2)
            int r3 = r2.f153235a
            r3 = r3 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x0031
            com.google.bv.e.c.a.ak r2 = com.google.android.libraries.p2460r.p2469c.p2470a.C32063f.m59746a(r2)
        L_0x0031:
            int r3 = r2.f153236b
            if (r3 != r12) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            boolean r4 = r1.f153614b
            if (r4 == 0) goto L_0x006e
        L_0x003a:
            if (r3 != r12) goto L_0x0041
            java.lang.Object r0 = r2.f153237c
            com.google.bv.e.c.a.fe r0 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57488fe) r0
            goto L_0x00b3
        L_0x0041:
            int r1 = r0.f153319a
            if (r1 != r12) goto L_0x004a
            java.lang.Object r0 = r0.f153320b
            com.google.bv.e.c.a.o r0 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57507o) r0
            goto L_0x004c
        L_0x004a:
            com.google.bv.e.c.a.o r0 = com.google.p4283bv.p4354e.p4367c.p4368a.C57507o.f153611c
        L_0x004c:
            boolean r0 = r0.f153614b
            if (r0 == 0) goto L_0x0054
            r6.mo37948o(r12)
            return
        L_0x0054:
            com.google.android.libraries.r.c.an r0 = new com.google.android.libraries.r.c.an
            com.google.bv.e.c.a.cb r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb.ERR_MISSING_BINDING_VALUE
            com.google.bv.e.c.a.cb r3 = com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb.ERR_MISSING_BINDING_VALUE
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.String r2 = r2.f153238d
            r4[r11] = r2
            java.lang.String r2 = "Chunked text binding %s had no content"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            java.lang.String r2 = r14.mo37967i(r10, r3, r2)
            r0.<init>(r1, r2)
            throw r0
        L_0x006e:
            com.google.android.libraries.r.c.an r0 = new com.google.android.libraries.r.c.an
            com.google.bv.e.c.a.cb r2 = com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb.ERR_MISSING_BINDING_VALUE
            com.google.bv.e.c.a.cb r3 = com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb.ERR_MISSING_BINDING_VALUE
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.String r1 = r1.f153613a
            r4[r11] = r1
            java.lang.String r1 = "Chunked text binding not found for %s"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            java.lang.String r1 = r14.mo37967i(r10, r3, r1)
            r0.<init>(r2, r1)
            throw r0
        L_0x0088:
            com.google.android.libraries.r.c.an r1 = new com.google.android.libraries.r.c.an
            com.google.bv.e.c.a.cb r2 = com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT
            com.google.bv.e.c.a.cb r3 = com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT
            java.lang.Object[] r4 = new java.lang.Object[r10]
            int r0 = r0.f153319a
            int r0 = com.google.p4283bv.p4354e.p4367c.p4368a.C57396bu.m88343b(r0)
            java.lang.String r0 = com.google.p4283bv.p4354e.p4367c.p4368a.C57396bu.m88342a(r0)
            r4[r11] = r0
            java.lang.String r0 = "Unhandled type of TextElement; had content %s"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            java.lang.String r0 = r14.mo37967i(r10, r3, r0)
            r1.<init>(r2, r0)
            throw r1
        L_0x00aa:
            if (r1 != r13) goto L_0x00b1
            java.lang.Object r0 = r0.f153320b
            com.google.bv.e.c.a.fe r0 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57488fe) r0
            goto L_0x00b3
        L_0x00b1:
            com.google.bv.e.c.a.fe r0 = com.google.p4283bv.p4354e.p4367c.p4368a.C57488fe.f153562b
        L_0x00b3:
            android.view.View r1 = r6.f86300d
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>()
            com.google.protobuf.cq r0 = r0.f153564a
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
        L_0x00c5:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0421
            java.lang.Object r0 = r16.next()
            r7 = r0
            com.google.bv.e.c.a.fc r7 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57486fc) r7
            int r18 = r8.length()
            int r0 = r7.f153557a
            int r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57485fb.m88366a(r0)
            int r2 = r1 + -1
            if (r1 == 0) goto L_0x041f
            java.lang.String r1 = "null"
            java.lang.String r3 = "CONTENT_NOT_SET"
            r5 = 3
            r4 = 2
            if (r2 == 0) goto L_0x0240
            if (r2 == r10) goto L_0x0110
            com.google.android.libraries.r.c.an r0 = new com.google.android.libraries.r.c.an
            com.google.bv.e.c.a.cb r2 = com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT
            java.lang.Object[] r8 = new java.lang.Object[r10]
            int r7 = r7.f153557a
            int r7 = com.google.p4283bv.p4354e.p4367c.p4368a.C57485fb.m88366a(r7)
            if (r7 == r10) goto L_0x0102
            if (r7 == r4) goto L_0x00ff
            if (r7 == r5) goto L_0x00fd
            goto L_0x0104
        L_0x00fd:
            r1 = r3
            goto L_0x0104
        L_0x00ff:
            java.lang.String r1 = "IMAGE_CHUNK"
            goto L_0x0104
        L_0x0102:
            java.lang.String r1 = "TEXT_CHUNK"
        L_0x0104:
            r8[r11] = r1
            java.lang.String r1 = "Unhandled type of ChunkedText Chunk; had content %s"
            java.lang.String r1 = java.lang.String.format(r1, r8)
            r0.<init>(r2, r1)
            throw r0
        L_0x0110:
            if (r0 != r4) goto L_0x0117
            java.lang.Object r0 = r7.f153558b
            com.google.bv.e.c.a.fl r0 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57495fl) r0
            goto L_0x0119
        L_0x0117:
            com.google.bv.e.c.a.fl r0 = com.google.p4283bv.p4354e.p4367c.p4368a.C57495fl.f153576d
        L_0x0119:
            int r2 = r0.f153578a
            int r19 = com.google.p4283bv.p4354e.p4367c.p4368a.C57494fk.m88367a(r2)
            int r15 = r19 + -1
            if (r19 == 0) goto L_0x023e
            if (r15 == 0) goto L_0x0158
            if (r15 == r10) goto L_0x014e
            com.google.bv.e.c.a.cb r2 = com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT
            java.lang.Object[] r15 = new java.lang.Object[r10]
            int r0 = r0.f153578a
            int r0 = com.google.p4283bv.p4354e.p4367c.p4368a.C57494fk.m88367a(r0)
            if (r0 == r10) goto L_0x013d
            if (r0 == r4) goto L_0x013a
            if (r0 == r5) goto L_0x0138
            goto L_0x013f
        L_0x0138:
            r1 = r3
            goto L_0x013f
        L_0x013a:
            java.lang.String r1 = "IMAGE"
            goto L_0x013f
        L_0x013d:
            java.lang.String r1 = "IMAGE_BINDING"
        L_0x013f:
            r15[r11] = r1
            java.lang.String r0 = "StyledImageChunk missing Image content; has %s"
            java.lang.String r0 = java.lang.String.format(r0, r15)
            r14.mo37967i(r10, r2, r0)
            r12 = 2
        L_0x014b:
            r13 = 3
            goto L_0x03a9
        L_0x014e:
            if (r2 != r5) goto L_0x0155
            java.lang.Object r1 = r0.f153579b
            com.google.bv.e.c.a.cl r1 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57414cl) r1
            goto L_0x016d
        L_0x0155:
            com.google.bv.e.c.a.cl r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57414cl.f153380b
            goto L_0x016d
        L_0x0158:
            if (r2 != r4) goto L_0x015f
            java.lang.Object r1 = r0.f153579b
            com.google.bv.e.c.a.w r1 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57515w) r1
            goto L_0x0161
        L_0x015f:
            com.google.bv.e.c.a.w r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57515w.f153630c
        L_0x0161:
            com.google.bv.e.c.a.ak r2 = r14.mo37963e(r1)
            int r3 = r2.f153236b
            if (r3 != r13) goto L_0x0226
            java.lang.Object r1 = r2.f153237c
            com.google.bv.e.c.a.cl r1 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57414cl) r1
        L_0x016d:
            com.google.bv.e.c.a.cl r15 = r14.mo37965g(r1)
            com.google.bv.e.c.a.er r0 = r0.f153580c
            if (r0 != 0) goto L_0x0177
            com.google.bv.e.c.a.er r0 = com.google.p4283bv.p4354e.p4367c.p4368a.C57474er.f153542d
        L_0x0177:
            com.google.android.libraries.r.c.ay r3 = r14.mo37960b(r0)
            boolean r0 = r3.mo37881j()
            if (r0 == 0) goto L_0x018a
            com.google.bv.e.c.a.cf r0 = r3.mo37876f()
            android.graphics.drawable.Drawable r0 = r3.mo37874e(r0)
            goto L_0x018b
        L_0x018a:
            r0 = 0
        L_0x018b:
            if (r0 != 0) goto L_0x0192
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r11)
        L_0x0192:
            android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r10]
            r1[r11] = r0
            r2.<init>(r1)
            r2.setId(r11, r11)
            r6.mo37933b(r2, r3, r9)
            android.text.style.ImageSpan r0 = new android.text.style.ImageSpan
            r0.<init>(r2, r10)
            com.google.bv.e.c.a.ep r1 = r3.f86174b
            com.google.bv.e.c.a.ec r1 = r1.f153530n
            if (r1 != 0) goto L_0x01ae
            com.google.bv.e.c.a.ec r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57459ec.f153490f
        L_0x01ae:
            int r1 = r1.f153492a
            r1 = r1 & r12
            if (r1 == 0) goto L_0x01c0
            com.google.bv.e.c.a.ep r1 = r3.f86174b
            com.google.bv.e.c.a.ec r1 = r1.f153530n
            if (r1 != 0) goto L_0x01bb
            com.google.bv.e.c.a.ec r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57459ec.f153490f
        L_0x01bb:
            int r1 = r1.f153495d
            r6.m59854r(r8, r1)
        L_0x01c0:
            java.lang.String r1 = " "
            r8.append(r1)
            int r1 = r8.length()
            int r1 = r1 + -1
            int r5 = r8.length()
            r13 = 17
            r8.setSpan(r0, r1, r5, r13)
            com.google.bv.e.c.a.ep r0 = r3.f86174b
            com.google.bv.e.c.a.ec r0 = r0.f153530n
            if (r0 != 0) goto L_0x01dd
            com.google.bv.e.c.a.ec r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57459ec.f153490f
            goto L_0x01de
        L_0x01dd:
            r1 = r0
        L_0x01de:
            int r1 = r1.f153492a
            r1 = r1 & 8
            if (r1 == 0) goto L_0x01ed
            if (r0 != 0) goto L_0x01e8
            com.google.bv.e.c.a.ec r0 = com.google.p4283bv.p4354e.p4367c.p4368a.C57459ec.f153490f
        L_0x01e8:
            int r0 = r0.f153496e
            r6.m59854r(r8, r0)
        L_0x01ed:
            com.google.bv.e.c.a.ep r0 = r3.f86174b
            int r1 = r0.f153517a
            r1 = r1 & r4
            if (r1 == 0) goto L_0x01fc
            int r0 = r0.f153524h
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = r0
            goto L_0x01fd
        L_0x01fc:
            r5 = 0
        L_0x01fd:
            com.google.android.libraries.r.c.h r13 = new com.google.android.libraries.r.c.h
            r0 = r13
            r1 = r21
            r20 = r3
            r12 = 2
            r4 = r5
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.Set r0 = r6.f86291a
            r0.add(r13)
            android.content.Context r0 = r6.f86298b
            r1 = r20
            r1.mo37873d(r0)
            android.content.Context r0 = r6.f86298b
            r1.mo37872c(r0)
            com.google.android.libraries.r.c.e r0 = r6.f86299c
            com.google.android.libraries.r.c.ac r0 = r0.f86274c
            com.google.android.libraries.r.c.a.b r0 = r0.f86117a
            r0.mo37844c(r15, r13)
            goto L_0x014b
        L_0x0226:
            r12 = 2
            boolean r0 = r1.f153633b
            if (r0 != 0) goto L_0x014b
            com.google.bv.e.c.a.cb r0 = com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb.ERR_MISSING_BINDING_VALUE
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.String r1 = r1.f153632a
            r2[r11] = r1
            java.lang.String r1 = "No image found for binding id: %s"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r14.mo37967i(r10, r0, r1)
            goto L_0x014b
        L_0x023e:
            r0 = 0
            throw r0
        L_0x0240:
            r12 = 2
            int r0 = r8.length()
            int r2 = r7.f153557a
            if (r2 != r10) goto L_0x024e
            java.lang.Object r2 = r7.f153558b
            com.google.bv.e.c.a.fo r2 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57498fo) r2
            goto L_0x0250
        L_0x024e:
            com.google.bv.e.c.a.fo r2 = com.google.p4283bv.p4354e.p4367c.p4368a.C57498fo.f153583d
        L_0x0250:
            int r2 = r2.f153585a
            int r2 = com.google.p4283bv.p4354e.p4367c.p4368a.C57497fn.m88368a(r2)
            int r4 = r2 + -1
            if (r2 == 0) goto L_0x041d
            if (r4 == 0) goto L_0x02aa
            if (r4 == r10) goto L_0x0292
            com.google.bv.e.c.a.cb r2 = com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT
            java.lang.Object[] r4 = new java.lang.Object[r10]
            int r5 = r7.f153557a
            if (r5 != r10) goto L_0x026b
            java.lang.Object r5 = r7.f153558b
            com.google.bv.e.c.a.fo r5 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57498fo) r5
            goto L_0x026d
        L_0x026b:
            com.google.bv.e.c.a.fo r5 = com.google.p4283bv.p4354e.p4367c.p4368a.C57498fo.f153583d
        L_0x026d:
            int r5 = r5.f153585a
            int r5 = com.google.p4283bv.p4354e.p4367c.p4368a.C57497fn.m88368a(r5)
            if (r5 == r10) goto L_0x0281
            if (r5 == r12) goto L_0x027d
            r13 = 3
            if (r5 == r13) goto L_0x027b
            goto L_0x0284
        L_0x027b:
            r1 = r3
            goto L_0x0284
        L_0x027d:
            r13 = 3
            java.lang.String r1 = "PARAMETERIZED_TEXT"
            goto L_0x0284
        L_0x0281:
            r13 = 3
            java.lang.String r1 = "PARAMETERIZED_TEXT_BINDING"
        L_0x0284:
            r4[r11] = r1
            java.lang.String r1 = "StyledTextChunk missing ParameterizedText content; has %s"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            r14.mo37967i(r10, r2, r1)
            com.google.bv.e.c.a.fi r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57492fi.f153570e
            goto L_0x02d0
        L_0x0292:
            r13 = 3
            int r1 = r7.f153557a
            if (r1 != r10) goto L_0x029c
            java.lang.Object r1 = r7.f153558b
            com.google.bv.e.c.a.fo r1 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57498fo) r1
            goto L_0x029e
        L_0x029c:
            com.google.bv.e.c.a.fo r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57498fo.f153583d
        L_0x029e:
            int r2 = r1.f153585a
            if (r2 != r13) goto L_0x02a7
            java.lang.Object r1 = r1.f153586b
            com.google.bv.e.c.a.fi r1 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57492fi) r1
            goto L_0x02d0
        L_0x02a7:
            com.google.bv.e.c.a.fi r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57492fi.f153570e
            goto L_0x02d0
        L_0x02aa:
            r13 = 3
            int r1 = r7.f153557a
            if (r1 != r10) goto L_0x02b4
            java.lang.Object r1 = r7.f153558b
            com.google.bv.e.c.a.fo r1 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57498fo) r1
            goto L_0x02b6
        L_0x02b4:
            com.google.bv.e.c.a.fo r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57498fo.f153583d
        L_0x02b6:
            int r2 = r1.f153585a
            if (r2 != r12) goto L_0x02bf
            java.lang.Object r1 = r1.f153586b
            com.google.bv.e.c.a.aa r1 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57349aa) r1
            goto L_0x02c1
        L_0x02bf:
            com.google.bv.e.c.a.aa r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57349aa.f153211c
        L_0x02c1:
            com.google.bv.e.c.a.ak r1 = r14.mo37964f(r1)
            int r2 = r1.f153236b
            if (r2 != r13) goto L_0x02ce
            java.lang.Object r1 = r1.f153237c
            com.google.bv.e.c.a.fi r1 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57492fi) r1
            goto L_0x02d0
        L_0x02ce:
            com.google.bv.e.c.a.fi r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57492fi.f153570e
        L_0x02d0:
            int r2 = r7.f153557a
            if (r2 != r10) goto L_0x02d9
            java.lang.Object r2 = r7.f153558b
            com.google.bv.e.c.a.fo r2 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57498fo) r2
            goto L_0x02db
        L_0x02d9:
            com.google.bv.e.c.a.fo r2 = com.google.p4283bv.p4354e.p4367c.p4368a.C57498fo.f153583d
        L_0x02db:
            com.google.bv.e.c.a.er r2 = r2.f153587c
            if (r2 != 0) goto L_0x02e1
            com.google.bv.e.c.a.er r2 = com.google.p4283bv.p4354e.p4367c.p4368a.C57474er.f153542d
        L_0x02e1:
            com.google.android.libraries.r.c.ay r2 = r14.mo37960b(r2)
            com.google.bv.e.c.a.ep r3 = r2.f86174b
            com.google.bv.e.c.a.ec r3 = r3.f153530n
            if (r3 != 0) goto L_0x02ed
            com.google.bv.e.c.a.ec r3 = com.google.p4283bv.p4354e.p4367c.p4368a.C57459ec.f153490f
        L_0x02ed:
            int r3 = r3.f153492a
            r4 = 4
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0300
            com.google.bv.e.c.a.ep r3 = r2.f86174b
            com.google.bv.e.c.a.ec r3 = r3.f153530n
            if (r3 != 0) goto L_0x02fb
            com.google.bv.e.c.a.ec r3 = com.google.p4283bv.p4354e.p4367c.p4368a.C57459ec.f153490f
        L_0x02fb:
            int r3 = r3.f153495d
            r6.m59854r(r8, r3)
        L_0x0300:
            com.google.android.libraries.r.c.e r3 = r6.f86299c
            com.google.android.libraries.r.c.ac r3 = r3.f86274c
            com.google.android.libraries.r.c.a.b r3 = r3.f86117a
            java.lang.CharSequence r1 = com.google.android.libraries.p2460r.p2469c.C32082am.m59774a(r3, r1)
            r8.append(r1)
            com.google.bv.e.c.a.ep r1 = r2.f86174b
            int r1 = r1.f153517a
            r1 = r1 & r12
            r3 = 33
            if (r1 == 0) goto L_0x0326
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            com.google.bv.e.c.a.ep r4 = r2.f86174b
            int r4 = r4.f153524h
            r1.<init>(r4)
            int r4 = r8.length()
            r8.setSpan(r1, r0, r4, r3)
        L_0x0326:
            com.google.bv.e.c.a.ep r1 = r2.f86174b
            com.google.bv.e.c.a.ee r1 = r1.f153527k
            if (r1 != 0) goto L_0x032e
            com.google.bv.e.c.a.ee r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57461ee.f153497g
        L_0x032e:
            boolean r1 = r1.f153502d
            if (r1 == 0) goto L_0x033e
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r12)
            int r4 = r8.length()
            r8.setSpan(r1, r0, r4, r3)
        L_0x033e:
            com.google.bv.e.c.a.ep r1 = r2.f86174b
            com.google.bv.e.c.a.ee r1 = r1.f153527k
            if (r1 != 0) goto L_0x0346
            com.google.bv.e.c.a.ee r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57461ee.f153497g
        L_0x0346:
            int r1 = r1.f153499a
            r1 = r1 & r10
            if (r1 == 0) goto L_0x0369
            android.text.style.AbsoluteSizeSpan r1 = new android.text.style.AbsoluteSizeSpan
            com.google.bv.e.c.a.ep r4 = r2.f86174b
            com.google.bv.e.c.a.ee r4 = r4.f153527k
            if (r4 != 0) goto L_0x0355
            com.google.bv.e.c.a.ee r4 = com.google.p4283bv.p4354e.p4367c.p4368a.C57461ee.f153497g
        L_0x0355:
            int r4 = r4.f153500b
            float r4 = (float) r4
            android.content.Context r5 = r6.f86298b
            float r4 = com.google.android.libraries.p2460r.p2464b.p2468d.C32056a.m59734b(r4, r5)
            int r4 = (int) r4
            r1.<init>(r4)
            int r4 = r8.length()
            r8.setSpan(r1, r0, r4, r3)
        L_0x0369:
            com.google.bv.e.c.a.ep r0 = r2.f86174b
            int r0 = r0.f153534r
            if (r0 <= 0) goto L_0x0390
            com.google.bv.e.c.a.cb r0 = com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb.ERR_UNSUPPORTED_FEATURE
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.google.bv.e.c.a.ep r3 = r2.f86174b
            int r3 = r3.f153534r
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r11] = r3
            java.lang.String r3 = "Ignoring max lines parameter set to '%s'; not supported on chunks."
            java.lang.String r1 = java.lang.String.format(r3, r1)
            java.lang.String r0 = r14.mo37967i(r12, r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r3 = 6
            java.lang.String r4 = "ChunkedTextElementAdapter"
            r5 = 0
            com.google.android.libraries.p2460r.p2464b.p2466b.C32054a.m59731b(r3, r4, r5, r0, r1)
        L_0x0390:
            com.google.bv.e.c.a.ep r0 = r2.f86174b
            com.google.bv.e.c.a.ec r0 = r0.f153530n
            if (r0 != 0) goto L_0x0399
            com.google.bv.e.c.a.ec r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57459ec.f153490f
            goto L_0x039a
        L_0x0399:
            r1 = r0
        L_0x039a:
            int r1 = r1.f153492a
            r1 = r1 & 8
            if (r1 == 0) goto L_0x03a9
            if (r0 != 0) goto L_0x03a4
            com.google.bv.e.c.a.ec r0 = com.google.p4283bv.p4354e.p4367c.p4368a.C57459ec.f153490f
        L_0x03a4:
            int r0 = r0.f153496e
            r6.m59854r(r8, r0)
        L_0x03a9:
            int r0 = r8.length()
            int r1 = r7.f153559c
            if (r1 == 0) goto L_0x03bc
            if (r1 == r13) goto L_0x03ba
            r2 = 4
            if (r1 == r2) goto L_0x03b8
            r5 = 0
            goto L_0x03bd
        L_0x03b8:
            r5 = 2
            goto L_0x03bd
        L_0x03ba:
            r5 = 1
            goto L_0x03bd
        L_0x03bc:
            r5 = 3
        L_0x03bd:
            int r2 = r5 + -1
            if (r5 == 0) goto L_0x041b
            if (r2 == 0) goto L_0x03f6
            if (r2 == r10) goto L_0x03cd
            r3 = r8
            r4 = r9
            r2 = 4
            r5 = 1
        L_0x03c9:
            r15 = 0
            r19 = 5
            goto L_0x03ee
        L_0x03cd:
            r2 = 4
            if (r1 != r2) goto L_0x03d5
            java.lang.Object r1 = r7.f153560d
            com.google.bv.e.c.a.m r1 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57505m) r1
            goto L_0x03d7
        L_0x03d5:
            com.google.bv.e.c.a.m r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57505m.f153607b
        L_0x03d7:
            com.google.bv.e.c.a.i r7 = r14.mo37961c(r1)
            r3 = r8
            r4 = r9
            r5 = 1
            if (r7 == 0) goto L_0x03c9
            r10 = r22
            r15 = 0
            r11 = r18
            r12 = r0
            r19 = 5
            r13 = r17
            m59855s(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0413
        L_0x03ee:
            r8 = r3
            r9 = r4
            r10 = 1
            r11 = 0
            r12 = 4
            r13 = 5
            goto L_0x00c5
        L_0x03f6:
            r3 = r8
            r4 = r9
            r2 = 4
            r5 = 1
            r15 = 0
            r19 = 5
            if (r1 != r13) goto L_0x0404
            java.lang.Object r1 = r7.f153560d
            com.google.bv.e.c.a.i r1 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57501i) r1
            goto L_0x0406
        L_0x0404:
            com.google.bv.e.c.a.i r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57501i.f153593f
        L_0x0406:
            r7 = r1
            r8 = r3
            r9 = r4
            r10 = r22
            r11 = r18
            r12 = r0
            r13 = r17
            m59855s(r7, r8, r9, r10, r11, r12, r13)
        L_0x0413:
            r10 = 1
            r11 = 0
            r12 = 4
            r13 = 5
            r17 = 1
            goto L_0x00c5
        L_0x041b:
            r0 = 0
            throw r0
        L_0x041d:
            r0 = 0
            throw r0
        L_0x041f:
            r0 = 0
            throw r0
        L_0x0421:
            r3 = r8
            r4 = r9
            r4.setText(r3)
            return
        L_0x0427:
            r0 = 0
            goto L_0x042a
        L_0x0429:
            throw r0
        L_0x042a:
            goto L_0x0429
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p2460r.p2469c.C32132j.mo37863c(com.google.android.libraries.r.c.z, com.google.bv.e.c.a.bv):void");
    }
}
