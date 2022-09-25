package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.n.c.a.h.af */
/* compiled from: PG */
public final /* synthetic */ class C39541af implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f104107a;

    /* renamed from: b */
    public final /* synthetic */ Context f104108b;

    public /* synthetic */ C39541af(String str, Context context) {
        this.f104107a = str;
        this.f104108b = context;
    }

    public final Object call() {
        String str;
        String str2 = this.f104107a;
        Context context = this.f104108b;
        if (str2 != null) {
            str = context.getFilesDir().getAbsolutePath() + "/" + str2;
        } else {
            C59104x c = C39542ag.f104109a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SodaCoreConfigProv");
            ((C59052c) ((C59052c) c).mo56372aa(53725)).mo56386p("Cannot get the Soda Hotword Directory because locale is null.");
            str = BuildConfig.FLAVOR;
        }
        C58976aa aaVar = C58975e.f156826a;
        return str;
    }
}
