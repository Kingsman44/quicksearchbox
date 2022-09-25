package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import android.content.Context;
import android.provider.Settings;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.p6294a.C80496d;
import com.google.common.base.C58817ah;
import com.google.speech.p5208h.C66544aa;
import com.google.speech.p5208h.C66545ab;
import com.google.speech.p5208h.C66691y;
import com.google.speech.p5208h.C66692z;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.bj */
/* compiled from: PG */
public final /* synthetic */ class C103505bj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Context f288415a;

    public /* synthetic */ C103505bj(Context context) {
        this.f288415a = context;
    }

    public final Object apply(Object obj) {
        Context context = this.f288415a;
        C66691y yVar = (C66691y) C66692z.f181426e.createBuilder();
        C66544aa aaVar = (C66544aa) C66545ab.f180982c.createBuilder();
        aaVar.copyOnWrite();
        C66545ab abVar = (C66545ab) aaVar.instance;
        abVar.f180985b = 1;
        abVar.f180984a |= 1;
        yVar.mo59704a(aaVar);
        boolean z = ((C80496d) obj).f220970a;
        yVar.copyOnWrite();
        C66692z zVar = (C66692z) yVar.instance;
        zVar.f181429a |= 1;
        zVar.f181431c = z;
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        yVar.copyOnWrite();
        C66692z zVar2 = (C66692z) yVar.instance;
        string.getClass();
        zVar2.f181429a |= 16;
        zVar2.f181432d = string;
        return (C66692z) yVar.build();
    }
}
