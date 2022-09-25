package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import android.app.Activity;
import android.content.Context;
import android.speech.SpeechRecognizer;
import androidx.core.p094f.C1888a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90042cu;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.j */
/* compiled from: PG */
public final class C113631j {

    /* renamed from: a */
    public static final C59071e f314660a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.translator.offline.j");

    /* renamed from: b */
    public final Context f314661b;

    /* renamed from: c */
    public SpeechRecognizer f314662c;

    /* renamed from: d */
    private final boolean f314663d;

    public C113631j(Activity activity, C86124t tVar) {
        this.f314661b = activity.getApplicationContext();
        this.f314663d = tVar.mo79746e(C90042cu.f248705f);
    }

    /* renamed from: a */
    public final boolean mo100358a() {
        if (!this.f314663d || !C1888a.m5149c()) {
            return false;
        }
        return SpeechRecognizer.isOnDeviceRecognitionAvailable(this.f314661b);
    }
}
