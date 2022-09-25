package com.google.android.apps.gsa.p8889z.p8893c.p8897d;

import com.google.common.base.C58839bc;
import com.google.speech.recognizer.p5233a.C67463k;
import com.google.speech.recognizer.p5233a.C67464l;

/* renamed from: com.google.android.apps.gsa.z.c.d.c */
/* compiled from: PG */
public final /* synthetic */ class C118879c implements C58839bc {

    /* renamed from: a */
    public static final /* synthetic */ C118879c f331552a = new C118879c();

    private /* synthetic */ C118879c() {
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        C67464l lVar = (C67464l) obj;
        if ((lVar.f183358a & 1) == 0) {
            return false;
        }
        C67463k a = C67463k.m97475a(lVar.f183359b);
        if (a == null) {
            a = C67463k.START_OF_SPEECH;
        }
        if (a.equals(C67463k.START_OF_SPEECH)) {
            return true;
        }
        return false;
    }
}
