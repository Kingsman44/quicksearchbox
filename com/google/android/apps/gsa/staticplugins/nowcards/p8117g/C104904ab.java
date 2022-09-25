package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.now.shared.p6421ui.C83421j;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91857e;
import com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView;
import com.google.p375ai.p378b.C8013sh;
import com.google.p375ai.p378b.C8019sn;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.ab */
/* compiled from: PG */
public final class C104904ab {

    /* renamed from: a */
    private final C91857e f292319a;

    /* renamed from: b */
    private final List f292320b = new ArrayList();

    /* renamed from: c */
    private final List f292321c = new ArrayList();

    /* renamed from: d */
    private final C83421j f292322d;

    /* renamed from: e */
    private LinearLayout f292323e;

    /* renamed from: f */
    private final C104977w f292324f;

    public C104904ab(C104977w wVar, C91857e eVar, C83421j jVar) {
        this.f292324f = wVar;
        this.f292319a = eVar;
        this.f292322d = jVar;
    }

    /* renamed from: d */
    private final ShapeDrawable m173886d(C8013sh shVar, boolean z) {
        int i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        Paint paint = shapeDrawable.getPaint();
        if (!z || (shVar.f28137a & 2) == 0) {
            i = shVar.f28138b;
        } else {
            i = shVar.f28139c;
        }
        paint.setColor(i);
        C104977w wVar = this.f292324f;
        paint.setStrokeWidth((float) wVar.f292472a.mo94426L(shVar.f28140d));
        paint.setStyle(Paint.Style.STROKE);
        return shapeDrawable;
    }

