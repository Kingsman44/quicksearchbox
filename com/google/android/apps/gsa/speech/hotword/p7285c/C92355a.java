package com.google.android.apps.gsa.speech.hotword.p7285c;

import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92388l;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92391o;
import com.google.common.base.C58817ah;
import com.google.speech.p5208h.C66593bs;
import com.google.speech.p5208h.C66595bu;

/* renamed from: com.google.android.apps.gsa.speech.hotword.c.a */
/* compiled from: PG */
public final /* synthetic */ class C92355a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C92355a f257489a = new C92355a();

    private /* synthetic */ C92355a() {
    }

    public final Object apply(Object obj) {
        C92391o oVar = (C92391o) obj;
        C66593bs bsVar = (C66593bs) C66595bu.f181148e.createBuilder();
        String str = oVar.f257645c;
        bsVar.copyOnWrite();
        C66595bu buVar = (C66595bu) bsVar.instance;
        str.getClass();
        int i = 4;
        buVar.f181150a |= 4;
        buVar.f181153d = str;
        int a = C92388l.m151714a(oVar.f257644b);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            i = 2;
        } else if (i2 != 2) {
            i = 1;
        }
        bsVar.copyOnWrite();
        C66595bu buVar2 = (C66595bu) bsVar.instance;
        buVar2.f181151b = i - 1;
        buVar2.f181150a |= 1;
        bsVar.copyOnWrite();
        C66595bu buVar3 = (C66595bu) bsVar.instance;
        buVar3.f181150a = 2 | buVar3.f181150a;
        buVar3.f181152c = true;
        return (C66595bu) bsVar.build();
    }
}
