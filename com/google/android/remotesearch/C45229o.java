package com.google.android.remotesearch;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.gsa.p8889z.p8917f.C119071a;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.C86085h;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.amo;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.remotesearch.o */
/* compiled from: PG */
final class C45229o extends C45217c {

    /* renamed from: a */
    final /* synthetic */ RemoteSearchService f118024a;

    public C45229o(RemoteSearchService remoteSearchService) {
        this.f118024a = remoteSearchService;
    }

    /* renamed from: m */
    private final Query m80542m() {
        new Bundle().putBoolean("android.speech.extra.BEEP_SUPPRESSED", true);
        return this.f118024a.f118001m.mo84275aL("com.google.android.apps.gsa.search.core.service.SearchService").mo84272aI(this.f118024a.f118003o.f236951d).mo84491t((Uri) null);
    }

    /* renamed from: n */
    private static final void m80543n(int i) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1563;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164255j |= 536870912;
        ufVar2.f164206cG = i;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: o */
    private static final C54946ad m80544o(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            return (C54946ad) C62942bv.parseFrom((C62942bv) C54946ad.f144531h, bArr, C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56382g(e)).mo56372aa(54277)).mo56386p("Invalid ActionV2");
            return null;
        }
    }

    /* renamed from: p */
    private final void m80545p(Uri uri, C45216b bVar, byte[] bArr, String str) {
        this.f118024a.f118006r = bVar;
        C54946ad o = m80544o(bArr);
        Query t = this.f118024a.mo49059b(str).mo84275aL("com.google.android.apps.gsa.search.core.service.SearchService").mo84272aI(this.f118024a.f118003o.f236951d).mo84491t(uri);
        if (o != null) {
            this.f118024a.mo49062f(t, o);
            return;
        }
        ((C87541c) this.f118024a.f117995g.mo27525b()).mo81653o();
        this.f118024a.mo49061e(t);
    }

    /* renamed from: a */
    public final long mo49072a() {
        m80543n(1010);
        this.f118024a.mo49064h(getCallingUid());
        this.f118024a.f118000l.mo78318b(getCallingUid());
        return this.f118024a.f117998j;
    }

    /* renamed from: b */
    public final void mo49073b() {
        m80543n(1005);
        C59071e eVar = RemoteSearchService.f117989a;
        this.f118024a.mo49064h(getCallingUid());
        this.f118024a.mo49063g(RemoteSearchService.m80511i());
        this.f118024a.f118000l.mo78318b(getCallingUid());
        this.f118024a.mo49060d();
    }

    /* renamed from: c */
    public final void mo49074c(byte[] bArr) {
        m80543n(1008);
        this.f118024a.mo49064h(getCallingUid());
        this.f118024a.mo49063g(RemoteSearchService.m80511i());
        RemoteSearchService remoteSearchService = this.f118024a;
        remoteSearchService.f118005q = null;
        remoteSearchService.f118000l.mo78318b(getCallingUid());
        C54946ad o = m80544o(bArr);
        if (o == null) {
            ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56372aa(54282)).mo56386p("Unable to parse the actionV2 to cancel");
            return;
        }
        try {
            List list = (List) C90877ak.m148473g(((C119071a) this.f118024a.f117994f.mo27525b()).mo87636c(o, m80542m()), 500, TimeUnit.SECONDS);
            if (!list.isEmpty()) {
                C87673aa aaVar = this.f118024a.f118004p;
                C88489j jVar = new C88489j(C87739bu.REQUEST_CANCEL_ACTION_EXECUTION);
                jVar.mo82015c(new ParcelableVoiceAction((VoiceAction) list.get(0)));
                aaVar.mo81937i(jVar.mo82013a());
                return;
            }
            ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56372aa(54280)).mo56386p("processActionV2 didn't return any action to cancel");
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((C59052c) ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56382g(e)).mo56372aa(54281)).mo56386p("Couldn't cancel action");
        }
    }

    @Deprecated
    /* renamed from: d */
    public final void mo49075d() {
        ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56224b()).mo56372aa(54283)).mo56386p("Calling endSession().");
        this.f118024a.f118000l.mo78318b(getCallingUid());
        this.f118024a.f118000l.mo78317a(getCallingUid());
        C45225k kVar = this.f118024a.f117999k;
        if (kVar != null) {
            kVar.mo49085b();
        }
    }

    /* renamed from: e */
    public final void mo49076e(byte[] bArr) {
        m80543n(1003);
        this.f118024a.mo49064h(getCallingUid());
        this.f118024a.mo49063g(RemoteSearchService.m80511i());
        RemoteSearchService remoteSearchService = this.f118024a;
        remoteSearchService.f118005q = null;
        remoteSearchService.f118000l.mo78318b(getCallingUid());
        C54946ad o = m80544o(bArr);
        if (o == null) {
            ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56372aa(54286)).mo56386p("Unable to parse the actionV2 to execute");
            ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56372aa(54287)).mo56386p("executeVoiceAction: RemoteCallback is null.");
            return;
        }
        List b = ((C119071a) this.f118024a.f117994f.mo27525b()).mo87635b(o, m80542m(), (PlaybackStatus) null);
        if (!b.isEmpty()) {
            RemoteSearchService remoteSearchService2 = this.f118024a;
            VoiceAction voiceAction = (VoiceAction) b.get(0);
            remoteSearchService2.f118005q = voiceAction;
            remoteSearchService2.f118004p.mo81954z(voiceAction, true);
            return;
        }
        ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56372aa(54285)).mo56386p("processActionV2 didn't return any action to execute");
    }

    /* renamed from: f */
    public final void mo49077f() {
        m80543n(1009);
        C59071e eVar = RemoteSearchService.f117989a;
        this.f118024a.mo49064h(getCallingUid());
        this.f118024a.f118000l.mo78318b(getCallingUid());
    }

    /* renamed from: g */
    public final boolean mo49078g() {
        m80543n(1006);
        C59071e eVar = RemoteSearchService.f117989a;
        this.f118024a.mo49064h(getCallingUid());
        this.f118024a.mo49063g(RemoteSearchService.m80511i());
        this.f118024a.f118000l.mo78318b(getCallingUid());
        C85651bb bbVar = this.f118024a.f117992d;
        C86085h a = bbVar.f231496g.mo85548a(((C86054o) bbVar.f231495f.mo27525b()).mo79668a(), true);
        if (a == null || !a.mo79717a()) {
            return false;
        }
        return true;
    }

    @Deprecated
    /* renamed from: h */
    public final void mo49079h() {
        m80543n(1007);
        C59071e eVar = RemoteSearchService.f117989a;
        this.f118024a.mo49064h(getCallingUid());
        this.f118024a.f118000l.mo78318b(getCallingUid());
    }

    /* renamed from: i */
    public final void mo49080i(int i, C45216b bVar, String str, Bundle bundle) {
        m80543n(1002);
        this.f118024a.mo49064h(getCallingUid());
        this.f118024a.mo49063g(RemoteSearchService.m80511i());
        this.f118024a.f118000l.mo78318b(getCallingUid());
        if (i != 2) {
            if (i == 3) {
                String string = bundle.getString("com.google.android.remotesearch.RemoteSearchService.TEXT_QUERY");
                if (string == null) {
                    ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56225c()).mo56372aa(54292)).mo56386p("startTextSearch: no text query provided");
                    bVar.mo49070f(1001);
                    return;
                }
                C54946ad o = m80544o(bundle.getByteArray("com.google.android.remotesearch.RemoteSearchService.ACTION_CONTEXT"));
                RemoteSearchService remoteSearchService = this.f118024a;
                remoteSearchService.f118006r = bVar;
                Query aI = remoteSearchService.mo49059b(str).mo84490s(string, RemoteSearchService.m80512j(bundle)).mo84275aL("com.google.android.apps.gsa.search.core.service.SearchService").mo84272aI(this.f118024a.f118003o.f236951d);
                if (o != null) {
                    this.f118024a.mo49062f(aI, o);
                    return;
                }
                ((C87541c) this.f118024a.f117995g.mo27525b()).mo81653o();
                this.f118024a.mo49061e(aI);
            } else if (i != 4) {
                bVar.mo49070f(1000);
            } else {
                this.f118024a.f118006r = bVar;
                String string2 = bundle.getString("com.google.android.remotesearch.RemoteSearchService.TEXT_QUERY");
                if (string2 == null || !bundle.containsKey("com.google.android.remotesearch.RemoteSearchService.ACTION_TYPE")) {
                    ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56225c()).mo56372aa(54290)).mo56386p("startDeviceTriggeredActionRequest: missing required arguments");
                    bVar.mo49070f(1001);
                    return;
                }
                C55421x a = C55421x.m87686a(bundle.getInt("com.google.android.remotesearch.RemoteSearchService.ACTION_TYPE"));
                String string3 = bundle.getString("com.google.android.remotesearch.RemoteSearchService.ACTION_PKG");
                this.f118024a.f118004p.mo81937i(RemoteSearchService.f117990b);
                C87541c cVar = (C87541c) this.f118024a.f117995g.mo27525b();
                if (!(a == null || a == C55421x.UNKNOWN_ACTION_TYPE)) {
                    cVar.mo81659u(a);
                }
                if (string3 != null) {
                    synchronized (cVar.f236439a) {
                        cVar.f236448j = string3;
                    }
                }
                this.f118024a.mo49061e(this.f118024a.mo49059b(str).mo84490s(string2, RemoteSearchService.m80512j(bundle)).mo84275aL("com.google.android.apps.gsa.search.core.service.SearchService").mo84272aI(this.f118024a.f118003o.f236951d).mo84494v());
            }
        } else if (bundle != null) {
            m80545p((Uri) bundle.getParcelable("com.google.android.remotesearch.RemoteSearchService.EXTERNAL_AUDIO_URI"), bVar, (byte[]) null, str);
        } else {
            bVar.mo49070f(1001);
        }
    }

    /* renamed from: j */
    public final void mo49081j(Uri uri, C45216b bVar, Bundle bundle) {
        int i;
        m80543n(1004);
        C59071e eVar = RemoteSearchService.f117989a;
        this.f118024a.mo49064h(getCallingUid());
        RemoteSearchService remoteSearchService = this.f118024a;
        C88486g gVar = new C88486g();
        gVar.f239199a = 8589934592L;
        gVar.f239201c = amo.CLOCKWORK;
        gVar.f239204f = "transcription";
        remoteSearchService.mo49063g(new ClientConfig(gVar));
        this.f118024a.f118000l.mo78318b(getCallingUid());
        this.f118024a.f118006r = bVar;
        boolean z = true;
        bundle.putBoolean("android.speech.extra.BEEP_SUPPRESSED", true);
        bundle.putBoolean("android.speech.extra.DICTATION_MODE", true);
        if (bundle == null || !bundle.containsKey("com.google.android.remotesearch.RemoteSearchService.AUDIO_SAMPLING_RATE") || (i = bundle.getInt("com.google.android.remotesearch.RemoteSearchService.AUDIO_SAMPLING_RATE")) == 0 || i < 0) {
            i = 0;
        }
        Query C = this.f118024a.f118001m.mo84275aL("com.google.android.apps.gsa.search.core.service.SearchService").mo84272aI(this.f118024a.f118003o.f236951d).mo84290aa(uri, bundle, i).mo84240C();
        if (bundle != null && bundle.getBoolean("com.google.android.remotesearch.RemoteSearchService.ENDPOINTING_BY_CLOSING_STREAM", false)) {
            z = false;
        }
        this.f118024a.mo49061e(C.mo84261Y(z));
    }

    /* renamed from: k */
    public final void mo49082k(Uri uri, C45216b bVar, byte[] bArr, String str) {
        m80543n(1001);
        this.f118024a.mo49064h(getCallingUid());
        this.f118024a.mo49063g(RemoteSearchService.m80511i());
        this.f118024a.f118000l.mo78318b(getCallingUid());
        try {
            m80545p(uri, bVar, bArr, str);
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56225c()).mo56382g(e)).mo56372aa(54294)).mo56386p("RemoteException: ");
        }
    }

    @Deprecated
    /* renamed from: l */
    public final C45220f mo49083l(String str, C45221g gVar) {
        this.f118024a.f118000l.mo78318b(getCallingUid());
        this.f118024a.f118000l.mo78317a(getCallingUid());
        if (!str.equals("GMM_COMMUTE_UPDATE_SESSION")) {
            ((C59052c) ((C59052c) RemoteSearchService.f117989a.mo56226d()).mo56372aa(54276)).mo56386p("Invalid session type.");
            return null;
        }
        RemoteSearchService remoteSearchService = this.f118024a;
        remoteSearchService.f117999k = new C45225k(remoteSearchService.f117991c, gVar, remoteSearchService.f117993e, remoteSearchService.f117997i);
        return this.f118024a.f117999k;
    }
}
