package com.google.android.libraries.home.p1940a.p1943c.p1944a;

import com.google.android.libraries.home.p1940a.p1943c.C23553e;
import com.google.android.libraries.home.p1940a.p1943c.C23571er;
import com.google.android.libraries.home.p1940a.p1943c.C23574eu;
import java.util.Collection;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.a.am */
/* compiled from: PG */
public final class C23366am implements C23571er {

    /* renamed from: a */
    public static final C23365al f63896a = new C23365al();

    /* renamed from: b */
    private final boolean f63897b;

    /* renamed from: c */
    private final List f63898c;

    /* renamed from: d */
    private final List f63899d;

    /* renamed from: e */
    private final C23364ak f63900e;

    /* renamed from: f */
    private final String f63901f;

    /* renamed from: g */
    private final C23553e f63902g;

    /* renamed from: h */
    private final C23370aq f63903h;

    /* renamed from: i */
    private final C23361ah f63904i;

    /* renamed from: j */
    private final C23359af f63905j;

    /* renamed from: k */
    private final C23368ao f63906k;

    /* renamed from: l */
    private final C23392u f63907l;

    /* renamed from: m */
    private final C23395x f63908m;

    /* renamed from: n */
    private final C23390s f63909n;

    /* renamed from: o */
    private final C23388q f63910o;

    /* renamed from: p */
    private final C23357ad f63911p;

    /* renamed from: q */
    private final C23355ab f63912q;

    /* renamed from: r */
    private final C23386o f63913r;

    /* renamed from: s */
    private final C23382k f63914s;

    /* renamed from: t */
    private final C23397z f63915t;

    /* renamed from: u */
    private final C23384m f63916u;

    /* renamed from: v */
    private final C23373b f63917v;

    /* renamed from: w */
    private final C23375d f63918w;

    /* renamed from: x */
    private final C23380i f63919x;

    public C23366am(boolean z, List list, List list2, C23364ak akVar, String str, C23553e eVar, C23370aq aqVar, C23361ah ahVar, C23359af afVar, C23368ao aoVar, C23392u uVar, C23395x xVar, C23390s sVar, C23388q qVar, C23357ad adVar, C23355ab abVar, C23386o oVar, C23382k kVar, C23397z zVar, C23384m mVar, C23373b bVar, C23375d dVar, C23380i iVar) {
        List list3 = list;
        List list4 = list2;
        String str2 = str;
        C23370aq aqVar2 = aqVar;
        C23361ah ahVar2 = ahVar;
        C23359af afVar2 = afVar;
        C23368ao aoVar2 = aoVar;
        C23392u uVar2 = uVar;
        C23395x xVar2 = xVar;
        C23390s sVar2 = sVar;
        C23388q qVar2 = qVar;
        C23357ad adVar2 = adVar;
        C23355ab abVar2 = abVar;
        C23386o oVar2 = oVar;
        C23397z zVar2 = zVar;
        C69664n.m101061g(list3, "supportedProtocols");
        C69664n.m101061g(list4, "historicalSupportedProtocols");
        C69664n.m101061g(str2, "cameraIdentifier");
        C69664n.m101061g(aqVar2, "cameraUuidParameter");
        C69664n.m101061g(ahVar2, "cameraStreamReceiverAppId");
        C69664n.m101061g(afVar2, "cameraStreamProtocol");
        C69664n.m101061g(aoVar2, "cameraStreamAccessUrl");
        C69664n.m101061g(uVar2, "cameraStreamAuthToken");
        C69664n.m101061g(xVar2, "cameraStreamAuthTokenType");
        C69664n.m101061g(sVar2, "cameraStreamAuthTokenExpirationSec");
        C69664n.m101061g(qVar2, "cameraStreamSignalingUrl");
        C69664n.m101061g(adVar2, "cameraStreamPlaceholderImage");
        C69664n.m101061g(abVar2, "cameraStreamLiveViewImage");
        C69664n.m101061g(oVar2, "offer");
        C69664n.m101061g(kVar, "iceServers");
        C69664n.m101061g(zVar, "streamHost");
        C69664n.m101061g(mVar, "cameraNexusHostParameter");
        C69664n.m101061g(bVar, "audioCommunicationTypeParameter");
        C69664n.m101061g(dVar, "cameraClientContextTokenParameter");
        C69664n.m101061g(iVar, "cameraCloudBackendParameter");
        this.f63897b = z;
        this.f63898c = list3;
        this.f63899d = list4;
        this.f63900e = akVar;
        this.f63901f = str2;
        this.f63902g = eVar;
        this.f63903h = aqVar2;
        this.f63904i = ahVar2;
        this.f63905j = afVar2;
        this.f63906k = aoVar2;
        this.f63907l = uVar2;
        this.f63908m = xVar2;
        this.f63909n = sVar2;
        this.f63910o = qVar2;
        this.f63911p = adVar2;
        this.f63912q = abVar2;
        this.f63913r = oVar2;
        this.f63914s = kVar;
        this.f63915t = zVar;
        this.f63916u = mVar;
        this.f63917v = bVar;
        this.f63918w = dVar;
        this.f63919x = iVar;
    }

    /* renamed from: a */
    public final C23574eu mo28848a() {
        return C23574eu.CAMERA_STREAM;
    }

