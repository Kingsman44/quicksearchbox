package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8130a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.p375ai.p378b.C7681g;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.b.a.d */
/* compiled from: PG */
public final class C105133d implements C23113i {

    /* renamed from: a */
    private final C105131b f293102a;

    public C105133d(C105131b bVar) {
        this.f293102a = bVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SecondScreenEntryProviderEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("dismissEntry_com.google.android.libraries.gsa.monet.shared.ProtoParcelable_boolean")) {
                boolean booleanValue = Boolean.valueOf(pVar.f63472a.getBoolean("recordAction")).booleanValue();
                this.f293102a.mo94572e((ProtoParcelable) new C23269n().mo28733b("entry", pVar), booleanValue);
            } else if (str.equals("recordFeedbackPromptAction_com.google.android.libraries.gsa.monet.shared.ProtoParcelable_com.google.geo.sidekick.ActionProto.Action.Type")) {
                C23259d dVar = new C23259d(C7681g.values());
                int i = pVar.f63472a.getInt("actionType");
                this.f293102a.mo94576j((ProtoParcelable) new C23269n().mo28733b("entry", pVar), (C7681g) dVar.f63738a[i]);
            }
        }
    }
}
