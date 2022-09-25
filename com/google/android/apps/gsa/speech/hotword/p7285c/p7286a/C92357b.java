package com.google.android.apps.gsa.speech.hotword.p7285c.p7286a;

import com.google.android.apps.gsa.assistant.shared.l;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.util.p7159c.C90891ay;
import com.google.android.apps.gsa.speech.hotword.p7285c.p7287b.C92361a;
import com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92367e;
import com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92368f;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.speech.hotword.c.a.b */
/* compiled from: PG */
final class C92357b extends C90891ay {

    /* renamed from: a */
    final /* synthetic */ String f257493a;

    /* renamed from: b */
    final /* synthetic */ l f257494b;

    /* renamed from: c */
    final /* synthetic */ C92361a f257495c;

    /* renamed from: d */
    final /* synthetic */ C92359d f257496d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92357b(C92359d dVar, String str, l lVar, C92361a aVar) {
        super("CanEnrollCheckCallback");
        this.f257496d = dVar;
        this.f257493a = str;
        this.f257494b = lVar;
        this.f257495c = aVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        String str = this.f257493a;
        this.f257496d.mo87005a("Device: " + str + " failed.");
        l lVar = this.f257494b;
        lVar.e(0);
        lVar.g(0);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C89057m mVar = (C89057m) obj;
        if (mVar == null) {
            C92359d dVar = this.f257496d;
            dVar.mo87005a(dVar.f257502d.getString(R.string.enrollment_check_failure_toast_msg, new Object[]{this.f257493a}));
            l lVar = this.f257494b;
            lVar.e(0);
            lVar.g(0);
            return;
        }
        C92367e a = C92368f.m151685a(mVar);
        if (a != null) {
            int a2 = a.mo87009a();
            if (a2 != 1) {
                l lVar2 = this.f257494b;
                lVar2.e(a2);
                lVar2.g(a2);
            } else if (this.f257495c == C92361a.IS_SPEAKER_ID_SUPPORTED_CHECK) {
                this.f257494b.g(1);
            } else {
                this.f257494b.e(1);
            }
        } else {
            l lVar3 = this.f257494b;
            lVar3.e(0);
            lVar3.g(0);
        }
    }
}
