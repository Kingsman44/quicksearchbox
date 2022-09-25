package com.google.android.apps.gsa.staticplugins.p7816dl.p7819c;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90138q;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7818b.C99643a;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7818b.C99655f;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7821e.p7822a.C99719a;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23268m;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.c.c */
/* compiled from: PG */
public final class C99678c implements C23113i {

    /* renamed from: a */
    private final C99676a f278954a;

    public C99678c(C99676a aVar) {
        this.f278954a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("PartnerTabContentHostEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onRestoreContent_com.google.common.base.Optional<android.os.Bundle>_java.lang.String_int_int_int")) {
                C58833ax e = new C23268m(new C23269n()).mo28733b("contentState", pVar);
                String string = pVar.f63472a.getString("videoUrl");
                string.getClass();
                int intValue = Integer.valueOf(pVar.f63472a.getInt("playerType")).intValue();
                int intValue2 = Integer.valueOf(pVar.f63472a.getInt("playerMaxWidthPortraitPx")).intValue();
                int intValue3 = Integer.valueOf(pVar.f63472a.getInt("playerMaxHeightLandscapePx")).intValue();
                C99676a aVar = this.f278954a;
                if (!((C23056g) aVar).f63405W.mo28420E()) {
                    C58976aa aaVar = C58975e.f156826a;
                    if (e.mo56113h()) {
                        C99655f fVar = (C99655f) aVar;
                        ((C99643a) fVar.f278898a).f278823a.mo28730f(e, false);
                        ((C99643a) fVar.f278898a).f278835m.mo28730f(string, false);
                        ((C99643a) fVar.f278898a).f278832j.mo28730f(Integer.valueOf(intValue), false);
                        ((C99643a) fVar.f278898a).f278831i.mo28730f(Integer.valueOf(intValue2), false);
                        ((C99643a) fVar.f278898a).f278830h.mo28730f(Integer.valueOf(intValue3), false);
                        fVar.f278905h = true;
                        fVar.f278902e.mo57356n(C118826c.f331422a);
                    } else {
                        ((C99655f) aVar).f278902e.mo57357o(new Exception("Unable to restore content state."));
                    }
                    ((C99643a) ((C99655f) aVar).f278898a).f278825c.mo28730f(false, false);
                }
            } else if (str.equals("onViewVisibilityFetched_boolean")) {
                boolean booleanValue = Boolean.valueOf(pVar.f63472a.getBoolean("isShownInViewport")).booleanValue();
                C99655f fVar2 = (C99655f) this.f278954a;
                ((C99643a) fVar2.f278898a).f278824b.mo28730f(false, false);
                if (fVar2.f278904g) {
                    fVar2.f278904g = false;
                    ((C99643a) fVar2.f278898a).f278824b.mo28730f(true, false);
                    return;
                }
                if (((Boolean) ((C99643a) fVar2.f278898a).f278826d.f63720e).booleanValue() != booleanValue) {
                    if (fVar2.f278901d.mo79746e(C90138q.f251845s) && !fVar2.f278909l) {
                        C99719a aVar2 = fVar2.f278899b;
                        String str3 = (String) ((C99643a) fVar2.f278898a).f278829g.f63720e;
                        str3.getClass();
                        aVar2.mo91578e(str3, fVar2.f278903f, booleanValue);
                    }
                    ((C99643a) fVar2.f278898a).f278826d.mo28730f(Boolean.valueOf(booleanValue), false);
                    Bundle bundle = fVar2.f278907j;
                    if (bundle != null) {
                        fVar2.mo91561j(bundle);
                        fVar2.f278907j = null;
                    }
                    if (!booleanValue) {
                        fVar2.mo91560i();
                    }
                }
                fVar2.f278909l = false;
            }
        }
    }
}
