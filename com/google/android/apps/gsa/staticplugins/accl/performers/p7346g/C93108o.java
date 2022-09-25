package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.apps.gsa.nga.api.a.ap;
import com.google.android.apps.gsa.nga.api.a.bz;
import com.google.android.apps.gsa.nga.api.a.cb;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.search.core.p6491a.C84350ai;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.p7066m.C90047cz;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.nga.p8044a.p8046b.C102999b;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52159hk;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52179id;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.o */
/* compiled from: PG */
public final class C93108o {

    /* renamed from: a */
    public static final C59071e f259723a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.g.o");

    /* renamed from: b */
    public static final C58495hd f259724b;

    /* renamed from: c */
    public final C68214a f259725c;

    /* renamed from: d */
    public final C69464a f259726d;

    /* renamed from: e */
    public final C68214a f259727e;

    /* renamed from: f */
    private final C21370a f259728f;

    /* renamed from: g */
    private final int f259729g;

    /* renamed from: h */
    private final C68214a f259730h;

    /* renamed from: i */
    private final C68214a f259731i;

    /* renamed from: j */
    private final C68214a f259732j;

    /* renamed from: k */
    private final C68214a f259733k;

    /* renamed from: l */
    private final C68214a f259734l;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("media.PAUSE", C118569b.MEDIA_GLANCEABILITY_PAUSE);
        gzVar.mo55429h("media.NEXT", C118569b.MEDIA_GLANCEABILITY_NEXT);
        gzVar.mo55429h("media.RESUME", C118569b.MEDIA_GLANCEABILITY_PLAY);
        gzVar.mo55429h("media.PREVIOUS", C118569b.MEDIA_GLANCEABILITY_PREVIOUS);
        f259724b = gzVar.mo55427f(false);
    }

    public C93108o(C68214a aVar, C69464a aVar2, C21370a aVar3, int i, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9) {
        this.f259725c = aVar;
        this.f259726d = aVar2;
        this.f259728f = aVar3;
        this.f259729g = i;
        this.f259730h = aVar4;
        this.f259731i = aVar5;
        this.f259732j = aVar6;
        this.f259733k = aVar7;
        this.f259734l = aVar8;
        this.f259727e = aVar9;
    }

    /* renamed from: b */
    public static String m153188b(C52159hk hkVar) {
        if (hkVar == null || (hkVar.f136862a & 1) == 0) {
            return null;
        }
        C51098gh ghVar = hkVar.f136863b;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        return C93094ap.m153165m(ghVar);
    }

    /* renamed from: a */
    public final C60870cx mo87542a(String str, long j, String str2) {
        long j2;
        long j3;
        String str3 = str;
        String str4 = str2;
        C93094ap apVar = (C93094ap) this.f259726d.mo17428b();
        C0320v a = apVar.mo87533a(str4, false);
        if (a == null) {
            return C60856cj.m92900i(C93094ap.m153160c(str2));
        }
        if (C93094ap.m153166p(a)) {
            return C60856cj.m92900i(C93094ap.m153159b(str4, C52179id.AUTHENTICATION_EXPIRED, a.mo1038f().f1000g));
        }
        if (str3.equals("media.SEEK_RELATIVE")) {
            PlaybackStateCompat f = a.mo1038f();
            if (f == null) {
                C59104x c = f259723a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "MediaControlPerformer");
                ((C59052c) ((C59052c) c).mo56372aa(13306)).mo56386p("Fail to get playback state from current media session.");
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.NOT_FOUND, "No playback state in current media controller"));
            }
            int i = f.f994a;
            j2 = (i == 1 || i == 2) ? f.f995b : f.f995b + ((long) (f.f997d * ((float) (this.f259728f.mo26871c() - f.f1001h))));
        } else {
            j2 = 0;
        }
        long j4 = j2 + j;
        if (j4 < 0) {
            C59104x b = f259723a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MediaControlPerformer");
            ((C59052c) ((C59052c) b).mo56372aa(13305)).mo56388r("#performSeekTo: Negative target position: %d.", j4);
            j3 = 0;
        } else {
            j3 = j4;
        }
        MediaMetadataCompat d = a.mo1036d();
        if (d == null) {
            C59104x c2 = f259723a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "MediaControlPerformer");
            ((C59052c) ((C59052c) c2).mo56372aa(13304)).mo56386p("Fail to get metadata from current media session.");
        } else {
            long a2 = d.mo816a("android.media.metadata.DURATION");
            if (j3 > a2) {
                C59104x b2 = f259723a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "MediaControlPerformer");
                ((C59052c) ((C59052c) b2).mo56372aa(13303)).mo56350C("#performSeekTo: Target position %d is longer than media content %d.", j3, a2);
                j3 = Math.max(a2 - 1, 0);
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        return apVar.mo87538k(str3, new C93095b(j3), a, false);
    }

    /* renamed from: c */
    public final void mo87543c() {
        if (this.f259729g == 4) {
            C90877ak.m148481o(((C84350ai) this.f259731i.mo27525b()).mo77886a(new C87684al(C88244um.NOTIFY_MEDIA_CONTROL).mo81964a()), "MediaControlPerformer", "Service event sent, received: %b", "Failed to send service event to active client.");
        } else if (((Boolean) ((C58833ax) this.f259733k.mo27525b()).mo56106b(C93096c.f259709a).mo56109e(false)).booleanValue() && ((C58833ax) this.f259734l.mo27525b()).mo56113h()) {
            bz createBuilder = cb.d.createBuilder();
            ap apVar = ap.a;
            createBuilder.copyOnWrite();
            cb cbVar = createBuilder.instance;
            apVar.getClass();
            cbVar.b = apVar;
            cbVar.a = 7;
            ((C102999b) ((C58833ax) this.f259734l.mo27525b()).mo56107c()).mo93556a(createBuilder.build());
        }
    }

    /* renamed from: d */
    public final C60870cx mo87544d(String str, String str2, C93093ao aoVar, int i) {
        C93094ap apVar = (C93094ap) this.f259726d.mo17428b();
        C0320v a = apVar.mo87533a(str2, false);
        if (a == null) {
            return C60856cj.m92900i(C93094ap.m153160c(str2));
        }
        if (C93094ap.m153166p(a)) {
            return C60856cj.m92900i(C93094ap.m153159b(str2, C52179id.AUTHENTICATION_EXPIRED, a.mo1038f().f1000g));
        }
        C58976aa aaVar = C58975e.f156826a;
        C87594r.m142385i(str, (C52174hz) null, str2, (C58833ax) this.f259732j.mo27525b());
        C60870cx k = apVar.mo87538k(str, aoVar, a, false);
        if (((C86124t) this.f259730h.mo27525b()).mo79746e(C90047cz.f248755a) && i == 2) {
            k.mo4106b(new C93101h(this, k, str), C60826bg.f164896a);
        }
        return k;
    }
}
