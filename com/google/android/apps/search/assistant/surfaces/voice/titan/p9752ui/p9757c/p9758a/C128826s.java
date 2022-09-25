package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.p9758a;

import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.C128690a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.C128805b;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.C128806c;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128830e;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128831f;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128832g;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128834i;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128836k;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128838m;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128841p;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128842q;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128843r;
import com.google.android.libraries.search.assistant.p2511d.C32561x;
import com.google.android.libraries.search.p6glow.C39872c;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.C69677g;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69669s;
import p5462h.p5478h.C69684c;
import p5462h.p5481k.C69713k;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.c.a.s */
/* compiled from: PG */
public final class C128826s implements C128843r, C128830e, C128805b {

    /* renamed from: a */
    static final /* synthetic */ C69713k[] f354097a;
    @Deprecated

    /* renamed from: b */
    public static final C59071e f354098b = C59071e.m91331h();

    /* renamed from: c */
    public final C128806c f354099c;

    /* renamed from: d */
    public final C46778cv f354100d;

    /* renamed from: e */
    private final C71422aw f354101e;

    /* renamed from: f */
    private final C69684c f354102f = new C128816i(C128690a.INITIALIZING, this);

    /* renamed from: g */
    private final C69684c f354103g = new C128817j(false, this);

    /* renamed from: h */
    private final C69684c f354104h = new C128818k(C128841p.INITIALIZING, this);

    /* renamed from: i */
    private final C69684c f354105i = new C128819l(C39872c.GONE, this);

    /* renamed from: j */
    private final C69684c f354106j = new C128820m(false, this);

    /* renamed from: k */
    private final C69684c f354107k = new C128821n(C128832g.f354116a, this);

    /* renamed from: l */
    private final C69684c f354108l = new C128822o(false, this);

    /* renamed from: m */
    private final C69684c f354109m = new C128823p(C128836k.NEAR, this);

    /* renamed from: n */
    private final C69684c f354110n = new C128824q(false, this);

    /* renamed from: o */
    private final C69684c f354111o = new C128813f(C128834i.ASSISTANT, this);

    /* renamed from: p */
    private final C69684c f354112p = new C128814g(C128842q.HIDDEN, this);

    /* renamed from: q */
    private final C69684c f354113q = new C128815h(true, this);

    static {
        Class<C128826s> cls = C128826s.class;
        C69669s sVar = new C69669s(cls, "_interactionState", "get_interactionState()Lcom/google/android/apps/search/assistant/surfaces/voice/titan/ui/connection/Connection$InteractionState;");
        int i = C69649af.f186028a;
        f354097a = new C69713k[]{sVar, new C69669s(cls, "_isAvatarEnabled", "get_isAvatarEnabled()Z"), new C69669s(cls, "_voicePlateMode", "get_voicePlateMode()Lcom/google/android/apps/search/assistant/surfaces/voice/titan/ui/contentprovider/VoicePlateUiContentProvider$VoicePlateMode;"), new C69669s(cls, "_glowState", "get_glowState()Lcom/google/android/libraries/search/p6glow/AssistantP6GlowAnimator$State;"), new C69669s(cls, "_isIntentPlateEnabled", "get_isIntentPlateEnabled()Z"), new C69669s(cls, "_contentState", "get_contentState()Lcom/google/android/apps/search/assistant/surfaces/voice/titan/ui/contentprovider/VoicePlateUiContentProvider$ContentState;"), new C69669s(cls, "_shouldShowKeyboardIcon", "get_shouldShowKeyboardIcon()Z"), new C69669s(cls, "_proximity", "get_proximity()Lcom/google/android/apps/search/assistant/surfaces/voice/titan/ui/contentprovider/VoicePlateUiContentProvider$Proximity;"), new C69669s(cls, "_isAssistantActive", "get_isAssistantActive()Z"), new C69669s(cls, "_iconType", "get_iconType()Lcom/google/android/apps/search/assistant/surfaces/voice/titan/ui/contentprovider/VoicePlateUiContentProvider$IconType;"), new C69669s(cls, "_voicePlateScrimMode", "get_voicePlateScrimMode()Lcom/google/android/apps/search/assistant/surfaces/voice/titan/ui/contentprovider/VoicePlateUiContentProvider$VoicePlateScrimMode;"), new C69669s(cls, "_enableAccessibility", "get_enableAccessibility()Z")};
    }

