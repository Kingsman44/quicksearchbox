package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.common.base.C58839bc;
import com.google.speech.p5224k.p5225a.C67238p;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.dc */
/* compiled from: PG */
public final /* synthetic */ class C103594dc implements C58839bc {

    /* renamed from: a */
    public static final /* synthetic */ C103594dc f288604a = new C103594dc();

    private /* synthetic */ C103594dc() {
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        C67438ag agVar;
        C67438ag agVar2;
        C67238p pVar = (C67238p) obj;
        if (pVar.f182740b == 1) {
            agVar = (C67438ag) pVar.f182741c;
        } else {
            agVar = C67438ag.f183256k;
        }
        int a = C67437af.m97466a(agVar.f183259b);
        if (a == 0 || a != 2) {
            return false;
        }
        if (pVar.f182740b == 1) {
            agVar2 = (C67438ag) pVar.f182741c;
        } else {
            agVar2 = C67438ag.f183256k;
        }
        C67442ak akVar = agVar2.f183263f;
        if (akVar == null) {
            akVar = C67442ak.f183276i;
        }
        if (akVar.f183281d.size() > 0) {
            return true;
        }
        return false;
    }
}
