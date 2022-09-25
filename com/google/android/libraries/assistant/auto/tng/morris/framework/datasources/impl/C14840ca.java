package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14739i;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14152v;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14415ij;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14416ik;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14417il;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.ca */
/* compiled from: PG */
final class C14840ca extends C0310l {

    /* renamed from: d */
    final C0320v f44677d;

    /* renamed from: e */
    final /* synthetic */ C14842cc f44678e;

    public C14840ca(C14842cc ccVar, C0320v vVar) {
        this.f44678e = ccVar;
        this.f44677d = vVar;
    }

    /* renamed from: d */
    public final void mo1005d(MediaMetadataCompat mediaMetadataCompat) {
        C59071e eVar = C14842cc.f44681a;
        C58976aa aaVar = C58975e.f156826a;
        if (mediaMetadataCompat != null) {
            C14986h hVar = this.f44678e.f44683b;
            C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
            C14415ij ijVar = (C14415ij) C14417il.f43604g.createBuilder();
            ijVar.copyOnWrite();
            ((C14417il) ijVar.instance).f43606a = 15;
            gtVar.copyOnWrite();
            C14492lf lfVar = (C14492lf) gtVar.instance;
            C14417il ilVar = (C14417il) ijVar.build();
            ilVar.getClass();
            lfVar.f43801d = ilVar;
            lfVar.f43800c = 6;
            hVar.mo21875g((C14492lf) gtVar.build());
            if (C14842cc.m31215q(mediaMetadataCompat)) {
                this.f44678e.f44685d.mo21479d(this.f44677d.mo1039g(), this.f44678e.mo21769k(this.f44677d));
            }
        }
    }

