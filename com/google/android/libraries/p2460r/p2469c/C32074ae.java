package com.google.android.libraries.p2460r.p2469c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.libraries.p2460r.p2464b.C32050a;
import com.google.android.libraries.p2460r.p2469c.p2471b.C32097a;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57359ak;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57368at;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57369au;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57387bl;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57388bm;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57413ck;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57414cl;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57416cn;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57467ek;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57471eo;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57515w;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.r.c.ae */
/* compiled from: PG */
final class C32074ae extends C32138p {

    /* renamed from: a */
    private C32077ah f86120a = null;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32074ae(android.content.Context r3, com.google.android.libraries.p2460r.p2469c.C32127e r4) {
        /*
            r2 = this;
            com.google.android.libraries.r.c.b.a r0 = new com.google.android.libraries.r.c.b.a
            r0.<init>(r3)
            r1 = 1
            r0.setCropToPadding(r1)
            com.google.android.libraries.r.c.av r1 = com.google.android.libraries.p2460r.p2469c.C32073ad.f86178a
            r2.<init>(r3, r4, r0)
            r2.f86303g = r1
            r3 = 0
            r2.f86120a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p2460r.p2469c.C32074ae.<init>(android.content.Context, com.google.android.libraries.r.c.e):void");
    }

    /* renamed from: a */
    public final void mo37854a() {
        C32077ah ahVar = this.f86120a;
        if (ahVar != null) {
            ahVar.f86124b = true;
            this.f86120a = null;
        }
        ((ImageView) this.f86300d).setImageDrawable((Drawable) null);
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ void mo37855m(Object obj, C32148z zVar) {
        C57388bm bmVar = (C57388bm) obj;
        C32094ay f = mo37940f();
        Context context = this.f86298b;
        int d = f.mo37873d(context);
        this.f86308l = d;
        if (C57471eo.m88361a(f.f86174b.f153520d) == 3) {
            if (d <= 0) {
                d = -3;
            }
            this.f86309m = d;
            return;
        }
        this.f86309m = f.mo37872c(context);
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo37853w(Object obj, C32148z zVar) {
        C57414cl clVar;
        float f;
        ImageView.ScaleType scaleType;
        int i;
        C57515w wVar;
        C57515w wVar2;
        C57388bm bmVar = (C57388bm) obj;
        int i2 = bmVar.f153299a;
        int a = C57387bl.m88339a(i2);
        int i3 = a - 1;
        Integer num = null;
        if (a != 0) {
            boolean z = true;
            if (i3 != 0) {
                if (i3 != 1) {
                    C57404cb cbVar = C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT;
                    Object[] objArr = new Object[1];
                    int a2 = C57387bl.m88339a(bmVar.f153299a);
                    objArr[0] = a2 != 1 ? a2 != 2 ? a2 != 3 ? "null" : "CONTENT_NOT_SET" : "IMAGE_BINDING" : "IMAGE";
                    throw new C32083an(cbVar, String.format("Unsupported or missing content in ImageElement: %s", objArr));
                }
                if (i2 == 2) {
                    wVar = (C57515w) bmVar.f153300b;
                } else {
                    wVar = C57515w.f153630c;
                }
                C57359ak e = zVar.mo37963e(wVar);
                if (e.f153236b == 5) {
                    clVar = (C57414cl) e.f153237c;
                } else {
                    if (bmVar.f153299a == 2) {
                        wVar2 = (C57515w) bmVar.f153300b;
                    } else {
                        wVar2 = C57515w.f153630c;
                    }
                    if (wVar2.f153633b) {
                        mo37948o(4);
                        return;
                    }
                    throw new C32083an(C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT, String.format("Image binding %s had no content", new Object[]{e.f153238d}));
                }
            } else if (i2 == 3) {
                clVar = (C57414cl) bmVar.f153300b;
            } else {
                clVar = C57414cl.f153380b;
            }
            if (mo37940f().mo37881j()) {
                C32094ay f2 = mo37940f();
                ((C32097a) this.f86300d).setImageDrawable(f2.mo37874e(f2.mo37876f()));
            }
            C57414cl g = zVar.mo37965g(clVar);
            C32097a aVar = (C32097a) this.f86300d;
            Iterator it = g.f153382a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    f = 0.0f;
                    break;
                }
                C57416cn cnVar = (C57416cn) it.next();
                int i4 = cnVar.f153390e;
                if (i4 > 0 && (i = cnVar.f153389d) > 0) {
                    f = ((float) i) / ((float) i4);
                    break;
                }
            }
            aVar.f86179a = f;
            aVar.invalidate();
            if (this.f86120a != null) {
                z = false;
            }
            C32050a.m59726a(z, "An image loading callback exists; unbind first", new Object[0]);
            if ((mo37940f().f86174b.f153517a & 2) != 0) {
                num = Integer.valueOf(mo37940f().f86174b.f153524h);
            }
            Integer num2 = num;
            int a3 = C57413ck.m88348a(mo37940f().f86174b.f153538v);
            if (a3 == 0) {
                a3 = 2;
            }
            if (a3 - 1 != 2) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            } else {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            }
            ImageView.ScaleType scaleType2 = scaleType;
            ImageView imageView = (ImageView) this.f86300d;
            C57467ek ekVar = mo37940f().f86174b.f153526j;
            if (ekVar == null) {
                ekVar = C57467ek.f153507d;
            }
            C32077ah ahVar = new C32077ah(imageView, scaleType2, num2, ekVar.f153511c, this.f86299c);
            this.f86120a = ahVar;
            this.f86299c.f86274c.f86117a.mo37844c(g, ahVar);
            return;
        }
        throw null;
    }

    /* renamed from: v */
    public final /* bridge */ /* synthetic */ Object mo37852v(C57369au auVar) {
        if (auVar.f153257b == 3) {
            return (C57388bm) auVar.f153258c;
        }
        throw new C32083an(C57404cb.ERR_MISSING_ELEMENT_CONTENTS, String.format("Missing ImageElement; has %s", new Object[]{C57368at.m88332a(C57368at.m88333b(auVar.f153257b))}));
    }
}
