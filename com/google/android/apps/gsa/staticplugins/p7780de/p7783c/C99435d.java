package com.google.android.apps.gsa.staticplugins.p7780de.p7783c;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.staticplugins.p7780de.p7782b.C99403at;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.common.p4580v.C60948g;
import com.google.common.p4580v.C60949h;
import com.google.p4479cg.p4480a.C58068e;
import p3186j$.time.ZoneId;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.c.d */
/* compiled from: PG */
public final class C99435d implements C23113i {

    /* renamed from: a */
    private final C99433b f278237a;

    public C99435d(C99433b bVar) {
        this.f278237a = bVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SearchNowEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onLanguageSelected_java.lang.String_java.lang.String_boolean")) {
                String string = pVar.f63472a.getString("language");
                string.getClass();
                String string2 = pVar.f63472a.getString("hlParam");
                string2.getClass();
                boolean booleanValue = Boolean.valueOf(pVar.f63472a.getBoolean("shouldUpdateLanguageSetting")).booleanValue();
                C99433b bVar = this.f278237a;
                if (booleanValue) {
                    C99403at atVar = (C99403at) bVar;
                    if (atVar.f278112g.mo79746e(C90110fh.f250701g)) {
                        atVar.f278131z.mo78471f(string);
                    } else {
                        atVar.f278131z.mo78467b(string, string2);
                    }
                }
                ((C99403at) bVar).f278131z.mo78469d(true);
            } else if (str.equals("onMicTapPdsUpdate_boolean")) {
                boolean booleanValue2 = Boolean.valueOf(pVar.f63472a.getBoolean("hasUserInteracted")).booleanValue();
                C99433b bVar2 = this.f278237a;
                if (booleanValue2) {
                    ((C99403at) bVar2).f278081A.mo78921c();
                    return;
                }
                ((C99403at) bVar2).f278081A.mo78920b(C58068e.m88824b(C60949h.m93108b(C60948g.f165068a, ZoneId.systemDefault())));
            }
        }
    }
}
