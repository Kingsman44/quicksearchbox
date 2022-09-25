package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qm */
final /* synthetic */ class C7230qm implements C7238qu {

    /* renamed from: a */
    static final C7238qu f23660a = new C7230qm();

    private C7230qm() {
    }

    /* renamed from: a */
    public final int mo16330a(Object obj) {
        int i = C7239qv.f23668a;
        String str = ((C7224qg) obj).f23577a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (aeu.f20466a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
