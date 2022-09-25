package com.google.android.apps.gsa.staticplugins.accl.p7330b;

import android.os.Build;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.apps.gsa.staticplugins.accl.p7334d.C92822d;
import com.google.android.apps.gsa.staticplugins.accl.performers.communication.C93015az;
import com.google.android.apps.gsa.staticplugins.accl.performers.communication.C93017ba;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.search.assistant.performer.communication.C35592cu;
import dagger.p5294a.C68220f;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.b.l */
/* compiled from: PG */
public final class C92732l implements C68220f {
    /* renamed from: a */
    public static C22538o m152727a(C86124t tVar, C93015az azVar, C35592cu cuVar, C92822d dVar) {
        return (Build.VERSION.SDK_INT < 30 || !tVar.mo79746e(C90025cd.f248165w)) ? azVar : new C93017ba(cuVar.mo39724a(dVar));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
