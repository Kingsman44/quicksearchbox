package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1147e;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15678j;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15679k;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.e.c */
/* compiled from: PG */
public final /* synthetic */ class C15618c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15626k f46690a;

    /* renamed from: b */
    public final /* synthetic */ boolean f46691b;

    /* renamed from: c */
    public final /* synthetic */ String f46692c;

    public /* synthetic */ C15618c(C15626k kVar, boolean z, String str) {
        this.f46690a = kVar;
        this.f46691b = z;
        this.f46692c = str;
    }

    public final C60870cx apply(Object obj) {
        C15626k kVar = this.f46690a;
        boolean z = this.f46691b;
        String str = this.f46692c;
        C15678j jVar = (C15678j) obj;
        if (!((Boolean) kVar.f46716d.mo17428b()).booleanValue() || !C15679k.m32474a(jVar) || z) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C59104x b = C15626k.f46713a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "LocalFulfillerImpl");
        ((C59052c) ((C59052c) b).mo56372aa(46216)).mo56389s("User is signed out so punt for destination: %s.", str);
        return kVar.mo22428d(R.string.punt_for_signed_out);
    }
}
