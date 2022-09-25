package com.google.android.apps.gsa.staticplugins.mediabrowser;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p031v4.media.MediaBrowserCompat;
import com.google.android.apps.gsa.search.core.p6519al.p6745m.C85527a;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87975kn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87977kp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87978kq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87980ks;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* compiled from: PG */
public final class MediaBrowserSessionController implements C86686h {

    /* renamed from: a */
    public static final C59071e f286636a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.mediabrowser.MediaBrowserSessionController");

    /* renamed from: c */
    public final Context f286637c;

    /* renamed from: d */
    public C86697a f286638d;

    /* renamed from: e */
    private final C22871g f286639e;

    /* renamed from: f */
    private final C22871g f286640f;

    /* renamed from: g */
    private final C85527a f286641g;

    /* compiled from: PG */
    public class ArrayParcelable implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C102700h();

        /* renamed from: a */
        MediaBrowserCompat.MediaItem[] f286642a;

        public ArrayParcelable(Parcel parcel) {
            int readInt = parcel.readInt();
            this.f286642a = new MediaBrowserCompat.MediaItem[readInt];
            for (int i = 0; i < readInt; i++) {
                this.f286642a[i] = (MediaBrowserCompat.MediaItem) parcel.readParcelable(MediaBrowserCompat.MediaItem.class.getClassLoader());
            }
        }

        public ArrayParcelable(MediaBrowserCompat.MediaItem[] mediaItemArr) {
            this.f286642a = mediaItemArr;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f286642a.length);
            parcel.writeParcelableArray(this.f286642a, 0);
        }
    }

    public MediaBrowserSessionController(Context context, C22871g gVar, C22871g gVar2, C85527a aVar) {
        this.f286637c = context;
        this.f286639e = gVar;
        this.f286640f = gVar2;
        this.f286641g = aVar;
    }

    /* renamed from: b */
    public final /* synthetic */ C86726f mo80291b(C21370a aVar) {
        return C86685g.m139632a(aVar);
    }

    /* renamed from: e */
    public final /* synthetic */ C58528ij mo80292e() {
        return C86686h.f234170b;
    }

    /* renamed from: f */
    public final void mo80293f(long j, ClientEventData clientEventData, C86681c cVar) {
        Object obj;
        Object obj2;
        C58976aa aaVar = C58975e.f156826a;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 171) {
            C62940bt btVar = C87975kn.f237928a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r3 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r3);
            Object l = bwVar.f169962ag.mo58854l(r3.f169971d);
            if (l == null) {
                obj = r3.f169969b;
            } else {
                obj = r3.mo58889c(l);
            }
            this.f286640f.mo28211k(this.f286639e.mo28209i(this.f286641g.mo79044a(((C87977kp) obj).f237932b), "audio-player-worker-connect", C102697e.f286660a), "send-media-session-token", new C102698f(this));
        } else if (ordinal == 172) {
            C62940bt btVar2 = C87978kq.f237933a;
            C87741bw bwVar2 = clientEventData.f236955a;
            C62940bt r32 = C62942bv.checkIsLite(btVar2);
            bwVar2.mo58887l(r32);
            Object l2 = bwVar2.f169962ag.mo58854l(r32.f169971d);
            if (l2 == null) {
                obj2 = r32.f169969b;
            } else {
                obj2 = r32.mo58889c(l2);
            }
            C87980ks ksVar = (C87980ks) obj2;
            String str = ksVar.f237938c;
            if ((ksVar.f237936a & 4) != 0) {
                this.f286640f.mo28211k(this.f286641g.mo79045c(str, ksVar.f237939d, ksVar.f237940e), "load-child-media-item-list", new C102699g(this, ksVar, str));
                return;
            }
            C59104x c = f286636a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MBSessionController");
            ((C59052c) ((C59052c) c).mo56372aa(20950)).mo56386p("Parent should have valid mediaId");
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: h */
    public final void mo80295h() {
        C58976aa aaVar = C58975e.f156826a;
        this.f286638d = null;
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f286638d = aVar;
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return C86685g.m139633b(clientConfig, clientConfig2);
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo80299l() {
        return false;
    }
}
