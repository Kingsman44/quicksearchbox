package com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9720d;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9013a.C119671a;
import com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128416ak;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.p2476a.p2483e.C32221c;
import com.google.assistant.p3897e.p3921j.C51773cz;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.p3926e.C51971fx;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.d.f */
/* compiled from: PG */
public final class C128434f implements C35472h {

    /* renamed from: a */
    public static final C33480d f353213a = C33480d.m62053a("show_search_results_page_args", "assistant.api.client_op.ShowSearchResultsPageArgs", C51971fx.f136380g);

    /* renamed from: b */
    public static final C51785da f353214b;

    /* renamed from: c */
    public static final C59071e f353215c = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.n.d.f");

    /* renamed from: d */
    public final C51809dy f353216d;

    /* renamed from: e */
    public final C128416ak f353217e;

    /* renamed from: f */
    public final C119671a f353218f;

    /* renamed from: g */
    public final C32221c f353219g;

    /* renamed from: h */
    public final Executor f353220h;

    static {
        C51773cz czVar = (C51773cz) C51785da.f135875e.createBuilder();
        czVar.copyOnWrite();
        C51785da daVar = (C51785da) czVar.instance;
        daVar.f135877a |= 1;
        daVar.f135878b = "ui.SHOW_SEARCH_RESULTS_PAGE";
        czVar.copyOnWrite();
        C51785da daVar2 = (C51785da) czVar.instance;
        daVar2.f135877a |= 2;
        daVar2.f135879c = 3;
        f353214b = (C51785da) czVar.build();
    }

    public C128434f(C51809dy dyVar, C128416ak akVar, C119671a aVar, C32221c cVar, Executor executor) {
        this.f353216d = dyVar;
        this.f353217e = akVar;
        this.f353218f = aVar;
        this.f353219g = cVar;
        this.f353220h = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        try {
            C33480d dVar = f353213a;
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C51971fx fxVar = (C51971fx) dVar.mo38883d(dwVar.f135932a);
            if ((fxVar.f136382a & 8) == 0) {
                return C60856cj.m92900i(C36180b.m64578b(C52235kf.INVALID_ARGUMENT));
            }
            if (!fxVar.f136383b.isEmpty()) {
                this.f353217e.mo108418g(fxVar.f136383b);
            }
            return C2169h.m6027a(new C128429a(this, fxVar));
        } catch (IllegalArgumentException unused) {
            return C60856cj.m92900i(C36180b.m64578b(C52235kf.INVALID_ARGUMENT));
        }
    }
}
