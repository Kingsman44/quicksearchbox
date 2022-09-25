package com.google.android.apps.search.assistant.verticals.newsplayer.p10068e;

import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.apps.search.assistant.verticals.newsplayer.p10066c.C132412d;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.e.n */
/* compiled from: PG */
final class C132433n extends C0310l {

    /* renamed from: d */
    final /* synthetic */ C47770dh f361454d;

    /* renamed from: e */
    final /* synthetic */ C132412d f361455e;

    public C132433n(C47770dh dhVar, C132412d dVar) {
        this.f361454d = dhVar;
        this.f361455e = dVar;
    }

    /* renamed from: e */
    public final void mo1006e(PlaybackStateCompat playbackStateCompat) {
        C62910ar arVar;
        C62910ar arVar2;
        C47538ax c = this.f361454d.mo51613c("MediaControllerCompat.onPlaybackStateChanged");
        try {
            C132412d dVar = this.f361455e;
            C132416a aVar = dVar.f361411d;
            if (aVar == null) {
                ((C59052c) ((C59052c) C132412d.f361408a.mo56226d()).mo56372aa(39640)).mo56386p("NewsPlayerSession is null.");
            } else {
                C52174hz a = aVar.mo110699a();
                if (a == null) {
                    ((C59052c) ((C59052c) C132412d.f361408a.mo56226d()).mo56372aa(39639)).mo56386p("MediaItem is null.");
                } else {
                    C132416a aVar2 = dVar.f361411d;
                    aVar2.getClass();
                    PlaybackStateCompat f = aVar2.mo110715q().f361493a.mo1038f();
                    C62910ar j = C62948a.m95459j(f.f995b);
                    C132416a aVar3 = dVar.f361411d;
                    aVar3.getClass();
                    C62910ar j2 = C62948a.m95459j(aVar3.mo110715q().f361493a.mo1036d().mo816a("android.media.metadata.DURATION"));
                    if (f != dVar.f361416i) {
                        int i = 3;
                        if (f.f994a == 3) {
                            i = 2;
                        }
                        dVar.mo110696a(a, i, j, j2);
                    }
                    C52174hz hzVar = dVar.f361415h;
                    if (!(hzVar == null || hzVar.f136895b.equals(a.f136895b) || (arVar = dVar.f361417j) == null || (arVar2 = dVar.f361418k) == null)) {
                        int i2 = arVar2.f169860a == arVar.f169860a ? 2 : 4;
                        C52174hz hzVar2 = dVar.f361415h;
                        hzVar2.getClass();
                        dVar.mo110696a(hzVar2, i2, arVar, arVar2);
                        dVar.mo110696a(a, 2, j, j2);
                    }
                    dVar.f361415h = a;
                    dVar.f361416i = f;
                    dVar.f361417j = j;
                    dVar.f361418k = j2;
                }
            }
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
