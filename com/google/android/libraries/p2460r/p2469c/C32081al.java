package com.google.android.libraries.p2460r.p2469c;

import android.content.Context;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57349aa;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57359ak;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57396bu;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57397bv;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57492fi;

/* renamed from: com.google.android.libraries.r.c.al */
/* compiled from: PG */
final class C32081al extends C32121bi {
    public C32081al(Context context, C32127e eVar) {
        super(context, eVar);
    }

    /* renamed from: r */
    private final void m59772r(TextView textView, C57492fi fiVar) {
        if ((fiVar.f153572a & 1) != 0) {
            textView.setText(C32082am.m59774a(this.f86299c.f86274c.f86117a, fiVar));
        } else {
            textView.setText(BuildConfig.FLAVOR);
        }
    }

    /* renamed from: c */
    public final void mo37863c(C32148z zVar, C57397bv bvVar) {
        C57492fi fiVar;
        C57349aa aaVar;
        C57492fi fiVar2;
        C57349aa aaVar2;
        int i = bvVar.f153319a;
        int b = C57396bu.m88343b(i);
        int i2 = b - 1;
        if (b == 0) {
            throw null;
        } else if (i2 == 2) {
            TextView textView = (TextView) this.f86300d;
            if (i == 3) {
                fiVar = (C57492fi) bvVar.f153320b;
            } else {
                fiVar = C57492fi.f153570e;
            }
            m59772r(textView, fiVar);
        } else if (i2 != 3) {
            zVar.mo37967i(1, C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT, String.format("TextElement missing ParameterizedText content; has %s", new Object[]{C57396bu.m88342a(C57396bu.m88343b(bvVar.f153319a))}));
            m59772r((TextView) this.f86300d, C57492fi.f153570e);
        } else {
            if (i == 2) {
                aaVar = (C57349aa) bvVar.f153320b;
            } else {
                aaVar = C57349aa.f153211c;
            }
            C57359ak f = zVar.mo37964f(aaVar);
            if (f.f153236b != 3) {
                if (bvVar.f153319a == 2) {
                    aaVar2 = (C57349aa) bvVar.f153320b;
                } else {
                    aaVar2 = C57349aa.f153211c;
                }
                if (!aaVar2.f153214b) {
                    throw new C32083an(C57404cb.ERR_MISSING_BINDING_VALUE, String.format("Parameterized text binding %s had no content", new Object[]{f.f153238d}));
                }
            }
            TextView textView2 = (TextView) this.f86300d;
            if (f.f153236b == 3) {
                fiVar2 = (C57492fi) f.f153237c;
            } else {
                fiVar2 = C57492fi.f153570e;
            }
            m59772r(textView2, fiVar2);
        }
    }
}
