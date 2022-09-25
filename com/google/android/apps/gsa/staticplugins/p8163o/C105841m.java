package com.google.android.apps.gsa.staticplugins.p8163o;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.media.session.C0324z;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media3.common.C2640bb;
import androidx.media3.exoplayer.C2759ad;
import androidx.mediarouter.p175a.C3687aw;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88398a;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88458h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.m */
/* compiled from: PG */
final class C105841m extends C0324z {

    /* renamed from: e */
    final /* synthetic */ C105846r f295268e;

    public C105841m(C105846r rVar) {
        this.f295268e = rVar;
    }

    /* renamed from: jU */
    public final void mo1064jU(String str, Bundle bundle) {
        C59104x b = C105846r.f295277a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "APWDelegate");
        ((C59052c) ((C59052c) b).mo56372aa(14056)).mo56389s("Handling custom action: %s", str);
        if (str.equals("com.google.android.apps.gsa.search.core.work.audioplayer.SkipToWindow") && bundle != null) {
            int i = bundle.getInt("com.google.android.apps.gsa.search.core.work.audioplayer.SkipToWindow");
            int i2 = bundle.getInt("com.google.android.apps.gsa.search.core.work.audioplayer.StartOffsetInWindow");
            C105846r rVar = this.f295268e;
            C2759ad adVar = rVar.f295314j;
            if (adVar != null) {
                int V = adVar.mo6254V();
                rVar.f295314j.mo5973A(i, (long) i2);
                if (V != i) {
                    rVar.mo95098q(true, true);
                }
            }
        } else if (str.equals("com.google.android.apps.gsa.search.core.work.audioplayer.SetPlaybackParameters") && bundle != null) {
            C105846r rVar2 = this.f295268e;
            float a = rVar2.mo95084a(bundle);
            boolean z = bundle.getBoolean("com.google.android.apps.gsa.search.core.work.audioplayer.TrimSilence", false);
            rVar2.f295316l = a;
            rVar2.f295317m = z;
            C2759ad adVar2 = rVar2.f295314j;
            if (adVar2 != null) {
                adVar2.mo5975C(new C2640bb(rVar2.f295316l, 1.0f));
                rVar2.f295314j.mo6470q(rVar2.f295317m);
                rVar2.mo95098q(true, false);
            }
        } else if (str.equals("com.google.android.apps.gsa.search.core.work.audioplayer.StartCasting") && bundle != null) {
            C105846r rVar3 = this.f295268e;
            long j = bundle.getLong("com.google.android.apps.gsa.search.core.work.audioplayer.PlayedPosition", 0);
            float a2 = this.f295268e.mo95084a(bundle);
            int i3 = bundle.getInt("com.google.android.apps.gsa.search.core.work.audioplayer.CastPlayerState");
            rVar3.f295326v = true;
            rVar3.mo95088g();
            rVar3.mo95090i();
            rVar3.mo95099r(j, a2, i3);
            C3687aw.m10683e(rVar3.f295307c).mo7776l(rVar3.f295313i);
        } else if (str.equals("com.google.android.apps.gsa.search.core.work.audioplayer.StopCasting")) {
            C105846r rVar4 = this.f295268e;
            rVar4.f295326v = false;
            if (bundle != null) {
                rVar4.mo95089h(Uri.parse(bundle.getString("android.media.metadata.MEDIA_URI")).toString(), bundle, bundle.getBoolean("com.google.android.apps.gsa.search.core.work.audioplayer.AutoPlay"));
                rVar4.mo95098q(true, false);
            }
        } else if (str.equals("com.google.android.apps.gsa.search.core.work.audioplayer.UpdateCastingPlaybackState") && bundle != null) {
            this.f295268e.mo95099r(bundle.getLong("com.google.android.apps.gsa.search.core.work.audioplayer.PlayedPosition", 0), this.f295268e.mo95084a(bundle), bundle.getInt("com.google.android.apps.gsa.search.core.work.audioplayer.CastPlayerState"));
        } else if (!str.equals("com.google.android.apps.gsa.search.core.work.audioplayer.UpdateMetadata") || bundle == null) {
            if (str.equals("com.google.android.apps.gsa.search.core.work.audioplayer.UpdatePlaybackState")) {
                C105846r rVar5 = this.f295268e;
                if (!rVar5.f295326v) {
                    if (bundle != null) {
                        rVar5.f295323s = bundle.getInt("com.google.android.apps.gsa.search.core.work.audioplayer.PlaybackStateErrorCode", 0);
                    }
                    this.f295268e.mo95098q(true, false);
                    this.f295268e.f295323s = 0;
                    return;
                }
            }
            if (str.equals("com.google.android.apps.gsa.search.core.work.audioplayer.SkipBackward")) {
                mo1075kf();
            } else if (str.equals("com.google.android.apps.gsa.search.core.work.audioplayer.SkipForward")) {
                mo1065jV();
            } else if (str.equals("com.google.android.apps.gsa.search.core.work.audioplayer.SkipPrevious")) {
                mo1081kl();
            } else if (str.equals("com.google.android.apps.gsa.search.core.work.audioplayer.SkipNext")) {
                mo1080kk();
            }
        } else {
            this.f295268e.mo95100s(bundle);
            this.f295268e.f295321q = (PendingIntent) bundle.getParcelable("com.google.android.apps.gsa.search.core.work.audioplayer.SessionActivity");
            C105846r rVar6 = this.f295268e;
            rVar6.f295313i.mo879k(rVar6.f295321q);
            C105846r rVar7 = this.f295268e;
            rVar7.f295313i.mo875g(rVar7.f295324t);
        }
    }

    /* renamed from: jV */
    public final void mo1065jV() {
        C59104x b = C105846r.f295277a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "APWDelegate");
        ((C59052c) ((C59052c) b).mo56372aa(14057)).mo56386p("onFastForward");
        C105846r rVar = this.f295268e;
        if (!rVar.f295326v) {
            rVar.mo95093l();
        }
    }

    /* renamed from: jW */
    public final void mo1066jW() {
        C59104x b = C105846r.f295277a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "APWDelegate");
        ((C59052c) ((C59052c) b).mo56372aa(14058)).mo56386p("onPause");
        C105846r rVar = this.f295268e;
        if (!rVar.f295326v) {
            rVar.mo95087f();
        }
    }

    /* renamed from: jX */
    public final void mo1067jX() {
        C59104x b = C105846r.f295277a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "APWDelegate");
        ((C59052c) ((C59052c) b).mo56372aa(14059)).mo56386p("onPlay");
        C105846r rVar = this.f295268e;
        if (!rVar.f295326v) {
            rVar.f295320p = false;
            rVar.mo95097p(rVar.mo95102u());
        }
    }

    /* renamed from: jY */
    public final void mo1068jY(String str, Bundle bundle) {
        C59104x b = C105846r.f295277a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "APWDelegate");
        ((C59052c) ((C59052c) b).mo56372aa(14060)).mo56389s("onPlayFromMediaId: %s", str);
        C105846r rVar = this.f295268e;
        if (!rVar.f295326v) {
            C88398a aVar = (C88398a) C88458h.f239136h.createBuilder();
            aVar.copyOnWrite();
            C88458h hVar = (C88458h) aVar.instance;
            hVar.f239138a |= 1;
            hVar.f239139b = 1024;
            aVar.copyOnWrite();
            C88458h hVar2 = (C88458h) aVar.instance;
            str.getClass();
            hVar2.f239138a |= 16;
            hVar2.f239143f = str;
            rVar.mo95095o((C88458h) aVar.build());
        }
    }

    /* renamed from: jZ */
    public final void mo1069jZ(String str, Bundle bundle) {
        C59104x b = C105846r.f295277a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "APWDelegate");
        ((C59052c) ((C59052c) b).mo56372aa(14061)).mo56389s("onPlayFromSearch: %s", str);
        C105846r rVar = this.f295268e;
        if (!rVar.f295326v) {
            C88398a aVar = (C88398a) C88458h.f239136h.createBuilder();
            aVar.copyOnWrite();
            C88458h hVar = (C88458h) aVar.instance;
            hVar.f239138a |= 1;
            hVar.f239139b = 2048;
            aVar.copyOnWrite();
            C88458h hVar2 = (C88458h) aVar.instance;
            str.getClass();
            hVar2.f239138a |= 32;
            hVar2.f239144g = str;
            rVar.mo95095o((C88458h) aVar.build());
        }
    }

    /* renamed from: ka */
    public final void mo1070ka(Uri uri, Bundle bundle) {
        C59104x b = C105846r.f295277a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "APWDelegate");
        ((C59052c) ((C59052c) b).mo56372aa(14062)).mo56389s("onPlayFromUri: %s", uri);
        C105846r rVar = this.f295268e;
        if (!rVar.f295326v) {
            String uri2 = uri.toString();
            if (bundle == null) {
                bundle = new Bundle();
            }
            rVar.mo95089h(uri2, bundle, true);
        }
    }

    /* renamed from: ke */
    public final void mo1074ke(Uri uri, Bundle bundle) {
        C59104x b = C105846r.f295277a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "APWDelegate");
        ((C59052c) ((C59052c) b).mo56372aa(14063)).mo56389s("onPrepareFromUri: %s", uri);
        C105846r rVar = this.f295268e;
        if (!rVar.f295326v) {
            String uri2 = uri.toString();
            if (bundle == null) {
                bundle = new Bundle();
            }
            rVar.mo95089h(uri2, bundle, false);
        }
    }

    /* renamed from: kf */
    public final void mo1075kf() {
        C105846r rVar = this.f295268e;
        if (!rVar.f295326v) {
            rVar.mo95092k();
        }
    }

    /* renamed from: kg */
    public final void mo1076kg(long j) {
        C59104x b = C105846r.f295277a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "APWDelegate");
        ((C59052c) ((C59052c) b).mo56372aa(14064)).mo56388r("onSeekTo %d", j);
        C105846r rVar = this.f295268e;
        if (!rVar.f295326v) {
            rVar.mo95094n(j);
        }
    }

    /* renamed from: ki */
    public final void mo1078ki(int i) {
        C2759ad adVar;
        C59104x b = C105846r.f295277a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "APWDelegate");
        ((C59052c) ((C59052c) b).mo56372aa(14065)).mo56387q("onSetRepeatMode %d", i);
        C105846r rVar = this.f295268e;
        if (!rVar.f295326v && (adVar = rVar.f295314j) != null) {
            adVar.mo5977E(i);
        }
    }

    /* renamed from: kk */
    public final void mo1080kk() {
        C59104x b = C105846r.f295277a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "APWDelegate");
        ((C59052c) ((C59052c) b).mo56372aa(14066)).mo56386p("onSkipToNext");
        C105846r rVar = this.f295268e;
        C88398a aVar = (C88398a) C88458h.f239136h.createBuilder();
        aVar.copyOnWrite();
        C88458h hVar = (C88458h) aVar.instance;
        hVar.f239138a |= 1;
        hVar.f239139b = 32;
        rVar.mo95095o((C88458h) aVar.build());
    }

    /* renamed from: kl */
    public final void mo1081kl() {
        C59104x b = C105846r.f295277a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "APWDelegate");
        ((C59052c) ((C59052c) b).mo56372aa(14067)).mo56386p("onSkipPrevious");
        C105846r rVar = this.f295268e;
        C88398a aVar = (C88398a) C88458h.f239136h.createBuilder();
        aVar.copyOnWrite();
        C88458h hVar = (C88458h) aVar.instance;
        hVar.f239138a |= 1;
        hVar.f239139b = 16;
        rVar.mo95095o((C88458h) aVar.build());
    }

    /* renamed from: kn */
    public final void mo1083kn() {
        C59104x b = C105846r.f295277a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "APWDelegate");
        ((C59052c) ((C59052c) b).mo56372aa(14068)).mo56386p("onStop");
        C2759ad adVar = this.f295268e.f295314j;
        if (adVar != null) {
            adVar.mo5981I();
            this.f295268e.mo95098q(false, false);
        }
    }

    /* renamed from: ko */
    public final boolean mo1084ko(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        C59104x b = C105846r.f295277a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "APWDelegate");
        ((C59052c) ((C59052c) b).mo56372aa(14069)).mo56393w("onMediaButtonEvent keyCode:%d, action:%d", keyCode, action);
        if (keyCode == 79 || keyCode == 85) {
            long currentTimeMillis = System.currentTimeMillis();
            if (action == 0) {
                C105846r rVar = this.f295268e;
                C105844p pVar = rVar.f295327w;
                if (currentTimeMillis > pVar.f295272b + 40) {
                    pVar.f295271a++;
                    rVar.f295308d.mo28213m("media-button-runner", (long) ViewConfiguration.getDoubleTapTimeout(), this.f295268e.f295327w);
                }
            } else if (action == 1) {
                this.f295268e.f295327w.f295272b = currentTimeMillis;
            }
            return true;
        }
        if (action == 0) {
            if (keyCode == 87) {
                C105846r rVar2 = this.f295268e;
                if (!rVar2.f295319o) {
                    mo1080kk();
                } else if (rVar2.f295326v) {
                    C88398a aVar = (C88398a) C88458h.f239136h.createBuilder();
                    aVar.copyOnWrite();
                    C88458h hVar = (C88458h) aVar.instance;
                    hVar.f239138a |= 1;
                    hVar.f239139b = 64;
                    rVar2.mo95095o((C88458h) aVar.build());
                } else {
                    rVar2.mo95093l();
                }
                return true;
            } else if (keyCode == 88) {
                C105846r rVar3 = this.f295268e;
                if (!rVar3.f295319o) {
                    mo1081kl();
                } else if (rVar3.f295326v) {
                    C88398a aVar2 = (C88398a) C88458h.f239136h.createBuilder();
                    aVar2.copyOnWrite();
                    C88458h hVar2 = (C88458h) aVar2.instance;
                    hVar2.f239138a |= 1;
                    hVar2.f239139b = 8;
                    rVar3.mo95095o((C88458h) aVar2.build());
                } else {
                    rVar3.mo95092k();
                }
                return true;
            }
        }
        return false;
    }
}
