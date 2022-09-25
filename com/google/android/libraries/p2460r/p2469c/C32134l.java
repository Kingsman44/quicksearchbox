package com.google.android.libraries.p2460r.p2469c;

import android.widget.FrameLayout;
import com.google.android.libraries.p2460r.p2464b.p2466b.C32054a;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32063f;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57359ak;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57364ap;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57366ar;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57368at;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57369au;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57509q;

/* renamed from: com.google.android.libraries.r.c.l */
/* compiled from: PG */
final class C32134l extends C32138p {

    /* renamed from: a */
    C57366ar f86292a = C57366ar.f153251a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32134l(android.content.Context r3, com.google.android.libraries.p2460r.p2469c.C32127e r4) {
        /*
            r2 = this;
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r3)
            com.google.android.libraries.r.c.av r1 = com.google.android.libraries.p2460r.p2469c.C32133k.f86178a
            r2.<init>(r3, r4, r0)
            r2.f86303g = r1
            com.google.bv.e.c.a.ar r3 = com.google.p4283bv.p4354e.p4367c.p4368a.C57366ar.f153251a
            r2.f86292a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p2460r.p2469c.C32134l.<init>(android.content.Context, com.google.android.libraries.r.c.e):void");
    }

    /* renamed from: a */
    public final void mo37854a() {
        FrameLayout frameLayout = (FrameLayout) this.f86300d;
        if (frameLayout.getChildCount() > 0) {
            for (int i = 0; i < frameLayout.getChildCount(); i++) {
                this.f86299c.f86274c.f86118b.mo37846b(frameLayout.getChildAt(i), this.f86292a);
            }
            frameLayout.removeAllViews();
        }
    }

    /* renamed from: w */
    public final /* synthetic */ void mo37853w(Object obj, C32148z zVar) {
        C57366ar arVar;
        C57509q qVar;
        C57509q qVar2;
        C57364ap apVar = (C57364ap) obj;
        int i = apVar.f153248a;
        int i2 = i != 0 ? i != 2 ? i != 3 ? 0 : 1 : 2 : 3;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 0) {
                if (i == 3) {
                    arVar = (C57366ar) apVar.f153249b;
                } else {
                    arVar = C57366ar.f153251a;
                }
                this.f86292a = arVar;
            } else if (i3 != 1) {
                C32054a.m59731b(6, "CustomElementAdapter", (Throwable) null, zVar.mo37967i(1, C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT, "Missing payload in CustomElement"), new Object[0]);
                return;
            } else {
                if (i == 2) {
                    qVar = (C57509q) apVar.f153249b;
                } else {
                    qVar = C57509q.f153616c;
                }
                C57359ak d = zVar.mo37962d(qVar.f153618a);
                if ((d.f153235a & 16384) != 0) {
                    d = C32063f.m59746a(d);
                }
                int i4 = d.f153236b;
                if (i4 != 2 && !qVar.f153619b) {
                    throw new C32083an(C57404cb.ERR_MISSING_BINDING_VALUE, zVar.mo37967i(1, C57404cb.ERR_MISSING_BINDING_VALUE, String.format("Custom element binding not found for %s", new Object[]{qVar.f153618a})));
                } else if (i4 == 2) {
                    this.f86292a = (C57366ar) d.f153237c;
                } else {
                    if (apVar.f153248a == 2) {
                        qVar2 = (C57509q) apVar.f153249b;
                    } else {
                        qVar2 = C57509q.f153616c;
                    }
                    if (qVar2.f153619b) {
                        mo37948o(4);
                        return;
                    }
                    throw new C32083an(C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT, zVar.mo37967i(1, C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT, String.format("Custom element binding %s had no content", new Object[]{d.f153238d})));
                }
            }
            ((FrameLayout) this.f86300d).addView(this.f86299c.f86274c.f86118b.mo37845a(this.f86292a));
            return;
        }
        throw null;
    }

    /* renamed from: v */
    public final /* bridge */ /* synthetic */ Object mo37852v(C57369au auVar) {
        if (auVar.f153257b == 1) {
            return (C57364ap) auVar.f153258c;
        }
        throw new C32083an(C57404cb.ERR_MISSING_ELEMENT_CONTENTS, String.format("Missing CustomElement; has %s", new Object[]{C57368at.m88332a(C57368at.m88333b(auVar.f153257b))}));
    }
}
