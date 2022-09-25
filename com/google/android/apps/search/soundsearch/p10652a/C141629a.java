package com.google.android.apps.search.soundsearch.p10652a;

import com.google.android.libraries.search.p2904c.C37400be;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.soundsearch.a.a */
/* compiled from: PG */
public final /* synthetic */ class C141629a implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C141629a f384441a = new C141629a();

    private /* synthetic */ C141629a() {
    }

    public final C60870cx apply(Object obj) {
        C37519dz dzVar;
        C37400be beVar = (C37400be) obj;
        if (beVar.mo40930b().mo56113h()) {
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
        return C60856cj.m92899h(new Exception("Failed to start listening to the microphone, status: ".concat(String.valueOf(dzVar.name()))));
    }
}
