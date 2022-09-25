package com.google.android.apps.search.assistant.verticals.newsplayer.p10068e;

import android.net.Uri;
import android.os.RemoteException;
import androidx.media3.common.C2666j;
import com.google.android.gms.cast.C143357ao;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.framework.C143394ab;
import com.google.android.gms.cast.framework.C143409aq;
import com.google.android.gms.cast.framework.C143410ar;
import com.google.android.gms.cast.framework.C143411as;
import com.google.android.gms.cast.framework.C143466m;
import com.google.android.gms.cast.framework.media.C143500bf;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.C143919bh;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.p4750c.C62948a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.e.t */
/* compiled from: PG */
final class C132439t implements C143411as {

    /* renamed from: a */
    final /* synthetic */ C132441v f361462a;

    public C132439t(C132441v vVar) {
        this.f361462a = vVar;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo6038g(C143409aq aqVar, int i) {
        C143466m mVar = (C143466m) aqVar;
        ((C59052c) ((C59052c) C132441v.f361464a.mo56224b()).mo56372aa(39648)).mo56386p("NewsPlayer cast ended.");
        C47538ax c = this.f361462a.f361467b.mo51613c("CastSessionManagerListenerImpl#onSessionEnded");
        try {
            this.f361462a.mo110728w();
            if (c != null) {
                c.close();
            }
            this.f361462a.f361475j = false;
            return;
        } catch (Throwable th) {
            C132438s.m215300a(th, th);
        }
        throw th;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo6039h(C143409aq aqVar) {
        C143466m mVar = (C143466m) aqVar;
        ((C59052c) ((C59052c) C132441v.f361464a.mo56224b()).mo56372aa(39649)).mo56386p("NewsPlayer cast ending.");
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo6040i(C143409aq aqVar, int i) {
        C143466m mVar = (C143466m) aqVar;
        ((C59052c) ((C59052c) C132441v.f361464a.mo56224b()).mo56372aa(39650)).mo56386p("NewsPlayer cast resume failed.");
        this.f361462a.f361475j = false;
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo6041j(C143409aq aqVar, boolean z) {
        C143466m mVar = (C143466m) aqVar;
        ((C59052c) ((C59052c) C132441v.f361464a.mo56224b()).mo56372aa(39651)).mo56386p("NewsPlayer cast resumed.");
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo6042k(C143409aq aqVar, String str) {
        C143466m mVar = (C143466m) aqVar;
        ((C59052c) ((C59052c) C132441v.f361464a.mo56224b()).mo56372aa(39652)).mo56389s("NewsPlayer cast resuming: %s", str);
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo6043l(C143409aq aqVar, int i) {
        C143466m mVar = (C143466m) aqVar;
        ((C59052c) ((C59052c) C132441v.f361464a.mo56224b()).mo56372aa(39653)).mo56386p("NewsPlayer cast start failed.");
        this.f361462a.f361475j = false;
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ void mo6044m(C143409aq aqVar, String str) {
        C143410ar arVar;
        Iterator it;
        ((C59052c) ((C59052c) C132441v.f361464a.mo56224b()).mo56372aa(39654)).mo56389s("NewsPlayer cast started: %s", str);
        C132441v vVar = this.f361462a;
        vVar.f361472g = (C143466m) aqVar;
        vVar.f361475j = true;
        try {
            C143466m mVar = vVar.f361472g;
            mVar.getClass();
            C143500bf c = mVar.mo118720c();
            if (c != null) {
                c.mo118764C(new C132422c(vVar), 200);
                c.mo118786n(new C132437r(vVar, c));
                ArrayList arrayList = new ArrayList();
                Iterator it2 = vVar.f361471f.f136914b.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    C52174hz hzVar = (C52174hz) it2.next();
                    if (hzVar.f136899f.size() > 0) {
                        MediaMetadata mediaMetadata = new MediaMetadata(3);
                        C52568wo woVar = hzVar.f136897d;
                        if (woVar == null) {
                            woVar = C52568wo.f137992v;
                        }
                        mediaMetadata.mo118417d("com.google.android.gms.cast.metadata.TITLE", woVar.f137998e);
                        C52568wo woVar2 = hzVar.f136897d;
                        if (woVar2 == null) {
                            woVar2 = C52568wo.f137992v;
                        }
                        mediaMetadata.mo118417d("com.google.android.gms.cast.metadata.SUBTITLE", woVar2.f138000g);
                        C52568wo woVar3 = hzVar.f136897d;
                        if (woVar3 == null) {
                            woVar3 = C52568wo.f137992v;
                        }
                        mediaMetadata.mo118417d("com.google.android.gms.cast.metadata.ARTIST", woVar3.f138000g);
                        C52568wo woVar4 = hzVar.f136897d;
                        if (woVar4 == null) {
                            woVar4 = C52568wo.f137992v;
                        }
                        C51012dc dcVar = woVar4.f138004k;
                        if (dcVar == null) {
                            dcVar = C51012dc.f132813k;
                        }
                        it = it2;
                        mediaMetadata.mo118415b(new WebImage(Uri.parse(dcVar.f132818d), 0, 0));
                        String str2 = (String) hzVar.f136899f.get(0);
                        JSONObject put = new JSONObject().put("itemType", "media-tts").put("indexInGroup", 0).put("periodIndex", i);
                        C143357ao aoVar = new C143357ao(str2);
                        aoVar.f388804d = str2;
                        aoVar.f388801a = 1;
                        aoVar.f388802b = "audio/mpeg";
                        aoVar.f388803c = mediaMetadata;
                        aoVar.mo118505b(put);
                        arrayList.add(C132441v.m215313t(aoVar.mo118504a()));
                        i++;
                    } else {
                        it = it2;
                    }
                    MediaMetadata mediaMetadata2 = new MediaMetadata(3);
                    C52568wo woVar5 = hzVar.f136897d;
                    if (woVar5 == null) {
                        woVar5 = C52568wo.f137992v;
                    }
                    mediaMetadata2.mo118417d("com.google.android.gms.cast.metadata.TITLE", woVar5.f137998e);
                    C52568wo woVar6 = hzVar.f136897d;
                    if (woVar6 == null) {
                        woVar6 = C52568wo.f137992v;
                    }
                    mediaMetadata2.mo118417d("com.google.android.gms.cast.metadata.SUBTITLE", woVar6.f138000g);
                    C52568wo woVar7 = hzVar.f136897d;
                    if (woVar7 == null) {
                        woVar7 = C52568wo.f137992v;
                    }
                    mediaMetadata2.mo118417d("com.google.android.gms.cast.metadata.ARTIST", woVar7.f138000g);
                    C52568wo woVar8 = hzVar.f136897d;
                    if (woVar8 == null) {
                        woVar8 = C52568wo.f137992v;
                    }
                    C51012dc dcVar2 = woVar8.f138004k;
                    if (dcVar2 == null) {
                        dcVar2 = C51012dc.f132813k;
                    }
                    mediaMetadata2.mo118415b(new WebImage(Uri.parse(dcVar2.f132817c), 0, 0));
                    JSONObject put2 = new JSONObject().put("itemType", "media-item").put("indexInGroup", 1).put("periodIndex", i);
                    String str3 = hzVar.f136895b;
                    C143357ao aoVar2 = new C143357ao(str3);
                    aoVar2.f388804d = str3;
                    aoVar2.f388801a = 1;
                    aoVar2.f388802b = "audio/mpeg";
                    aoVar2.f388803c = mediaMetadata2;
                    aoVar2.mo118505b(put2);
                    arrayList.add(C132441v.m215313t(aoVar2.mo118504a()));
                    i++;
                    it2 = it;
                }
                c.mo118769I((MediaQueueItem[]) Collection.EL.toArray(arrayList, C132427h.f361443a), vVar.f361476k, 0, C62948a.m95453d(vVar.f361477l), new JSONObject());
                return;
            }
            ((C59052c) ((C59052c) C132441v.f361464a.mo56226d()).mo56372aa(39659)).mo56386p("RMC is null at loadRemoteMedia");
        } catch (JSONException e) {
            ((C59052c) ((C59052c) ((C59052c) C132441v.f361464a.mo56226d()).mo56382g(e)).mo56372aa(39657)).mo56386p("NewsPlayer failed to loadRemoteMedia.");
            if (vVar.f361475j && (arVar = vVar.f361473h) != null) {
                arVar.mo118624d(true);
            }
        }
    }

    /* renamed from: n */
    public final /* synthetic */ void mo6045n(C143409aq aqVar) {
        C59052c cVar = (C59052c) ((C59052c) C132441v.f361464a.mo56224b()).mo56372aa(39655);
        C143919bh.m233964g("Must be called from the main thread.");
        C143394ab abVar = ((C143466m) aqVar).f388905g;
        String str = null;
        if (abVar != null) {
            try {
                str = abVar.mo118571h();
            } catch (RemoteException e) {
                C143409aq.f388903f.mo118885c(e, "Unable to call %s on %s.", "getSessionId", C143394ab.class.getSimpleName());
            }
        }
        cVar.mo56389s("NewsPlayer cast starting with id %s. Pausing local playback.", str);
        C47538ax c = this.f361462a.f361467b.mo51613c("CastSessionManagerListenerImpl#onSessionStarting");
        try {
            ((C2666j) this.f361462a.f361468c).mo5974B(false);
            ((C2666j) this.f361462a.f361469d).mo5974B(false);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C132438s.m215300a(th, th);
        }
        throw th;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ void mo6046o(C143409aq aqVar, int i) {
        C143466m mVar = (C143466m) aqVar;
        ((C59052c) ((C59052c) C132441v.f361464a.mo56224b()).mo56372aa(39656)).mo56386p("NewsPlayer cast suspended.");
        this.f361462a.f361475j = false;
    }
}
