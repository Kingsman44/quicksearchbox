package com.google.android.apps.gsa.staticplugins.p7445bf.p7450c;

import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.assistant.p3861at.C49944eu;
import com.google.assistant.p3861at.C49945ev;
import com.google.assistant.p3861at.C49946ew;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.c.v */
/* compiled from: PG */
final class C94585v extends C84036z {

    /* renamed from: a */
    final /* synthetic */ C94586w f264558a;

    public C94585v(C94586w wVar) {
        this.f264558a = wVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        C60870cx cxVar = (C60870cx) this.f264558a.f264561c.mo27525b();
        if (cxVar.isDone()) {
            try {
                C49945ev evVar = (C49945ev) ((C49946ew) C90877ak.m148472f(cxVar)).toBuilder();
                C49946ew ewVar = (C49946ew) evVar.instance;
                if (ewVar.f129829d) {
                    ((C59052c) ((C59052c) C94586w.f264559a.mo56224b()).mo56372aa(20217)).mo56386p("user has already selected voice preference.");
                    return C58485gu.m89845m();
                } else if (ewVar.f129827b.size() == 0) {
                    ((C59052c) ((C59052c) C94586w.f264559a.mo56224b()).mo56372aa(20216)).mo56386p("no voices available");
                    return C58485gu.m89845m();
                } else {
                    String string = this.f264558a.f264560b.getString("extra_enrollment_locale");
                    if (((C49946ew) evVar.instance).f129830e.size() != 0) {
                        if (((String) ((C49946ew) evVar.instance).f129830e.get(0)).equals(string)) {
                            List unmodifiableList = Collections.unmodifiableList(((C49946ew) evVar.instance).f129827b);
                            if (!unmodifiableList.isEmpty()) {
                                String str = ((C49944eu) unmodifiableList.get(this.f264558a.f264562d.nextInt(unmodifiableList.size()))).f129813d;
                                evVar.copyOnWrite();
                                C49946ew ewVar2 = (C49946ew) evVar.instance;
                                str.getClass();
                                ewVar2.f129826a |= 1;
                                ewVar2.f129828c = str;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putByteArray("voice_settings_ui", ((C49946ew) evVar.build()).toByteArray());
                            return C58485gu.m89846n(C83875ai.m133540e(new C94580q(), bundle));
                        }
                    }
                    ((C59052c) ((C59052c) C94586w.f264559a.mo56224b()).mo56372aa(20214)).mo56386p("user's primary language does not match enrollment language");
                    return C58485gu.m89845m();
                }
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) C94586w.f264559a.mo56225c()).mo56382g(e)).mo56372aa(20215)).mo56386p("voice settings get request failed.");
                return C58485gu.m89845m();
            }
        } else {
            ((C59052c) ((C59052c) C94586w.f264559a.mo56225c()).mo56372aa(20218)).mo56386p("voice settings get request not yet completed.");
            return C58485gu.m89845m();
        }
    }
}