    public C128826s(C128806c cVar, C46778cv cvVar, C71422aw awVar) {
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(awVar, "scope");
        this.f354099c = cVar;
        this.f354100d = cvVar;
        this.f354101e = awVar;
    }

    /* renamed from: A */
    private final void m210217A(boolean z) {
        this.f354113q.mo42045b(f354097a[11], Boolean.valueOf(z));
    }

    /* renamed from: B */
    private final void m210218B(C128834i iVar) {
        this.f354111o.mo42045b(f354097a[9], iVar);
    }

    /* renamed from: C */
    private final void m210219C(C128690a aVar) {
        this.f354102f.mo42045b(f354097a[0], aVar);
    }

    /* renamed from: D */
    private final void m210220D(boolean z) {
        this.f354106j.mo42045b(f354097a[4], Boolean.valueOf(z));
    }

    /* renamed from: E */
    private final void m210221E(C128836k kVar) {
        this.f354109m.mo42045b(f354097a[7], kVar);
    }

    /* renamed from: F */
    private final void m210222F(boolean z) {
        this.f354108l.mo42045b(f354097a[6], Boolean.valueOf(z));
    }

    /* renamed from: G */
    private final boolean m210223G() {
        return ((Boolean) this.f354106j.mo42046c(f354097a[4])).booleanValue();
    }

    /* renamed from: w */
    private final C128690a m210224w() {
        return (C128690a) this.f354102f.mo42046c(f354097a[0]);
    }

    /* renamed from: x */
    private final C128831f m210225x() {
        return (C128831f) this.f354107k.mo42046c(f354097a[5]);
    }

    /* renamed from: y */
    private final C128841p m210226y() {
        return (C128841p) this.f354104h.mo42046c(f354097a[2]);
    }

    /* renamed from: z */
    private final void m210227z(C128831f fVar) {
        this.f354107k.mo42045b(f354097a[5], fVar);
    }

    /* renamed from: a */
    public final void mo108661a(boolean z) {
        m210217A(z);
    }

    /* renamed from: b */
    public final void mo108662b(boolean z) {
        mo108683t(z);
    }

    /* renamed from: c */
    public final void mo108663c(C128831f fVar) {
        m210227z(fVar);
    }

    /* renamed from: d */
    public final void mo108664d(boolean z) {
        m210220D(z);
    }

    /* renamed from: e */
    public final void mo108665e(C128690a aVar) {
        C69664n.m101061g(aVar, "interactionState");
        m210219C(aVar);
    }

    /* renamed from: f */
    public final void mo108666f(boolean z) {
        m210222F(z);
    }

    /* renamed from: g */
    public final void mo108667g(C128836k kVar) {
        C69664n.m101061g(kVar, "proximity");
        m210221E(kVar);
    }

    /* renamed from: h */
    public final void mo108671h() {
        m210219C(C128690a.INITIALIZING);
        m210220D(false);
        m210227z(C128832g.f354116a);
        mo108683t(false);
        m210218B(C128834i.ASSISTANT);
        m210221E(C128836k.NEAR);
        m210222F(false);
        m210217A(true);
        C71803m.m105043d(this.f354101e, (C69585o) null, (C71424ay) null, new C128810c(this, (C69577g) null), 3);
    }

    /* renamed from: i */
    public final void mo108672i() {
        C71803m.m105043d(this.f354101e, (C69585o) null, (C71424ay) null, new C128812e(this, (C69577g) null), 3);
    }

    /* renamed from: j */
    public final C128831f mo108673j() {
        return m210225x();
    }

    /* renamed from: k */
    public final C128834i mo108674k() {
        return (C128834i) this.f354111o.mo42046c(f354097a[9]);
    }

    /* renamed from: l */
    public final C128836k mo108675l() {
        return (C128836k) this.f354109m.mo42046c(f354097a[7]);
    }

    /* renamed from: m */
    public final C128841p mo108676m() {
        return m210226y();
    }

    /* renamed from: n */
    public final C128842q mo108677n() {
        return (C128842q) this.f354112p.mo42046c(f354097a[10]);
    }

