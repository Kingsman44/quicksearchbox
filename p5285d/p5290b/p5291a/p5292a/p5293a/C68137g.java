package p5285d.p5290b.p5291a.p5292a.p5293a;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.frameworks.client.data.android.C61372an;
import com.google.frameworks.client.data.android.C61373ao;

/* renamed from: d.b.a.a.a.g */
/* compiled from: PG */
public final class C68137g implements C61373ao {

    /* renamed from: a */
    public static final C31164au f184404a = C31164au.m58092b("google.search.readaloud.v1.ReadAloudService.");

    /* renamed from: b */
    public static final C61372an f184405b = new C68131a();

    /* renamed from: c */
    public static final C61372an f184406c = new C68132b();

    /* renamed from: d */
    public static final C61372an f184407d = new C68133c();

    /* renamed from: e */
    public static final C61372an f184408e = new C68134d();

    /* renamed from: f */
    public static final C61372an f184409f = new C68135e();

    /* renamed from: g */
    public static final C61372an f184410g = new C68136f();

    /* renamed from: h */
    public static final C68137g f184411h = new C68137g();

    /* renamed from: k */
    private static final C31164au f184412k = C31164au.m58092b("google.search.readaloud.v1.ReadAloudService/");

    /* renamed from: l */
    private static final C31164au f184413l = C31164au.m58092b("readaloud.googleapis.com");

    /* renamed from: i */
    public final C58485gu f184414i;

    /* renamed from: j */
    public final C58528ij f184415j = new C58526ih().mo55486f();

    /* renamed from: m */
    private final C58495hd f184416m;

    static {
        C31164au.m58092b("google.search.readaloud.v1.ReadAloudService");
    }

    private C68137g() {
        C58480gp e = C58485gu.m89837e();
        e.mo55395g("autopush-readaloud.mtls.sandbox.googleapis.com");
        e.mo55395g("autopush-readaloud.sandbox.googleapis.com");
        e.mo55395g("prodsearchqual-readaloud.mtls.sandbox.googleapis.com");
        e.mo55395g("prodsearchqual-readaloud.sandbox.googleapis.com");
        e.mo55395g("readaloud.mtls.googleapis.com");
        e.mo55395g("staging-readaloud.mtls.sandbox.googleapis.com");
        e.mo55395g("staging-readaloud.sandbox.googleapis.com");
        e.mo55395g("readaloud.googleapis.com");
        this.f184414i = e.mo55394f();
        C61372an anVar = f184405b;
        C61372an anVar2 = f184406c;
        C61372an anVar3 = f184407d;
        C61372an anVar4 = f184408e;
        C61372an anVar5 = f184409f;
        C61372an anVar6 = f184410g;
        C58528ij.m90015O(anVar, anVar2, anVar3, anVar4, anVar5, anVar6, new C61372an[0]);
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("GenerateAudioDoc", anVar);
        gzVar.mo55429h("GenerateAudioDocStream", anVar2);
        gzVar.mo55429h("GetAudioBytesStream", anVar3);
        gzVar.mo55429h("ListVoices", anVar4);
        gzVar.mo55429h("CheckUrl", anVar5);
        gzVar.mo55429h("CheckClientOptions", anVar6);
        this.f184416m = gzVar.mo55427f(true);
        new C58490gz(4).mo55427f(true);
    }

    /* renamed from: a */
    public final C31164au mo17202a() {
        return f184413l;
    }

    /* renamed from: b */
    public final C61372an mo17203b(String str) {
        String str2 = f184412k.f84029a;
        if (!str.startsWith(str2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        if (this.f184416m.containsKey(substring)) {
            return (C61372an) this.f184416m.get(substring);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo17204c() {
        return null;
    }
}
