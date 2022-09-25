package com.google.android.apps.gsa.speech.p7302m;

import android.content.Context;
import android.provider.Settings;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p6487s3.producers.C84310i;
import com.google.protobuf.C62940bt;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66628cz;
import com.google.speech.p5208h.C66634da;
import com.google.speech.p5208h.C66691y;
import com.google.speech.p5208h.C66692z;

/* renamed from: com.google.android.apps.gsa.speech.m.a */
/* compiled from: PG */
public final class C92476a implements C84310i {

    /* renamed from: a */
    private final Context f258055a;

    public C92476a(Context context) {
        this.f258055a = context;
    }

    /* renamed from: a */
    public final void mo77853a(C66606cd cdVar) {
        C62940bt btVar = C66692z.f181427f;
        C66691y yVar = (C66691y) C66692z.f181426e.createBuilder();
        yVar.copyOnWrite();
        C66692z zVar = (C66692z) yVar.instance;
        zVar.f181429a |= 1;
        zVar.f181431c = true;
        String string = Settings.Secure.getString(this.f258055a.getContentResolver(), "android_id");
        if (string == null) {
            string = BuildConfig.FLAVOR;
        }
        yVar.copyOnWrite();
        C66692z zVar2 = (C66692z) yVar.instance;
        zVar2.f181429a |= 16;
        zVar2.f181432d = string;
        cdVar.mo58885m(btVar, (C66692z) yVar.build());
        C62940bt btVar2 = C66634da.f181293h;
        C66628cz czVar = (C66628cz) C66634da.f181292g.createBuilder();
        czVar.copyOnWrite();
        C66634da daVar = (C66634da) czVar.instance;
        daVar.f181295a |= 1;
        daVar.f181296b = 1.0f;
        czVar.copyOnWrite();
        C66634da daVar2 = (C66634da) czVar.instance;
        daVar2.f181298d = 1;
        daVar2.f181295a |= 4;
        cdVar.mo58885m(btVar2, (C66634da) czVar.build());
    }
}
