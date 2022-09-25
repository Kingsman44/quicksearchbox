package com.google.android.apps.gsa.staticplugins.mediabrowser;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.MediaDescriptionCompat;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.util.Base64;
import android.util.Pair;
import androidx.media.C2434k;
import androidx.media.C2449z;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87975kn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87976ko;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87977kp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87978kq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87979kr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87980ks;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87981kt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87983kv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.p6996ar.C89285b;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.apps.gsa.staticplugins.mediabrowser.MediaBrowserSessionController;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.apps.gsa.staticplugins.mediabrowser.a */
/* compiled from: PG */
public class C102692a extends C89285b implements C87682aj {

    /* renamed from: j */
    private static final C59071e f286643j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.mediabrowser.a");

    /* renamed from: f */
    final Map f286644f = new HashMap();

    /* renamed from: g */
    final Map f286645g = new HashMap();

    /* renamed from: h */
    public C87677ae f286646h;

    /* renamed from: i */
    public Random f286647i;

    /* renamed from: k */
    private final String f286648k;

    /* renamed from: l */
    private final String f286649l;

    /* renamed from: m */
    private C102702j f286650m;

    /* renamed from: n */
    private C87673aa f286651n;

    /* renamed from: o */
    private int f286652o = 0;

    public C102692a(String str, String str2) {
        this.f286648k = str;
        this.f286649l = str2;
    }

    /* renamed from: i */
    private final C58833ax m170283i(String str) {
        try {
            List i = C58869cf.m90937c(C58837ba.m90854c(":")).mo56156j().mo56155i(str);
            if (i.size() > 1) {
                return C58833ax.m90834k(new Pair((String) i.get(0), (String) i.get(1)));
            }
        } catch (PatternSyntaxException e) {
            C59052c cVar = (C59052c) f286643j.mo56225c();
            cVar.mo56378ag(C58975e.f156826a, this.f286648k);
            ((C59052c) ((C59052c) cVar.mo56382g(e)).mo56372aa(20932)).mo56386p("Delimiter format is wrong");
        }
        return C58836b.f156633a;
    }

    /* renamed from: j */
    private static String m170284j(String str, String str2) {
        return str + ":" + str2;
    }

