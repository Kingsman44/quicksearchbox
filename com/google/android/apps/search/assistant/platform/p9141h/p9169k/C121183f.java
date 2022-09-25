package com.google.android.apps.search.assistant.platform.p9141h.p9169k;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.search.assistant.platform.p9141h.p9169k.p9170a.C121175a;
import com.google.android.apps.search.assistant.platform.p9141h.p9169k.p9170a.C121177c;
import com.google.android.apps.search.assistant.platform.p9141h.p9169k.p9170a.C121178d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.storage.protostore.C43019v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.MessageLite;
import dagger.C68214a;

/* renamed from: com.google.android.apps.search.assistant.platform.h.k.f */
/* compiled from: PG */
public final class C121183f implements C43019v {

    /* renamed from: a */
    private static final C59071e f336690a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.h.k.f");

    /* renamed from: b */
    private final Context f336691b;

    /* renamed from: c */
    private final C68214a f336692c;

    public C121183f(Context context, C68214a aVar) {
        this.f336691b = context;
        this.f336692c = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo18054a() {
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C60870cx mo18055b(MessageLite messageLite) {
        ((C59052c) ((C59052c) f336690a.mo56224b()).mo56372aa(35725)).mo56386p("SpeechOutputSettingsDataAgsaSharedPreferencesMigration running now.");
        C121175a aVar = (C121175a) ((C121178d) messageLite).toBuilder();
        String string = ((SharedPreferences) this.f336692c.mo27525b()).getString("ttsMode", this.f336691b.getString(R.string.prefDefault_ttsMode));
        if (this.f336691b.getString(R.string.prefValue_ttsMode_on).equals(string)) {
            C121177c cVar = C121177c.ON;
            aVar.copyOnWrite();
            C121178d dVar = (C121178d) aVar.instance;
            dVar.f336685b = cVar.f336681e;
            dVar.f336684a |= 1;
        } else if (this.f336691b.getString(R.string.prefValue_ttsMode_verbose).equals(string)) {
            C121177c cVar2 = C121177c.VERBOSE;
            aVar.copyOnWrite();
            C121178d dVar2 = (C121178d) aVar.instance;
            dVar2.f336685b = cVar2.f336681e;
            dVar2.f336684a |= 1;
        } else if (this.f336691b.getString(R.string.prefValue_ttsMode_handsFreeOnly).equals(string)) {
            C121177c cVar3 = C121177c.HANDS_FREE_ONLY;
            aVar.copyOnWrite();
            C121178d dVar3 = (C121178d) aVar.instance;
            dVar3.f336685b = cVar3.f336681e;
            dVar3.f336684a |= 1;
        } else {
            C121177c cVar4 = C121177c.UNSPECIFIED;
            aVar.copyOnWrite();
            C121178d dVar4 = (C121178d) aVar.instance;
            dVar4.f336685b = cVar4.f336681e;
            dVar4.f336684a |= 1;
        }
        return C60856cj.m92900i((C121178d) aVar.build());
    }

    /* renamed from: c */
    public final C60870cx mo18056c() {
        return C60856cj.m92900i(true);
    }
}
