package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d;

import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13921e;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13976a;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13983h;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36082f;
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

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.d.g */
/* compiled from: PG */
public final /* synthetic */ class C13953g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13968v f42501a;

    /* renamed from: b */
    public final /* synthetic */ String f42502b;

    /* renamed from: c */
    public final /* synthetic */ String f42503c;

    /* renamed from: d */
    public final /* synthetic */ long f42504d;

    public /* synthetic */ C13953g(C13968v vVar, String str, String str2, long j) {
        this.f42501a = vVar;
        this.f42502b = str;
        this.f42503c = str2;
        this.f42504d = j;
    }

    public final C60870cx apply(Object obj) {
        long j;
        C13968v vVar = this.f42501a;
        String str = this.f42502b;
        String str2 = this.f42503c;
        long j2 = this.f42504d;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return C60856cj.m92900i(C13976a.m30267b(str));
        }
        C0320v vVar2 = (C0320v) optional.get();
        if (C13983h.m30278e(vVar2)) {
            return C60856cj.m92900i(C13976a.m30269d(str, C52179id.AUTHENTICATION_EXPIRED, vVar2.mo1038f().f1000g));
        }
        if (str2.equals("media.SEEK_RELATIVE")) {
            PlaybackStateCompat f = vVar2.mo1038f();
            if (f == null) {
                C59104x d = C13968v.f42527a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MediaControlPerformer");
                ((C59052c) ((C59052c) d).mo56372aa(45193)).mo56386p("Fail to get playback state from current media session.");
                return C60856cj.m92900i(C13976a.m30266a(C52235kf.NOT_FOUND, "No playback state in current media controller"));
            }
            j = f.f995b + ((long) (f.f997d * ((float) (vVar.f42531e.mo26871c() - f.f1001h))));
        } else {
            j = 0;
        }
        long j3 = j2 + j;
        if (j3 < 0) {
            C59104x d2 = C13968v.f42527a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "MediaControlPerformer");
            ((C59052c) ((C59052c) d2).mo56372aa(45192)).mo56388r("#performSeekTo: Negative target position: %d.", j3);
            return C60856cj.m92900i(C13976a.m30266a(C52235kf.INVALID_ARGUMENT, "Negative target position"));
        }
        MediaMetadataCompat d3 = vVar2.mo1036d();
        if (d3 == null) {
            C59104x d4 = C13968v.f42527a.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "MediaControlPerformer");
            ((C59052c) ((C59052c) d4).mo56372aa(45191)).mo56386p("Fail to get metadata from current media session.");
        } else {
            long a = d3.mo816a("android.media.metadata.DURATION");
            if (j3 > a) {
                C59104x d5 = C13968v.f42527a.mo56226d();
                d5.mo56378ag(C58975e.f156826a, "MediaControlPerformer");
                ((C59052c) ((C59052c) d5).mo56372aa(45190)).mo56350C("#performSeekTo: Target position %d is longer than media content %d.", j3, a);
                return C60856cj.m92900i(C13976a.m30266a(C52235kf.INVALID_ARGUMENT, "Target position longer than content"));
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        if (((Boolean) vVar.f42533g.mo17428b()).booleanValue()) {
            return ((C36082f) vVar.f42529c.mo17428b()).mo39960a(str2, new C13964r(j3), vVar2);
        }
        return ((C13921e) vVar.f42528b.mo27525b()).mo21349a(str2, new C13965s(j3), vVar2);
    }
}