    /* renamed from: b */
    public final void mo5831b(String str, C2449z zVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f286651n == null) {
            C59052c cVar = (C59052c) f286643j.mo56225c();
            cVar.mo56378ag(C58975e.f156826a, this.f286648k);
            ((C59052c) cVar.mo56372aa(20937)).mo56386p("No searchServiceClient to route the quest for loading children.");
            return;
        }
        C58833ax i = m170283i(str);
        if (!i.mo56113h()) {
            C59052c cVar2 = (C59052c) f286643j.mo56225c();
            cVar2.mo56378ag(C58975e.f156826a, this.f286648k);
            ((C59052c) cVar2.mo56372aa(20936)).mo56386p("Package and MediaId not in the right format.");
            zVar.mo5863c((Object) null);
            return;
        }
        String valueOf = String.valueOf(this.f286647i.nextInt());
        String str2 = (String) ((Pair) i.mo56107c()).first;
        String str3 = (String) ((Pair) i.mo56107c()).second;
        C87979kr krVar = (C87979kr) C87980ks.f237934f.createBuilder();
        krVar.copyOnWrite();
        C87980ks ksVar = (C87980ks) krVar.instance;
        valueOf.getClass();
        ksVar.f237936a |= 1;
        ksVar.f237937b = valueOf;
        krVar.copyOnWrite();
        C87980ks ksVar2 = (C87980ks) krVar.instance;
        str2.getClass();
        ksVar2.f237936a |= 2;
        ksVar2.f237938c = str2;
        String str4 = this.f286649l;
        krVar.copyOnWrite();
        C87980ks ksVar3 = (C87980ks) krVar.instance;
        str4.getClass();
        ksVar3.f237936a |= 8;
        ksVar3.f237940e = str4;
        krVar.copyOnWrite();
        C87980ks ksVar4 = (C87980ks) krVar.instance;
        str3.getClass();
        ksVar4.f237936a |= 4;
        ksVar4.f237939d = str3;
        this.f286644f.put(valueOf, zVar);
        this.f286645g.put(valueOf, str2);
        C88489j jVar = new C88489j(C87739bu.MEDIA_BROWSER_LOAD_CHILDREN);
        jVar.mo82014b(C87978kq.f237933a, (C87980ks) krVar.build());
        ClientEventData a = jVar.mo82013a();
        C87673aa aaVar2 = this.f286651n;
        aaVar2.getClass();
        aaVar2.mo81932c();
        C87673aa aaVar3 = this.f286651n;
        aaVar3.getClass();
        aaVar3.mo81937i(a);
        this.f286652o++;
        zVar.mo5857b();
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        MediaBrowserCompat.MediaItem[] mediaItemArr;
        int i;
        String str;
        ServiceEventData serviceEventData2 = serviceEventData;
        C88244um a = C88244um.m142794a(serviceEventData2.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal == 120) {
            if (!serviceEventData2.mo81913d(MediaSessionCompat.Token.class)) {
                C59052c cVar = (C59052c) f286643j.mo56226d();
                cVar.mo56378ag(C58975e.f156826a, this.f286648k);
                ((C59052c) cVar.mo56372aa(20938)).mo56386p("No session token fetched!");
            } else if (this.f6689e == null) {
                mo5836iP((MediaSessionCompat.Token) serviceEventData2.mo81912b(MediaSessionCompat.Token.class));
            }
            int i2 = this.f286652o - 1;
            this.f286652o = i2;
            C87673aa aaVar = this.f286651n;
            if (aaVar != null && i2 == 0) {
                aaVar.mo81933e();
            }
        } else if (ordinal == 121) {
            C58976aa aaVar2 = C58975e.f156826a;
            String str2 = ((C87983kv) serviceEventData2.mo81918e(C87981kt.f237941a)).f237945b;
            C2449z zVar = (C2449z) this.f286644f.get(str2);
            if (zVar == null) {
                C59052c cVar2 = (C59052c) f286643j.mo56226d();
                cVar2.mo56378ag(C58975e.f156826a, this.f286648k);
                ((C59052c) cVar2.mo56372aa(20941)).mo56389s("Not a valid request Id %s ", str2);
                return;
            }
            String str3 = (String) this.f286645g.get(str2);
            str3.getClass();
            if (serviceEventData2.mo81913d(MediaBrowserSessionController.ArrayParcelable.class)) {
                ArrayList arrayList = new ArrayList();
                MediaBrowserCompat.MediaItem[] mediaItemArr2 = ((MediaBrowserSessionController.ArrayParcelable) serviceEventData2.mo81912b(MediaBrowserSessionController.ArrayParcelable.class)).f286642a;
                int i3 = 0;
                for (int length = mediaItemArr2.length; i3 < length; length = i) {
                    MediaBrowserCompat.MediaItem mediaItem = mediaItemArr2[i3];
                    if (mediaItem.f929a == 1) {
                        MediaDescriptionCompat mediaDescriptionCompat = mediaItem.f930b;
                        String j = m170284j(str3, mediaDescriptionCompat.f932a);
                        CharSequence charSequence = mediaDescriptionCompat.f935d;
                        Bundle bundle = mediaDescriptionCompat.f938g;
                        Bitmap bitmap = mediaDescriptionCompat.f936e;
                        Uri uri = mediaDescriptionCompat.f937f;
                        mediaItemArr = mediaItemArr2;
                        Uri uri2 = mediaDescriptionCompat.f939h;
                        str = str3;
                        i = length;
                        Bitmap bitmap2 = bitmap;
                        arrayList.add(new MediaBrowserCompat.MediaItem(new MediaDescriptionCompat(j, mediaDescriptionCompat.f933b, mediaDescriptionCompat.f934c, charSequence, bitmap2, uri, bundle, uri2), mediaItem.f929a));
                    } else {
                        mediaItemArr = mediaItemArr2;
                        str = str3;
                        i = length;
                        arrayList.add(mediaItem);
                    }
                    if (arrayList.size() >= 400) {
                        break;
                    }
                    i3++;
                    mediaItemArr2 = mediaItemArr;
                    str3 = str;
                }
                zVar.mo5863c(arrayList);
            } else {
                C59052c cVar3 = (C59052c) f286643j.mo56226d();
                cVar3.mo56378ag(C58975e.f156826a, this.f286648k);
                ((C59052c) cVar3.mo56372aa(20940)).mo56386p("No array parcelable returned from media browser session controller.");
                zVar.mo5863c((Object) null);
            }
            this.f286644f.remove(str2);
            this.f286645g.remove(str2);
            int i4 = this.f286652o - 1;
            this.f286652o = i4;
            C87673aa aaVar3 = this.f286651n;
            if (aaVar3 != null && i4 == 0) {
                aaVar3.mo81933e();
            }
        }
    }

    /* renamed from: h */
    public final C2434k mo5835h(String str, int i) {
        PackageInfo a;
        C59052c cVar = (C59052c) f286643j.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, this.f286648k);
        ((C59052c) cVar.mo56372aa(20929)).mo56389s("onGetRoot %s", str);
        if (this.f286650m == null) {
            this.f286650m = new C102702j(getApplicationContext());
        }
        C102702j jVar = this.f286650m;
        Context applicationContext = getApplicationContext();
        if (!(i == 1000 || Process.myUid() == i)) {
            if (!((C58759qy) C102702j.f286669b).f156534a.equals(str) && !"com.android.systemui".equals(str)) {
                PackageInfo a2 = C102702j.m170301a(applicationContext, "android");
                int i2 = 0;
                if (a2 == null || a2.signatures == null || a2.signatures.length == 0 || (a = C102702j.m170301a(applicationContext, str)) == null || a.signatures == null || a.signatures.length <= 0 || !a2.signatures[0].equals(a.signatures[0])) {
                    PackageInfo a3 = C102702j.m170301a(applicationContext, str);
                    if (a3 != null) {
                        if (a3.signatures.length != 1) {
                            ((C59052c) ((C59052c) C102702j.f286668a.mo56226d()).mo56372aa(20961)).mo56386p("Caller does not have exactly one signature certificate!");
                        } else {
                            ArrayList arrayList = (ArrayList) jVar.f286670c.get(Base64.encodeToString(a3.signatures[0].toByteArray(), 2));
                            if (arrayList == null) {
                                jVar.f286670c.isEmpty();
                            } else {
                                int size = arrayList.size();
                                while (i2 < size) {
                                    C102701i iVar = (C102701i) arrayList.get(i2);
                                    if (str.equals(iVar.f286666b)) {
                                        String str2 = iVar.f286665a;
                                        String str3 = iVar.f286666b;
                                        boolean z = iVar.f286667c;
                                    } else {
                                        String str4 = iVar.f286666b;
                                        i2++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C59052c cVar2 = (C59052c) f286643j.mo56225c();
            cVar2.mo56378ag(C58975e.f156826a, this.f286648k);
            ((C59052c) cVar2.mo56372aa(20931)).mo56389s("%s is not authorized to browse contents.", str);
            return null;
        }
        if (this.f286651n == null) {
            C59052c cVar3 = (C59052c) f286643j.mo56224b();
            cVar3.mo56378ag(C58975e.f156826a, this.f286648k);
            ((C59052c) cVar3.mo56372aa(20930)).mo56386p("Creating new searchServiceClient to route media browser request");
            C88486g gVar = new C88486g();
            gVar.f239201c = amo.MEDIA_BROWSER_SERVICE;
            gVar.f239204f = "media_browser";
            C87673aa a4 = this.f286646h.mo81958a(this, (C90757ba) null, new ClientConfig(gVar));
            this.f286651n = a4;
            a4.mo81932c();
            this.f286651n.mo81944p();
            C87976ko koVar = (C87976ko) C87977kp.f237929c.createBuilder();
            String str5 = this.f286649l;
            koVar.copyOnWrite();
            C87977kp kpVar = (C87977kp) koVar.instance;
            str5.getClass();
            kpVar.f237931a |= 1;
            kpVar.f237932b = str5;
            C88489j jVar2 = new C88489j(C87739bu.MEDIA_BROWSER_FETCH_MEDIA_SESSION_TOKEN);
            jVar2.mo82014b(C87975kn.f237928a, (C87977kp) koVar.build());
            ClientEventData a5 = jVar2.mo82013a();
            C87673aa aaVar = this.f286651n;
            aaVar.getClass();
            aaVar.mo81937i(a5);
            this.f286652o++;
        }
        return new C2434k(m170284j(str, "agsa_root_media_id"), (Bundle) null);
    }

    public void onCreate() {
        super.onCreate();
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onDestroy() {
        super.onDestroy();
        C58976aa aaVar = C58975e.f156826a;
        C87673aa aaVar2 = this.f286651n;
        if (aaVar2 != null) {
            aaVar2.mo81941m(this, new C88244um[0]);
            this.f286651n.mo81934f();
            this.f286651n = null;
        }
    }
}
