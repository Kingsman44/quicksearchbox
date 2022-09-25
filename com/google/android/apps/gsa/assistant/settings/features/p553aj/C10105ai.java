package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.widget.CompoundButton;
import com.google.android.apps.gsa.assistant.settings.features.av.al;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3897e.p3929l.p3930a.C52704bj;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.ai */
/* compiled from: PG */
public final /* synthetic */ class C10105ai implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C10107ak f34401a;

    public /* synthetic */ C10105ai(C10107ak akVar) {
        this.f34401a = akVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C10107ak akVar = this.f34401a;
        if (!z) {
            akVar.f34405c.s(akVar.f34404b, false, C10107ak.m24927a());
            akVar.mo18248d();
        } else if ((akVar.f34408f.f129630a & 32) == 0 || !akVar.f34406d.h()) {
            akVar.f34405c.s(akVar.f34404b, true, C10107ak.m24927a());
            akVar.mo18248d();
        } else {
            int a = C52704bj.m86696a(akVar.mo18247c().f129036e);
            if (a == 0) {
                a = 1;
            }
            if (a == 3 || a == 4) {
                int a2 = C52704bj.m86696a(akVar.mo18247c().f129034c);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (a2 == 3 || a2 == 4) {
                    C49891cv cvVar = akVar.f34408f.f129639j;
                    if (cvVar == null) {
                        cvVar = C49891cv.f129647N;
                    }
                    if (!cvVar.f129670h) {
                        al.a(akVar.f34403a, 18, (String) null, akVar.f34404b);
                        return;
                    }
                    akVar.f34405c.s(akVar.f34404b, true, C10107ak.m24927a());
                    akVar.mo18248d();
                    return;
                }
                akVar.f34405c.s(akVar.f34404b, true, C10107ak.m24927a());
                akVar.mo18248d();
                return;
            }
            akVar.f34407e.a(akVar.f34403a, akVar.f34408f.f129636g);
        }
    }
}