    /* renamed from: o */
    public final C39872c mo108678o() {
        return (C39872c) this.f354105i.mo42046c(f354097a[3]);
    }

    /* renamed from: p */
    public final C60870cx mo108679p() {
        return C32561x.m60381a(this.f354101e, new C128811d(this, (C69577g) null));
    }

    /* renamed from: q */
    public final C60870cx mo108680q() {
        return C32561x.m60381a(this.f354101e, new C128825r(this, (C69577g) null));
    }

    /* renamed from: r */
    public final boolean mo108681r() {
        return ((Boolean) this.f354113q.mo42046c(f354097a[11])).booleanValue();
    }

    /* renamed from: s */
    public final boolean mo108682s() {
        return ((Boolean) this.f354108l.mo42046c(f354097a[6])).booleanValue();
    }

    /* renamed from: t */
    public final void mo108683t(boolean z) {
        this.f354103g.mo42045b(f354097a[1], Boolean.valueOf(z));
    }

    /* renamed from: u */
    public final void mo108684u() {
        C128834i iVar;
        if (!C69664n.m101066l(m210225x(), C128832g.f354116a)) {
            C128831f x = m210225x();
            boolean booleanValue = ((Boolean) this.f354103g.mo42046c(f354097a[1])).booleanValue();
            if (x instanceof C128838m) {
                iVar = booleanValue ? C128834i.USER_AVATAR : C128834i.DEFAULT_AVATAR;
            } else {
                iVar = C128834i.ASSISTANT;
            }
            m210218B(iVar);
        }
    }

    /* renamed from: v */
    public final void mo108685v() {
        C128841p pVar;
        C128842q qVar;
        C39872c cVar;
        C128831f x = m210225x();
        boolean G = m210223G();
        C128690a w = m210224w();
        C69664n.m101061g(x, "contentState");
        C69664n.m101061g(w, "interactionState");
        if (G) {
            pVar = C128841p.INTENT_PLATE;
        } else if (!C69664n.m101066l(x, C128832g.f354116a)) {
            pVar = C128841p.PLATE;
        } else {
            C128690a aVar = C128690a.INITIALIZING;
            switch (w.ordinal()) {
                case 0:
                    pVar = C128841p.INITIALIZING;
                    break;
                case 1:
                case 7:
                case 8:
                    pVar = C128841p.CLOSED;
                    break;
                case 2:
                case 4:
                case 5:
                case 6:
                    pVar = C128841p.SOFT;
                    break;
                case 3:
                    pVar = C128841p.PLATE;
                    break;
                default:
                    throw new C69677g();
            }
        }
        C69684c cVar2 = this.f354104h;
        C69713k[] kVarArr = f354097a;
        cVar2.mo42045b(kVarArr[2], pVar);
        C128841p y = m210226y();
        C69664n.m101061g(y, "voicePlateMode");
        if (y == C128841p.PLATE || y == C128841p.INTENT_PLATE) {
            qVar = C128842q.VISIBLE;
        } else {
            qVar = C128842q.HIDDEN;
        }
        this.f354112p.mo42045b(kVarArr[10], qVar);
        boolean G2 = m210223G();
        C128690a w2 = m210224w();
        C69664n.m101061g(w2, "interactionState");
        if (G2) {
            cVar = C39872c.GONE;
        } else {
            C128690a aVar2 = C128690a.INITIALIZING;
            switch (w2.ordinal()) {
                case 0:
                case 1:
                case 7:
                case 8:
                    cVar = C39872c.GONE;
                    break;
                case 2:
                case 3:
                    cVar = C39872c.LISTENING;
                    break;
                case 4:
                    cVar = C39872c.USER_INPUT;
                    break;
                case 5:
                case 6:
                    cVar = C39872c.THINKING;
                    break;
                default:
                    throw new C69677g();
            }
        }
        this.f354105i.mo42045b(kVarArr[3], cVar);
        boolean z = false;
        if (!(m210224w() == C128690a.IDLE || m210224w() == C128690a.INITIALIZING)) {
            z = true;
        }
        this.f354110n.mo42045b(kVarArr[8], Boolean.valueOf(z));
    }
}