    /* renamed from: b */
    public final Collection mo28849b() {
        return C69540x.m100947e(this.f63903h, this.f63904i, this.f63905j, this.f63906k, this.f63907l, this.f63908m, this.f63909n, this.f63910o, this.f63911p, this.f63912q, this.f63913r, this.f63914s, this.f63915t, this.f63916u, this.f63917v, this.f63918w, this.f63919x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23366am)) {
            return false;
        }
        C23366am amVar = (C23366am) obj;
        return this.f63897b == amVar.f63897b && C69664n.m101066l(this.f63898c, amVar.f63898c) && C69664n.m101066l(this.f63899d, amVar.f63899d) && C69664n.m101066l(this.f63900e, amVar.f63900e) && C69664n.m101066l(this.f63901f, amVar.f63901f) && C69664n.m101066l(this.f63902g, amVar.f63902g) && C69664n.m101066l(this.f63903h, amVar.f63903h) && C69664n.m101066l(this.f63904i, amVar.f63904i) && C69664n.m101066l(this.f63905j, amVar.f63905j) && C69664n.m101066l(this.f63906k, amVar.f63906k) && C69664n.m101066l(this.f63907l, amVar.f63907l) && C69664n.m101066l(this.f63908m, amVar.f63908m) && C69664n.m101066l(this.f63909n, amVar.f63909n) && C69664n.m101066l(this.f63910o, amVar.f63910o) && C69664n.m101066l(this.f63911p, amVar.f63911p) && C69664n.m101066l(this.f63912q, amVar.f63912q) && C69664n.m101066l(this.f63913r, amVar.f63913r) && C69664n.m101066l(this.f63914s, amVar.f63914s) && C69664n.m101066l(this.f63915t, amVar.f63915t) && C69664n.m101066l(this.f63916u, amVar.f63916u) && C69664n.m101066l(this.f63917v, amVar.f63917v) && C69664n.m101066l(this.f63918w, amVar.f63918w) && C69664n.m101066l(this.f63919x, amVar.f63919x);
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((this.f63897b ? 1 : 0) * true) + this.f63898c.hashCode()) * 31) + this.f63899d.hashCode()) * 31) + this.f63900e.hashCode()) * 31) + this.f63901f.hashCode()) * 31) + this.f63902g.f64463a.hashCode()) * 31) + this.f63903h.hashCode()) * 31) + this.f63904i.hashCode()) * 31) + this.f63905j.hashCode()) * 31) + this.f63906k.hashCode()) * 31) + this.f63907l.hashCode()) * 31) + this.f63908m.hashCode()) * 31) + this.f63909n.hashCode()) * 31) + this.f63910o.hashCode()) * 31) + this.f63911p.hashCode()) * 31) + this.f63912q.hashCode()) * 31) + this.f63913r.hashCode()) * 31) + this.f63914s.hashCode()) * 31) + this.f63915t.hashCode()) * 31) + this.f63916u.hashCode()) * 31) + this.f63917v.hashCode()) * 31) + this.f63918w.hashCode()) * 31) + this.f63919x.hashCode();
    }

    public final String toString() {
        boolean z = this.f63897b;
        List list = this.f63898c;
        List list2 = this.f63899d;
        C23364ak akVar = this.f63900e;
        String str = this.f63901f;
        C23553e eVar = this.f63902g;
        C23370aq aqVar = this.f63903h;
        C23361ah ahVar = this.f63904i;
        C23359af afVar = this.f63905j;
        C23368ao aoVar = this.f63906k;
        C23392u uVar = this.f63907l;
        C23395x xVar = this.f63908m;
        C23390s sVar = this.f63909n;
        C23388q qVar = this.f63910o;
        C23357ad adVar = this.f63911p;
        C23355ab abVar = this.f63912q;
        C23386o oVar = this.f63913r;
        C23382k kVar = this.f63914s;
        C23397z zVar = this.f63915t;
        C23384m mVar = this.f63916u;
        C23373b bVar = this.f63917v;
        C23375d dVar = this.f63918w;
        return "HomeAutomationCameraStreamTrait(needAuthToken=" + z + ", supportedProtocols=" + list + ", historicalSupportedProtocols=" + list2 + ", aspectRatio=" + akVar + ", cameraIdentifier=" + str + ", cameraStreamTraitAttributes=" + eVar + ", cameraUuidParameter=" + aqVar + ", cameraStreamReceiverAppId=" + ahVar + ", cameraStreamProtocol=" + afVar + ", cameraStreamAccessUrl=" + aoVar + ", cameraStreamAuthToken=" + uVar + ", cameraStreamAuthTokenType=" + xVar + ", cameraStreamAuthTokenExpirationSec=" + sVar + ", cameraStreamSignalingUrl=" + qVar + ", cameraStreamPlaceholderImage=" + adVar + ", cameraStreamLiveViewImage=" + abVar + ", offer=" + oVar + ", iceServers=" + kVar + ", streamHost=" + zVar + ", cameraNexusHostParameter=" + mVar + ", audioCommunicationTypeParameter=" + bVar + ", cameraClientContextTokenParameter=" + dVar + ", cameraCloudBackendParameter=" + this.f63919x + ")";
    }
}
