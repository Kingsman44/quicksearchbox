package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.p7601a;

import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97078a;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97095j;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97096k;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d.C97102q;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7605b.C97190f;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C97013r;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C97014s;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97040c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.d.a.b */
/* compiled from: PG */
public final /* synthetic */ class C97080b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C97085g f271271a;

    public /* synthetic */ C97080b(C97085g gVar) {
        this.f271271a = gVar;
    }

    public final void run() {
        int i;
        C97190f fVar = (C97190f) this.f271271a;
        C97102q qVar = fVar.f271548e;
        C97040c cVar = fVar.f271549f;
        C97095j f = C97096k.m160726f();
        f.mo90448c(fVar.f271552i.f271280f.f271109a);
        C97014s sVar = fVar.f271552i.f271280f;
        String str = sVar.f271110b;
        if (str != null) {
            ((C97078a) f).f271267b = str;
            f.mo90447b(sVar.f271111c);
            int a = C97013r.m160580a(fVar.f271552i.f271280f.f271112d);
            if (a == 0) {
                a = 1;
            }
            switch (a - 1) {
                case 1:
                    i = R.drawable.ic_soccer;
                    break;
                case 2:
                    i = R.drawable.ic_football;
                    break;
                case 3:
                    i = R.drawable.ic_basketball;
                    break;
                case 4:
                    i = R.drawable.ic_baseball;
                    break;
                case 5:
                    i = R.drawable.ic_hockey;
                    break;
                case 6:
                    i = R.drawable.ic_cricket;
                    break;
                case 7:
                    i = R.drawable.ic_finance;
                    break;
                default:
                    i = R.drawable.logo_google_g_reverse;
                    break;
            }
            f.mo90449d(i);
            qVar.mo90469b(cVar, f.mo90446a());
            return;
        }
        throw new NullPointerException("Null multipleBubblesTitle");
    }
}
