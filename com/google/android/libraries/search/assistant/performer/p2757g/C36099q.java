package com.google.android.libraries.search.assistant.performer.p2757g;

import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.libraries.assistant.p1531n.p1532a.C18434a;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36082f;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52179id;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.q */
/* compiled from: PG */
public final /* synthetic */ class C36099q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36108z f94420a;

    /* renamed from: b */
    public final /* synthetic */ String f94421b;

    /* renamed from: c */
    public final /* synthetic */ String f94422c;

    /* renamed from: d */
    public final /* synthetic */ long f94423d;

    public /* synthetic */ C36099q(C36108z zVar, String str, String str2, long j) {
        this.f94420a = zVar;
        this.f94421b = str;
        this.f94422c = str2;
        this.f94423d = j;
    }

    public final C60870cx apply(Object obj) {
        long j;
        long j2;
        C36108z zVar = this.f94420a;
        String str = this.f94421b;
        String str2 = this.f94422c;
        long j3 = this.f94423d;
        Optional optional = (Optional) obj;
        if (!optional.isEmpty()) {
            C0320v vVar = (C0320v) optional.get();
            if (C18434a.m35906b(vVar)) {
                return C60856cj.m92900i(C36089g.m64501d(str, C52179id.AUTHENTICATION_EXPIRED, vVar.mo1038f().f1000g));
            }
            if (str2.equals("media.SEEK_RELATIVE")) {
                PlaybackStateCompat f = vVar.mo1038f();
                if (f == null) {
                    C59104x d = C36108z.f94436a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "MediaControlPerformer");
                    ((C59052c) ((C59052c) d).mo56372aa(52089)).mo56386p("Fail to get playback state from current media session.");
                    return C60856cj.m92900i(C36180b.m64579c(C52235kf.NOT_FOUND, "No playback state in current media controller"));
                }
                int i = f.f994a;
                j = (i == 1 || i == 2) ? f.f995b : f.f995b + ((long) (f.f997d * ((float) (zVar.f94438c.mo26871c() - f.f1001h))));
            } else {
                j = 0;
            }
            long j4 = j + j3;
            if (j4 < 0) {
                C59104x b = C36108z.f94436a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "MediaControlPerformer");
                ((C59052c) ((C59052c) b).mo56372aa(52088)).mo56388r("#performSeekTo: Negative target position: %d.", j4);
                j2 = 0;
            } else {
                j2 = j4;
            }
            MediaMetadataCompat d2 = vVar.mo1036d();
            if (d2 == null) {
                C59104x d3 = C36108z.f94436a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "MediaControlPerformer");
                ((C59052c) ((C59052c) d3).mo56372aa(52087)).mo56386p("Fail to get metadata from current media session.");
            } else {
                long a = d2.mo816a("android.media.metadata.DURATION");
                if (j2 > a) {
                    C59104x b2 = C36108z.f94436a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "MediaControlPerformer");
                    ((C59052c) ((C59052c) b2).mo56372aa(52086)).mo56350C("#performSeekTo: Target position %d is longer than media content %d.", j2, a);
                    j2 = Math.max(a - 1, 0);
                }
            }
            C58976aa aaVar = C58975e.f156826a;
            return ((C36082f) zVar.f94437b.mo27525b()).mo39960a(str2, new C36096n(j2), vVar);
        } else if (str == null) {
            return C60856cj.m92900i(C36089g.m64500c());
        } else {
            return C60856cj.m92900i(C36089g.m64498a(str));
        }
    }
}
