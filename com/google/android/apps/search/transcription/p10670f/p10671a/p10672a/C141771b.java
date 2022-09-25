package com.google.android.apps.search.transcription.p10670f.p10671a.p10672a;

import com.google.android.apps.search.transcription.p10666b.C141759r;
import com.google.android.libraries.search.p2904c.C37400be;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.transcription.f.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C141771b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C141780k f384739a;

    public /* synthetic */ C141771b(C141780k kVar) {
        this.f384739a = kVar;
    }

    public final C60870cx apply(Object obj) {
        C37519dz dzVar;
        C141780k kVar = this.f384739a;
        C37400be beVar = (C37400be) obj;
        if (beVar.mo40930b().mo56113h()) {
            kVar.f384749d.mo116744n();
            return C60856cj.m92900i(beVar.mo40930b());
        }
        C37561eb ebVar = beVar.mo40929a().f99350b;
        if (ebVar == null) {
            ebVar = C37561eb.f99800c;
        }
        if (ebVar.f99802a == 2) {
            dzVar = C37519dz.m66524a(((Integer) ebVar.f99803b).intValue());
            if (dzVar == null) {
                dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
            }
        } else {
            dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
        }
        return C60856cj.m92899h(new C141759r(dzVar.f99687U));
    }
}