    /* renamed from: e */
    private final void m173887e(View view, C8019sn snVar, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList();
        if ((snVar.f28156a & 32) != 0) {
            arrayList.add(new ColorDrawable(snVar.f28161f));
            i = 1;
        } else {
            i = 0;
        }
        if ((snVar.f28156a & 128) != 0) {
            C8013sh shVar = snVar.f28162g;
            if (shVar == null) {
                shVar = C8013sh.f28135e;
            }
            arrayList.add(m173886d(shVar, z));
        }
        if ((snVar.f28156a & 256) != 0) {
            C8013sh shVar2 = snVar.f28163h;
            if (shVar2 == null) {
                shVar2 = C8013sh.f28135e;
            }
            arrayList.add(m173886d(shVar2, z));
        }
        if ((snVar.f28156a & 512) != 0) {
            C8013sh shVar3 = snVar.f28164i;
            if (shVar3 == null) {
                shVar3 = C8013sh.f28135e;
            }
            arrayList.add(m173886d(shVar3, z));
        }
        if ((snVar.f28156a & 1024) != 0) {
            C8013sh shVar4 = snVar.f28165j;
            if (shVar4 == null) {
                shVar4 = C8013sh.f28135e;
            }
            arrayList.add(m173886d(shVar4, z));
        }
        if (!arrayList.isEmpty()) {
            LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[arrayList.size()]));
            if ((snVar.f28156a & 128) != 0) {
                C104977w wVar = this.f292324f;
                C8013sh shVar5 = snVar.f28162g;
                if (shVar5 == null) {
                    shVar5 = C8013sh.f28135e;
                }
                LayerDrawable layerDrawable2 = layerDrawable;
                int i2 = i;
                m173888f(layerDrawable2, i2, -20, wVar.f292472a.mo94426L(shVar5.f28140d) / 2, -20, -20);
                C104977w wVar2 = this.f292324f;
                C8013sh shVar6 = snVar.f28162g;
                if (shVar6 == null) {
                    shVar6 = C8013sh.f28135e;
                }
                C91115n.m148874f(view, 0, wVar2.f292472a.mo94426L(shVar6.f28140d));
                i++;
            }
            if ((snVar.f28156a & 256) != 0) {
                C104977w wVar3 = this.f292324f;
                C8013sh shVar7 = snVar.f28163h;
                if (shVar7 == null) {
                    shVar7 = C8013sh.f28135e;
                }
                LayerDrawable layerDrawable3 = layerDrawable;
                int i3 = i;
                m173888f(layerDrawable3, i3, -20, -20, -20, wVar3.f292472a.mo94426L(shVar7.f28140d) / 2);
                C104977w wVar4 = this.f292324f;
                C8013sh shVar8 = snVar.f28163h;
                if (shVar8 == null) {
                    shVar8 = C8013sh.f28135e;
                }
                C91115n.m148874f(view, 1, wVar4.f292472a.mo94426L(shVar8.f28140d));
                i++;
            }
            if ((snVar.f28156a & 512) != 0) {
                C104977w wVar5 = this.f292324f;
                C8013sh shVar9 = snVar.f28164i;
                if (shVar9 == null) {
                    shVar9 = C8013sh.f28135e;
                }
                LayerDrawable layerDrawable4 = layerDrawable;
                int i4 = i;
                m173888f(layerDrawable4, i4, wVar5.f292472a.mo94426L(shVar9.f28140d) / 2, -20, -20, -20);
                C104977w wVar6 = this.f292324f;
                C8013sh shVar10 = snVar.f28164i;
                if (shVar10 == null) {
                    shVar10 = C8013sh.f28135e;
                }
                C91115n.m148874f(view, 2, wVar6.f292472a.mo94426L(shVar10.f28140d));
                i++;
            }
            int i5 = i;
            if ((snVar.f28156a & 1024) != 0) {
                C104977w wVar7 = this.f292324f;
                C8013sh shVar11 = snVar.f28165j;
                if (shVar11 == null) {
                    shVar11 = C8013sh.f28135e;
                }
                LayerDrawable layerDrawable5 = layerDrawable;
                m173888f(layerDrawable5, i5, -20, -20, wVar7.f292472a.mo94426L(shVar11.f28140d) / 2, -20);
                C104977w wVar8 = this.f292324f;
                C8013sh shVar12 = snVar.f28165j;
                if (shVar12 == null) {
                    shVar12 = C8013sh.f28135e;
                }
                C91115n.m148874f(view, 3, wVar8.f292472a.mo94426L(shVar12.f28140d));
            }
            view.setBackground(layerDrawable);
        }
    }

    /* renamed from: f */
    private static void m173888f(LayerDrawable layerDrawable, int i, int i2, int i3, int i4, int i5) {
        boolean g = C91115n.m148875g();
        layerDrawable.setLayerInset(i, true != g ? i2 : i4, i3, true != g ? i4 : i2, i5);
    }

    /* renamed from: g */
    private static int m173889g(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 2 ? 48 : 80;
        }
        return 16;
    }

    /* renamed from: a */
    public final ViewGroup mo94389a() {
        if (this.f292323e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f292324f.f292472a.f290307b);
            this.f292323e = linearLayout;
            linearLayout.setOrientation(0);
            this.f292323e.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        }
        LinearLayout linearLayout2 = this.f292323e;
        linearLayout2.getClass();
        return linearLayout2;
    }

    /* renamed from: c */
    public final void mo94391c() {
        for (MetadataLineView c : this.f292320b) {
            c.mo94501c();
        }
        this.f292320b.clear();
        for (C104903aa aaVar : this.f292321c) {
            aaVar.f227389a.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            aaVar.f227389a.setBackground((Drawable) null);
            ViewGroup viewGroup = aaVar.f292318c;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            this.f292324f.f292472a.f292474A.mo76755b(aaVar);
        }
        this.f292321c.clear();
        LinearLayout linearLayout = this.f292323e;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v40, resolved type: com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v57, resolved type: com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v58, resolved type: com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x05d4  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x05f6  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x05fc  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94390b(com.google.p375ai.p378b.C8025st r25, com.google.android.apps.p489g.p494d.C9141ad r26, com.google.p375ai.p378b.C8034tb r27, int r28, boolean r29) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r29
            android.widget.LinearLayout r5 = r0.f292323e
            r5.getClass()
            r6 = 2131233965(0x7f080cad, float:1.8084082E38)
            r8 = 1
            r9 = 0
            if (r2 != 0) goto L_0x0040
            int r10 = r1.f28180a
            r10 = r10 & r8
            if (r10 == 0) goto L_0x0040
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r2 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r2 = r2.f292472a
            android.content.Context r11 = r2.f290307b
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r2 = r2.f290314i
            com.google.android.apps.gsa.shared.au.b.a r2 = r2.f290331a
            if (r10 == 0) goto L_0x002e
            com.google.ai.b.ax r10 = r1.f28182c
            if (r10 != 0) goto L_0x002f
            com.google.ai.b.ax r10 = com.google.p375ai.p378b.C7536ax.f26084o
            goto L_0x002f
        L_0x002e:
            r10 = 0
        L_0x002f:
            com.google.android.apps.g.d.ad r2 = com.google.android.apps.gsa.sidekick.shared.util.C91992k.m150979g(r11, r2, r9, r10)
            if (r2 == 0) goto L_0x003c
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r10 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r10 = r10.f292472a
            r10.mo94103B(r5, r2)
        L_0x003c:
            r5.setBackgroundResource(r6)
            goto L_0x0052
        L_0x0040:
            if (r2 == 0) goto L_0x0052
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r10 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r10 = r10.f292472a
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r11 = r10.f290314i
            boolean r11 = r11.f290335e
            if (r11 == 0) goto L_0x0052
            r10.mo94103B(r5, r2)
            r5.setBackgroundResource(r6)
        L_0x0052:
            r2 = r28
            r5.setBackgroundColor(r2)
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r2 = r0.f292324f
            int r6 = r1.f28183d
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r2 = r2.f292472a
            int r2 = r2.mo94426L(r6)
            r5.setMinimumHeight(r2)
            com.google.protobuf.cq r1 = r1.f28181b
            java.util.Iterator r1 = r1.iterator()
        L_0x006a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x09a3
            java.lang.Object r2 = r1.next()
            com.google.ai.b.sn r2 = (com.google.p375ai.p378b.C8019sn) r2
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r10 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r10 = r10.f292472a
            android.content.Context r10 = r10.f290307b
            r6.<init>(r10)
            int r10 = r2.f28157b
            r11 = -2
            r12 = -1
            r13 = 2
            if (r10 != r13) goto L_0x062d
            java.lang.Object r10 = r2.f28158c
            com.google.ai.b.sm r10 = (com.google.p375ai.p378b.C8018sm) r10
            int r14 = r2.f28160e
            int r14 = com.google.p375ai.p378b.C8009sd.m22924a(r14)
            if (r14 != 0) goto L_0x0095
            r14 = 1
        L_0x0095:
            android.widget.FrameLayout$LayoutParams r15 = new android.widget.FrameLayout$LayoutParams
            r15.<init>(r12, r11)
            int r11 = m173889g(r14)
            r15.gravity = r11
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r11 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r11 = r11.f292472a
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r11 = r11.f290314i
            boolean r11 = r11.f290335e
            if (r11 == 0) goto L_0x0607
            com.google.protobuf.cq r11 = r10.f28153a
            int r11 = r11.size()
            if (r11 != r8) goto L_0x0607
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r11 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.ui.f r11 = r11.mo94425a()
            com.google.protobuf.cq r14 = r10.f28153a
            java.lang.Object r14 = r14.get(r9)
            com.google.ai.b.lb r14 = (com.google.p375ai.p378b.C7818lb) r14
            com.google.ai.b.la r11 = r11.mo94513d(r14)
            com.google.ai.b.la r7 = com.google.p375ai.p378b.C7817la.TEXTLINE_WITH_IMAGE
            if (r11 == r7) goto L_0x0607
            com.google.protobuf.cq r7 = r14.f27419b
            int r7 = r7.size()
            if (r7 != r8) goto L_0x0607
            com.google.protobuf.cq r7 = r14.f27419b
            java.lang.Object r7 = r7.get(r9)
            com.google.ai.b.kv r7 = (com.google.p375ai.p378b.C7811kv) r7
            int r7 = r7.f27308b
            if (r7 != r8) goto L_0x0607
            com.google.protobuf.cq r7 = r14.f27419b
            java.lang.Object r7 = r7.get(r9)
            com.google.ai.b.kv r7 = (com.google.p375ai.p378b.C7811kv) r7
            int r11 = r7.f27308b
            if (r11 != r8) goto L_0x00ed
            java.lang.Object r7 = r7.f27309c
            com.google.ai.b.ll r7 = (com.google.p375ai.p378b.C7828ll) r7
            goto L_0x00ef
        L_0x00ed:
            com.google.ai.b.ll r7 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x00ef:
            com.google.ai.b.xj r7 = r7.f27458b
            if (r7 != 0) goto L_0x00f5
            com.google.ai.b.xj r7 = com.google.p375ai.p378b.C8150xj.f28657d
        L_0x00f5:
            com.google.protobuf.cq r7 = r7.f28661c
            int r7 = r7.size()
            if (r7 != 0) goto L_0x0607
            com.google.protobuf.cq r7 = r14.f27419b
            java.lang.Object r7 = r7.get(r9)
            com.google.ai.b.kv r7 = (com.google.p375ai.p378b.C7811kv) r7
            int r11 = r7.f27308b
            if (r11 != r8) goto L_0x010e
            java.lang.Object r7 = r7.f27309c
            com.google.ai.b.ll r7 = (com.google.p375ai.p378b.C7828ll) r7
            goto L_0x0110
        L_0x010e:
            com.google.ai.b.ll r7 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x0110:
            com.google.ai.b.xj r7 = r7.f27458b
            if (r7 != 0) goto L_0x0116
            com.google.ai.b.xj r7 = com.google.p375ai.p378b.C8150xj.f28657d
        L_0x0116:
            java.lang.String r7 = r7.f28660b
            java.lang.String r11 = "<"
            int r7 = r7.indexOf(r11)
            if (r7 != r12) goto L_0x0607
            com.google.protobuf.cq r7 = r14.f27419b
            java.lang.Object r7 = r7.get(r9)
            com.google.ai.b.kv r7 = (com.google.p375ai.p378b.C7811kv) r7
            int r11 = r7.f27308b
            if (r11 != r8) goto L_0x0131
            java.lang.Object r7 = r7.f27309c
            com.google.ai.b.ll r7 = (com.google.p375ai.p378b.C7828ll) r7
            goto L_0x0133
        L_0x0131:
            com.google.ai.b.ll r7 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x0133:
            com.google.ai.b.xj r7 = r7.f27458b
            if (r7 != 0) goto L_0x0139
            com.google.ai.b.xj r7 = com.google.p375ai.p378b.C8150xj.f28657d
        L_0x0139:
            java.lang.String r7 = r7.f28660b
            java.lang.String r11 = "&"
            int r7 = r7.indexOf(r11)
            if (r7 != r12) goto L_0x0607
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r7 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.ui.f r7 = r7.mo94425a()
            com.google.protobuf.cq r10 = r10.f28153a
            java.lang.Object r10 = r10.get(r9)
            com.google.ai.b.lb r10 = (com.google.p375ai.p378b.C7818lb) r10
            android.widget.TextView r11 = new android.widget.TextView
            android.content.Context r14 = r7.f292790b
            r11.<init>(r14)
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r14 = r7.f292791c
            if (r14 == 0) goto L_0x0164
            boolean r14 = r14.mo49317l()
            if (r14 == 0) goto L_0x0164
            r14 = 1
            goto L_0x0165
        L_0x0164:
            r14 = 0
        L_0x0165:
            com.google.ai.b.ku r16 = com.google.p375ai.p378b.C7810ku.STRING
            com.google.ai.b.la r16 = r7.mo94513d(r10)
            int r16 = r16.ordinal()
            java.lang.String r12 = "sans-serif-medium"
            r13 = 1096810496(0x41600000, float:14.0)
            switch(r16) {
                case 1: goto L_0x0516;
                case 2: goto L_0x050f;
                case 3: goto L_0x04f3;
                case 4: goto L_0x04e0;
                case 5: goto L_0x04e0;
                case 6: goto L_0x0176;
                case 7: goto L_0x04cd;
                case 8: goto L_0x04c6;
                case 9: goto L_0x04bc;
                case 10: goto L_0x04b2;
                case 11: goto L_0x049c;
                case 12: goto L_0x0481;
                case 13: goto L_0x0479;
                case 14: goto L_0x0471;
                case 15: goto L_0x0469;
                case 16: goto L_0x0455;
                case 17: goto L_0x044a;
                case 18: goto L_0x043f;
                case 19: goto L_0x0437;
                case 20: goto L_0x0424;
                case 21: goto L_0x0176;
                case 22: goto L_0x0176;
                case 23: goto L_0x0176;
                case 24: goto L_0x0176;
                case 25: goto L_0x0176;
                case 26: goto L_0x0176;
                case 27: goto L_0x0419;
                case 28: goto L_0x049c;
                case 29: goto L_0x0469;
                case 30: goto L_0x0471;
                case 31: goto L_0x0411;
                case 32: goto L_0x0406;
                case 33: goto L_0x03f2;
                case 34: goto L_0x03de;
                case 35: goto L_0x03ca;
                case 36: goto L_0x0469;
                case 37: goto L_0x03c2;
                case 38: goto L_0x0437;
                case 39: goto L_0x0469;
                case 40: goto L_0x0479;
                case 41: goto L_0x03ba;
                case 42: goto L_0x0411;
                case 43: goto L_0x03b2;
                case 44: goto L_0x0471;
                case 45: goto L_0x03aa;
                case 46: goto L_0x03a2;
                case 47: goto L_0x038d;
                case 48: goto L_0x0382;
                case 49: goto L_0x036d;
                case 50: goto L_0x0352;
                case 51: goto L_0x0330;
                case 52: goto L_0x0314;
                case 53: goto L_0x02ff;
                case 54: goto L_0x02f4;
                case 55: goto L_0x02df;
                case 56: goto L_0x02c3;
                case 57: goto L_0x02a8;
                case 58: goto L_0x0297;
                case 59: goto L_0x028f;
                case 60: goto L_0x0287;
                case 61: goto L_0x027f;
                case 62: goto L_0x0277;
                case 63: goto L_0x026f;
                case 64: goto L_0x0267;
                case 65: goto L_0x025f;
                case 66: goto L_0x0257;
                case 67: goto L_0x024f;
                case 68: goto L_0x0247;
                case 69: goto L_0x023f;
                case 70: goto L_0x0237;
                case 71: goto L_0x022f;
                case 72: goto L_0x0176;
                case 73: goto L_0x0176;
                case 74: goto L_0x0227;
                case 75: goto L_0x021f;
                case 76: goto L_0x0217;
                case 77: goto L_0x020f;
                case 78: goto L_0x0207;
                case 79: goto L_0x01ff;
                case 80: goto L_0x01f7;
                case 81: goto L_0x01ef;
                case 82: goto L_0x01e7;
                case 83: goto L_0x01df;
                case 84: goto L_0x01d7;
                case 85: goto L_0x01cf;
                case 86: goto L_0x01c7;
                case 87: goto L_0x01bf;
                case 88: goto L_0x01b7;
                case 89: goto L_0x01af;
                case 90: goto L_0x01a7;
                case 91: goto L_0x019f;
                case 92: goto L_0x0197;
                default: goto L_0x0176;
            }
        L_0x0176:
            com.google.common.f.e r12 = com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105069f.f292789a
            com.google.common.f.x r12 = r12.mo56226d()
            java.lang.String r13 = "Asked for default layout instead of setting type"
            r14 = 22090(0x564a, float:3.0955E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r14)).mo56386p(r13)
            r12 = 2132152911(0x7f16124f, float:1.9947926E38)
            r11.setTextAppearance(r12)
            android.content.Context r12 = r7.f292790b
            r13 = 1090519040(0x41000000, float:8.0)
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r12)
            int r12 = (int) r12
            r11.setPadding(r9, r12, r9, r9)
            goto L_0x0520
        L_0x0197:
            r12 = 2132152999(0x7f1612a7, float:1.9948105E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x019f:
            r12 = 2132152998(0x7f1612a6, float:1.9948103E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x01a7:
            r12 = 2132152997(0x7f1612a5, float:1.99481E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x01af:
            r12 = 2132152995(0x7f1612a3, float:1.9948097E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x01b7:
            r12 = 2132152996(0x7f1612a4, float:1.9948099E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x01bf:
            r12 = 2132152994(0x7f1612a2, float:1.9948095E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x01c7:
            r12 = 2132152993(0x7f1612a1, float:1.9948093E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x01cf:
            r12 = 2132152992(0x7f1612a0, float:1.994809E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x01d7:
            r12 = 2132152991(0x7f16129f, float:1.9948089E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x01df:
            r12 = 2132152990(0x7f16129e, float:1.9948087E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x01e7:
            r12 = 2132152474(0x7f16109a, float:1.994704E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x01ef:
            r12 = 2132152473(0x7f161099, float:1.9947038E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x01f7:
            r12 = 2132152472(0x7f161098, float:1.9947036E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x01ff:
            r12 = 2132152471(0x7f161097, float:1.9947034E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x0207:
            r12 = 2132152470(0x7f161096, float:1.9947032E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x020f:
            r12 = 2132152469(0x7f161095, float:1.994703E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x0217:
            r12 = 2132152468(0x7f161094, float:1.9947028E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x021f:
            r12 = 2132152467(0x7f161093, float:1.9947026E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x0227:
            r12 = 2132152465(0x7f161091, float:1.9947022E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x022f:
            r12 = 2132152466(0x7f161092, float:1.9947024E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x0237:
            r12 = 2132152463(0x7f16108f, float:1.9947018E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x023f:
            r12 = 2132152464(0x7f161090, float:1.994702E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x0247:
            r12 = 2132152363(0x7f16102b, float:1.9946815E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x024f:
            r12 = 2132152364(0x7f16102c, float:1.9946817E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x0257:
            r12 = 2132152365(0x7f16102d, float:1.9946819E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x025f:
            r12 = 2132152367(0x7f16102f, float:1.9946823E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x0267:
            r12 = 2132152366(0x7f16102e, float:1.994682E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x026f:
            r12 = 2132152369(0x7f161031, float:1.9946827E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x0277:
            r12 = 2132152368(0x7f161030, float:1.9946825E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x027f:
            r12 = 2132152370(0x7f161032, float:1.994683E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x0287:
            r12 = 2132152371(0x7f161033, float:1.9946831E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x028f:
            r12 = 2132152372(0x7f161034, float:1.9946833E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x0297:
            if (r8 == r14) goto L_0x029d
            r13 = 2132152918(0x7f161256, float:1.994794E38)
            goto L_0x02a0
        L_0x029d:
            r13 = 2132152917(0x7f161255, float:1.9947938E38)
        L_0x02a0:
            r11.setTextAppearance(r13)
            r11.setMaxLines(r8)
            goto L_0x0520
        L_0x02a8:
            if (r8 == r14) goto L_0x02ae
            r12 = 2132152907(0x7f16124b, float:1.9947918E38)
            goto L_0x02b1
        L_0x02ae:
            r12 = 2132152909(0x7f16124d, float:1.9947922E38)
        L_0x02b1:
            r11.setTextAppearance(r12)
            r11.setMaxLines(r8)
            android.content.Context r12 = r7.f292790b
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r12)
            int r12 = (int) r12
            r11.setPadding(r9, r9, r9, r12)
            goto L_0x0520
        L_0x02c3:
            r14 = 2132152918(0x7f161256, float:1.994794E38)
            r11.setTextAppearance(r14)
            r11.setMaxLines(r8)
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r9)
            r11.setTypeface(r12)
            android.content.Context r12 = r7.f292790b
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r12)
            int r12 = (int) r12
            r11.setPadding(r9, r9, r9, r12)
            goto L_0x0520
        L_0x02df:
            r14 = 2132152918(0x7f161256, float:1.994794E38)
            r11.setTextAppearance(r14)
            r11.setMaxLines(r8)
            android.content.Context r12 = r7.f292790b
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r12)
            int r12 = (int) r12
            r11.setPadding(r9, r9, r9, r12)
            goto L_0x0520
        L_0x02f4:
            r12 = 2132152916(0x7f161254, float:1.9947936E38)
            r11.setTextAppearance(r12)
            r11.setMaxLines(r8)
            goto L_0x0520
        L_0x02ff:
            r12 = 2132152521(0x7f1610c9, float:1.9947135E38)
            r11.setTextAppearance(r12)
            r11.setMaxLines(r8)
            android.content.Context r12 = r7.f292790b
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r12)
            int r12 = (int) r12
            r11.setPadding(r9, r9, r9, r12)
            goto L_0x0520
        L_0x0314:
            r14 = 2132152915(0x7f161253, float:1.9947934E38)
            r11.setTextAppearance(r14)
            r11.setMaxLines(r8)
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r9)
            r11.setTypeface(r12)
            android.content.Context r12 = r7.f292790b
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r12)
            int r12 = (int) r12
            r11.setPadding(r9, r9, r9, r12)
            goto L_0x0520
        L_0x0330:
            if (r8 == r14) goto L_0x0336
            r14 = 2132152915(0x7f161253, float:1.9947934E38)
            goto L_0x0339
        L_0x0336:
            r14 = 2132152913(0x7f161251, float:1.994793E38)
        L_0x0339:
            r11.setTextAppearance(r14)
            r11.setMaxLines(r8)
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r9)
            r11.setTypeface(r12)
            android.content.Context r12 = r7.f292790b
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r12)
            int r12 = (int) r12
            r11.setPadding(r9, r9, r9, r12)
            goto L_0x0520
        L_0x0352:
            if (r8 == r14) goto L_0x0358
            r12 = 2132152907(0x7f16124b, float:1.9947918E38)
            goto L_0x035b
        L_0x0358:
            r12 = 2132152909(0x7f16124d, float:1.9947922E38)
        L_0x035b:
            r11.setTextAppearance(r12)
            r11.setMaxLines(r8)
            android.content.Context r12 = r7.f292790b
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r12)
            int r12 = (int) r12
            r11.setPadding(r9, r9, r9, r12)
            goto L_0x0520
        L_0x036d:
            r12 = 2132152901(0x7f161245, float:1.9947906E38)
            r11.setTextAppearance(r12)
            r11.setMaxLines(r8)
            android.content.Context r12 = r7.f292790b
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r12)
            int r12 = (int) r12
            r11.setPadding(r9, r9, r9, r12)
            goto L_0x0520
        L_0x0382:
            r12 = 2132152529(0x7f1610d1, float:1.9947152E38)
            r11.setTextAppearance(r12)
            r11.setMaxLines(r8)
            goto L_0x0520
        L_0x038d:
            r12 = 2132152899(0x7f161243, float:1.9947902E38)
            r11.setTextAppearance(r12)
            r11.setMaxLines(r8)
            android.content.Context r12 = r7.f292790b
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r12)
            int r12 = (int) r12
            r11.setPadding(r9, r9, r9, r12)
            goto L_0x0520
        L_0x03a2:
            r12 = 2132152916(0x7f161254, float:1.9947936E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x03aa:
            r12 = 2132152918(0x7f161256, float:1.994794E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x03b2:
            r12 = 2132152915(0x7f161253, float:1.9947934E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x03ba:
            r12 = 2132152910(0x7f16124e, float:1.9947924E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x03c2:
            r12 = 2132152899(0x7f161243, float:1.9947902E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x03ca:
            r12 = 2132152915(0x7f161253, float:1.9947934E38)
            r11.setTextAppearance(r12)
            android.content.Context r12 = r7.f292790b
            r13 = 1082130432(0x40800000, float:4.0)
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r12)
            int r12 = (int) r12
            r11.setPadding(r9, r12, r9, r9)
            goto L_0x0520
        L_0x03de:
            r12 = 2132152916(0x7f161254, float:1.9947936E38)
            r13 = 1082130432(0x40800000, float:4.0)
            r11.setTextAppearance(r12)
            android.content.Context r12 = r7.f292790b
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r12)
            int r12 = (int) r12
            r11.setPadding(r9, r12, r9, r9)
            goto L_0x0520
        L_0x03f2:
            r12 = 2132152916(0x7f161254, float:1.9947936E38)
            r11.setTextAppearance(r12)
            android.content.Context r12 = r7.f292790b
            r13 = 1098907648(0x41800000, float:16.0)
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r12)
            int r12 = (int) r12
            r11.setPadding(r9, r12, r9, r9)
            goto L_0x0520
        L_0x0406:
            r12 = 2132152915(0x7f161253, float:1.9947934E38)
            r11.setTextAppearance(r12)
            r11.setMaxLines(r8)
            goto L_0x0520
        L_0x0411:
            r12 = 2132152912(0x7f161250, float:1.9947928E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x0419:
            r12 = 2132152901(0x7f161245, float:1.9947906E38)
            r11.setTextAppearance(r12)
            r11.setMaxLines(r8)
            goto L_0x0520
        L_0x0424:
            r13 = 2132152912(0x7f161250, float:1.9947928E38)
            r11.setTextAppearance(r13)
            r13 = 2
            r11.setMaxLines(r13)
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r9)
            r11.setTypeface(r12)
            goto L_0x0520
        L_0x0437:
            r12 = 2132152901(0x7f161245, float:1.9947906E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x043f:
            r12 = 2132152918(0x7f161256, float:1.994794E38)
            r11.setTextAppearance(r12)
            r11.setMaxLines(r8)
            goto L_0x0520
        L_0x044a:
            r12 = 2132152907(0x7f16124b, float:1.9947918E38)
            r11.setTextAppearance(r12)
            r11.setMaxLines(r8)
            goto L_0x0520
        L_0x0455:
            r12 = 2132152915(0x7f161253, float:1.9947934E38)
            r11.setTextAppearance(r12)
            android.content.Context r12 = r7.f292790b
            r13 = 1082130432(0x40800000, float:4.0)
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r12)
            int r12 = (int) r12
            r11.setPadding(r9, r12, r9, r9)
            goto L_0x0520
        L_0x0469:
            r12 = 2132152907(0x7f16124b, float:1.9947918E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x0471:
            r12 = 2132152911(0x7f16124f, float:1.9947926E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x0479:
            r12 = 2132152904(0x7f161248, float:1.9947912E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x0481:
            r12 = 2132152899(0x7f161243, float:1.9947902E38)
            r11.setTextAppearance(r12)
            android.content.Context r12 = r7.f292790b
            r13 = 1098907648(0x41800000, float:16.0)
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r12)
            int r12 = (int) r12
            android.content.Context r14 = r7.f292790b
            float r13 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r14)
            int r13 = (int) r13
            r11.setPadding(r12, r9, r13, r9)
            goto L_0x0520
        L_0x049c:
            r12 = 2132152915(0x7f161253, float:1.9947934E38)
            r11.setTextAppearance(r12)
            r11.setMaxLines(r8)
            android.content.Context r12 = r7.f292790b
            r13 = 1082130432(0x40800000, float:4.0)
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r12)
            int r12 = (int) r12
            r11.setPadding(r9, r12, r9, r9)
            goto L_0x0520
        L_0x04b2:
            r12 = 2132152900(0x7f161244, float:1.9947904E38)
            r11.setTextAppearance(r12)
            r11.setMaxLines(r8)
            goto L_0x0520
        L_0x04bc:
            r12 = 2132152899(0x7f161243, float:1.9947902E38)
            r11.setTextAppearance(r12)
            r11.setMaxLines(r8)
            goto L_0x0520
        L_0x04c6:
            r12 = 2132152919(0x7f161257, float:1.9947943E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x04cd:
            r12 = 2132152919(0x7f161257, float:1.9947943E38)
            r11.setTextAppearance(r12)
            android.content.Context r12 = r7.f292790b
            r13 = 1090519040(0x41000000, float:8.0)
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r12)
            int r12 = (int) r12
            r11.setPadding(r9, r12, r9, r9)
            goto L_0x0520
        L_0x04e0:
            r12 = 2132152911(0x7f16124f, float:1.9947926E38)
            r13 = 1090519040(0x41000000, float:8.0)
            r11.setTextAppearance(r12)
            android.content.Context r12 = r7.f292790b
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r12)
            int r12 = (int) r12
            r11.setPadding(r9, r12, r9, r9)
            goto L_0x0520
        L_0x04f3:
            r12 = 2132152911(0x7f16124f, float:1.9947926E38)
            r11.setTextAppearance(r12)
            r12 = 1099956224(0x41900000, float:18.0)
            android.content.Context r13 = r7.f292790b
            float r12 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r12, r13)
            int r12 = (int) r12
            r13 = 1099956224(0x41900000, float:18.0)
            android.content.Context r14 = r7.f292790b
            float r13 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r13, r14)
            int r13 = (int) r13
            r11.setPadding(r9, r12, r9, r13)
            goto L_0x0520
        L_0x050f:
            r12 = 2132152903(0x7f161247, float:1.994791E38)
            r11.setTextAppearance(r12)
            goto L_0x0520
        L_0x0516:
            r12 = 2132152899(0x7f161243, float:1.9947902E38)
            r11.setTextAppearance(r12)
            r12 = 2
            r11.setMaxLines(r12)
        L_0x0520:
            com.google.android.apps.gsa.staticplugins.nowcards.ui.e r12 = r7.f292793e
            boolean r12 = r12.f292787c
            if (r12 == 0) goto L_0x056f
            com.google.protobuf.cq r12 = r10.f27419b
            java.lang.Object r12 = r12.get(r9)
            com.google.ai.b.kv r12 = (com.google.p375ai.p378b.C7811kv) r12
            int r13 = r12.f27308b
            if (r13 != r8) goto L_0x0537
            java.lang.Object r12 = r12.f27309c
            com.google.ai.b.ll r12 = (com.google.p375ai.p378b.C7828ll) r12
            goto L_0x0539
        L_0x0537:
            com.google.ai.b.ll r12 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x0539:
            int r12 = r12.f27457a
            r12 = r12 & 4
            if (r12 == 0) goto L_0x056f
            com.google.protobuf.cq r12 = r10.f27419b
            java.lang.Object r12 = r12.get(r9)
            com.google.ai.b.kv r12 = (com.google.p375ai.p378b.C7811kv) r12
            int r13 = r12.f27308b
            if (r13 != r8) goto L_0x0550
            java.lang.Object r12 = r12.f27309c
            com.google.ai.b.ll r12 = (com.google.p375ai.p378b.C7828ll) r12
            goto L_0x0552
        L_0x0550:
            com.google.ai.b.ll r12 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x0552:
            int r12 = r12.f27460d
            if (r12 == 0) goto L_0x056f
            com.google.protobuf.cq r12 = r10.f27419b
            java.lang.Object r12 = r12.get(r9)
            com.google.ai.b.kv r12 = (com.google.p375ai.p378b.C7811kv) r12
            int r13 = r12.f27308b
            if (r13 != r8) goto L_0x0567
            java.lang.Object r12 = r12.f27309c
            com.google.ai.b.ll r12 = (com.google.p375ai.p378b.C7828ll) r12
            goto L_0x0569
        L_0x0567:
            com.google.ai.b.ll r12 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x0569:
            int r12 = r12.f27460d
            r11.setTextColor(r12)
            goto L_0x05b7
        L_0x056f:
            com.google.android.apps.gsa.staticplugins.nowcards.ui.e r12 = r7.f292793e
            boolean r12 = r12.f292787c
            if (r12 == 0) goto L_0x0586
            android.content.Context r12 = r7.f292790b
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131100395(0x7f0602eb, float:1.781317E38)
            int r12 = r12.getColor(r13)
            r11.setTextColor(r12)
            goto L_0x05b7
        L_0x0586:
            com.google.protobuf.cq r12 = r10.f27419b
            java.lang.Object r12 = r12.get(r9)
            com.google.ai.b.kv r12 = (com.google.p375ai.p378b.C7811kv) r12
            int r13 = r12.f27308b
            if (r13 != r8) goto L_0x0597
            java.lang.Object r12 = r12.f27309c
            com.google.ai.b.ll r12 = (com.google.p375ai.p378b.C7828ll) r12
            goto L_0x0599
        L_0x0597:
            com.google.ai.b.ll r12 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x0599:
            int r12 = r12.f27457a
            r13 = 2
            r12 = r12 & r13
            if (r12 == 0) goto L_0x05b7
            com.google.protobuf.cq r12 = r10.f27419b
            java.lang.Object r12 = r12.get(r9)
            com.google.ai.b.kv r12 = (com.google.p375ai.p378b.C7811kv) r12
            int r13 = r12.f27308b
            if (r13 != r8) goto L_0x05b0
            java.lang.Object r12 = r12.f27309c
            com.google.ai.b.ll r12 = (com.google.p375ai.p378b.C7828ll) r12
            goto L_0x05b2
        L_0x05b0:
            com.google.ai.b.ll r12 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x05b2:
            int r12 = r12.f27459c
            r11.setTextColor(r12)
        L_0x05b7:
            com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105069f.m174308e(r10, r11)
            int r12 = r10.f27421d
            if (r12 <= 0) goto L_0x05c9
            int r13 = r11.getMaxLines()
            if (r12 == r13) goto L_0x05c9
            int r12 = r10.f27421d
            r11.setMaxLines(r12)
        L_0x05c9:
            android.text.TextUtils$TruncateAt r12 = android.text.TextUtils.TruncateAt.END
            r11.setEllipsize(r12)
            int r12 = r10.f27418a
            r12 = r12 & 32
            if (r12 == 0) goto L_0x05e5
            com.google.android.apps.gsa.shared.au.b.a r12 = r7.f292792d
            android.content.Context r7 = r7.f292790b
            com.google.ai.b.xj r13 = r10.f27425h
            if (r13 != 0) goto L_0x05de
            com.google.ai.b.xj r13 = com.google.p375ai.p378b.C8150xj.f28657d
        L_0x05de:
            java.lang.String r7 = r12.mo83231a(r7, r13)
            r11.setContentDescription(r7)
        L_0x05e5:
            com.google.protobuf.cq r7 = r10.f27419b
            java.lang.Object r7 = r7.get(r9)
            com.google.ai.b.kv r7 = (com.google.p375ai.p378b.C7811kv) r7
            int r10 = r7.f27308b
            if (r10 != r8) goto L_0x05f6
            java.lang.Object r7 = r7.f27309c
            com.google.ai.b.ll r7 = (com.google.p375ai.p378b.C7828ll) r7
            goto L_0x05f8
        L_0x05f6:
            com.google.ai.b.ll r7 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x05f8:
            com.google.ai.b.xj r7 = r7.f27458b
            if (r7 != 0) goto L_0x05fe
            com.google.ai.b.xj r7 = com.google.p375ai.p378b.C8150xj.f28657d
        L_0x05fe:
            java.lang.String r7 = r7.f28660b
            r11.setText(r7)
            r11.setLayoutParams(r15)
            goto L_0x0627
        L_0x0607:
            com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView r11 = new com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r7 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r7 = r7.f292472a
            android.content.Context r7 = r7.f290307b
            r11.<init>(r7)
            r11.setLayoutParams(r15)
            java.util.List r7 = r0.f292320b
            r7.add(r11)
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r7 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.ui.f r7 = r7.mo94425a()
            com.google.protobuf.cq r10 = r10.f28153a
            com.google.android.apps.gsa.now.shared.ui.j r12 = r0.f292322d
            r11.mo94502d(r7, r10, r12)
        L_0x0627:
            r23 = r1
            r12 = r11
            r11 = 0
            goto L_0x091b
        L_0x062d:
            r7 = 3
            if (r10 != r7) goto L_0x0866
            java.lang.Object r7 = r2.f28158c
            com.google.ai.b.sk r7 = (com.google.p375ai.p378b.C8016sk) r7
            int r10 = r2.f28160e
            int r10 = com.google.p375ai.p378b.C8009sd.m22924a(r10)
            if (r10 != 0) goto L_0x063d
            r10 = 1
        L_0x063d:
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r12 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r12 = r12.f292472a
            com.google.android.apps.gsa.now.shared.ui.i r12 = r12.f292474A
            r13 = 2131626412(0x7f0e09ac, float:1.888006E38)
            com.google.android.apps.gsa.now.shared.ui.h r12 = r12.mo76754a(r13)
            com.google.android.apps.gsa.staticplugins.nowcards.g.aa r12 = (com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104903aa) r12
            if (r12 != 0) goto L_0x068b
            android.widget.FrameLayout r12 = new android.widget.FrameLayout
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r13 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r13 = r13.f292472a
            android.content.Context r13 = r13.f290307b
            r12.<init>(r13)
            android.widget.FrameLayout$LayoutParams r13 = new android.widget.FrameLayout$LayoutParams
            r13.<init>(r11, r11)
            r12.setLayoutParams(r13)
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r13 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r13 = r13.f292472a
            android.content.Context r13 = r13.f290307b
            android.content.res.Resources$Theme r13 = r13.getTheme()
            r14 = 2132149527(0x7f160517, float:1.9941063E38)
            r13.applyStyle(r14, r8)
            com.google.android.apps.gsa.now.shared.ui.CrossfadingWebImageView r13 = new com.google.android.apps.gsa.now.shared.ui.CrossfadingWebImageView
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r14 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r14 = r14.f292472a
            android.content.Context r14 = r14.f290307b
            r13.<init>(r14)
            r14 = 2131434489(0x7f0b1bf9, float:1.8490793E38)
            r13.setId(r14)
            r12.addView(r13)
            com.google.android.apps.gsa.staticplugins.nowcards.g.aa r13 = new com.google.android.apps.gsa.staticplugins.nowcards.g.aa
            r13.<init>(r12)
            r12 = r13
        L_0x068b:
            r12.f292318c = r6
            java.util.List r13 = r0.f292321c
            r13.add(r12)
            android.view.View r12 = r12.f227389a
            int r13 = r7.f28144b
            r14 = 2
            if (r13 != r14) goto L_0x0730
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r13 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r13 = r13.f292472a
            android.content.Context r13 = r13.f290307b
            java.lang.Object r14 = r7.f28145c
            com.google.ai.b.tj r14 = (com.google.p375ai.p378b.C8042tj) r14
            com.google.android.apps.g.d.cj r15 = com.google.android.apps.p489g.p494d.C9201cj.f31773u
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.android.apps.g.d.ci r15 = (com.google.android.apps.p489g.p494d.C9200ci) r15
            int r11 = r14.f28244a
            r11 = r11 & r8
            if (r11 == 0) goto L_0x06c6
            java.lang.String r11 = r14.f28245b
            r15.copyOnWrite()
            com.google.protobuf.bv r9 = r15.instance
            com.google.android.apps.g.d.cj r9 = (com.google.android.apps.p489g.p494d.C9201cj) r9
            r11.getClass()
            r23 = r1
            int r1 = r9.f31775a
            r1 = r1 | r8
            r9.f31775a = r1
            r9.f31776b = r11
            goto L_0x06c8
        L_0x06c6:
            r23 = r1
        L_0x06c8:
            int r1 = r14.f28244a
            r9 = 2
            r1 = r1 & r9
            if (r1 == 0) goto L_0x06e1
            java.lang.String r1 = r14.f28246c
            r15.copyOnWrite()
            com.google.protobuf.bv r11 = r15.instance
            com.google.android.apps.g.d.cj r11 = (com.google.android.apps.p489g.p494d.C9201cj) r11
            r1.getClass()
            int r8 = r11.f31775a
            r8 = r8 | r9
            r11.f31775a = r8
            r11.f31777c = r1
        L_0x06e1:
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r1 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r1 = r1.f292472a
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r1 = r1.f290314i
            com.google.android.apps.gsa.shared.au.b.a r1 = r1.f290331a
            com.google.ai.b.xj r8 = r14.f28247d
            if (r8 != 0) goto L_0x06ef
            com.google.ai.b.xj r8 = com.google.p375ai.p378b.C8150xj.f28657d
        L_0x06ef:
            java.lang.String r1 = r1.mo83231a(r13, r8)
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 != 0) goto L_0x06fc
            r15.mo17452a(r1)
        L_0x06fc:
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r1 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r1 = r1.f292472a
            com.google.android.apps.gsa.staticplugins.nowcards.base.n r1 = r1.f290314i
            com.google.android.apps.gsa.shared.au.b.a r1 = r1.f290331a
            int r8 = r14.f28244a
            r8 = r8 & 8
            if (r8 == 0) goto L_0x0711
            com.google.ai.b.ax r8 = r14.f28248e
            if (r8 != 0) goto L_0x0712
            com.google.ai.b.ax r8 = com.google.p375ai.p378b.C7536ax.f26084o
            goto L_0x0712
        L_0x0711:
            r8 = 0
        L_0x0712:
            r9 = 0
            com.google.android.apps.g.d.ad r1 = com.google.android.apps.gsa.sidekick.shared.util.C91992k.m150979g(r13, r1, r9, r8)
            if (r1 == 0) goto L_0x0728
            r15.copyOnWrite()
            com.google.protobuf.bv r8 = r15.instance
            com.google.android.apps.g.d.cj r8 = (com.google.android.apps.p489g.p494d.C9201cj) r8
            r8.f31779e = r1
            int r1 = r8.f31775a
            r1 = r1 | 4
            r8.f31775a = r1
        L_0x0728:
            com.google.protobuf.bv r1 = r15.build()
            com.google.android.apps.g.d.cj r1 = (com.google.android.apps.p489g.p494d.C9201cj) r1
            goto L_0x07ae
        L_0x0730:
            r23 = r1
            r1 = 1
            if (r13 != r1) goto L_0x073a
            java.lang.Object r1 = r7.f28145c
            com.google.ai.b.nw r1 = (com.google.p375ai.p378b.C7893nw) r1
            goto L_0x073c
        L_0x073a:
            com.google.ai.b.nw r1 = com.google.p375ai.p378b.C7893nw.f27731q
        L_0x073c:
            com.google.android.apps.g.d.cj r8 = com.google.android.apps.p489g.p494d.C9201cj.f31773u
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.g.d.ci r8 = (com.google.android.apps.p489g.p494d.C9200ci) r8
            if (r1 == 0) goto L_0x07a8
            int r11 = r1.f27733a
            r11 = r11 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0760
            java.lang.String r11 = r1.f27743k
            r8.copyOnWrite()
            com.google.protobuf.bv r13 = r8.instance
            com.google.android.apps.g.d.cj r13 = (com.google.android.apps.p489g.p494d.C9201cj) r13
            r11.getClass()
            int r14 = r13.f31775a
            r15 = 1
            r14 = r14 | r15
            r13.f31775a = r14
            r13.f31776b = r11
        L_0x0760:
            int r11 = r1.f27733a
            r11 = r11 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x077a
            java.lang.String r11 = r1.f27745m
            r8.copyOnWrite()
            com.google.protobuf.bv r13 = r8.instance
            com.google.android.apps.g.d.cj r13 = (com.google.android.apps.p489g.p494d.C9201cj) r13
            r11.getClass()
            int r14 = r13.f31775a
            r15 = 2
            r14 = r14 | r15
            r13.f31775a = r14
            r13.f31777c = r11
        L_0x077a:
            int r11 = r1.f27733a
            r13 = 1
            r11 = r11 & r13
            if (r11 == 0) goto L_0x0791
            int r11 = r1.f27734b
            r8.copyOnWrite()
            com.google.protobuf.bv r13 = r8.instance
            com.google.android.apps.g.d.cj r13 = (com.google.android.apps.p489g.p494d.C9201cj) r13
            int r14 = r13.f31775a
            r14 = r14 | 8
            r13.f31775a = r14
            r13.f31781g = r11
        L_0x0791:
            int r11 = r1.f27733a
            r13 = 2
            r11 = r11 & r13
            if (r11 == 0) goto L_0x07a8
            int r1 = r1.f27735c
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.android.apps.g.d.cj r11 = (com.google.android.apps.p489g.p494d.C9201cj) r11
            int r13 = r11.f31775a
            r13 = r13 | 16
            r11.f31775a = r13
            r11.f31782h = r1
        L_0x07a8:
            com.google.protobuf.bv r1 = r8.build()
            com.google.android.apps.g.d.cj r1 = (com.google.android.apps.p489g.p494d.C9201cj) r1
        L_0x07ae:
            int r8 = r7.f28149g
            int r8 = com.google.p375ai.p378b.C8007sb.m22923a(r8)
            if (r8 != 0) goto L_0x07b7
            r8 = 1
        L_0x07b7:
            int r11 = r2.f28156a
            r11 = r11 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x07c4
            com.google.ai.b.tb r11 = r2.f28166k
            if (r11 != 0) goto L_0x07c6
            com.google.ai.b.tb r11 = com.google.p375ai.p378b.C8034tb.f28222f
            goto L_0x07c6
        L_0x07c4:
            com.google.ai.b.tb r11 = com.google.p375ai.p378b.C8034tb.f28222f
        L_0x07c6:
            int r13 = r7.f28143a
            r14 = r13 & 4
            if (r14 == 0) goto L_0x07cf
            int r14 = r7.f28146d
            goto L_0x07d9
        L_0x07cf:
            int r14 = r1.f31775a
            r14 = r14 & 8
            if (r14 == 0) goto L_0x07d8
            int r14 = r1.f31781g
            goto L_0x07d9
        L_0x07d8:
            r14 = 0
        L_0x07d9:
            r13 = r13 & 8
            if (r13 == 0) goto L_0x07e0
            int r13 = r7.f28147e
            goto L_0x07ea
        L_0x07e0:
            int r13 = r1.f31775a
            r13 = r13 & 16
            if (r13 == 0) goto L_0x07e9
            int r13 = r1.f31782h
            goto L_0x07ea
        L_0x07e9:
            r13 = 0
        L_0x07ea:
            if (r14 <= 0) goto L_0x07f2
            int r15 = r11.f28227d
            int r9 = r11.f28228e
            int r15 = r15 + r9
            int r14 = r14 + r15
        L_0x07f2:
            if (r13 <= 0) goto L_0x07fa
            int r9 = r11.f28225b
            int r11 = r11.f28226c
            int r9 = r9 + r11
            int r13 = r13 + r9
        L_0x07fa:
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            if (r14 <= 0) goto L_0x0807
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r11 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r11 = r11.f292472a
            int r11 = r11.mo94426L(r14)
            goto L_0x0808
        L_0x0807:
            r11 = -2
        L_0x0808:
            if (r13 <= 0) goto L_0x0813
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r14 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r14 = r14.f292472a
            int r13 = r14.mo94426L(r13)
            goto L_0x0814
        L_0x0813:
            r13 = -2
        L_0x0814:
            r9.<init>(r11, r13)
            boolean r11 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148875g()
            r13 = -1
            int r8 = r8 + r13
            r13 = 1
            if (r8 == r13) goto L_0x082d
            r13 = 2
            if (r8 == r13) goto L_0x082b
            if (r11 == 0) goto L_0x0829
            r8 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x0834
        L_0x0829:
            r8 = 3
            goto L_0x0834
        L_0x082b:
            r8 = 1
            goto L_0x0834
        L_0x082d:
            if (r11 == 0) goto L_0x0833
            r8 = 8388613(0x800005, float:1.175495E-38)
            goto L_0x0834
        L_0x0833:
            r8 = 5
        L_0x0834:
            int r10 = m173889g(r10)
            r8 = r8 | r10
            r9.gravity = r8
            r12.setLayoutParams(r9)
            int r8 = r7.f28143a
            r8 = r8 & 16
            if (r8 == 0) goto L_0x084b
            int r7 = r7.f28148f
            r12.setBackgroundColor(r7)
            r11 = 0
            goto L_0x084f
        L_0x084b:
            r11 = 0
            r12.setBackground(r11)
        L_0x084f:
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r7 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r7 = r7.f292472a
            r20 = 0
            r21 = 0
            r22 = 0
            r16 = r7
            r17 = r12
            r18 = r12
            r19 = r1
            r16.mo94124p(r17, r18, r19, r20, r21, r22)
            goto L_0x091b
        L_0x0866:
            r23 = r1
            r1 = 1
            r11 = 0
            if (r10 != r1) goto L_0x091a
            java.lang.Object r1 = r2.f28158c
            com.google.ai.b.sf r1 = (com.google.p375ai.p378b.C8011sf) r1
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r7 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r7 = r7.f292472a
            com.google.android.apps.gsa.sidekick.shared.cards.a.h r8 = r7.f292477y
            android.content.Context r7 = r7.f290307b
            com.google.android.apps.g.d.u r9 = com.google.android.apps.p489g.p494d.C9277u.GRID
            com.google.android.apps.gsa.sidekick.shared.cards.a.g r7 = r8.mo86092a(r7, r9)
            com.google.android.apps.gsa.staticplugins.nowcards.base.l r7 = (com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l) r7
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r8 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r8 = r8.f292472a
            com.google.android.apps.gsa.sidekick.shared.cards.a.j r8 = r8.f290309d
            if (r7 == 0) goto L_0x091a
            r7.mo94037t(r4)
            com.google.android.apps.gsa.sidekick.shared.monet.util.e r9 = r0.f292319a
            r7.f290316k = r9
            com.google.android.apps.g.d.v r9 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.apps.g.d.q r9 = (com.google.android.apps.p489g.p494d.C9273q) r9
            com.google.android.apps.g.d.u r10 = com.google.android.apps.p489g.p494d.C9277u.GRID
            r9.copyOnWrite()
            com.google.protobuf.bv r12 = r9.instance
            com.google.android.apps.g.d.v r12 = (com.google.android.apps.p489g.p494d.C9278v) r12
            int r10 = r10.f32164ay
            r12.f32196c = r10
            int r10 = r12.f32192a
            r13 = 1
            r10 = r10 | r13
            r12.f32192a = r10
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r10 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r10 = r10.f292472a
            com.google.android.apps.g.d.v r10 = r10.f290310e
            com.google.ai.b.hj r10 = r10.f32174H
            if (r10 != 0) goto L_0x08b6
            com.google.ai.b.hj r10 = com.google.p375ai.p378b.C7718hj.f26927af
        L_0x08b6:
            r9.copyOnWrite()
            com.google.protobuf.bv r12 = r9.instance
            com.google.android.apps.g.d.v r12 = (com.google.android.apps.p489g.p494d.C9278v) r12
            r10.getClass()
            r12.f32174H = r10
            int r10 = r12.f32192a
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 | r13
            r12.f32192a = r10
            com.google.android.apps.g.d.ax r10 = com.google.android.apps.p489g.p494d.C9161ax.f31622d
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.apps.g.d.aw r10 = (com.google.android.apps.p489g.p494d.C9160aw) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.apps.g.d.ax r12 = (com.google.android.apps.p489g.p494d.C9161ax) r12
            r1.getClass()
            r12.f31625b = r1
            int r1 = r12.f31624a
            r13 = 1
            r1 = r1 | r13
            r12.f31624a = r1
            r9.copyOnWrite()
            com.google.protobuf.bv r1 = r9.instance
            com.google.android.apps.g.d.v r1 = (com.google.android.apps.p489g.p494d.C9278v) r1
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.apps.g.d.ax r10 = (com.google.android.apps.p489g.p494d.C9161ax) r10
            r10.getClass()
            r1.f32216w = r10
            int r10 = r1.f32192a
            r12 = 1048576(0x100000, float:1.469368E-39)
            r10 = r10 | r12
            r1.f32192a = r10
            r9.copyOnWrite()
            com.google.protobuf.bv r1 = r9.instance
            com.google.android.apps.g.d.v r1 = (com.google.android.apps.p489g.p494d.C9278v) r1
            int r10 = r1.f32195b
            r12 = 32768(0x8000, float:4.5918E-41)
            r10 = r10 | r12
            r1.f32195b = r10
            r10 = 1
            r1.f32188V = r10
            com.google.protobuf.bv r1 = r9.build()
            com.google.android.apps.g.d.v r1 = (com.google.android.apps.p489g.p494d.C9278v) r1
            android.view.View r1 = r7.mo86091a(r8, r1)
            r12 = r1
            goto L_0x091b
        L_0x091a:
            r12 = r11
        L_0x091b:
            if (r12 != 0) goto L_0x0928
            android.view.View r12 = new android.view.View
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r1 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r1 = r1.f292472a
            android.content.Context r1 = r1.f290307b
            r12.<init>(r1)
        L_0x0928:
            com.google.ai.b.sp r1 = r2.f28159d
            if (r1 != 0) goto L_0x092e
            com.google.ai.b.sp r1 = com.google.p375ai.p378b.C8021sp.f28168c
        L_0x092e:
            int r1 = r1.f28170a
            r7 = 1
            if (r1 != r7) goto L_0x0950
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r1 = r0.f292324f
            com.google.ai.b.sp r8 = r2.f28159d
            if (r8 != 0) goto L_0x093b
            com.google.ai.b.sp r8 = com.google.p375ai.p378b.C8021sp.f28168c
        L_0x093b:
            int r9 = r8.f28170a
            if (r9 != r7) goto L_0x0948
            java.lang.Object r8 = r8.f28171b
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            goto L_0x0949
        L_0x0948:
            r8 = 0
        L_0x0949:
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r1 = r1.f292472a
            int r1 = r1.mo94426L(r8)
            goto L_0x0951
        L_0x0950:
            r1 = 0
        L_0x0951:
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = -1
            r8.<init>(r1, r9)
            int r1 = r2.f28156a
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0980
            com.google.ai.b.sp r1 = r2.f28159d
            if (r1 != 0) goto L_0x0964
            com.google.ai.b.sp r9 = com.google.p375ai.p378b.C8021sp.f28168c
            goto L_0x0965
        L_0x0964:
            r9 = r1
        L_0x0965:
            int r9 = r9.f28170a
            r10 = 2
            if (r9 != r10) goto L_0x0984
            if (r1 != 0) goto L_0x096e
            com.google.ai.b.sp r1 = com.google.p375ai.p378b.C8021sp.f28168c
        L_0x096e:
            int r9 = r1.f28170a
            if (r9 != r10) goto L_0x097b
            java.lang.Object r1 = r1.f28171b
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x097c
        L_0x097b:
            r1 = 0
        L_0x097c:
            float r1 = (float) r1
            r8.weight = r1
            goto L_0x0984
        L_0x0980:
            r1 = 1065353216(0x3f800000, float:1.0)
            r8.weight = r1
        L_0x0984:
            r6.setLayoutParams(r8)
            r0.m173887e(r6, r2, r4)
            r6.addView(r12)
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r1 = r0.f292324f
            com.google.ai.b.tb r2 = r2.f28166k
            if (r2 != 0) goto L_0x0995
            com.google.ai.b.tb r2 = com.google.p375ai.p378b.C8034tb.f28222f
        L_0x0995:
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r1 = r1.f292472a
            r1.mo94428N(r2, r12)
            r5.addView(r6)
            r1 = r23
            r8 = 1
            r9 = 0
            goto L_0x006a
        L_0x09a3:
            if (r3 == 0) goto L_0x09ad
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r1 = r0.f292324f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r1 = r1.f292472a
            r1.mo94428N(r3, r5)
            return
        L_0x09ad:
            com.google.android.apps.gsa.staticplugins.nowcards.g.w r1 = r0.f292324f
            com.google.ai.b.tb r2 = com.google.p375ai.p378b.C8034tb.f28222f
            com.google.android.apps.gsa.staticplugins.nowcards.g.x r1 = r1.f292472a
            r1.mo94428N(r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104904ab.mo94390b(com.google.ai.b.st, com.google.android.apps.g.d.ad, com.google.ai.b.tb, int, boolean):void");
    }
}
