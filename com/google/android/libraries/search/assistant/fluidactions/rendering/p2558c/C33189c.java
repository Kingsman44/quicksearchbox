package com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0815b;
import androidx.activity.result.C0816c;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.c.c */
/* compiled from: PG */
public final class C33189c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C0815b f88765a;

    /* renamed from: b */
    final /* synthetic */ C33190d f88766b;

    /* renamed from: c */
    final /* synthetic */ Intent f88767c;

    public C33189c(C0815b bVar, C33190d dVar, Intent intent) {
        this.f88765a = bVar;
        this.f88766b = dVar;
        this.f88767c = intent;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        if (th instanceof UnsupportedOperationException) {
            C33190d dVar = this.f88766b;
            Intent intent = this.f88767c;
            C0815b bVar = this.f88765a;
            if (dVar.f88771d == null) {
                C59052c cVar = (C59052c) C33191e.f88775a.mo56225c();
                cVar.mo56380ai(C58979ad.SMALL);
                cVar.mo56379ah(new C59094n(50945));
                cVar.mo56386p("#startActivityForResult: Failed, fragment is not attached to an Activity");
                bVar.onActivityResult(C33190d.f88768a);
                return;
            }
            C0816c cVar2 = dVar.f88772e;
            if (cVar2 == null) {
                C59052c cVar3 = (C59052c) C33191e.f88775a.mo56225c();
                cVar3.mo56380ai(C58979ad.SMALL);
                cVar3.mo56379ah(new C59094n(50944));
                cVar3.mo56386p("#startActivityForResult: Failed, ActivityResultLauncher not initialized");
                bVar.onActivityResult(C33190d.f88768a);
                return;
            }
            dVar.f88773f = bVar;
            cVar2.mo526b(intent);
            return;
        }
        C59052c cVar4 = (C59052c) ((C59052c) C33191e.f88775a.mo56225c()).mo56382g(th);
        cVar4.mo56379ah(new C59094n(50941));
        cVar4.mo56386p("#startActivityForResult: Failed with fatal error");
        this.f88765a.onActivityResult(C33190d.f88768a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        C69664n.m101061g(activityResult, "result");
        this.f88765a.onActivityResult(activityResult);
    }
}
