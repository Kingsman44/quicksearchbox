package com.google.android.libraries.assistant.hotword;

import android.content.Context;
import com.google.android.apps.gsa.shared.p7066m.C90127fy;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b;
import com.google.android.apps.gsa.speech.hotword.p7283b.C92351a;
import com.google.android.apps.gsa.speech.hotword.p7283b.C92353b;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92513g;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.micro.GoogleHotwordData;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.hotword.m */
/* compiled from: PG */
public final class C18376m extends C68247h {

    /* renamed from: a */
    private final C68283d f52151a;

    /* renamed from: c */
    private final C68283d f52152c;

    public C18376m(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C18376m.class), aVar);
        this.f52151a = C68236af.m98549d(dVar);
        this.f52152c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Context context = (Context) list.get(0);
        C90580b bVar = (C90580b) new C92351a(new C90127fy(), new C92353b(new C90127fy(), (C58833ax) list.get(1))).mo86999a(C58833ax.m90834k(false)).get("en-US");
        byte[] h = bVar != null ? C92513g.m152179h(context, bVar.f253241c) : null;
        if (h != null) {
            System.loadLibrary("google_speech_micro_jni");
            return C60856cj.m92900i(new GoogleHotwordData(h, 16000, 1, 0, false));
        }
        throw new RuntimeException("failed");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f52151a.mo60297gq(), this.f52152c.mo60297gq());
    }
}
