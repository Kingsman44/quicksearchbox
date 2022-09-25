package com.google.android.apps.gsa.staticplugins.chime.googlefeedback;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7746ik;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56989y;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56990z;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public class InvokeSendFeedbackActivity extends C97724b {

    /* renamed from: l */
    private static final C59071e f272851l = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.chime.googlefeedback.InvokeSendFeedbackActivity");

    /* renamed from: k */
    public C90465g f272852k;

    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.U);
        super.onCreate(bundle);
        if (getIntent() == null) {
            ((C59052c) ((C59052c) f272851l.mo56226d()).mo56372aa(18975)).mo56386p("Finishing InvokeSendFeedbackActivity without sending feedback. Created activity with null intent");
            finish();
        }
    }

    public final void onStart() {
        C56990z zVar;
        super.onStart();
        Intent intent = getIntent();
        if (intent == null) {
            ((C59052c) ((C59052c) f272851l.mo56226d()).mo56372aa(18977)).mo56386p("Finishing InvokeSendFeedbackActivity without sending feedback. Started activity with null intent");
            finish();
            return;
        }
        C90461c cVar = new C90461c();
        cVar.f252699k = false;
        cVar.f252698j = true;
        cVar.f252693e = "com.google.android.googlequicksearchbox.NOTIFICATIONS_AGA";
        cVar.mo84200d("Entry type", Integer.toString(C7746ik.MODULE.f27108J));
        if (intent.hasExtra("staticplugin_chime_googlefeedback")) {
            try {
                zVar = (C56990z) ProtoParsers.m95519b(intent, "staticplugin_chime_googlefeedback", C56990z.f152131b, C62921ba.m95368a());
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) f272851l.mo56225c()).mo56382g(e)).mo56372aa(18976)).mo56386p("Unable to parse GoogleFeedback");
                zVar = null;
            }
            if (zVar != null) {
                for (C56989y yVar : zVar.f152133a) {
                    int i = yVar.f152128a;
                    if (!((i & 1) == 0 || (i & 2) == 0)) {
                        cVar.mo84200d(yVar.f152129b, yVar.f152130c);
                    }
                }
            }
        }
        this.f272852k.mo84210a(getBaseContext()).mo84209b(cVar, 1);
        finish();
    }
}