    /* renamed from: e */
    public final void mo1006e(PlaybackStateCompat playbackStateCompat) {
        String str;
        String str2;
        C59071e eVar = C14842cc.f44681a;
        C58976aa aaVar = C58975e.f156826a;
        if (playbackStateCompat == null) {
            C59104x d = C14842cc.f44681a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.MediaDataSrc");
            ((C59052c) ((C59052c) d).mo56372aa(45585)).mo56389s("Receiving a playbackstate with null here for media session: %s", C14842cc.m31213j(this.f44677d));
        } else {
            C59104x b = C14842cc.f44681a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "Morris.MediaDataSrc");
            C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(45582);
            String j = C14842cc.m31213j(this.f44677d);
            switch (playbackStateCompat.f994a) {
                case 0:
                    str = "STATE_NONE";
                    break;
                case 1:
                    str = "STATE_STOPPED";
                    break;
                case 2:
                    str = "STATE_PAUSED";
                    break;
                case 3:
                    str = "STATE_PLAYING";
                    break;
                case 4:
                    str = "STATE_FAST_FORWARDING";
                    break;
                case 5:
                    str = "STATE_REWINDING";
                    break;
                case 6:
                    str = "STATE_BUFFERING";
                    break;
                case 7:
                    str = "STATE_ERROR";
                    break;
                case 8:
                    str = "STATE_CONNECTING";
                    break;
                case 9:
                    str = "STATE_SKIPPING_TO_PREVIOUS";
                    break;
                case 10:
                    str = "STATE_SKIPPING_TO_NEXT";
                    break;
                case 11:
                    str = "STATE_SKIPPING_TO_QUEUE_ITEM";
                    break;
                default:
                    str = "UNDEFINED_STATE";
                    break;
            }
            cVar.mo56359L("session: %s playbackstate changed to: %s, state type: %s", j, playbackStateCompat, str);
            if (playbackStateCompat.f994a == 7) {
                C59104x b2 = C14842cc.f44681a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "Morris.MediaDataSrc");
                C59052c cVar2 = (C59052c) ((C59052c) b2).mo56372aa(45584);
                switch (playbackStateCompat.f999f) {
                    case 0:
                        str2 = "UNKNOWN_ERROR";
                        break;
                    case 1:
                        str2 = "APP_ERROR";
                        break;
                    case 2:
                        str2 = "NOT_SUPPORTED";
                        break;
                    case 3:
                        str2 = "AUTHENTICATION_EXPIRED";
                        break;
                    case 4:
                        str2 = "PREMIUM_ACCOUNT_REQUIRED";
                        break;
                    case 5:
                        str2 = "CONCURRENT_STREAM_LIMIT";
                        break;
                    case 6:
                        str2 = "PARENTAL_CONTROL_RESTRICTED";
                        break;
                    case 7:
                        str2 = "NOT_AVAILABLE_IN_REGION";
                        break;
                    case 8:
                        str2 = "CONTENT_ALREADY_PLAYING";
                        break;
                    case 9:
                        str2 = "SKIP_LIMIT_REACHED";
                        break;
                    case 10:
                        str2 = "ACTION_ABORTED";
                        break;
                    case 11:
                        str2 = "END_OF_QUEUE";
                        break;
                    default:
                        str2 = "UNDEFINED_ERROR";
                        break;
                }
                cVar2.mo56354G("Playbackstate is ERROR, Error code: %s, error msg: %s", str2, playbackStateCompat.f1000g);
            }
        }
        if (playbackStateCompat != null && playbackStateCompat.f994a == 3) {
            this.f44678e.f44685d.mo21479d(this.f44677d.mo1039g(), this.f44678e.mo21769k(this.f44677d));
            C14152v vVar = this.f44678e.f44685d;
            MediaMetadataCompat d2 = this.f44677d.mo1036d();
            if (d2 != null) {
                float f = playbackStateCompat.f997d;
                long j2 = playbackStateCompat.f995b;
                vVar.f42895q = (long) (((float) vVar.f42898t.mo26871c()) + (((float) (d2.mo816a("android.media.metadata.DURATION") - j2)) / f));
                long j3 = vVar.f42895q;
            }
        } else if (this.f44678e.mo21774p(this.f44677d)) {
            this.f44678e.f44685d.f42895q = 0;
        }
        if (this.f44678e.mo21774p(this.f44677d)) {
            if (playbackStateCompat == null || playbackStateCompat.f994a == 7) {
                this.f44678e.mo21772n((C0320v) null);
                C14842cc ccVar = this.f44678e;
                ccVar.f44683b.mo21875g(C14739i.m31029b((C14416ik) ccVar.f44689h.get()));
                return;
            }
            C14986h hVar = this.f44678e.f44683b;
            C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
            C14415ij ijVar = (C14415ij) C14417il.f43604g.createBuilder();
            ijVar.copyOnWrite();
            ((C14417il) ijVar.instance).f43606a = 12;
            gtVar.copyOnWrite();
            C14492lf lfVar = (C14492lf) gtVar.instance;
            C14417il ilVar = (C14417il) ijVar.build();
            ilVar.getClass();
            lfVar.f43801d = ilVar;
            lfVar.f43800c = 6;
            hVar.mo21875g((C14492lf) gtVar.build());
        } else if (playbackStateCompat != null) {
            int i = playbackStateCompat.f994a;
            if (i == 3 || i == 6) {
                this.f44678e.mo21772n(this.f44677d);
                C14842cc ccVar2 = this.f44678e;
                ccVar2.f44683b.mo21875g(C14739i.m31029b((C14416ik) ccVar2.f44689h.get()));
            }
        }
    }

    /* renamed from: i */
    public final void mo1010i() {
        C59071e eVar = C14842cc.f44681a;
        C58976aa aaVar = C58975e.f156826a;
        this.f44677d.mo1041i(this);
        this.f44678e.f44690i.remove(new C14841cb(this.f44677d));
        if (this.f44678e.mo21774p(this.f44677d)) {
            this.f44678e.mo21772n((C0320v) null);
            C14842cc ccVar = this.f44678e;
            ccVar.f44683b.mo21875g(C14739i.m31029b((C14416ik) ccVar.f44689h.get()));
        }
    }
}
